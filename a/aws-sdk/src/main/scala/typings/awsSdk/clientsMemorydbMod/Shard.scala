package typings.awsSdk.clientsMemorydbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Shard extends StObject {
  
  /**
    * The name of the shard
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * A list containing information about individual nodes within the shard
    */
  var Nodes: js.UndefOr[NodeList] = js.undefined
  
  /**
    * The number of nodes in the shard
    */
  var NumberOfNodes: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The keyspace for this shard.
    */
  var Slots: js.UndefOr[String] = js.undefined
  
  /**
    * The current state of this replication group - creating, available, modifying, deleting.
    */
  var Status: js.UndefOr[String] = js.undefined
}
object Shard {
  
  inline def apply(): Shard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Shard]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Shard] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setNodes(value: NodeList): Self = StObject.set(x, "Nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesUndefined: Self = StObject.set(x, "Nodes", js.undefined)
    
    inline def setNodesVarargs(value: Node*): Self = StObject.set(x, "Nodes", js.Array(value*))
    
    inline def setNumberOfNodes(value: IntegerOptional): Self = StObject.set(x, "NumberOfNodes", value.asInstanceOf[js.Any])
    
    inline def setNumberOfNodesUndefined: Self = StObject.set(x, "NumberOfNodes", js.undefined)
    
    inline def setSlots(value: String): Self = StObject.set(x, "Slots", value.asInstanceOf[js.Any])
    
    inline def setSlotsUndefined: Self = StObject.set(x, "Slots", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
