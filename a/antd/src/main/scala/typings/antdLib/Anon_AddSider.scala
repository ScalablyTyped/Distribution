package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddSider extends js.Object {
  def addSider(id: java.lang.String): scala.Unit
  def removeSider(id: java.lang.String): scala.Unit
}

object Anon_AddSider {
  @scala.inline
  def apply(addSider: java.lang.String => scala.Unit, removeSider: java.lang.String => scala.Unit): Anon_AddSider = {
    val __obj = js.Dynamic.literal(addSider = js.Any.fromFunction1(addSider), removeSider = js.Any.fromFunction1(removeSider))
  
    __obj.asInstanceOf[Anon_AddSider]
  }
}

