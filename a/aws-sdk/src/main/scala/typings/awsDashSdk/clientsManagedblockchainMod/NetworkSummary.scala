package typings.awsDashSdk.clientsManagedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkSummary extends js.Object {
  /**
    * The date and time that the network was created.
    */
  var CreationDate: js.UndefOr[Timestamp] = js.native
  /**
    * An optional description of the network.
    */
  var Description: js.UndefOr[DescriptionString] = js.native
  /**
    * The blockchain framework that the network uses.
    */
  var Framework: js.UndefOr[typings.awsDashSdk.clientsManagedblockchainMod.Framework] = js.native
  /**
    * The version of the blockchain framework that the network uses.
    */
  var FrameworkVersion: js.UndefOr[FrameworkVersionString] = js.native
  /**
    * The unique identifier of the network.
    */
  var Id: js.UndefOr[ResourceIdString] = js.native
  /**
    * The name of the network.
    */
  var Name: js.UndefOr[NameString] = js.native
  /**
    * The current status of the network.
    */
  var Status: js.UndefOr[NetworkStatus] = js.native
}

object NetworkSummary {
  @scala.inline
  def apply(
    CreationDate: Timestamp = null,
    Description: DescriptionString = null,
    Framework: Framework = null,
    FrameworkVersion: FrameworkVersionString = null,
    Id: ResourceIdString = null,
    Name: NameString = null,
    Status: NetworkStatus = null
  ): NetworkSummary = {
    val __obj = js.Dynamic.literal()
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Framework != null) __obj.updateDynamic("Framework")(Framework.asInstanceOf[js.Any])
    if (FrameworkVersion != null) __obj.updateDynamic("FrameworkVersion")(FrameworkVersion.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkSummary]
  }
}

