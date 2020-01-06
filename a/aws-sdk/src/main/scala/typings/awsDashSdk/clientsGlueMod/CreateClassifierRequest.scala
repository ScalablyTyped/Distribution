package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateClassifierRequest extends js.Object {
  /**
    * A CsvClassifier object specifying the classifier to create.
    */
  var CsvClassifier: js.UndefOr[CreateCsvClassifierRequest] = js.native
  /**
    * A GrokClassifier object specifying the classifier to create.
    */
  var GrokClassifier: js.UndefOr[CreateGrokClassifierRequest] = js.native
  /**
    * A JsonClassifier object specifying the classifier to create.
    */
  var JsonClassifier: js.UndefOr[CreateJsonClassifierRequest] = js.native
  /**
    * An XMLClassifier object specifying the classifier to create.
    */
  var XMLClassifier: js.UndefOr[CreateXMLClassifierRequest] = js.native
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
    if (CsvClassifier != null) __obj.updateDynamic("CsvClassifier")(CsvClassifier.asInstanceOf[js.Any])
    if (GrokClassifier != null) __obj.updateDynamic("GrokClassifier")(GrokClassifier.asInstanceOf[js.Any])
    if (JsonClassifier != null) __obj.updateDynamic("JsonClassifier")(JsonClassifier.asInstanceOf[js.Any])
    if (XMLClassifier != null) __obj.updateDynamic("XMLClassifier")(XMLClassifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateClassifierRequest]
  }
}

