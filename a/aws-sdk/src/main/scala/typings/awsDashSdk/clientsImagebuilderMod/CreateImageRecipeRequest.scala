package typings.awsDashSdk.clientsImagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateImageRecipeRequest extends js.Object {
  /**
    *  The block device mappings of the image recipe. 
    */
  var blockDeviceMappings: js.UndefOr[InstanceBlockDeviceMappings] = js.native
  /**
    *  The idempotency token used to make this request idempotent. 
    */
  var clientToken: ClientToken = js.native
  /**
    *  The components of the image recipe. 
    */
  var components: ComponentConfigurationList = js.native
  /**
    *  The description of the image recipe. 
    */
  var description: js.UndefOr[NonEmptyString] = js.native
  /**
    *  The name of the image recipe. 
    */
  var name: ResourceName = js.native
  /**
    *  The parent image of the image recipe. 
    */
  var parentImage: NonEmptyString = js.native
  /**
    *  The semantic version of the image recipe. 
    */
  var semanticVersion: VersionNumber = js.native
  /**
    *  The tags of the image recipe. 
    */
  var tags: js.UndefOr[TagMap] = js.native
}

object CreateImageRecipeRequest {
  @scala.inline
  def apply(
    clientToken: ClientToken,
    components: ComponentConfigurationList,
    name: ResourceName,
    parentImage: NonEmptyString,
    semanticVersion: VersionNumber,
    blockDeviceMappings: InstanceBlockDeviceMappings = null,
    description: NonEmptyString = null,
    tags: TagMap = null
  ): CreateImageRecipeRequest = {
    val __obj = js.Dynamic.literal(clientToken = clientToken.asInstanceOf[js.Any], components = components.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parentImage = parentImage.asInstanceOf[js.Any], semanticVersion = semanticVersion.asInstanceOf[js.Any])
    if (blockDeviceMappings != null) __obj.updateDynamic("blockDeviceMappings")(blockDeviceMappings.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateImageRecipeRequest]
  }
}

