package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.CustomLayouts")
@js.native
class CustomLayouts protected () extends js.Object {
  val Application: Application = js.native
  val Count: scala.Double = js.native
  val Parent: js.Any = js.native
  var `PowerPoint.CustomLayouts_typekey`: CustomLayouts = js.native
  def Add(Index: scala.Double): CustomLayout = js.native
  def Item(Index: js.Any): CustomLayout = js.native
  /** @param number [Index=-1] */
  def Paste(): CustomLayout = js.native
  def Paste(Index: scala.Double): CustomLayout = js.native
}

