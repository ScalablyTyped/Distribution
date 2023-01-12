package typings.antvComponent.libTypesMod

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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataMarkerTextCfg] (val x: Self) extends AnyVal {
    
    inline def setDisplay(value: Boolean): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
  }
}
