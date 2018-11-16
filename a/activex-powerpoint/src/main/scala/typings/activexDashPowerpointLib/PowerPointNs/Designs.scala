package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.Designs")
@js.native
class Designs protected () extends js.Object {
  val Application: Application = js.native
  val Count: scala.Double = js.native
  val Parent: js.Any = js.native
  var `PowerPoint.Designs_typekey`: Designs = js.native
  /** @param number [Index=-1] */
  def Add(designName: java.lang.String): Design = js.native
  /** @param number [Index=-1] */
  def Add(designName: java.lang.String, Index: scala.Double): Design = js.native
  /** @param number [Index=-1] */
  def Clone(pOriginal: Design): Design = js.native
  /** @param number [Index=-1] */
  def Clone(pOriginal: Design, Index: scala.Double): Design = js.native
  def Item(Index: js.Any): Design = js.native
  /** @param number [Index=-1] */
  def Load(TemplateName: java.lang.String): Design = js.native
  /** @param number [Index=-1] */
  def Load(TemplateName: java.lang.String, Index: scala.Double): Design = js.native
}

