package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateGrokClassifierRequest extends js.Object {
  /**
    * An identifier of the data format that the classifier matches, such as Twitter, JSON, Omniture logs, Amazon CloudWatch Logs, and so on.
    */
  var Classification: js.UndefOr[typings.awsDashSdk.clientsGlueMod.Classification] = js.undefined
  /**
    * Optional custom grok patterns used by this classifier.
    */
  var CustomPatterns: js.UndefOr[typings.awsDashSdk.clientsGlueMod.CustomPatterns] = js.undefined
  /**
    * The grok pattern used by this classifier.
    */
  var GrokPattern: js.UndefOr[typings.awsDashSdk.clientsGlueMod.GrokPattern] = js.undefined
  /**
    * The name of the GrokClassifier.
    */
  var Name: NameString
}

object UpdateGrokClassifierRequest {
  @scala.inline
  def apply(
    Name: NameString,
    Classification: Classification = null,
    CustomPatterns: CustomPatterns = null,
    GrokPattern: GrokPattern = null
  ): UpdateGrokClassifierRequest = {
    val __obj = js.Dynamic.literal(Name = Name)
    if (Classification != null) __obj.updateDynamic("Classification")(Classification)
    if (CustomPatterns != null) __obj.updateDynamic("CustomPatterns")(CustomPatterns)
    if (GrokPattern != null) __obj.updateDynamic("GrokPattern")(GrokPattern)
    __obj.asInstanceOf[UpdateGrokClassifierRequest]
  }
}

