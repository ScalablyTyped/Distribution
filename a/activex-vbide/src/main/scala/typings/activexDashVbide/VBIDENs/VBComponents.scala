package typings.activexDashVbide.VBIDENs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VBComponents extends js.Object {
  val Count: Double = js.native
  val Parent: VBProject = js.native
  val VBE: typings.activexDashVbide.VBIDENs.VBE = js.native
  def apply(index: js.Any): VBComponent = js.native
  def Add(ComponentType: vbext_ComponentType): VBComponent = js.native
  def AddCustom(ProgId: String): VBComponent = js.native
  /** @param index [index=0] */
  def AddMTDesigner(): VBComponent = js.native
  def AddMTDesigner(index: Double): VBComponent = js.native
  def Import(FileName: String): VBComponent = js.native
  def Item(index: js.Any): VBComponent = js.native
  def Remove(VBComponent: VBComponent): Unit = js.native
}

