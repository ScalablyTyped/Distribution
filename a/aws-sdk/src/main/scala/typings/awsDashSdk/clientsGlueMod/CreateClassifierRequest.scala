package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateClassifierRequest extends js.Object {
  /**
    * A CsvClassifier object specifying the classifier to create.
    */
  var CsvClassifier: js.UndefOr[CreateCsvClassifierRequest] = js.undefined
  /**
    * A GrokClassifier object specifying the classifier to create.
    */
  var GrokClassifier: js.UndefOr[CreateGrokClassifierRequest] = js.undefined
  /**
    * A JsonClassifier object specifying the classifier to create.
    */
  var JsonClassifier: js.UndefOr[CreateJsonClassifierRequest] = js.undefined
  /**
    * An XMLClassifier object specifying the classifier to create.
    */
  var XMLClassifier: js.UndefOr[CreateXMLClassifierRequest] = js.undefined
}

object CreateClassifierRequest {
  @scala.inline
  def apply(
    CsvClassifier: CreateCsvClassifierRequest = null,
    GrokClassifier: CreateGrokClassifierRequest = null,
    JsonClassifier: CreateJsonClassifierRequest = null,
    XMLClassifier: CreateXMLClassifierRequest = null
  ): CreateClassifierRequest = {
    val __obj = js.Dynamic.literal()
    if (CsvClassifier != null) __obj.updateDynamic("CsvClassifier")(CsvClassifier)
    if (GrokClassifier != null) __obj.updateDynamic("GrokClassifier")(GrokClassifier)
    if (JsonClassifier != null) __obj.updateDynamic("JsonClassifier")(JsonClassifier)
    if (XMLClassifier != null) __obj.updateDynamic("XMLClassifier")(XMLClassifier)
    __obj.asInstanceOf[CreateClassifierRequest]
  }
}

