package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Activation extends js.Object {
  /**
    * The ID created by Systems Manager when you submitted the activation.
    */
  var ActivationId: js.UndefOr[typings.awsDashSdk.clientsSsmMod.ActivationId] = js.undefined
  /**
    * The date the activation was created.
    */
  var CreatedDate: js.UndefOr[typings.awsDashSdk.clientsSsmMod.CreatedDate] = js.undefined
  /**
    * A name for the managed instance when it is created.
    */
  var DefaultInstanceName: js.UndefOr[typings.awsDashSdk.clientsSsmMod.DefaultInstanceName] = js.undefined
  /**
    * A user defined description of the activation.
    */
  var Description: js.UndefOr[ActivationDescription] = js.undefined
  /**
    * The date when this activation can no longer be used to register managed instances.
    */
  var ExpirationDate: js.UndefOr[typings.awsDashSdk.clientsSsmMod.ExpirationDate] = js.undefined
  /**
    * Whether or not the activation is expired.
    */
  var Expired: js.UndefOr[Boolean] = js.undefined
  /**
    * The Amazon Identity and Access Management (IAM) role to assign to the managed instance.
    */
  var IamRole: js.UndefOr[typings.awsDashSdk.clientsSsmMod.IamRole] = js.undefined
  /**
    * The maximum number of managed instances that can be registered using this activation.
    */
  var RegistrationLimit: js.UndefOr[typings.awsDashSdk.clientsSsmMod.RegistrationLimit] = js.undefined
  /**
    * The number of managed instances already registered with this activation.
    */
  var RegistrationsCount: js.UndefOr[typings.awsDashSdk.clientsSsmMod.RegistrationsCount] = js.undefined
  /**
    * Tags assigned to the activation.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}

object Activation {
  @scala.inline
  def apply(
    ActivationId: ActivationId = null,
    CreatedDate: CreatedDate = null,
    DefaultInstanceName: DefaultInstanceName = null,
    Description: ActivationDescription = null,
    ExpirationDate: ExpirationDate = null,
    Expired: js.UndefOr[scala.Boolean] = js.undefined,
    IamRole: IamRole = null,
    RegistrationLimit: Int | Double = null,
    RegistrationsCount: Int | Double = null,
    Tags: TagList = null
  ): Activation = {
    val __obj = js.Dynamic.literal()
    if (ActivationId != null) __obj.updateDynamic("ActivationId")(ActivationId)
    if (CreatedDate != null) __obj.updateDynamic("CreatedDate")(CreatedDate)
    if (DefaultInstanceName != null) __obj.updateDynamic("DefaultInstanceName")(DefaultInstanceName)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (ExpirationDate != null) __obj.updateDynamic("ExpirationDate")(ExpirationDate)
    if (!js.isUndefined(Expired)) __obj.updateDynamic("Expired")(Expired)
    if (IamRole != null) __obj.updateDynamic("IamRole")(IamRole)
    if (RegistrationLimit != null) __obj.updateDynamic("RegistrationLimit")(RegistrationLimit.asInstanceOf[js.Any])
    if (RegistrationsCount != null) __obj.updateDynamic("RegistrationsCount")(RegistrationsCount.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[Activation]
  }
}

