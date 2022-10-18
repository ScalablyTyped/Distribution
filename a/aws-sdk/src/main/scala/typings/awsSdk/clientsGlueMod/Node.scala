package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Node extends StObject {
  
  /**
    * Details of the crawler when the node represents a crawler.
    */
  var CrawlerDetails: js.UndefOr[CrawlerNodeDetails] = js.undefined
  
  /**
    * Details of the Job when the node represents a Job.
    */
  var JobDetails: js.UndefOr[JobNodeDetails] = js.undefined
  
  /**
    * The name of the Glue component represented by the node.
    */
  var Name: js.UndefOr[NameString] = js.undefined
  
  /**
    * Details of the Trigger when the node represents a Trigger.
    */
  var TriggerDetails: js.UndefOr[TriggerNodeDetails] = js.undefined
  
  /**
    * The type of Glue component represented by the node.
    */
  var Type: js.UndefOr[NodeType] = js.undefined
  
  /**
    * The unique Id assigned to the node within the workflow.
    */
  var UniqueId: js.UndefOr[NameString] = js.undefined
}
object Node {
  
  inline def apply(): Node = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Node]
  }
  
  extension [Self <: Node](x: Self) {
    
    inline def setCrawlerDetails(value: CrawlerNodeDetails): Self = StObject.set(x, "CrawlerDetails", value.asInstanceOf[js.Any])
    
    inline def setCrawlerDetailsUndefined: Self = StObject.set(x, "CrawlerDetails", js.undefined)
    
    inline def setJobDetails(value: JobNodeDetails): Self = StObject.set(x, "JobDetails", value.asInstanceOf[js.Any])
    
    inline def setJobDetailsUndefined: Self = StObject.set(x, "JobDetails", js.undefined)
    
    inline def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setTriggerDetails(value: TriggerNodeDetails): Self = StObject.set(x, "TriggerDetails", value.asInstanceOf[js.Any])
    
    inline def setTriggerDetailsUndefined: Self = StObject.set(x, "TriggerDetails", js.undefined)
    
    inline def setType(value: NodeType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    inline def setUniqueId(value: NameString): Self = StObject.set(x, "UniqueId", value.asInstanceOf[js.Any])
    
    inline def setUniqueIdUndefined: Self = StObject.set(x, "UniqueId", js.undefined)
  }
}
