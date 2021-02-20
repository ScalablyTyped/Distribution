package typings.antvComponent.typesMod

import typings.antvGBase.interfacesMod.IGroup
import org.scalablytyped.runtime.StObject
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
  implicit class ShapeAnnotationCfgMutableBuilder[Self <: ShapeAnnotationCfg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRender(value: IGroup => Unit): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
  }
}
