package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListVirtualNodesOutput extends StObject {
  
  /**
    * The nextToken value to include in a future ListVirtualNodes request. When the results of a ListVirtualNodes request exceed limit, you can use this value to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.native
  
  /**
    * The list of existing virtual nodes for the specified service mesh.
    */
  var virtualNodes: VirtualNodeList = js.native
}
object ListVirtualNodesOutput {
  
  @scala.inline
  def apply(virtualNodes: VirtualNodeList): ListVirtualNodesOutput = {
    val __obj = js.Dynamic.literal(virtualNodes = virtualNodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListVirtualNodesOutput]
  }
  
  @scala.inline
  implicit class ListVirtualNodesOutputMutableBuilder[Self <: ListVirtualNodesOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setVirtualNodes(value: VirtualNodeList): Self = StObject.set(x, "virtualNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualNodesVarargs(value: VirtualNodeRef*): Self = StObject.set(x, "virtualNodes", js.Array(value :_*))
  }
}
