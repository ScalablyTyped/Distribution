package typings.antvG2.libInterfaceMod

import typings.antvG2.anon.ParsePosition
import typings.antvG2.viewMod.View
import typings.antvGBase.interfacesMod.IGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShapeAnnotationOption
  extends StObject
     with AnnotationBaseOption {
  
  /**
    * @title 自定义 Annotation 绘制函数
    */
  def render(container: IGroup, view: View, helpers: ParsePosition): Unit
}
object ShapeAnnotationOption {
  
  inline def apply(render: (IGroup, View, ParsePosition) => Unit): ShapeAnnotationOption = {
    val __obj = js.Dynamic.literal(render = js.Any.fromFunction3(render))
    __obj.asInstanceOf[ShapeAnnotationOption]
  }
  
  extension [Self <: ShapeAnnotationOption](x: Self) {
    
    inline def setRender(value: (IGroup, View, ParsePosition) => Unit): Self = StObject.set(x, "render", js.Any.fromFunction3(value))
  }
}
