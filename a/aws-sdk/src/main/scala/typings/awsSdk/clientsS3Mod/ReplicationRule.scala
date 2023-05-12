package typings.awsSdk.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplicationRule extends StObject {
  
  var DeleteMarkerReplication: js.UndefOr[typings.awsSdk.clientsS3Mod.DeleteMarkerReplication] = js.undefined
  
  /**
    * A container for information about the replication destination and its configurations including enabling the S3 Replication Time Control (S3 RTC).
    */
  var Destination: typings.awsSdk.clientsS3Mod.Destination
  
  /**
    * Optional configuration to replicate existing source bucket objects. For more information, see Replicating Existing Objects in the Amazon S3 User Guide. 
    */
  var ExistingObjectReplication: js.UndefOr[typings.awsSdk.clientsS3Mod.ExistingObjectReplication] = js.undefined
  
  var Filter: js.UndefOr[ReplicationRuleFilter] = js.undefined
  
  /**
    * A unique identifier for the rule. The maximum value is 255 characters.
    */
  var ID: js.UndefOr[typings.awsSdk.clientsS3Mod.ID] = js.undefined
  
  /**
    * An object key name prefix that identifies the object or objects to which the rule applies. The maximum prefix length is 1,024 characters. To include all objects in a bucket, specify an empty string.   Replacement must be made for object keys containing special characters (such as carriage returns) when using XML requests. For more information, see  XML related object key constraints. 
    */
  var Prefix: js.UndefOr[typings.awsSdk.clientsS3Mod.Prefix] = js.undefined
  
  /**
    * The priority indicates which rule has precedence whenever two or more replication rules conflict. Amazon S3 will attempt to replicate objects according to all replication rules. However, if there are two or more rules with the same destination bucket, then objects will be replicated according to the rule with the highest priority. The higher the number, the higher the priority.  For more information, see Replication in the Amazon S3 User Guide.
    */
  var Priority: js.UndefOr[typings.awsSdk.clientsS3Mod.Priority] = js.undefined
  
  /**
    * A container that describes additional filters for identifying the source objects that you want to replicate. You can choose to enable or disable the replication of these objects. Currently, Amazon S3 supports only the filter that you can specify for objects created with server-side encryption using a customer managed key stored in Amazon Web Services Key Management Service (SSE-KMS).
    */
  var SourceSelectionCriteria: js.UndefOr[typings.awsSdk.clientsS3Mod.SourceSelectionCriteria] = js.undefined
  
  /**
    * Specifies whether the rule is enabled.
    */
  var Status: ReplicationRuleStatus
}
object ReplicationRule {
  
  inline def apply(Destination: Destination, Status: ReplicationRuleStatus): ReplicationRule = {
    val __obj = js.Dynamic.literal(Destination = Destination.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicationRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReplicationRule] (val x: Self) extends AnyVal {
    
    inline def setDeleteMarkerReplication(value: DeleteMarkerReplication): Self = StObject.set(x, "DeleteMarkerReplication", value.asInstanceOf[js.Any])
    
    inline def setDeleteMarkerReplicationUndefined: Self = StObject.set(x, "DeleteMarkerReplication", js.undefined)
    
    inline def setDestination(value: Destination): Self = StObject.set(x, "Destination", value.asInstanceOf[js.Any])
    
    inline def setExistingObjectReplication(value: ExistingObjectReplication): Self = StObject.set(x, "ExistingObjectReplication", value.asInstanceOf[js.Any])
    
    inline def setExistingObjectReplicationUndefined: Self = StObject.set(x, "ExistingObjectReplication", js.undefined)
    
    inline def setFilter(value: ReplicationRuleFilter): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "Filter", js.undefined)
    
    inline def setID(value: ID): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    inline def setIDUndefined: Self = StObject.set(x, "ID", js.undefined)
    
    inline def setPrefix(value: Prefix): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "Prefix", js.undefined)
    
    inline def setPriority(value: Priority): Self = StObject.set(x, "Priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "Priority", js.undefined)
    
    inline def setSourceSelectionCriteria(value: SourceSelectionCriteria): Self = StObject.set(x, "SourceSelectionCriteria", value.asInstanceOf[js.Any])
    
    inline def setSourceSelectionCriteriaUndefined: Self = StObject.set(x, "SourceSelectionCriteria", js.undefined)
    
    inline def setStatus(value: ReplicationRuleStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
