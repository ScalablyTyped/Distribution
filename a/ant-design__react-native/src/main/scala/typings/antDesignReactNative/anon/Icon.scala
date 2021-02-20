package typings.antDesignReactNative.anon

import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Icon extends StObject {
  
  var icon: Element = js.native
  
  var text: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 420 */ js.Any = js.native
}
object Icon {
  
  @scala.inline
  def apply(
    icon: Element,
    text: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 420 */ js.Any
  ): Icon = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Icon]
  }
  
  @scala.inline
  implicit class IconMutableBuilder[Self <: Icon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIcon(value: Element): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 420 */ js.Any): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
