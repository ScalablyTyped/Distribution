package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MitigationActionParams extends js.Object {
  /**
    * Parameters to define a mitigation action that moves devices associated with a certificate to one or more specified thing groups, typically for quarantine.
    */
  var addThingsToThingGroupParams: js.UndefOr[AddThingsToThingGroupParams] = js.undefined
  /**
    * Parameters to define a mitigation action that enables AWS IoT logging at a specified level of detail.
    */
  var enableIoTLoggingParams: js.UndefOr[EnableIoTLoggingParams] = js.undefined
  /**
    * Parameters to define a mitigation action that publishes findings to Amazon SNS. You can implement your own custom actions in response to the Amazon SNS messages.
    */
  var publishFindingToSnsParams: js.UndefOr[PublishFindingToSnsParams] = js.undefined
  /**
    * Parameters to define a mitigation action that adds a blank policy to restrict permissions.
    */
  var replaceDefaultPolicyVersionParams: js.UndefOr[ReplaceDefaultPolicyVersionParams] = js.undefined
  /**
    * Parameters to define a mitigation action that changes the state of the CA certificate to inactive.
    */
  var updateCACertificateParams: js.UndefOr[UpdateCACertificateParams] = js.undefined
  /**
    * Parameters to define a mitigation action that changes the state of the device certificate to inactive.
    */
  var updateDeviceCertificateParams: js.UndefOr[UpdateDeviceCertificateParams] = js.undefined
}

object MitigationActionParams {
  @scala.inline
  def apply(
    addThingsToThingGroupParams: AddThingsToThingGroupParams = null,
    enableIoTLoggingParams: EnableIoTLoggingParams = null,
    publishFindingToSnsParams: PublishFindingToSnsParams = null,
    replaceDefaultPolicyVersionParams: ReplaceDefaultPolicyVersionParams = null,
    updateCACertificateParams: UpdateCACertificateParams = null,
    updateDeviceCertificateParams: UpdateDeviceCertificateParams = null
  ): MitigationActionParams = {
    val __obj = js.Dynamic.literal()
    if (addThingsToThingGroupParams != null) __obj.updateDynamic("addThingsToThingGroupParams")(addThingsToThingGroupParams)
    if (enableIoTLoggingParams != null) __obj.updateDynamic("enableIoTLoggingParams")(enableIoTLoggingParams)
    if (publishFindingToSnsParams != null) __obj.updateDynamic("publishFindingToSnsParams")(publishFindingToSnsParams)
    if (replaceDefaultPolicyVersionParams != null) __obj.updateDynamic("replaceDefaultPolicyVersionParams")(replaceDefaultPolicyVersionParams)
    if (updateCACertificateParams != null) __obj.updateDynamic("updateCACertificateParams")(updateCACertificateParams)
    if (updateDeviceCertificateParams != null) __obj.updateDynamic("updateDeviceCertificateParams")(updateDeviceCertificateParams)
    __obj.asInstanceOf[MitigationActionParams]
  }
}

