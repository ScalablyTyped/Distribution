package typings.awsDashSdk.clientsKmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AliasListEntry extends js.Object {
  /**
    * String that contains the key ARN.
    */
  var AliasArn: js.UndefOr[ArnType] = js.undefined
  /**
    * String that contains the alias. This value begins with alias/.
    */
  var AliasName: js.UndefOr[AliasNameType] = js.undefined
  /**
    * String that contains the key identifier referred to by the alias.
    */
  var TargetKeyId: js.UndefOr[KeyIdType] = js.undefined
}

object AliasListEntry {
  @scala.inline
  def apply(AliasArn: ArnType = null, AliasName: AliasNameType = null, TargetKeyId: KeyIdType = null): AliasListEntry = {
    val __obj = js.Dynamic.literal()
    if (AliasArn != null) __obj.updateDynamic("AliasArn")(AliasArn)
    if (AliasName != null) __obj.updateDynamic("AliasName")(AliasName)
    if (TargetKeyId != null) __obj.updateDynamic("TargetKeyId")(TargetKeyId)
    __obj.asInstanceOf[AliasListEntry]
  }
}

