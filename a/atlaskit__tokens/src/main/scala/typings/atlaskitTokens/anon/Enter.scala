package typings.atlaskitTokens.anon

import typings.babelTraverse.mod.NodePath
import typings.babelTypes.mod.Program_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Enter extends StObject {
  
  def enter(path: NodePath[Program_], state: Opts): Unit
  
  def exit(path: NodePath[Program_]): Unit
}
object Enter {
  
  inline def apply(enter: (NodePath[Program_], Opts) => Unit, exit: NodePath[Program_] => Unit): Enter = {
    val __obj = js.Dynamic.literal(enter = js.Any.fromFunction2(enter), exit = js.Any.fromFunction1(exit))
    __obj.asInstanceOf[Enter]
  }
  
  extension [Self <: Enter](x: Self) {
    
    inline def setEnter(value: (NodePath[Program_], Opts) => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setExit(value: NodePath[Program_] => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction1(value))
  }
}
