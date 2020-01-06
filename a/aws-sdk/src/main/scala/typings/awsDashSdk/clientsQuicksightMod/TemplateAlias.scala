package typings.awsDashSdk.clientsQuicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateAlias extends js.Object {
  /**
    * The display name of the template alias.
    */
  var AliasName: js.UndefOr[typings.awsDashSdk.clientsQuicksightMod.AliasName] = js.native
  /**
    * The Amazon Resource Name (ARN) of the template alias.
    */
  var Arn: js.UndefOr[typings.awsDashSdk.clientsQuicksightMod.Arn] = js.native
  /**
    * The version number of the template alias.
    */
  var TemplateVersionNumber: js.UndefOr[VersionNumber] = js.native
}

object TemplateAlias {
  @scala.inline
  def apply(AliasName: AliasName = null, Arn: Arn = null, TemplateVersionNumber: Int | scala.Double = null): TemplateAlias = {
    val __obj = js.Dynamic.literal()
    if (AliasName != null) __obj.updateDynamic("AliasName")(AliasName.asInstanceOf[js.Any])
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (TemplateVersionNumber != null) __obj.updateDynamic("TemplateVersionNumber")(TemplateVersionNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateAlias]
  }
}

