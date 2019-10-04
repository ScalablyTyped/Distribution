package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateInstancesRequest extends js.Object {
  /**
    * An array of objects representing the add-ons to enable for the new instance.
    */
  var addOns: js.UndefOr[AddOnRequestList] = js.undefined
  /**
    * The Availability Zone in which to create your instance. Use the following format: us-east-2a (case sensitive). You can get a list of Availability Zones by using the get regions operation. Be sure to add the include Availability Zones parameter to your request.
    */
  var availabilityZone: String
  /**
    * The ID for a virtual private server image (e.g., app_wordpress_4_4 or app_lamp_7_0). Use the get blueprints operation to return a list of available images (or blueprints).  Use active blueprints when creating new instances. Inactive blueprints are listed to support customers with existing instances and are not necessarily available to create new instances. Blueprints are marked inactive when they become outdated due to operating system updates or new application releases. 
    */
  var blueprintId: NonEmptyString
  /**
    * The bundle of specification information for your virtual private server (or instance), including the pricing plan (e.g., micro_1_0).
    */
  var bundleId: NonEmptyString
  /**
    * (Deprecated) The name for your custom image.  In releases prior to June 12, 2017, this parameter was ignored by the API. It is now deprecated. 
    */
  var customImageName: js.UndefOr[ResourceName] = js.undefined
  /**
    * The names to use for your new Lightsail instances. Separate multiple values using quotation marks and commas, for example: ["MyFirstInstance","MySecondInstance"] 
    */
  var instanceNames: StringList
  /**
    * The name of your key pair.
    */
  var keyPairName: js.UndefOr[ResourceName] = js.undefined
  /**
    * The tag keys and optional values to add to the resource during create. To tag a resource after it has been created, see the tag resource operation.
    */
  var tags: js.UndefOr[TagList] = js.undefined
  /**
    * A launch script you can create that configures a server with additional user data. For example, you might want to run apt-get -y update.  Depending on the machine image you choose, the command to get software on your instance varies. Amazon Linux and CentOS use yum, Debian and Ubuntu use apt-get, and FreeBSD uses pkg. For a complete list, see the Dev Guide. 
    */
  var userData: js.UndefOr[String] = js.undefined
}

object CreateInstancesRequest {
  @scala.inline
  def apply(
    availabilityZone: String,
    blueprintId: NonEmptyString,
    bundleId: NonEmptyString,
    instanceNames: StringList,
    addOns: AddOnRequestList = null,
    customImageName: ResourceName = null,
    keyPairName: ResourceName = null,
    tags: TagList = null,
    userData: String = null
  ): CreateInstancesRequest = {
    val __obj = js.Dynamic.literal(availabilityZone = availabilityZone, blueprintId = blueprintId, bundleId = bundleId, instanceNames = instanceNames)
    if (addOns != null) __obj.updateDynamic("addOns")(addOns)
    if (customImageName != null) __obj.updateDynamic("customImageName")(customImageName)
    if (keyPairName != null) __obj.updateDynamic("keyPairName")(keyPairName)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (userData != null) __obj.updateDynamic("userData")(userData)
    __obj.asInstanceOf[CreateInstancesRequest]
  }
}

