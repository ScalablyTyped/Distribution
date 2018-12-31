package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.Presentations")
@js.native
class Presentations protected () extends js.Object {
  val Application: Application = js.native
  val Count: scala.Double = js.native
  val Parent: js.Any = js.native
  var `PowerPoint.Presentations_typekey`: Presentations = js.native
  /** @param Office.MsoTriState [WithWindow=-1] */
  def Add(): Presentation = js.native
  def Add(WithWindow: activexDashOfficeLib.OfficeNs.MsoTriState): Presentation = js.native
  def CanCheckOut(FileName: java.lang.String): scala.Boolean = js.native
  def CheckOut(FileName: java.lang.String): scala.Unit = js.native
  def Item(Index: js.Any): Presentation = js.native
  /**
    * @param Office.MsoTriState [ReadOnly=0]
    * @param Office.MsoTriState [Untitled=0]
    * @param Office.MsoTriState [WithWindow=-1]
    */
  def Open(FileName: java.lang.String): Presentation = js.native
  def Open(FileName: java.lang.String, ReadOnly: activexDashOfficeLib.OfficeNs.MsoTriState): Presentation = js.native
  def Open(
    FileName: java.lang.String,
    ReadOnly: activexDashOfficeLib.OfficeNs.MsoTriState,
    Untitled: activexDashOfficeLib.OfficeNs.MsoTriState
  ): Presentation = js.native
  def Open(
    FileName: java.lang.String,
    ReadOnly: activexDashOfficeLib.OfficeNs.MsoTriState,
    Untitled: activexDashOfficeLib.OfficeNs.MsoTriState,
    WithWindow: activexDashOfficeLib.OfficeNs.MsoTriState
  ): Presentation = js.native
  /**
    * @param Office.MsoTriState [ReadOnly=0]
    * @param Office.MsoTriState [Untitled=0]
    * @param Office.MsoTriState [WithWindow=-1]
    * @param Office.MsoTriState [OpenAndRepair=0]
    */
  def Open2007(FileName: java.lang.String): Presentation = js.native
  def Open2007(FileName: java.lang.String, ReadOnly: activexDashOfficeLib.OfficeNs.MsoTriState): Presentation = js.native
  def Open2007(
    FileName: java.lang.String,
    ReadOnly: activexDashOfficeLib.OfficeNs.MsoTriState,
    Untitled: activexDashOfficeLib.OfficeNs.MsoTriState
  ): Presentation = js.native
  def Open2007(
    FileName: java.lang.String,
    ReadOnly: activexDashOfficeLib.OfficeNs.MsoTriState,
    Untitled: activexDashOfficeLib.OfficeNs.MsoTriState,
    WithWindow: activexDashOfficeLib.OfficeNs.MsoTriState
  ): Presentation = js.native
  def Open2007(
    FileName: java.lang.String,
    ReadOnly: activexDashOfficeLib.OfficeNs.MsoTriState,
    Untitled: activexDashOfficeLib.OfficeNs.MsoTriState,
    WithWindow: activexDashOfficeLib.OfficeNs.MsoTriState,
    OpenAndRepair: activexDashOfficeLib.OfficeNs.MsoTriState
  ): Presentation = js.native
  /**
    * @param Office.MsoTriState [ReadOnly=0]
    * @param Office.MsoTriState [Untitled=0]
    * @param Office.MsoTriState [WithWindow=-1]
    */
  def OpenOld(FileName: java.lang.String): Presentation = js.native
  def OpenOld(FileName: java.lang.String, ReadOnly: activexDashOfficeLib.OfficeNs.MsoTriState): Presentation = js.native
  def OpenOld(
    FileName: java.lang.String,
    ReadOnly: activexDashOfficeLib.OfficeNs.MsoTriState,
    Untitled: activexDashOfficeLib.OfficeNs.MsoTriState
  ): Presentation = js.native
  def OpenOld(
    FileName: java.lang.String,
    ReadOnly: activexDashOfficeLib.OfficeNs.MsoTriState,
    Untitled: activexDashOfficeLib.OfficeNs.MsoTriState,
    WithWindow: activexDashOfficeLib.OfficeNs.MsoTriState
  ): Presentation = js.native
}

