package typings.awsDashSdk.clientsInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RulesPackage extends js.Object {
  /**
    * The ARN of the rules package.
    */
  var arn: Arn = js.native
  /**
    * The description of the rules package.
    */
  var description: js.UndefOr[Text] = js.native
  /**
    * The name of the rules package.
    */
  var name: RulesPackageName = js.native
  /**
    * The provider of the rules package.
    */
  var provider: ProviderName = js.native
  /**
    * The version ID of the rules package.
    */
  var version: Version = js.native
}

object RulesPackage {
  @scala.inline
  def apply(
    arn: Arn,
    name: RulesPackageName,
    provider: ProviderName,
    version: Version,
    description: Text = null
  ): RulesPackage = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[RulesPackage]
  }
}

