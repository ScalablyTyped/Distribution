package typings
package antdLib.libTableCreateStoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Store extends js.Object {
  def getState(): js.Any
  def setState(partial: js.Object): scala.Unit
  def subscribe(listener: js.Function0[scala.Unit]): js.Function0[scala.Unit]
}

