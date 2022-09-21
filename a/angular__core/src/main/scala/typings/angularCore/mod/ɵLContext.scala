package typings.angularCore.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/core", "\u0275LContext")
@js.native
open class ɵLContext protected () extends StObject {
  def this(
    /**
    * ID of the component's parent view data.
    */
  lViewId: Double,
    /**
    * The index instance of the node.
    */
  nodeIndex: Double,
    /**
    * The instance of the DOM node that is attached to the lNode.
    */
  native: RNode
  ) = this()
  
  /**
    * The instance of the Component node.
    */
  var component: js.UndefOr[js.Object | Null] = js.native
  
  /**
    * The list of active directives that exist on this element.
    */
  var directives: js.UndefOr[js.Array[Any] | Null] = js.native
  
  /** Component's parent view data. */
  def lView: LView[Any] | Null = js.native
  
  /**
    * ID of the component's parent view data.
    */
  /* private */ var lViewId: Any = js.native
  
  /**
    * The map of local references (local reference name => element or directive instance) that
    * exist on this element.
    */
  var localRefs: js.UndefOr[StringDictionary[Any] | Null] = js.native
  
  /**
    * The instance of the DOM node that is attached to the lNode.
    */
  var native: RNode = js.native
  
  /**
    * The index instance of the node.
    */
  var nodeIndex: Double = js.native
}
