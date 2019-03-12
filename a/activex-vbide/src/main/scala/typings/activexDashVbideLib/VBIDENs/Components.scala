package typings
package activexDashVbideLib.VBIDENs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Components extends js.Object {
  val Application: activexDashVbideLib.VBIDENs.Application = js.native
  val Count: scala.Double = js.native
  val Parent: VBProject = js.native
  val VBE: activexDashVbideLib.VBIDENs.VBE = js.native
  def apply(index: js.Any): Component = js.native
  def Add(ComponentType: vbext_ComponentType): Component = js.native
  def Import(FileName: java.lang.String): Component = js.native
  def Item(index: js.Any): Component = js.native
  def Remove(Component: Component): scala.Unit = js.native
}

