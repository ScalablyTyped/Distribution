package typings.antvComponent.libTypesMod

import typings.antvGBase.libInterfacesMod.IGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShapeAnnotationCfg
  extends StObject
     with GroupComponentCfg {
  
  /** 自定义 render 函数，注意绘制的 shape/group 需要设置 id */
  def render(container: IGroup): Unit
}
object ShapeAnnotationCfg {
  
  inline def apply(container: IGroup, render: IGroup => Unit): ShapeAnnotationCfg = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], render = js.Any.fromFunction1(render))
    __obj.asInstanceOf[ShapeAnnotationCfg]
  }
  
  extension [Self <: ShapeAnnotationCfg](x: Self) {
    
    inline def setRender(value: IGroup => Unit): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
  }
}
