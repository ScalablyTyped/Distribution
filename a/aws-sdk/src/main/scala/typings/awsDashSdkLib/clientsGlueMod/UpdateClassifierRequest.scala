package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateClassifierRequest extends js.Object {
  /**
    * A CsvClassifier object with updated fields.
    */
  var CsvClassifier: js.UndefOr[UpdateCsvClassifierRequest] = js.undefined
  /**
    * A GrokClassifier object with updated fields.
    */
  var GrokClassifier: js.UndefOr[UpdateGrokClassifierRequest] = js.undefined
  /**
    * A JsonClassifier object with updated fields.
    */
  var JsonClassifier: js.UndefOr[UpdateJsonClassifierRequest] = js.undefined
  /**
    * An XMLClassifier object with updated fields.
    */
  var XMLClassifier: js.UndefOr[UpdateXMLClassifierRequest] = js.undefined
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
    if (CsvClassifier != null) __obj.updateDynamic("CsvClassifier")(CsvClassifier)
    if (GrokClassifier != null) __obj.updateDynamic("GrokClassifier")(GrokClassifier)
    if (JsonClassifier != null) __obj.updateDynamic("JsonClassifier")(JsonClassifier)
    if (XMLClassifier != null) __obj.updateDynamic("XMLClassifier")(XMLClassifier)
    __obj.asInstanceOf[UpdateClassifierRequest]
  }
}

