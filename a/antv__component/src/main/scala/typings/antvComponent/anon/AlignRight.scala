package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlignRight extends StObject {
  
  var alignRight: Boolean = js.native
  
  var formatter: js.Any = js.native
  
  var style: FillFontSize = js.native
}
object AlignRight {
  
  @scala.inline
  def apply(alignRight: Boolean, formatter: js.Any, style: FillFontSize): AlignRight = {
    val __obj = js.Dynamic.literal(alignRight = alignRight.asInstanceOf[js.Any], formatter = formatter.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlignRight]
  }
  
  @scala.inline
  implicit class AlignRightMutableBuilder[Self <: AlignRight] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlignRight(value: Boolean): Self = StObject.set(x, "alignRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatter(value: js.Any): Self = StObject.set(x, "formatter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: FillFontSize): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
