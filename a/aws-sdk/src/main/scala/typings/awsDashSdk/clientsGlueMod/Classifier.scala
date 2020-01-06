package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Classifier extends js.Object {
  /**
    * A classifier for comma-separated values (CSV).
    */
  var CsvClassifier: js.UndefOr[typings.awsDashSdk.clientsGlueMod.CsvClassifier] = js.native
  /**
    * A classifier that uses grok.
    */
  var GrokClassifier: js.UndefOr[typings.awsDashSdk.clientsGlueMod.GrokClassifier] = js.native
  /**
    * A classifier for JSON content.
    */
  var JsonClassifier: js.UndefOr[typings.awsDashSdk.clientsGlueMod.JsonClassifier] = js.native
  /**
    * A classifier for XML content.
    */
  var XMLClassifier: js.UndefOr[typings.awsDashSdk.clientsGlueMod.XMLClassifier] = js.native
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
    if (CsvClassifier != null) __obj.updateDynamic("CsvClassifier")(CsvClassifier.asInstanceOf[js.Any])
    if (GrokClassifier != null) __obj.updateDynamic("GrokClassifier")(GrokClassifier.asInstanceOf[js.Any])
    if (JsonClassifier != null) __obj.updateDynamic("JsonClassifier")(JsonClassifier.asInstanceOf[js.Any])
    if (XMLClassifier != null) __obj.updateDynamic("XMLClassifier")(XMLClassifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[Classifier]
  }
}

