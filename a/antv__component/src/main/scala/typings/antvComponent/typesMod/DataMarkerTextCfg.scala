package typings.antvComponent.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataMarkerTextCfg extends EnhancedTextCfg {
  
  var display: js.UndefOr[Boolean] = js.native
}
object DataMarkerTextCfg {
  
  @scala.inline
  def apply(content: String | Double): DataMarkerTextCfg = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataMarkerTextCfg]
  }
  
  @scala.inline
  implicit class DataMarkerTextCfgMutableBuilder[Self <: DataMarkerTextCfg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplay(value: Boolean): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
  }
}
