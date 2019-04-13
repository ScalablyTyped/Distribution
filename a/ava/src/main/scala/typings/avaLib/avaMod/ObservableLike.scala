package typings
package avaLib.avaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObservableLike extends js.Object {
  def subscribe(observer: js.Function1[/* value */ js.Any, scala.Unit]): scala.Unit
}

object ObservableLike {
  @scala.inline
  def apply(subscribe: js.Function1[/* value */ js.Any, scala.Unit] => scala.Unit): ObservableLike = {
    val __obj = js.Dynamic.literal(subscribe = js.Any.fromFunction1(subscribe))
  
    __obj.asInstanceOf[ObservableLike]
  }
}

