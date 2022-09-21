package typings.antvG2

import typings.std.CanvasRenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilContextMod {
  
  @JSImport("@antv/g2/lib/util/context", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getCanvasContext(): CanvasRenderingContext2D = ^.asInstanceOf[js.Dynamic].applyDynamic("getCanvasContext")().asInstanceOf[CanvasRenderingContext2D]
}
