package typings.awsDashSdk.clientsKmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AliasListEntry extends js.Object {
  /**
    * String that contains the key ARN.
    */
  var AliasArn: js.UndefOr[ArnType] = js.native
  /**
    * String that contains the alias. This value begins with alias/.
    */
  var AliasName: js.UndefOr[AliasNameType] = js.native
  /**
    * String that contains the key identifier referred to by the alias.
    */
  var TargetKeyId: js.UndefOr[KeyIdType] = js.native
}

object AliasListEntry {
  @scala.inline
  def apply(AliasArn: ArnType = null, AliasName: AliasNameType = null, TargetKeyId: KeyIdType = null): AliasListEntry = {
    val __obj = js.Dynamic.literal()
    if (AliasArn != null) __obj.updateDynamic("AliasArn")(AliasArn.asInstanceOf[js.Any])
    if (AliasName != null) __obj.updateDynamic("AliasName")(AliasName.asInstanceOf[js.Any])
    if (TargetKeyId != null) __obj.updateDynamic("TargetKeyId")(TargetKeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AliasListEntry]
  }
}

