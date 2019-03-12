package typings
package activexDashVbideLib.VBIDENs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Windows extends js.Object {
  val Count: scala.Double = js.native
  val Parent: Application = js.native
  val VBE: activexDashVbideLib.VBIDENs.VBE = js.native
  def apply(index: js.Any): Window = js.native
  def CreateToolWindow(
    AddInInst: AddIn,
    ProgId: java.lang.String,
    Caption: java.lang.String,
    GuidPosition: java.lang.String,
    DocObj: js.Any
  ): Window = js.native
  def Item(index: js.Any): Window = js.native
}

