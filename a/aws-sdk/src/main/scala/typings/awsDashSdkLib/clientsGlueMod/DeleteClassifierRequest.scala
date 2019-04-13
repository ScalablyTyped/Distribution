package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteClassifierRequest extends js.Object {
  /**
    * Name of the classifier to remove.
    */
  var Name: NameString
}

object DeleteClassifierRequest {
  @scala.inline
  def apply(Name: NameString): DeleteClassifierRequest = {
    val __obj = js.Dynamic.literal(Name = Name)
  
    __obj.asInstanceOf[DeleteClassifierRequest]
  }
}

