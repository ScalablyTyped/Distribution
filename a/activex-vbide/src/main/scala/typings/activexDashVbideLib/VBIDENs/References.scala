package typings
package activexDashVbideLib.VBIDENs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait References extends js.Object {
  val Count: scala.Double = js.native
  val Parent: VBProject = js.native
  val VBE: VBE = js.native
  def apply(index: js.Any): Reference = js.native
  def AddFromFile(FileName: java.lang.String): Reference = js.native
  def AddFromGuid(Guid: java.lang.String, Major: scala.Double, Minor: scala.Double): Reference = js.native
  def Item(index: js.Any): Reference = js.native
  def Remove(Reference: Reference): scala.Unit = js.native
}

