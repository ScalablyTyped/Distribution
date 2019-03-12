package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DomEvent extends js.Object {
  var domEvent: stdLib.MouseEvent
  var key: java.lang.String
}

object Anon_DomEvent {
  @scala.inline
  def apply(domEvent: stdLib.MouseEvent, key: java.lang.String): Anon_DomEvent = {
    val __obj = js.Dynamic.literal(domEvent = domEvent, key = key)
  
    __obj.asInstanceOf[Anon_DomEvent]
  }
}

