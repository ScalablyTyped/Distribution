package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetClassifierResponse extends js.Object {
  /**
    * The requested classifier.
    */
  var Classifier: js.UndefOr[Classifier] = js.undefined
}

object GetClassifierResponse {
  @scala.inline
  def apply(Classifier: Classifier = null): GetClassifierResponse = {
    val __obj = js.Dynamic.literal()
    if (Classifier != null) __obj.updateDynamic("Classifier")(Classifier)
    __obj.asInstanceOf[GetClassifierResponse]
  }
}

