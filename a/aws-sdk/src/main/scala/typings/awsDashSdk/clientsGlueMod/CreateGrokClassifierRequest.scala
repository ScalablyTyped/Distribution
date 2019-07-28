package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateGrokClassifierRequest extends js.Object {
  /**
    * An identifier of the data format that the classifier matches, such as Twitter, JSON, Omniture logs, Amazon CloudWatch Logs, and so on.
    */
  var Classification: typings.awsDashSdk.clientsGlueMod.Classification
  /**
    * Optional custom grok patterns used by this classifier.
    */
  var CustomPatterns: js.UndefOr[typings.awsDashSdk.clientsGlueMod.CustomPatterns] = js.undefined
  /**
    * The grok pattern used by this classifier.
    */
  var GrokPattern: typings.awsDashSdk.clientsGlueMod.GrokPattern
  /**
    * The name of the new classifier.
    */
  var Name: NameString
}

object CreateGrokClassifierRequest {
  @scala.inline
  def apply(
    Classification: Classification,
    GrokPattern: GrokPattern,
    Name: NameString,
    CustomPatterns: CustomPatterns = null
  ): CreateGrokClassifierRequest = {
    val __obj = js.Dynamic.literal(Classification = Classification, GrokPattern = GrokPattern, Name = Name)
    if (CustomPatterns != null) __obj.updateDynamic("CustomPatterns")(CustomPatterns)
    __obj.asInstanceOf[CreateGrokClassifierRequest]
  }
}

