package typings
package apostropheLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CallbackLink extends js.Object {
  def link(name: java.lang.String, callback: js.Function0[_]): scala.Unit
}

object Anon_CallbackLink {
  @scala.inline
  def apply(link: (java.lang.String, js.Function0[_]) => scala.Unit): Anon_CallbackLink = {
    val __obj = js.Dynamic.literal(link = js.Any.fromFunction2(link))
  
    __obj.asInstanceOf[Anon_CallbackLink]
  }
}

