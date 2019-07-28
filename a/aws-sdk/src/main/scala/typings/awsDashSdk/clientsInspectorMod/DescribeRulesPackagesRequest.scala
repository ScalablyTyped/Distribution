package typings.awsDashSdk.clientsInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeRulesPackagesRequest extends js.Object {
  /**
    * The locale that you want to translate a rules package description into.
    */
  var locale: js.UndefOr[Locale] = js.undefined
  /**
    * The ARN that specifies the rules package that you want to describe.
    */
  var rulesPackageArns: BatchDescribeArnList
}

object DescribeRulesPackagesRequest {
  @scala.inline
  def apply(rulesPackageArns: BatchDescribeArnList, locale: Locale = null): DescribeRulesPackagesRequest = {
    val __obj = js.Dynamic.literal(rulesPackageArns = rulesPackageArns)
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRulesPackagesRequest]
  }
}

