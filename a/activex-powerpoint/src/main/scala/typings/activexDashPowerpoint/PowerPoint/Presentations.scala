package typings.activexDashPowerpoint.PowerPoint

import typings.activexDashOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.Presentations")
@js.native
class Presentations protected () extends js.Object {
  val Application: typings.activexDashPowerpoint.PowerPoint.Application = js.native
  val Count: Double = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.Presentations_typekey")
  var PowerPointDotPresentations_typekey: Presentations = js.native
  /** @param Office.MsoTriState [WithWindow=-1] */
  def Add(): Presentation = js.native
  def Add(WithWindow: MsoTriState): Presentation = js.native
  def CanCheckOut(FileName: String): Boolean = js.native
  def CheckOut(FileName: String): Unit = js.native
  def Item(Index: js.Any): Presentation = js.native
  /**
    * @param Office.MsoTriState [ReadOnly=0]
    * @param Office.MsoTriState [Untitled=0]
    * @param Office.MsoTriState [WithWindow=-1]
    */
  def Open(FileName: String): Presentation = js.native
  def Open(FileName: String, ReadOnly: MsoTriState): Presentation = js.native
  def Open(FileName: String, ReadOnly: MsoTriState, Untitled: MsoTriState): Presentation = js.native
  def Open(FileName: String, ReadOnly: MsoTriState, Untitled: MsoTriState, WithWindow: MsoTriState): Presentation = js.native
  /**
    * @param Office.MsoTriState [ReadOnly=0]
    * @param Office.MsoTriState [Untitled=0]
    * @param Office.MsoTriState [WithWindow=-1]
    * @param Office.MsoTriState [OpenAndRepair=0]
    */
  def Open2007(FileName: String): Presentation = js.native
  def Open2007(FileName: String, ReadOnly: MsoTriState): Presentation = js.native
  def Open2007(FileName: String, ReadOnly: MsoTriState, Untitled: MsoTriState): Presentation = js.native
  def Open2007(FileName: String, ReadOnly: MsoTriState, Untitled: MsoTriState, WithWindow: MsoTriState): Presentation = js.native
  def Open2007(
    FileName: String,
    ReadOnly: MsoTriState,
    Untitled: MsoTriState,
    WithWindow: MsoTriState,
    OpenAndRepair: MsoTriState
  ): Presentation = js.native
  /**
    * @param Office.MsoTriState [ReadOnly=0]
    * @param Office.MsoTriState [Untitled=0]
    * @param Office.MsoTriState [WithWindow=-1]
    */
  def OpenOld(FileName: String): Presentation = js.native
  def OpenOld(FileName: String, ReadOnly: MsoTriState): Presentation = js.native
  def OpenOld(FileName: String, ReadOnly: MsoTriState, Untitled: MsoTriState): Presentation = js.native
  def OpenOld(FileName: String, ReadOnly: MsoTriState, Untitled: MsoTriState, WithWindow: MsoTriState): Presentation = js.native
}

