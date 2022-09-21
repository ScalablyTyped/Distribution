package typings.ahooks

import typings.ahooks.domTargetMod.BasicTarget
import typings.std.Document
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useScrollMod {
  
  @JSImport("ahooks/lib/useScroll", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.UndefOr[Position] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.UndefOr[Position]]
  inline def default(target: Unit, shouldUpdate: ScrollListenController): js.UndefOr[Position] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], shouldUpdate.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Position]]
  inline def default(target: Target): js.UndefOr[Position] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Position]]
  inline def default(target: Target, shouldUpdate: ScrollListenController): js.UndefOr[Position] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], shouldUpdate.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Position]]
  
  trait Position extends StObject {
    
    var left: Double
    
    var top: Double
  }
  object Position {
    
    inline def apply(left: Double, top: Double): Position = {
      val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[Position]
    }
    
    extension [Self <: Position](x: Self) {
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  type ScrollListenController = js.Function1[/* val */ Position, Boolean]
  
  type Target = BasicTarget[Element | Document]
}
