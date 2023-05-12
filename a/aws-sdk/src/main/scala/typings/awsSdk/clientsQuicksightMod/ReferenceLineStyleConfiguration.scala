package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReferenceLineStyleConfiguration extends StObject {
  
  /**
    * The hex color of the reference line.
    */
  var Color: js.UndefOr[HexColor] = js.undefined
  
  /**
    * The pattern type of the line style. Choose one of the following options:    SOLID     DASHED     DOTTED   
    */
  var Pattern: js.UndefOr[ReferenceLinePatternType] = js.undefined
}
object ReferenceLineStyleConfiguration {
  
  inline def apply(): ReferenceLineStyleConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReferenceLineStyleConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReferenceLineStyleConfiguration] (val x: Self) extends AnyVal {
    
    inline def setColor(value: HexColor): Self = StObject.set(x, "Color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "Color", js.undefined)
    
    inline def setPattern(value: ReferenceLinePatternType): Self = StObject.set(x, "Pattern", value.asInstanceOf[js.Any])
    
    inline def setPatternUndefined: Self = StObject.set(x, "Pattern", js.undefined)
  }
}
