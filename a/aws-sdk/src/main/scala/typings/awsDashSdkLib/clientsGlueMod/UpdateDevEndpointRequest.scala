package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateDevEndpointRequest extends js.Object {
  /**
    * The map of arguments to add the map of arguments used to configure the DevEndpoint.
    */
  var AddArguments: js.UndefOr[MapValue] = js.undefined
  /**
    * The list of public keys for the DevEndpoint to use.
    */
  var AddPublicKeys: js.UndefOr[PublicKeysList] = js.undefined
  /**
    * Custom Python or Java libraries to be loaded in the DevEndpoint.
    */
  var CustomLibraries: js.UndefOr[DevEndpointCustomLibraries] = js.undefined
  /**
    * The list of argument keys to be deleted from the map of arguments used to configure the DevEndpoint.
    */
  var DeleteArguments: js.UndefOr[StringList] = js.undefined
  /**
    * The list of public keys to be deleted from the DevEndpoint.
    */
  var DeletePublicKeys: js.UndefOr[PublicKeysList] = js.undefined
  /**
    * The name of the DevEndpoint to be updated.
    */
  var EndpointName: GenericString
  /**
    * The public key for the DevEndpoint to use.
    */
  var PublicKey: js.UndefOr[GenericString] = js.undefined
  /**
    *  True if the list of custom libraries to be loaded in the development endpoint needs to be updated, or False if otherwise.
    */
  var UpdateEtlLibraries: js.UndefOr[BooleanValue] = js.undefined
}

object UpdateDevEndpointRequest {
  @scala.inline
  def apply(
    EndpointName: GenericString,
    AddArguments: MapValue = null,
    AddPublicKeys: PublicKeysList = null,
    CustomLibraries: DevEndpointCustomLibraries = null,
    DeleteArguments: StringList = null,
    DeletePublicKeys: PublicKeysList = null,
    PublicKey: GenericString = null,
    UpdateEtlLibraries: js.UndefOr[BooleanValue] = js.undefined
  ): UpdateDevEndpointRequest = {
    val __obj = js.Dynamic.literal(EndpointName = EndpointName)
    if (AddArguments != null) __obj.updateDynamic("AddArguments")(AddArguments)
    if (AddPublicKeys != null) __obj.updateDynamic("AddPublicKeys")(AddPublicKeys)
    if (CustomLibraries != null) __obj.updateDynamic("CustomLibraries")(CustomLibraries)
    if (DeleteArguments != null) __obj.updateDynamic("DeleteArguments")(DeleteArguments)
    if (DeletePublicKeys != null) __obj.updateDynamic("DeletePublicKeys")(DeletePublicKeys)
    if (PublicKey != null) __obj.updateDynamic("PublicKey")(PublicKey)
    if (!js.isUndefined(UpdateEtlLibraries)) __obj.updateDynamic("UpdateEtlLibraries")(UpdateEtlLibraries)
    __obj.asInstanceOf[UpdateDevEndpointRequest]
  }
}

