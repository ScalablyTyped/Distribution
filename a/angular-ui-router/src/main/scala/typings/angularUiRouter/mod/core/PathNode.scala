package typings.angularUiRouter.mod.core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("angular-ui-router", "core.PathNode")
@js.native
open class PathNode protected ()
  extends typings.uirouterCore.mod.PathNode {
  /** Creates a copy of a PathNode */
  def this(node: typings.uirouterCore.pathNodeMod.PathNode) = this()
  /** Creates a new (empty) PathNode for a State */
  def this(state: typings.uirouterCore.stateObjectMod.StateObject) = this()
}
/* static members */
object PathNode {
  
  @JSImport("angular-ui-router", "core.PathNode")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns a clone of the PathNode
    * @deprecated use instance method `node.clone()`
    */
  inline def clone(node: typings.uirouterCore.pathNodeMod.PathNode): typings.uirouterCore.pathNodeMod.PathNode = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(node.asInstanceOf[js.Any]).asInstanceOf[typings.uirouterCore.pathNodeMod.PathNode]
}
