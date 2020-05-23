package typings.aliApp.anon

import typings.aliApp.my.ContactsDic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContactsDicArray extends js.Object {
  var contactsDicArray: js.Array[ContactsDic]
}

object ContactsDicArray {
  @scala.inline
  def apply(contactsDicArray: js.Array[ContactsDic]): ContactsDicArray = {
    val __obj = js.Dynamic.literal(contactsDicArray = contactsDicArray.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactsDicArray]
  }
}

