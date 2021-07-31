package typings.astTypes

import typings.astTypes.astTypesMod.Fork
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esprimaMod {
  
  @JSImport("ast-types/def/esprima", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(fork: Fork): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(fork.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
