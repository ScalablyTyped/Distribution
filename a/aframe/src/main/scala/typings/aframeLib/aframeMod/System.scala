package typings
package aframeLib.aframeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait System[T /* <: js.Object */] extends js.Object {
  var data: T
  var schema: Schema[T]
  var tick: js.UndefOr[js.Function2[/* t */ scala.Double, /* dt */ scala.Double, scala.Unit]] = js.undefined
  def init(): scala.Unit
  def pause(): scala.Unit
  def play(): scala.Unit
}

