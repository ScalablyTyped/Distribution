package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sequences extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  val Count: Double = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.Sequences_typekey")
  var PowerPointDotSequences_typekey: Sequences = js.native
  /** @param number [Index=-1] */
  def Add(): Sequence = js.native
  def Add(Index: Double): Sequence = js.native
  def Item(Index: Double): Sequence = js.native
}

