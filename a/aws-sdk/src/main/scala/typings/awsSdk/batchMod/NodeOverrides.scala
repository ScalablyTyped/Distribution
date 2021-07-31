package typings.awsSdk.batchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeOverrides extends StObject {
  
  /**
    * The node property overrides for the job.
    */
  var nodePropertyOverrides: js.UndefOr[NodePropertyOverrides] = js.undefined
  
  /**
    * The number of nodes to use with a multi-node parallel job. This value overrides the number of nodes that are specified in the job definition. To use this override:   There must be at least one node range in your job definition that has an open upper boundary (such as : or n:).   The lower boundary of the node range specified in the job definition must be fewer than the number of nodes specified in the override.   The main node index specified in the job definition must be fewer than the number of nodes specified in the override.  
    */
  var numNodes: js.UndefOr[Integer] = js.undefined
}
object NodeOverrides {
  
  @scala.inline
  def apply(): NodeOverrides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeOverrides]
  }
  
  @scala.inline
  implicit class NodeOverridesMutableBuilder[Self <: NodeOverrides] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNodePropertyOverrides(value: NodePropertyOverrides): Self = StObject.set(x, "nodePropertyOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodePropertyOverridesUndefined: Self = StObject.set(x, "nodePropertyOverrides", js.undefined)
    
    @scala.inline
    def setNodePropertyOverridesVarargs(value: NodePropertyOverride*): Self = StObject.set(x, "nodePropertyOverrides", js.Array(value :_*))
    
    @scala.inline
    def setNumNodes(value: Integer): Self = StObject.set(x, "numNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumNodesUndefined: Self = StObject.set(x, "numNodes", js.undefined)
  }
}
