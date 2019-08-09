package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfusionMatrix extends js.Object {
  /**
    * The number of matches in the data that the transform didn't find, in the confusion matrix for your transform.
    */
  var NumFalseNegatives: js.UndefOr[RecordsCount] = js.undefined
  /**
    * The number of nonmatches in the data that the transform incorrectly classified as a match, in the confusion matrix for your transform.
    */
  var NumFalsePositives: js.UndefOr[RecordsCount] = js.undefined
  /**
    * The number of nonmatches in the data that the transform correctly rejected, in the confusion matrix for your transform.
    */
  var NumTrueNegatives: js.UndefOr[RecordsCount] = js.undefined
  /**
    * The number of matches in the data that the transform correctly found, in the confusion matrix for your transform.
    */
  var NumTruePositives: js.UndefOr[RecordsCount] = js.undefined
}

object ConfusionMatrix {
  @scala.inline
  def apply(
    NumFalseNegatives: js.UndefOr[RecordsCount] = js.undefined,
    NumFalsePositives: js.UndefOr[RecordsCount] = js.undefined,
    NumTrueNegatives: js.UndefOr[RecordsCount] = js.undefined,
    NumTruePositives: js.UndefOr[RecordsCount] = js.undefined
  ): ConfusionMatrix = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(NumFalseNegatives)) __obj.updateDynamic("NumFalseNegatives")(NumFalseNegatives)
    if (!js.isUndefined(NumFalsePositives)) __obj.updateDynamic("NumFalsePositives")(NumFalsePositives)
    if (!js.isUndefined(NumTrueNegatives)) __obj.updateDynamic("NumTrueNegatives")(NumTrueNegatives)
    if (!js.isUndefined(NumTruePositives)) __obj.updateDynamic("NumTruePositives")(NumTruePositives)
    __obj.asInstanceOf[ConfusionMatrix]
  }
}

