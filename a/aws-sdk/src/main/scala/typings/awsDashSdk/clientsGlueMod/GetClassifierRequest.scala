package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetClassifierRequest extends js.Object {
  /**
    * Name of the classifier to retrieve.
    */
  var Name: NameString = js.native
}

object GetClassifierRequest {
  @scala.inline
  def apply(Name: NameString): GetClassifierRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetClassifierRequest]
  }
}

