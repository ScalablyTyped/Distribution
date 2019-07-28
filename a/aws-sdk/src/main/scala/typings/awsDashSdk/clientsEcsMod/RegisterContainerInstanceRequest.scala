package typings.awsDashSdk.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisterContainerInstanceRequest extends js.Object {
  /**
    * The container instance attributes that this container instance supports.
    */
  var attributes: js.UndefOr[Attributes] = js.undefined
  /**
    * The short name or full Amazon Resource Name (ARN) of the cluster with which to register your container instance. If you do not specify a cluster, the default cluster is assumed.
    */
  var cluster: js.UndefOr[String] = js.undefined
  /**
    * The ARN of the container instance (if it was previously registered).
    */
  var containerInstanceArn: js.UndefOr[String] = js.undefined
  /**
    * The instance identity document for the EC2 instance to register. This document can be found by running the following command from the instance: curl http://169.254.169.254/latest/dynamic/instance-identity/document/ 
    */
  var instanceIdentityDocument: js.UndefOr[String] = js.undefined
  /**
    * The instance identity document signature for the EC2 instance to register. This signature can be found by running the following command from the instance: curl http://169.254.169.254/latest/dynamic/instance-identity/signature/ 
    */
  var instanceIdentityDocumentSignature: js.UndefOr[String] = js.undefined
  /**
    * The devices that are available on the container instance. The only supported device type is a GPU.
    */
  var platformDevices: js.UndefOr[PlatformDevices] = js.undefined
  /**
    * The metadata that you apply to the container instance to help you categorize and organize them. Each tag consists of a key and an optional value, both of which you define. Tag keys can have a maximum character length of 128 characters, and tag values can have a maximum length of 256 characters.
    */
  var tags: js.UndefOr[Tags] = js.undefined
  /**
    * The resources available on the instance.
    */
  var totalResources: js.UndefOr[Resources] = js.undefined
  /**
    * The version information for the Amazon ECS container agent and Docker daemon running on the container instance.
    */
  var versionInfo: js.UndefOr[VersionInfo] = js.undefined
}

object RegisterContainerInstanceRequest {
  @scala.inline
  def apply(
    attributes: Attributes = null,
    cluster: String = null,
    containerInstanceArn: String = null,
    instanceIdentityDocument: String = null,
    instanceIdentityDocumentSignature: String = null,
    platformDevices: PlatformDevices = null,
    tags: Tags = null,
    totalResources: Resources = null,
    versionInfo: VersionInfo = null
  ): RegisterContainerInstanceRequest = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (cluster != null) __obj.updateDynamic("cluster")(cluster)
    if (containerInstanceArn != null) __obj.updateDynamic("containerInstanceArn")(containerInstanceArn)
    if (instanceIdentityDocument != null) __obj.updateDynamic("instanceIdentityDocument")(instanceIdentityDocument)
    if (instanceIdentityDocumentSignature != null) __obj.updateDynamic("instanceIdentityDocumentSignature")(instanceIdentityDocumentSignature)
    if (platformDevices != null) __obj.updateDynamic("platformDevices")(platformDevices)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (totalResources != null) __obj.updateDynamic("totalResources")(totalResources)
    if (versionInfo != null) __obj.updateDynamic("versionInfo")(versionInfo)
    __obj.asInstanceOf[RegisterContainerInstanceRequest]
  }
}

