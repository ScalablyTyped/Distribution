package typings.awsDashSdk.clientsManagedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkSummary extends js.Object {
  /**
    * The date and time that the network was created.
    */
  var CreationDate: js.UndefOr[Timestamp] = js.undefined
  /**
    * An optional description of the network.
    */
  var Description: js.UndefOr[DescriptionString] = js.undefined
  /**
    * The blockchain framework that the network uses.
    */
  var Framework: js.UndefOr[typings.awsDashSdk.clientsManagedblockchainMod.Framework] = js.undefined
  /**
    * The version of the blockchain framework that the network uses.
    */
  var FrameworkVersion: js.UndefOr[FrameworkVersionString] = js.undefined
  /**
    * The unique identifier of the network.
    */
  var Id: js.UndefOr[ResourceIdString] = js.undefined
  /**
    * The name of the network.
    */
  var Name: js.UndefOr[NameString] = js.undefined
  /**
    * The current status of the network.
    */
  var Status: js.UndefOr[NetworkStatus] = js.undefined
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
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (Framework != null) __obj.updateDynamic("Framework")(Framework.asInstanceOf[js.Any])
    if (FrameworkVersion != null) __obj.updateDynamic("FrameworkVersion")(FrameworkVersion)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkSummary]
  }
}

