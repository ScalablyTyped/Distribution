package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplicationRule extends js.Object {
  /**
    * 
    */
  var DeleteMarkerReplication: js.UndefOr[DeleteMarkerReplication] = js.undefined
  /**
    * A container for information about the replication destination.
    */
  var Destination: awsDashSdkLib.clientsS3Mod.Destination
  /**
    * 
    */
  var Filter: js.UndefOr[ReplicationRuleFilter] = js.undefined
  /**
    * A unique identifier for the rule. The maximum value is 255 characters.
    */
  var ID: js.UndefOr[ID] = js.undefined
  /**
    * An object keyname prefix that identifies the object or objects to which the rule applies. The maximum prefix length is 1,024 characters. To include all objects in a bucket, specify an empty string. 
    */
  var Prefix: js.UndefOr[Prefix] = js.undefined
  /**
    * The priority associated with the rule. If you specify multiple rules in a replication configuration, Amazon S3 prioritizes the rules to prevent conflicts when filtering. If two or more rules identify the same object based on a specified filter, the rule with higher priority takes precedence. For example:   Same object quality prefix based filter criteria If prefixes you specified in multiple rules overlap    Same object qualify tag based filter criteria specified in multiple rules   For more information, see Cross-Region Replication (CRR) in the Amazon S3 Developer Guide.
    */
  var Priority: js.UndefOr[Priority] = js.undefined
  /**
    * A container that describes additional filters for identifying the source objects that you want to replicate. You can choose to enable or disable the replication of these objects. Currently, Amazon S3 supports only the filter that you can specify for objects created with server-side encryption using an AWS KMS-Managed Key (SSE-KMS).
    */
  var SourceSelectionCriteria: js.UndefOr[SourceSelectionCriteria] = js.undefined
  /**
    * Specifies whether the rule is enabled.
    */
  var Status: ReplicationRuleStatus
}

object ReplicationRule {
  @scala.inline
  def apply(
    Destination: Destination,
    Status: ReplicationRuleStatus,
    DeleteMarkerReplication: DeleteMarkerReplication = null,
    Filter: ReplicationRuleFilter = null,
    ID: ID = null,
    Prefix: Prefix = null,
    Priority: js.UndefOr[Priority] = js.undefined,
    SourceSelectionCriteria: SourceSelectionCriteria = null
  ): ReplicationRule = {
    val __obj = js.Dynamic.literal(Destination = Destination, Status = Status.asInstanceOf[js.Any])
    if (DeleteMarkerReplication != null) __obj.updateDynamic("DeleteMarkerReplication")(DeleteMarkerReplication)
    if (Filter != null) __obj.updateDynamic("Filter")(Filter)
    if (ID != null) __obj.updateDynamic("ID")(ID)
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix)
    if (!js.isUndefined(Priority)) __obj.updateDynamic("Priority")(Priority)
    if (SourceSelectionCriteria != null) __obj.updateDynamic("SourceSelectionCriteria")(SourceSelectionCriteria)
    __obj.asInstanceOf[ReplicationRule]
  }
}

