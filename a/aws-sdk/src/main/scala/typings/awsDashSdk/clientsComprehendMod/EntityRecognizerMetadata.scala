package typings.awsDashSdk.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntityRecognizerMetadata extends js.Object {
  /**
    * Entity types from the metadata of an entity recognizer.
    */
  var EntityTypes: js.UndefOr[EntityRecognizerMetadataEntityTypesList] = js.undefined
  /**
    * Detailed information about the accuracy of an entity recognizer.
    */
  var EvaluationMetrics: js.UndefOr[EntityRecognizerEvaluationMetrics] = js.undefined
  /**
    *  The number of documents in the input data that were used to test the entity recognizer. Typically this is 10 to 20 percent of the input documents.
    */
  var NumberOfTestDocuments: js.UndefOr[Integer] = js.undefined
  /**
    *  The number of documents in the input data that were used to train the entity recognizer. Typically this is 80 to 90 percent of the input documents.
    */
  var NumberOfTrainedDocuments: js.UndefOr[Integer] = js.undefined
}

object EntityRecognizerMetadata {
  @scala.inline
  def apply(
    EntityTypes: EntityRecognizerMetadataEntityTypesList = null,
    EvaluationMetrics: EntityRecognizerEvaluationMetrics = null,
    NumberOfTestDocuments: Int | scala.Double = null,
    NumberOfTrainedDocuments: Int | scala.Double = null
  ): EntityRecognizerMetadata = {
    val __obj = js.Dynamic.literal()
    if (EntityTypes != null) __obj.updateDynamic("EntityTypes")(EntityTypes)
    if (EvaluationMetrics != null) __obj.updateDynamic("EvaluationMetrics")(EvaluationMetrics)
    if (NumberOfTestDocuments != null) __obj.updateDynamic("NumberOfTestDocuments")(NumberOfTestDocuments.asInstanceOf[js.Any])
    if (NumberOfTrainedDocuments != null) __obj.updateDynamic("NumberOfTrainedDocuments")(NumberOfTrainedDocuments.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityRecognizerMetadata]
  }
}

