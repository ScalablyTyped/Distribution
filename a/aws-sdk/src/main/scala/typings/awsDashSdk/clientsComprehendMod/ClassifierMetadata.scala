package typings.awsDashSdk.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassifierMetadata extends js.Object {
  /**
    *  Describes the result metrics for the test data associated with an documentation classifier.
    */
  var EvaluationMetrics: js.UndefOr[ClassifierEvaluationMetrics] = js.undefined
  /**
    * The number of labels in the input data. 
    */
  var NumberOfLabels: js.UndefOr[Integer] = js.undefined
  /**
    * The number of documents in the input data that were used to test the classifier. Typically this is 10 to 20 percent of the input documents.
    */
  var NumberOfTestDocuments: js.UndefOr[Integer] = js.undefined
  /**
    * The number of documents in the input data that were used to train the classifier. Typically this is 80 to 90 percent of the input documents.
    */
  var NumberOfTrainedDocuments: js.UndefOr[Integer] = js.undefined
}

object ClassifierMetadata {
  @scala.inline
  def apply(
    EvaluationMetrics: ClassifierEvaluationMetrics = null,
    NumberOfLabels: js.UndefOr[Integer] = js.undefined,
    NumberOfTestDocuments: js.UndefOr[Integer] = js.undefined,
    NumberOfTrainedDocuments: js.UndefOr[Integer] = js.undefined
  ): ClassifierMetadata = {
    val __obj = js.Dynamic.literal()
    if (EvaluationMetrics != null) __obj.updateDynamic("EvaluationMetrics")(EvaluationMetrics)
    if (!js.isUndefined(NumberOfLabels)) __obj.updateDynamic("NumberOfLabels")(NumberOfLabels)
    if (!js.isUndefined(NumberOfTestDocuments)) __obj.updateDynamic("NumberOfTestDocuments")(NumberOfTestDocuments)
    if (!js.isUndefined(NumberOfTrainedDocuments)) __obj.updateDynamic("NumberOfTrainedDocuments")(NumberOfTrainedDocuments)
    __obj.asInstanceOf[ClassifierMetadata]
  }
}

