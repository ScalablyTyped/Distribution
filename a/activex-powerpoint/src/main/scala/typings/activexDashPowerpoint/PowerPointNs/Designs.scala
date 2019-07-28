package typings.activexDashPowerpoint.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.Designs")
@js.native
class Designs protected () extends js.Object {
  val Application: typings.activexDashPowerpoint.PowerPointNs.Application = js.native
  val Count: Double = js.native
  val Parent: js.Any = js.native
  var `PowerPoint.Designs_typekey`: Designs = js.native
  /** @param number [Index=-1] */
  def Add(designName: String): Design = js.native
  def Add(designName: String, Index: Double): Design = js.native
  /** @param number [Index=-1] */
  def Clone(pOriginal: Design): Design = js.native
  def Clone(pOriginal: Design, Index: Double): Design = js.native
  def Item(Index: js.Any): Design = js.native
  /** @param number [Index=-1] */
  def Load(TemplateName: String): Design = js.native
  def Load(TemplateName: String, Index: Double): Design = js.native
}

