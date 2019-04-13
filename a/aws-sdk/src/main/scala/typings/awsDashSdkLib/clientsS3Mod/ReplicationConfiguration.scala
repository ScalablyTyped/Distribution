package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplicationConfiguration extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that Amazon S3 can assume when replicating the objects.
    */
  var Role: awsDashSdkLib.clientsS3Mod.Role
  /**
    * A container for one or more replication rules. A replication configuration must have at least one rule and can contain a maximum of 1,000 rules. 
    */
  var Rules: ReplicationRules
}

object ReplicationConfiguration {
  @scala.inline
  def apply(Role: Role, Rules: ReplicationRules): ReplicationConfiguration = {
    val __obj = js.Dynamic.literal(Role = Role, Rules = Rules)
  
    __obj.asInstanceOf[ReplicationConfiguration]
  }
}

