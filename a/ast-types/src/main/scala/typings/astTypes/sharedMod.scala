package typings.astTypes

import typings.astTypes.anon.Geq
import typings.astTypes.astTypesMod.Fork
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sharedMod {
  
  @JSImport("ast-types/lib/shared", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(fork: Fork): Geq = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(fork.asInstanceOf[js.Any]).asInstanceOf[Geq]
}
