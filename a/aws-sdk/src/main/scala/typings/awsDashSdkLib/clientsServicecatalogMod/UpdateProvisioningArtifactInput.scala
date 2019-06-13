package typings
package awsDashSdkLib.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateProvisioningArtifactInput extends js.Object {
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
  /**
    * Indicates whether the product version is active.
    */
  var Active: js.UndefOr[ProvisioningArtifactActive] = js.undefined
  /**
    * The updated description of the provisioning artifact.
    */
  var Description: js.UndefOr[ProvisioningArtifactDescription] = js.undefined
  /**
    * Information set by the administrator to provide guidance to end users about which provisioning artifacts to use. The DEFAULT value indicates that the product version is active. The administrator can set the guidance to DEPRECATED to inform users that the product version is deprecated. Users are able to make updates to a provisioned product of a deprecated version but cannot launch new provisioned products using a deprecated version.
    */
  var Guidance: js.UndefOr[ProvisioningArtifactGuidance] = js.undefined
  /**
    * The updated name of the provisioning artifact.
    */
  var Name: js.UndefOr[ProvisioningArtifactName] = js.undefined
  /**
    * The product identifier.
    */
  var ProductId: Id
  /**
    * The identifier of the provisioning artifact.
    */
  var ProvisioningArtifactId: Id
}

object UpdateProvisioningArtifactInput {
  @scala.inline
  def apply(
    ProductId: Id,
    ProvisioningArtifactId: Id,
    AcceptLanguage: AcceptLanguage = null,
    Active: js.UndefOr[ProvisioningArtifactActive] = js.undefined,
    Description: ProvisioningArtifactDescription = null,
    Guidance: ProvisioningArtifactGuidance = null,
    Name: ProvisioningArtifactName = null
  ): UpdateProvisioningArtifactInput = {
    val __obj = js.Dynamic.literal(ProductId = ProductId, ProvisioningArtifactId = ProvisioningArtifactId)
    if (AcceptLanguage != null) __obj.updateDynamic("AcceptLanguage")(AcceptLanguage)
    if (!js.isUndefined(Active)) __obj.updateDynamic("Active")(Active)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (Guidance != null) __obj.updateDynamic("Guidance")(Guidance.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[UpdateProvisioningArtifactInput]
  }
}

