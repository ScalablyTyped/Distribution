package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.ShapeNodes")
@js.native
class ShapeNodes protected () extends js.Object {
  val Application: Application = js.native
  val Count: scala.Double = js.native
  val Creator: scala.Double = js.native
  val Parent: js.Any = js.native
  var `Word.ShapeNodes_typekey`: ShapeNodes = js.native
  def Delete(Index: scala.Double): scala.Unit = js.native
  /**
    * @param number [X2=0]
    * @param number [Y2=0]
    * @param number [X3=0]
    * @param number [Y3=0]
    */
  def Insert(
    Index: scala.Double,
    SegmentType: activexDashOfficeLib.OfficeNs.MsoSegmentType,
    EditingType: activexDashOfficeLib.OfficeNs.MsoEditingType,
    X1: scala.Double,
    Y1: scala.Double
  ): scala.Unit = js.native
  def Insert(
    Index: scala.Double,
    SegmentType: activexDashOfficeLib.OfficeNs.MsoSegmentType,
    EditingType: activexDashOfficeLib.OfficeNs.MsoEditingType,
    X1: scala.Double,
    Y1: scala.Double,
    X2: scala.Double
  ): scala.Unit = js.native
  def Insert(
    Index: scala.Double,
    SegmentType: activexDashOfficeLib.OfficeNs.MsoSegmentType,
    EditingType: activexDashOfficeLib.OfficeNs.MsoEditingType,
    X1: scala.Double,
    Y1: scala.Double,
    X2: scala.Double,
    Y2: scala.Double
  ): scala.Unit = js.native
  def Insert(
    Index: scala.Double,
    SegmentType: activexDashOfficeLib.OfficeNs.MsoSegmentType,
    EditingType: activexDashOfficeLib.OfficeNs.MsoEditingType,
    X1: scala.Double,
    Y1: scala.Double,
    X2: scala.Double,
    Y2: scala.Double,
    X3: scala.Double
  ): scala.Unit = js.native
  def Insert(
    Index: scala.Double,
    SegmentType: activexDashOfficeLib.OfficeNs.MsoSegmentType,
    EditingType: activexDashOfficeLib.OfficeNs.MsoEditingType,
    X1: scala.Double,
    Y1: scala.Double,
    X2: scala.Double,
    Y2: scala.Double,
    X3: scala.Double,
    Y3: scala.Double
  ): scala.Unit = js.native
  def Item(Index: js.Any): ShapeNode = js.native
  def SetEditingType(Index: scala.Double, EditingType: activexDashOfficeLib.OfficeNs.MsoEditingType): scala.Unit = js.native
  def SetPosition(Index: scala.Double, X1: scala.Double, Y1: scala.Double): scala.Unit = js.native
  def SetSegmentType(Index: scala.Double, SegmentType: activexDashOfficeLib.OfficeNs.MsoSegmentType): scala.Unit = js.native
}

