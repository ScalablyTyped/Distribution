package typings.awsDashSdk.clientsInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeExclusionsRequest extends js.Object {
  /**
    * The list of ARNs that specify the exclusions that you want to describe.
    */
  var exclusionArns: BatchDescribeExclusionsArnList
  /**
    * The locale into which you want to translate the exclusion's title, description, and recommendation.
    */
  var locale: js.UndefOr[Locale] = js.undefined
}

object DescribeExclusionsRequest {
  @scala.inline
  def apply(exclusionArns: BatchDescribeExclusionsArnList, locale: Locale = null): DescribeExclusionsRequest = {
    val __obj = js.Dynamic.literal(exclusionArns = exclusionArns)
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeExclusionsRequest]
  }
}

