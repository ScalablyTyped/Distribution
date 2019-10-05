package typings.awsDashSdk.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SentimentScore extends js.Object {
  /**
    * The level of confidence that Amazon Comprehend has in the accuracy of its detection of the MIXED sentiment.
    */
  var Mixed: js.UndefOr[Float] = js.undefined
  /**
    * The level of confidence that Amazon Comprehend has in the accuracy of its detection of the NEGATIVE sentiment.
    */
  var Negative: js.UndefOr[Float] = js.undefined
  /**
    * The level of confidence that Amazon Comprehend has in the accuracy of its detection of the NEUTRAL sentiment.
    */
  var Neutral: js.UndefOr[Float] = js.undefined
  /**
    * The level of confidence that Amazon Comprehend has in the accuracy of its detection of the POSITIVE sentiment.
    */
  var Positive: js.UndefOr[Float] = js.undefined
}

object SentimentScore {
  @scala.inline
  def apply(
    Mixed: Int | scala.Double = null,
    Negative: Int | scala.Double = null,
    Neutral: Int | scala.Double = null,
    Positive: Int | scala.Double = null
  ): SentimentScore = {
    val __obj = js.Dynamic.literal()
    if (Mixed != null) __obj.updateDynamic("Mixed")(Mixed.asInstanceOf[js.Any])
    if (Negative != null) __obj.updateDynamic("Negative")(Negative.asInstanceOf[js.Any])
    if (Neutral != null) __obj.updateDynamic("Neutral")(Neutral.asInstanceOf[js.Any])
    if (Positive != null) __obj.updateDynamic("Positive")(Positive.asInstanceOf[js.Any])
    __obj.asInstanceOf[SentimentScore]
  }
}

