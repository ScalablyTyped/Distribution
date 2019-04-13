package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetClassifierRequest extends js.Object {
  /**
    * Name of the classifier to retrieve.
    */
  var Name: NameString
}

object GetClassifierRequest {
  @scala.inline
  def apply(Name: NameString): GetClassifierRequest = {
    val __obj = js.Dynamic.literal(Name = Name)
  
    __obj.asInstanceOf[GetClassifierRequest]
  }
}

