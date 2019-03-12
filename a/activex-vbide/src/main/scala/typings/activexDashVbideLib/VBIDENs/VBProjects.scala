package typings
package activexDashVbideLib.VBIDENs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VBProjects extends js.Object {
  val Count: scala.Double = js.native
  val Parent: VBE = js.native
  val VBE: activexDashVbideLib.VBIDENs.VBE = js.native
  def apply(index: js.Any): VBProject = js.native
  def Add(Type: vbext_ProjectType): VBProject = js.native
  def Item(index: js.Any): VBProject = js.native
  def Open(bstrPath: java.lang.String): VBProject = js.native
  def Remove(lpc: VBProject): scala.Unit = js.native
}

