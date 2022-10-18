package typings.angularDevkitCore

import typings.angularDevkitCore.anon.Exclude
import typings.angularDevkitCore.srcJsonUtilsMod.JsonArray
import typings.angularDevkitCore.srcJsonUtilsMod.JsonObject
import typings.angularDevkitCore.srcJsonUtilsMod.JsonValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcWorkspaceJsonUtilitiesMod {
  
  @JSImport("@angular-devkit/core/src/workspace/json/utilities", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createVirtualAstObject[T /* <: js.Object */](root: JsonArray): T = ^.asInstanceOf[js.Dynamic].applyDynamic("createVirtualAstObject")(root.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def createVirtualAstObject[T /* <: js.Object */](root: JsonArray, options: Exclude): T = (^.asInstanceOf[js.Dynamic].applyDynamic("createVirtualAstObject")(root.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def createVirtualAstObject[T /* <: js.Object */](root: JsonObject): T = ^.asInstanceOf[js.Dynamic].applyDynamic("createVirtualAstObject")(root.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def createVirtualAstObject[T /* <: js.Object */](root: JsonObject, options: Exclude): T = (^.asInstanceOf[js.Dynamic].applyDynamic("createVirtualAstObject")(root.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @js.native
  trait ChangeListener extends StObject {
    
    def apply(path: js.Array[String]): Unit = js.native
    def apply(path: js.Array[String], newValue: JsonValue): Unit = js.native
  }
}
