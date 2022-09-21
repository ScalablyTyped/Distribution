package typings.angularDevkitArchitect

import typings.angularDevkitArchitect.apiMod.BuilderHandlerFn
import typings.angularDevkitArchitect.apiMod.BuilderOutput
import typings.angularDevkitArchitect.internalMod.Builder
import typings.angularDevkitCore.utilsMod.JsonObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createBuilderMod {
  
  @JSImport("@angular-devkit/architect/src/create-builder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createBuilder[OptT, OutT /* <: BuilderOutput */](fn: BuilderHandlerFn[OptT]): Builder[OptT & JsonObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("createBuilder")(fn.asInstanceOf[js.Any]).asInstanceOf[Builder[OptT & JsonObject]]
}
