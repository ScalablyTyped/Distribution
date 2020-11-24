package typings.antdMobile.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtraProps extends js.Object {
  
  var extraProps: RenderBodyComponent = js.native
  
  var restProps: ClassName = js.native
}
object ExtraProps {
  
  @scala.inline
  def apply(extraProps: RenderBodyComponent, restProps: ClassName): ExtraProps = {
    val __obj = js.Dynamic.literal(extraProps = extraProps.asInstanceOf[js.Any], restProps = restProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtraProps]
  }
  
  @scala.inline
  implicit class ExtraPropsOps[Self <: ExtraProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExtraProps(value: RenderBodyComponent): Self = this.set("extraProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestProps(value: ClassName): Self = this.set("restProps", value.asInstanceOf[js.Any])
  }
}
