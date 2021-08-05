package typings.astTypes

import typings.astTypes.anon.AstNodesAreEquivalent
import typings.astTypes.astTypesMod.Def
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object forkMod {
  
  @JSImport("ast-types/fork", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(defs: js.Array[Def]): AstNodesAreEquivalent = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(defs.asInstanceOf[js.Any]).asInstanceOf[AstNodesAreEquivalent]
}
