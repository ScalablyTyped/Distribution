package typings.activexVbide.VBIDE

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinkedWindows extends js.Object {
  val Count: Double = js.native
  val Parent: Window = js.native
  val VBE: typings.activexVbide.VBIDE.VBE = js.native
  def apply(index: js.Any): Window = js.native
  def Add(Window: Window): Unit = js.native
  def Item(index: js.Any): Window = js.native
  def Remove(Window: Window): Unit = js.native
}

