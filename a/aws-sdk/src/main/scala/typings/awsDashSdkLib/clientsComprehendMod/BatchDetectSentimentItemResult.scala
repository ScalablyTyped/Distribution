package typings
package awsDashSdkLib.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchDetectSentimentItemResult extends js.Object {
  /**
    * The zero-based index of the document in the input list.
    */
  var Index: js.UndefOr[Integer] = js.undefined
  /**
    * The sentiment detected in the document.
    */
  var Sentiment: js.UndefOr[SentimentType] = js.undefined
  /**
    * The level of confidence that Amazon Comprehend has in the accuracy of its sentiment detection.
    */
  var SentimentScore: js.UndefOr[SentimentScore] = js.undefined
}

object BatchDetectSentimentItemResult {
  @scala.inline
  def apply(
    Index: js.UndefOr[Integer] = js.undefined,
    Sentiment: SentimentType = null,
    SentimentScore: SentimentScore = null
  ): BatchDetectSentimentItemResult = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Index)) __obj.updateDynamic("Index")(Index)
    if (Sentiment != null) __obj.updateDynamic("Sentiment")(Sentiment.asInstanceOf[js.Any])
    if (SentimentScore != null) __obj.updateDynamic("SentimentScore")(SentimentScore)
    __obj.asInstanceOf[BatchDetectSentimentItemResult]
  }
}

