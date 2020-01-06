package typings.awsDashSdk.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchDetectSentimentItemResult extends js.Object {
  /**
    * The zero-based index of the document in the input list.
    */
  var Index: js.UndefOr[Integer] = js.native
  /**
    * The sentiment detected in the document.
    */
  var Sentiment: js.UndefOr[SentimentType] = js.native
  /**
    * The level of confidence that Amazon Comprehend has in the accuracy of its sentiment detection.
    */
  var SentimentScore: js.UndefOr[typings.awsDashSdk.clientsComprehendMod.SentimentScore] = js.native
}

object BatchDetectSentimentItemResult {
  @scala.inline
  def apply(
    Index: Int | scala.Double = null,
    Sentiment: SentimentType = null,
    SentimentScore: SentimentScore = null
  ): BatchDetectSentimentItemResult = {
    val __obj = js.Dynamic.literal()
    if (Index != null) __obj.updateDynamic("Index")(Index.asInstanceOf[js.Any])
    if (Sentiment != null) __obj.updateDynamic("Sentiment")(Sentiment.asInstanceOf[js.Any])
    if (SentimentScore != null) __obj.updateDynamic("SentimentScore")(SentimentScore.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDetectSentimentItemResult]
  }
}

