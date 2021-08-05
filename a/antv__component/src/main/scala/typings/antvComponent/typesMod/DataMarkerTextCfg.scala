package typings.antvComponent.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataMarkerTextCfg
  extends StObject
     with EnhancedTextCfg {
  
  var display: js.UndefOr[Boolean] = js.undefined
}
object DataMarkerTextCfg {
  
  inline def apply(content: String | Double): DataMarkerTextCfg = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataMarkerTextCfg]
  }
  
  extension [Self <: DataMarkerTextCfg](x: Self) {
    
    inline def setDisplay(value: Boolean): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
  }
}
