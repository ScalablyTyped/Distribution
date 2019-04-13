package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Classifier extends js.Object {
  /**
    * A CSVClassifier object.
    */
  var CsvClassifier: js.UndefOr[CsvClassifier] = js.undefined
  /**
    * A GrokClassifier object.
    */
  var GrokClassifier: js.UndefOr[GrokClassifier] = js.undefined
  /**
    * A JsonClassifier object.
    */
  var JsonClassifier: js.UndefOr[JsonClassifier] = js.undefined
  /**
    * An XMLClassifier object.
    */
  var XMLClassifier: js.UndefOr[XMLClassifier] = js.undefined
}

object Classifier {
  @scala.inline
  def apply(
    CsvClassifier: CsvClassifier = null,
    GrokClassifier: GrokClassifier = null,
    JsonClassifier: JsonClassifier = null,
    XMLClassifier: XMLClassifier = null
  ): Classifier = {
    val __obj = js.Dynamic.literal()
    if (CsvClassifier != null) __obj.updateDynamic("CsvClassifier")(CsvClassifier)
    if (GrokClassifier != null) __obj.updateDynamic("GrokClassifier")(GrokClassifier)
    if (JsonClassifier != null) __obj.updateDynamic("JsonClassifier")(JsonClassifier)
    if (XMLClassifier != null) __obj.updateDynamic("XMLClassifier")(XMLClassifier)
    __obj.asInstanceOf[Classifier]
  }
}

