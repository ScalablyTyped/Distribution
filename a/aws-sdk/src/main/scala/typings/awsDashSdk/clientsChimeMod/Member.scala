package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Member extends js.Object {
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: js.UndefOr[NonEmptyString] = js.native
  /**
    * The member email address.
    */
  var Email: js.UndefOr[SensitiveString] = js.native
  /**
    * The member name.
    */
  var FullName: js.UndefOr[SensitiveString] = js.native
  /**
    * The member ID (user ID or bot ID).
    */
  var MemberId: js.UndefOr[NonEmptyString] = js.native
  /**
    * The member type.
    */
  var MemberType: js.UndefOr[typings.awsDashSdk.clientsChimeMod.MemberType] = js.native
}

object Member {
  @scala.inline
  def apply(
    AccountId: NonEmptyString = null,
    Email: SensitiveString = null,
    FullName: SensitiveString = null,
    MemberId: NonEmptyString = null,
    MemberType: MemberType = null
  ): Member = {
    val __obj = js.Dynamic.literal()
    if (AccountId != null) __obj.updateDynamic("AccountId")(AccountId.asInstanceOf[js.Any])
    if (Email != null) __obj.updateDynamic("Email")(Email.asInstanceOf[js.Any])
    if (FullName != null) __obj.updateDynamic("FullName")(FullName.asInstanceOf[js.Any])
    if (MemberId != null) __obj.updateDynamic("MemberId")(MemberId.asInstanceOf[js.Any])
    if (MemberType != null) __obj.updateDynamic("MemberType")(MemberType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Member]
  }
}

