package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShapeNodes extends js.Object {
  val Application: js.Any = js.native
  val Count: scala.Double = js.native
  val Creator: scala.Double = js.native
  val Parent: js.Any = js.native
  def apply(Index: java.lang.String): ShapeNode = js.native
  def apply(Index: scala.Double): ShapeNode = js.native
  def Delete(Index: scala.Double): scala.Unit = js.native
  /**
    * @param X2 [X2=0]
    * @param Y2 [Y2=0]
    * @param X3 [X3=0]
    * @param Y3 [Y3=0]
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
  def Item(Index: java.lang.String): ShapeNode = js.native
  def Item(Index: scala.Double): ShapeNode = js.native
  def SetEditingType(Index: scala.Double, EditingType: activexDashOfficeLib.OfficeNs.MsoEditingType): scala.Unit = js.native
  def SetPosition(Index: scala.Double, X1: scala.Double, Y1: scala.Double): scala.Unit = js.native
  def SetSegmentType(Index: scala.Double, SegmentType: activexDashOfficeLib.OfficeNs.MsoSegmentType): scala.Unit = js.native
}

