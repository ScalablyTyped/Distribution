package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrendArrowOptions extends StObject {
  
  /**
    * The visibility of the trend arrows.
    */
  var Visibility: js.UndefOr[typings.awsSdk.clientsQuicksightMod.Visibility] = js.undefined
}
object TrendArrowOptions {
  
  inline def apply(): TrendArrowOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrendArrowOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TrendArrowOptions] (val x: Self) extends AnyVal {
    
    inline def setVisibility(value: Visibility): Self = StObject.set(x, "Visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "Visibility", js.undefined)
  }
}
