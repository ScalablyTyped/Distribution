package typings.activexDashVbide.VBIDENs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Windows extends js.Object {
  val Count: Double = js.native
  val Parent: Application = js.native
  val VBE: typings.activexDashVbide.VBIDENs.VBE = js.native
  def apply(index: js.Any): Window = js.native
  def CreateToolWindow(AddInInst: AddIn, ProgId: String, Caption: String, GuidPosition: String, DocObj: js.Any): Window = js.native
  def Item(index: js.Any): Window = js.native
}

