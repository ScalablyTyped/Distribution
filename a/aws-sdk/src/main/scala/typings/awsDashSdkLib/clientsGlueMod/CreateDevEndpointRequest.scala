package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDevEndpointRequest extends js.Object {
  /**
    * A map of arguments used to configure the DevEndpoint.
    */
  var Arguments: js.UndefOr[MapValue] = js.undefined
  /**
    * The name to be assigned to the new DevEndpoint.
    */
  var EndpointName: GenericString
  /**
    * Path to one or more Java Jars in an S3 bucket that should be loaded in your DevEndpoint.
    */
  var ExtraJarsS3Path: js.UndefOr[GenericString] = js.undefined
  /**
    * Path(s) to one or more Python libraries in an S3 bucket that should be loaded in your DevEndpoint. Multiple values must be complete paths separated by a comma. Please note that only pure Python libraries can currently be used on a DevEndpoint. Libraries that rely on C extensions, such as the pandas Python data analysis library, are not yet supported.
    */
  var ExtraPythonLibsS3Path: js.UndefOr[GenericString] = js.undefined
  /**
    * The number of AWS Glue Data Processing Units (DPUs) to allocate to this DevEndpoint.
    */
  var NumberOfNodes: js.UndefOr[IntegerValue] = js.undefined
  /**
    * The public key to be used by this DevEndpoint for authentication. This attribute is provided for backward compatibility, as the recommended attribute to use is public keys.
    */
  var PublicKey: js.UndefOr[GenericString] = js.undefined
  /**
    * A list of public keys to be used by the DevEndpoints for authentication. The use of this attribute is preferred over a single public key because the public keys allow you to have a different private key per client.  If you previously created an endpoint with a public key, you must remove that key to be able to set a list of public keys: call the UpdateDevEndpoint API with the public key content in the deletePublicKeys attribute, and the list of new keys in the addPublicKeys attribute. 
    */
  var PublicKeys: js.UndefOr[PublicKeysList] = js.undefined
  /**
    * The IAM role for the DevEndpoint.
    */
  var RoleArn: awsDashSdkLib.clientsGlueMod.RoleArn
  /**
    * The name of the SecurityConfiguration structure to be used with this DevEndpoint.
    */
  var SecurityConfiguration: js.UndefOr[NameString] = js.undefined
  /**
    * Security group IDs for the security groups to be used by the new DevEndpoint.
    */
  var SecurityGroupIds: js.UndefOr[StringList] = js.undefined
  /**
    * The subnet ID for the new DevEndpoint to use.
    */
  var SubnetId: js.UndefOr[GenericString] = js.undefined
  /**
    * The tags to use with this DevEndpoint. You may use tags to limit access to the DevEndpoint. For more information about tags in AWS Glue, see AWS Tags in AWS Glue in the developer guide.
    */
  var Tags: js.UndefOr[TagsMap] = js.undefined
}

object CreateDevEndpointRequest {
  @scala.inline
  def apply(
    EndpointName: GenericString,
    RoleArn: RoleArn,
    Arguments: MapValue = null,
    ExtraJarsS3Path: GenericString = null,
    ExtraPythonLibsS3Path: GenericString = null,
    NumberOfNodes: js.UndefOr[IntegerValue] = js.undefined,
    PublicKey: GenericString = null,
    PublicKeys: PublicKeysList = null,
    SecurityConfiguration: NameString = null,
    SecurityGroupIds: StringList = null,
    SubnetId: GenericString = null,
    Tags: TagsMap = null
  ): CreateDevEndpointRequest = {
    val __obj = js.Dynamic.literal(EndpointName = EndpointName, RoleArn = RoleArn)
    if (Arguments != null) __obj.updateDynamic("Arguments")(Arguments)
    if (ExtraJarsS3Path != null) __obj.updateDynamic("ExtraJarsS3Path")(ExtraJarsS3Path)
    if (ExtraPythonLibsS3Path != null) __obj.updateDynamic("ExtraPythonLibsS3Path")(ExtraPythonLibsS3Path)
    if (!js.isUndefined(NumberOfNodes)) __obj.updateDynamic("NumberOfNodes")(NumberOfNodes)
    if (PublicKey != null) __obj.updateDynamic("PublicKey")(PublicKey)
    if (PublicKeys != null) __obj.updateDynamic("PublicKeys")(PublicKeys)
    if (SecurityConfiguration != null) __obj.updateDynamic("SecurityConfiguration")(SecurityConfiguration)
    if (SecurityGroupIds != null) __obj.updateDynamic("SecurityGroupIds")(SecurityGroupIds)
    if (SubnetId != null) __obj.updateDynamic("SubnetId")(SubnetId)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[CreateDevEndpointRequest]
  }
}

