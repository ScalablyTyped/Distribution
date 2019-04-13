package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateInstancesFromSnapshotRequest extends js.Object {
  /**
    * An object containing information about one or more disk mappings.
    */
  var attachedDiskMapping: js.UndefOr[AttachedDiskMap] = js.undefined
  /**
    * The Availability Zone where you want to create your instances. Use the following formatting: us-east-2a (case sensitive). You can get a list of Availability Zones by using the get regions operation. Be sure to add the include Availability Zones parameter to your request.
    */
  var availabilityZone: java.lang.String
  /**
    * The bundle of specification information for your virtual private server (or instance), including the pricing plan (e.g., micro_1_0).
    */
  var bundleId: NonEmptyString
  /**
    * The names for your new instances.
    */
  var instanceNames: StringList
  /**
    * The name of the instance snapshot on which you are basing your new instances. Use the get instance snapshots operation to return information about your existing snapshots.
    */
  var instanceSnapshotName: ResourceName
  /**
    * The name for your key pair.
    */
  var keyPairName: js.UndefOr[ResourceName] = js.undefined
  /**
    * The tag keys and optional values to add to the resource during create. To tag a resource after it has been created, see the tag resource operation.
    */
  var tags: js.UndefOr[TagList] = js.undefined
  /**
    * You can create a launch script that configures a server with additional user data. For example, apt-get -y update.  Depending on the machine image you choose, the command to get software on your instance varies. Amazon Linux and CentOS use yum, Debian and Ubuntu use apt-get, and FreeBSD uses pkg. For a complete list, see the Dev Guide. 
    */
  var userData: js.UndefOr[java.lang.String] = js.undefined
}

object CreateInstancesFromSnapshotRequest {
  @scala.inline
  def apply(
    availabilityZone: java.lang.String,
    bundleId: NonEmptyString,
    instanceNames: StringList,
    instanceSnapshotName: ResourceName,
    attachedDiskMapping: AttachedDiskMap = null,
    keyPairName: ResourceName = null,
    tags: TagList = null,
    userData: java.lang.String = null
  ): CreateInstancesFromSnapshotRequest = {
    val __obj = js.Dynamic.literal(availabilityZone = availabilityZone, bundleId = bundleId, instanceNames = instanceNames, instanceSnapshotName = instanceSnapshotName)
    if (attachedDiskMapping != null) __obj.updateDynamic("attachedDiskMapping")(attachedDiskMapping)
    if (keyPairName != null) __obj.updateDynamic("keyPairName")(keyPairName)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (userData != null) __obj.updateDynamic("userData")(userData)
    __obj.asInstanceOf[CreateInstancesFromSnapshotRequest]
  }
}

