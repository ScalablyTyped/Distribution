package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.FreeformBuilder")
@js.native
class FreeformBuilder protected () extends js.Object {
  val Application: Application = js.native
  val Creator: scala.Double = js.native
  val Parent: js.Any = js.native
  var `Word.FreeformBuilder_typekey`: FreeformBuilder = js.native
  /**
    * @param number [X2=0]
    * @param number [Y2=0]
    * @param number [X3=0]
    * @param number [Y3=0]
    */
  def AddNodes(
    SegmentType: activexDashOfficeLib.OfficeNs.MsoSegmentType,
    EditingType: activexDashOfficeLib.OfficeNs.MsoEditingType,
    X1: scala.Double,
    Y1: scala.Double
  ): scala.Unit = js.native
  def AddNodes(
    SegmentType: activexDashOfficeLib.OfficeNs.MsoSegmentType,
    EditingType: activexDashOfficeLib.OfficeNs.MsoEditingType,
    X1: scala.Double,
    Y1: scala.Double,
    X2: scala.Double
  ): scala.Unit = js.native
  def AddNodes(
    SegmentType: activexDashOfficeLib.OfficeNs.MsoSegmentType,
    EditingType: activexDashOfficeLib.OfficeNs.MsoEditingType,
    X1: scala.Double,
    Y1: scala.Double,
    X2: scala.Double,
    Y2: scala.Double
  ): scala.Unit = js.native
  def AddNodes(
    SegmentType: activexDashOfficeLib.OfficeNs.MsoSegmentType,
    EditingType: activexDashOfficeLib.OfficeNs.MsoEditingType,
    X1: scala.Double,
    Y1: scala.Double,
    X2: scala.Double,
    Y2: scala.Double,
    X3: scala.Double
  ): scala.Unit = js.native
  def AddNodes(
    SegmentType: activexDashOfficeLib.OfficeNs.MsoSegmentType,
    EditingType: activexDashOfficeLib.OfficeNs.MsoEditingType,
    X1: scala.Double,
    Y1: scala.Double,
    X2: scala.Double,
    Y2: scala.Double,
    X3: scala.Double,
    Y3: scala.Double
  ): scala.Unit = js.native
  def ConvertToShape(): Shape = js.native
  def ConvertToShape(Anchor: js.Any): Shape = js.native
}

