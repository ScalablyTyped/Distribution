package typings.angularCore.mod

import org.scalablytyped.runtime.NumberDictionary
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object that contains hydration-related information serialized
  * on the server, as well as the necessary references to segments of
  * the DOM, to facilitate the hydration process for a given hydration
  * boundary on the client.
  */
trait DehydratedView extends StObject {
  
  /**
    * An instance of a Set that represents nodes disconnected from
    * the DOM tree at the serialization time, but otherwise present
    * in the internal data structures.
    *
    * The Set is based on the `SerializedView[DISCONNECTED_NODES]` data
    * and is needed to have constant-time lookups.
    *
    * If the value is `null`, it means that there were no disconnected
    * nodes detected in this view at serialization time.
    */
  var disconnectedNodes: js.UndefOr[Set[Double] | Null] = js.undefined
  
  /**
    * A reference to the first child in a DOM segment associated
    * with a given hydration boundary.
    */
  var firstChild: RNode | Null
  
  /**
    * Stores references to first nodes in DOM segments that
    * represent either an <ng-container> or a view container.
    */
  var segmentHeads: js.UndefOr[NumberDictionary[RNode | Null]] = js.undefined
}
object DehydratedView {
  
  inline def apply(): DehydratedView = {
    val __obj = js.Dynamic.literal(firstChild = null)
    __obj.asInstanceOf[DehydratedView]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DehydratedView] (val x: Self) extends AnyVal {
    
    inline def setDisconnectedNodes(value: Set[Double]): Self = StObject.set(x, "disconnectedNodes", value.asInstanceOf[js.Any])
    
    inline def setDisconnectedNodesNull: Self = StObject.set(x, "disconnectedNodes", null)
    
    inline def setDisconnectedNodesUndefined: Self = StObject.set(x, "disconnectedNodes", js.undefined)
    
    inline def setFirstChild(value: RNode): Self = StObject.set(x, "firstChild", value.asInstanceOf[js.Any])
    
    inline def setFirstChildNull: Self = StObject.set(x, "firstChild", null)
    
    inline def setSegmentHeads(value: NumberDictionary[RNode | Null]): Self = StObject.set(x, "segmentHeads", value.asInstanceOf[js.Any])
    
    inline def setSegmentHeadsUndefined: Self = StObject.set(x, "segmentHeads", js.undefined)
  }
}
