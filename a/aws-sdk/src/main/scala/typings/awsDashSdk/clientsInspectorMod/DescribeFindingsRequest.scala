package typings.awsDashSdk.clientsInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeFindingsRequest extends js.Object {
  /**
    * The ARN that specifies the finding that you want to describe.
    */
  var findingArns: BatchDescribeArnList
  /**
    * The locale into which you want to translate a finding description, recommendation, and the short description that identifies the finding.
    */
  var locale: js.UndefOr[Locale] = js.undefined
}

object DescribeFindingsRequest {
  @scala.inline
  def apply(findingArns: BatchDescribeArnList, locale: Locale = null): DescribeFindingsRequest = {
    val __obj = js.Dynamic.literal(findingArns = findingArns)
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFindingsRequest]
  }
}

