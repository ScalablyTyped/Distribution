package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateClassifierRequest extends js.Object {
  /**
    * A CsvClassifier object with updated fields.
    */
  var CsvClassifier: js.UndefOr[UpdateCsvClassifierRequest] = js.native
  /**
    * A GrokClassifier object with updated fields.
    */
  var GrokClassifier: js.UndefOr[UpdateGrokClassifierRequest] = js.native
  /**
    * A JsonClassifier object with updated fields.
    */
  var JsonClassifier: js.UndefOr[UpdateJsonClassifierRequest] = js.native
  /**
    * An XMLClassifier object with updated fields.
    */
  var XMLClassifier: js.UndefOr[UpdateXMLClassifierRequest] = js.native
}

object UpdateClassifierRequest {
  @scala.inline
  def apply(
    CsvClassifier: UpdateCsvClassifierRequest = null,
    GrokClassifier: UpdateGrokClassifierRequest = null,
    JsonClassifier: UpdateJsonClassifierRequest = null,
    XMLClassifier: UpdateXMLClassifierRequest = null
  ): UpdateClassifierRequest = {
    val __obj = js.Dynamic.literal()
    if (CsvClassifier != null) __obj.updateDynamic("CsvClassifier")(CsvClassifier.asInstanceOf[js.Any])
    if (GrokClassifier != null) __obj.updateDynamic("GrokClassifier")(GrokClassifier.asInstanceOf[js.Any])
    if (JsonClassifier != null) __obj.updateDynamic("JsonClassifier")(JsonClassifier.asInstanceOf[js.Any])
    if (XMLClassifier != null) __obj.updateDynamic("XMLClassifier")(XMLClassifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateClassifierRequest]
  }
}

