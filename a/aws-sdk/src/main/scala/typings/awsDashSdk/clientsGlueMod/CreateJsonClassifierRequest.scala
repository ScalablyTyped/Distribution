package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateJsonClassifierRequest extends js.Object {
  /**
    * A JsonPath string defining the JSON data for the classifier to classify. AWS Glue supports a subset of JsonPath, as described in Writing JsonPath Custom Classifiers.
    */
  var JsonPath: typings.awsDashSdk.clientsGlueMod.JsonPath = js.native
  /**
    * The name of the classifier.
    */
  var Name: NameString = js.native
}

object CreateJsonClassifierRequest {
  @scala.inline
  def apply(JsonPath: JsonPath, Name: NameString): CreateJsonClassifierRequest = {
    val __obj = js.Dynamic.literal(JsonPath = JsonPath.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateJsonClassifierRequest]
  }
}

