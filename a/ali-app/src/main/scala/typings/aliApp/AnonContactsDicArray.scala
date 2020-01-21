package typings.aliApp

import typings.aliApp.my.ContactsDic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContactsDicArray extends js.Object {
  var contactsDicArray: js.Array[ContactsDic]
}

object AnonContactsDicArray {
  @scala.inline
  def apply(contactsDicArray: js.Array[ContactsDic]): AnonContactsDicArray = {
    val __obj = js.Dynamic.literal(contactsDicArray = contactsDicArray.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonContactsDicArray]
  }
}

