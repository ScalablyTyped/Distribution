package typings.angularDevkitArchitect

import typings.angularDevkitArchitect.srcApiMod.BuilderHandlerFn
import typings.angularDevkitArchitect.srcApiMod.BuilderOutput
import typings.angularDevkitArchitect.srcInternalMod.Builder
import typings.angularDevkitCore.srcJsonUtilsMod.JsonObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCreateBuilderMod {
  
  @JSImport("@angular-devkit/architect/src/create-builder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createBuilder[OptT, OutT /* <: BuilderOutput */](fn: BuilderHandlerFn[OptT]): Builder[OptT & JsonObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("createBuilder")(fn.asInstanceOf[js.Any]).asInstanceOf[Builder[OptT & JsonObject]]
}
