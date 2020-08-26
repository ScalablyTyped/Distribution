package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Presentations extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
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
  def Open(
    FileName: String,
    ReadOnly: js.UndefOr[scala.Nothing],
    Untitled: js.UndefOr[scala.Nothing],
    WithWindow: MsoTriState
  ): Presentation = js.native
  def Open(FileName: String, ReadOnly: js.UndefOr[scala.Nothing], Untitled: MsoTriState): Presentation = js.native
  def Open(
    FileName: String,
    ReadOnly: js.UndefOr[scala.Nothing],
    Untitled: MsoTriState,
    WithWindow: MsoTriState
  ): Presentation = js.native
  def Open(FileName: String, ReadOnly: MsoTriState): Presentation = js.native
  def Open(
    FileName: String,
    ReadOnly: MsoTriState,
    Untitled: js.UndefOr[scala.Nothing],
    WithWindow: MsoTriState
  ): Presentation = js.native
  def Open(FileName: String, ReadOnly: MsoTriState, Untitled: MsoTriState): Presentation = js.native
  def Open(FileName: String, ReadOnly: MsoTriState, Untitled: MsoTriState, WithWindow: MsoTriState): Presentation = js.native
  /**
    * @param Office.MsoTriState [ReadOnly=0]
    * @param Office.MsoTriState [Untitled=0]
    * @param Office.MsoTriState [WithWindow=-1]
    * @param Office.MsoTriState [OpenAndRepair=0]
    */
  def Open2007(FileName: String): Presentation = js.native
  def Open2007(
    FileName: String,
    ReadOnly: js.UndefOr[scala.Nothing],
    Untitled: js.UndefOr[scala.Nothing],
    WithWindow: js.UndefOr[scala.Nothing],
    OpenAndRepair: MsoTriState
  ): Presentation = js.native
  def Open2007(
    FileName: String,
    ReadOnly: js.UndefOr[scala.Nothing],
    Untitled: js.UndefOr[scala.Nothing],
    WithWindow: MsoTriState
  ): Presentation = js.native
  def Open2007(
    FileName: String,
    ReadOnly: js.UndefOr[scala.Nothing],
    Untitled: js.UndefOr[scala.Nothing],
    WithWindow: MsoTriState,
    OpenAndRepair: MsoTriState
  ): Presentation = js.native
  def Open2007(FileName: String, ReadOnly: js.UndefOr[scala.Nothing], Untitled: MsoTriState): Presentation = js.native
  def Open2007(
    FileName: String,
    ReadOnly: js.UndefOr[scala.Nothing],
    Untitled: MsoTriState,
    WithWindow: js.UndefOr[scala.Nothing],
    OpenAndRepair: MsoTriState
  ): Presentation = js.native
  def Open2007(
    FileName: String,
    ReadOnly: js.UndefOr[scala.Nothing],
    Untitled: MsoTriState,
    WithWindow: MsoTriState
  ): Presentation = js.native
  def Open2007(
    FileName: String,
    ReadOnly: js.UndefOr[scala.Nothing],
    Untitled: MsoTriState,
    WithWindow: MsoTriState,
    OpenAndRepair: MsoTriState
  ): Presentation = js.native
  def Open2007(FileName: String, ReadOnly: MsoTriState): Presentation = js.native
  def Open2007(
    FileName: String,
    ReadOnly: MsoTriState,
    Untitled: js.UndefOr[scala.Nothing],
    WithWindow: js.UndefOr[scala.Nothing],
    OpenAndRepair: MsoTriState
  ): Presentation = js.native
  def Open2007(
    FileName: String,
    ReadOnly: MsoTriState,
    Untitled: js.UndefOr[scala.Nothing],
    WithWindow: MsoTriState
  ): Presentation = js.native
  def Open2007(
    FileName: String,
    ReadOnly: MsoTriState,
    Untitled: js.UndefOr[scala.Nothing],
    WithWindow: MsoTriState,
    OpenAndRepair: MsoTriState
  ): Presentation = js.native
  def Open2007(FileName: String, ReadOnly: MsoTriState, Untitled: MsoTriState): Presentation = js.native
  def Open2007(
    FileName: String,
    ReadOnly: MsoTriState,
    Untitled: MsoTriState,
    WithWindow: js.UndefOr[scala.Nothing],
    OpenAndRepair: MsoTriState
  ): Presentation = js.native
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
  def OpenOld(
    FileName: String,
    ReadOnly: js.UndefOr[scala.Nothing],
    Untitled: js.UndefOr[scala.Nothing],
    WithWindow: MsoTriState
  ): Presentation = js.native
  def OpenOld(FileName: String, ReadOnly: js.UndefOr[scala.Nothing], Untitled: MsoTriState): Presentation = js.native
  def OpenOld(
    FileName: String,
    ReadOnly: js.UndefOr[scala.Nothing],
    Untitled: MsoTriState,
    WithWindow: MsoTriState
  ): Presentation = js.native
  def OpenOld(FileName: String, ReadOnly: MsoTriState): Presentation = js.native
  def OpenOld(
    FileName: String,
    ReadOnly: MsoTriState,
    Untitled: js.UndefOr[scala.Nothing],
    WithWindow: MsoTriState
  ): Presentation = js.native
  def OpenOld(FileName: String, ReadOnly: MsoTriState, Untitled: MsoTriState): Presentation = js.native
  def OpenOld(FileName: String, ReadOnly: MsoTriState, Untitled: MsoTriState, WithWindow: MsoTriState): Presentation = js.native
}

