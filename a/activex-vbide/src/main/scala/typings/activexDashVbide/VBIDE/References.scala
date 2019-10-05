package typings.activexDashVbide.VBIDE

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait References extends js.Object {
  val Count: Double = js.native
  val Parent: VBProject = js.native
  val VBE: typings.activexDashVbide.VBIDE.VBE = js.native
  def apply(index: js.Any): Reference = js.native
  def AddFromFile(FileName: String): Reference = js.native
  def AddFromGuid(Guid: String, Major: Double, Minor: Double): Reference = js.native
  def Item(index: js.Any): Reference = js.native
  def Remove(Reference: Reference): Unit = js.native
}

