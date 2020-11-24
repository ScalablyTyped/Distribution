package typings.antvComponent.typesMod

import typings.antvGBase.interfacesMod.IGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShapeAnnotationCfg extends GroupComponentCfg {
  
  /** 自定义 render 函数，注意绘制的 shape/group 需要设置 id */
  def render(container: IGroup): Unit = js.native
}
object ShapeAnnotationCfg {
  
  @scala.inline
  def apply(container: IGroup, render: IGroup => Unit): ShapeAnnotationCfg = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], render = js.Any.fromFunction1(render))
    __obj.asInstanceOf[ShapeAnnotationCfg]
  }
  
  @scala.inline
  implicit class ShapeAnnotationCfgOps[Self <: ShapeAnnotationCfg] (val x: Self) extends AnyVal {
    
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
    def setRender(value: IGroup => Unit): Self = this.set("render", js.Any.fromFunction1(value))
  }
}
