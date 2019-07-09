package typings
package avaLib.avaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObservableLike extends js.Object {
  def subscribe(observer: js.Function1[/* value */ js.Any, scala.Unit]): scala.Unit = js.native
}

