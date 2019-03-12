package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.View")
@js.native
class View protected () extends js.Object {
  val Application: activexDashPowerpointLib.PowerPointNs.Application = js.native
  var DisplaySlideMiniature: activexDashOfficeLib.OfficeNs.MsoTriState = js.native
  val MediaControlsHeight: scala.Double = js.native
  val MediaControlsLeft: scala.Double = js.native
  val MediaControlsTop: scala.Double = js.native
  val MediaControlsVisible: activexDashOfficeLib.OfficeNs.MsoTriState = js.native
  val MediaControlsWidth: scala.Double = js.native
  val Parent: js.Any = js.native
  var `PowerPoint.View_typekey`: View = js.native
  val PrintOptions: activexDashPowerpointLib.PowerPointNs.PrintOptions = js.native
  var Slide: js.Any = js.native
  val Type: PpViewType = js.native
  var Zoom: scala.Double = js.native
  var ZoomToFit: activexDashOfficeLib.OfficeNs.MsoTriState = js.native
  def GotoSlide(Index: scala.Double): scala.Unit = js.native
  def Paste(): scala.Unit = js.native
  /**
    * @param PowerPoint.PpPasteDataType [DataType=0]
    * @param Office.MsoTriState [DisplayAsIcon=0]
    * @param string [IconFileName='']
    * @param number [IconIndex=0]
    * @param string [IconLabel='']
    * @param Office.MsoTriState [Link=0]
    */
  def PasteSpecial(
    DataType: js.UndefOr[PpPasteDataType],
    DisplayAsIcon: js.UndefOr[activexDashOfficeLib.OfficeNs.MsoTriState],
    IconFileName: js.UndefOr[java.lang.String],
    IconIndex: js.UndefOr[scala.Double],
    IconLabel: js.UndefOr[java.lang.String],
    Link: js.UndefOr[activexDashOfficeLib.OfficeNs.MsoTriState]
  ): scala.Unit = js.native
  def Player(ShapeId: js.Any): activexDashPowerpointLib.PowerPointNs.Player = js.native
  /**
    * @param number [From=-1]
    * @param number [To=-1]
    * @param string [PrintToFile='']
    * @param number [Copies=0]
    * @param Office.MsoTriState [Collate=-99]
    */
  def PrintOut(): scala.Unit = js.native
  def PrintOut(From: scala.Double): scala.Unit = js.native
  def PrintOut(From: scala.Double, To: scala.Double): scala.Unit = js.native
  def PrintOut(From: scala.Double, To: scala.Double, PrintToFile: java.lang.String): scala.Unit = js.native
  def PrintOut(From: scala.Double, To: scala.Double, PrintToFile: java.lang.String, Copies: scala.Double): scala.Unit = js.native
  def PrintOut(
    From: scala.Double,
    To: scala.Double,
    PrintToFile: java.lang.String,
    Copies: scala.Double,
    Collate: activexDashOfficeLib.OfficeNs.MsoTriState
  ): scala.Unit = js.native
}

