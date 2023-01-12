package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResumeWorkflowRunRequest extends StObject {
  
  /**
    * The name of the workflow to resume.
    */
  var Name: NameString
  
  /**
    * A list of the node IDs for the nodes you want to restart. The nodes that are to be restarted must have a run attempt in the original run.
    */
  var NodeIds: NodeIdList
  
  /**
    * The ID of the workflow run to resume.
    */
  var RunId: IdString
}
object ResumeWorkflowRunRequest {
  
  inline def apply(Name: NameString, NodeIds: NodeIdList, RunId: IdString): ResumeWorkflowRunRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], NodeIds = NodeIds.asInstanceOf[js.Any], RunId = RunId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResumeWorkflowRunRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResumeWorkflowRunRequest] (val x: Self) extends AnyVal {
    
    inline def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNodeIds(value: NodeIdList): Self = StObject.set(x, "NodeIds", value.asInstanceOf[js.Any])
    
    inline def setNodeIdsVarargs(value: NameString*): Self = StObject.set(x, "NodeIds", js.Array(value*))
    
    inline def setRunId(value: IdString): Self = StObject.set(x, "RunId", value.asInstanceOf[js.Any])
  }
}
