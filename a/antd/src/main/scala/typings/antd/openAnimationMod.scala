package typings.antd

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object openAnimationMod {
  
  object default {
    
    @JSImport("antd/lib/collapse/openAnimation", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def appear(node: HTMLElement, done: js.Function0[Unit]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("appear")(node.asInstanceOf[js.Any], done.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    inline def enter(node: HTMLElement, done: js.Function0[Unit]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("enter")(node.asInstanceOf[js.Any], done.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    inline def leave(node: HTMLElement, done: js.Function0[Unit]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("leave")(node.asInstanceOf[js.Any], done.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  }
}
