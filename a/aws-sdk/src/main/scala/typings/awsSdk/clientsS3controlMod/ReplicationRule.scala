package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplicationRule extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the access point for the source Outposts bucket that you want S3 on Outposts to replicate the objects from.
    */
  var Bucket: BucketIdentifierString
  
  /**
    * Specifies whether S3 on Outposts replicates delete markers. If you specify a Filter element in your replication configuration, you must also include a DeleteMarkerReplication element. If your Filter includes a Tag element, the DeleteMarkerReplication element's Status child element must be set to Disabled, because S3 on Outposts doesn't support replicating delete markers for tag-based rules. For more information about delete marker replication, see How delete operations affect replication in the Amazon S3 User Guide. 
    */
  var DeleteMarkerReplication: js.UndefOr[typings.awsSdk.clientsS3controlMod.DeleteMarkerReplication] = js.undefined
  
  /**
    * A container for information about the replication destination and its configurations.
    */
  var Destination: typings.awsSdk.clientsS3controlMod.Destination
  
  /**
    * An optional configuration to replicate existing source bucket objects.   This is not supported by Amazon S3 on Outposts buckets. 
    */
  var ExistingObjectReplication: js.UndefOr[typings.awsSdk.clientsS3controlMod.ExistingObjectReplication] = js.undefined
  
  /**
    * A filter that identifies the subset of objects to which the replication rule applies. A Filter element must specify exactly one Prefix, Tag, or And child element.
    */
  var Filter: js.UndefOr[ReplicationRuleFilter] = js.undefined
  
  /**
    * A unique identifier for the rule. The maximum value is 255 characters.
    */
  var ID: js.UndefOr[typings.awsSdk.clientsS3controlMod.ID] = js.undefined
  
  /**
    * An object key name prefix that identifies the object or objects to which the rule applies. The maximum prefix length is 1,024 characters. To include all objects in an Outposts bucket, specify an empty string.  When you're using XML requests, you must replace special characters (such as carriage returns) in object keys with their equivalent XML entity codes. For more information, see  XML-related object key constraints in the Amazon S3 User Guide. 
    */
  var Prefix: js.UndefOr[typings.awsSdk.clientsS3controlMod.Prefix] = js.undefined
  
  /**
    * The priority indicates which rule has precedence whenever two or more replication rules conflict. S3 on Outposts attempts to replicate objects according to all replication rules. However, if there are two or more rules with the same destination Outposts bucket, then objects will be replicated according to the rule with the highest priority. The higher the number, the higher the priority.  For more information, see Creating replication rules on Outposts in the Amazon S3 User Guide.
    */
  var Priority: js.UndefOr[typings.awsSdk.clientsS3controlMod.Priority] = js.undefined
  
  /**
    * A container that describes additional filters for identifying the source Outposts objects that you want to replicate. You can choose to enable or disable the replication of these objects.
    */
  var SourceSelectionCriteria: js.UndefOr[typings.awsSdk.clientsS3controlMod.SourceSelectionCriteria] = js.undefined
  
  /**
    * Specifies whether the rule is enabled.
    */
  var Status: ReplicationRuleStatus
}
object ReplicationRule {
  
  inline def apply(Bucket: BucketIdentifierString, Destination: Destination, Status: ReplicationRuleStatus): ReplicationRule = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Destination = Destination.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicationRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReplicationRule] (val x: Self) extends AnyVal {
    
    inline def setBucket(value: BucketIdentifierString): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
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
