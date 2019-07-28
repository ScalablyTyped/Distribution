package typings.adone.adoneNs.compressorNs.INs.lzmaNs

import typings.node.streamMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stream extends Transform {
  var bufsize: Double = js.native
  def cleanup(): Unit = js.native
  def totalIn(): Double = js.native
  def totalOut(): Double = js.native
}

