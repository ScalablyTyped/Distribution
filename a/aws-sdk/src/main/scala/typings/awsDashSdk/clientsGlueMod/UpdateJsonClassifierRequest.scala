package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateJsonClassifierRequest extends js.Object {
  /**
    * A JsonPath string defining the JSON data for the classifier to classify. AWS Glue supports a subset of JsonPath, as described in Writing JsonPath Custom Classifiers.
    */
  var JsonPath: js.UndefOr[typings.awsDashSdk.clientsGlueMod.JsonPath] = js.undefined
  /**
    * The name of the classifier.
    */
  var Name: NameString
}

object UpdateJsonClassifierRequest {
  @scala.inline
  def apply(Name: NameString, JsonPath: JsonPath = null): UpdateJsonClassifierRequest = {
    val __obj = js.Dynamic.literal(Name = Name)
    if (JsonPath != null) __obj.updateDynamic("JsonPath")(JsonPath)
    __obj.asInstanceOf[UpdateJsonClassifierRequest]
  }
}

