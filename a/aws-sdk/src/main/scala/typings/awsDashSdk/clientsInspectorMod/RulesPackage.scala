package typings.awsDashSdk.clientsInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RulesPackage extends js.Object {
  /**
    * The ARN of the rules package.
    */
  var arn: Arn
  /**
    * The description of the rules package.
    */
  var description: js.UndefOr[Text] = js.undefined
  /**
    * The name of the rules package.
    */
  var name: RulesPackageName
  /**
    * The provider of the rules package.
    */
  var provider: ProviderName
  /**
    * The version ID of the rules package.
    */
  var version: Version
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
    val __obj = js.Dynamic.literal(arn = arn, name = name, provider = provider, version = version)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[RulesPackage]
  }
}

