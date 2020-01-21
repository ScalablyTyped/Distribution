package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsCloudMapServiceDiscovery extends js.Object {
  /**
    * A string map that contains attributes with values that you can use to filter instances
    by any custom attribute that you specified when you registered the instance. Only instances
    that match all of the specified key/value pairs will be returned.
    */
  var attributes: js.UndefOr[AwsCloudMapInstanceAttributes] = js.native
  /**
    * The name of the AWS Cloud Map namespace to use.
    */
  var namespaceName: AwsCloudMapName = js.native
  /**
    * The name of the AWS Cloud Map service to use.
    */
  var serviceName: AwsCloudMapName = js.native
}

object AwsCloudMapServiceDiscovery {
  @scala.inline
  def apply(
    namespaceName: AwsCloudMapName,
    serviceName: AwsCloudMapName,
    attributes: AwsCloudMapInstanceAttributes = null
  ): AwsCloudMapServiceDiscovery = {
    val __obj = js.Dynamic.literal(namespaceName = namespaceName.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsCloudMapServiceDiscovery]
  }
}

