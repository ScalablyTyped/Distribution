package typings.angularCompilerCli

import typings.babelTypes.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object coreMod {
  
  trait BabelFile extends StObject {
    
    def buildCodeFrameError(node: Node, message: String): js.Error
  }
  object BabelFile {
    
    inline def apply(buildCodeFrameError: (Node, String) => js.Error): BabelFile = {
      val __obj = js.Dynamic.literal(buildCodeFrameError = js.Any.fromFunction2(buildCodeFrameError))
      __obj.asInstanceOf[BabelFile]
    }
    
    extension [Self <: BabelFile](x: Self) {
      
      inline def setBuildCodeFrameError(value: (Node, String) => js.Error): Self = StObject.set(x, "buildCodeFrameError", js.Any.fromFunction2(value))
    }
  }
}
