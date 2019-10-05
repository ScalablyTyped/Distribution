package typings.activexDashPowerpoint

import typings.activexDashPowerpoint.PowerPoint.Application
import typings.activexDashPowerpoint.PowerPoint.OLEControl
import typings.activexDashPowerpoint.activexDashPowerpointStrings.AfterNewPresentation
import typings.activexDashPowerpoint.activexDashPowerpointStrings.AfterPresentationOpen
import typings.activexDashPowerpoint.activexDashPowerpointStrings.Cancel
import typings.activexDashPowerpoint.activexDashPowerpointStrings.ColorSchemeChanged
import typings.activexDashPowerpoint.activexDashPowerpointStrings.GotFocus
import typings.activexDashPowerpoint.activexDashPowerpointStrings.LostFocus
import typings.activexDashPowerpoint.activexDashPowerpointStrings.NewPresentation
import typings.activexDashPowerpoint.activexDashPowerpointStrings.Pres
import typings.activexDashPowerpoint.activexDashPowerpointStrings.PresentationBeforeClose
import typings.activexDashPowerpoint.activexDashPowerpointStrings.PresentationBeforeSave
import typings.activexDashPowerpoint.activexDashPowerpointStrings.PresentationClose
import typings.activexDashPowerpoint.activexDashPowerpointStrings.PresentationCloseFinal
import typings.activexDashPowerpoint.activexDashPowerpointStrings.PresentationNewSlide
import typings.activexDashPowerpoint.activexDashPowerpointStrings.PresentationOpen
import typings.activexDashPowerpoint.activexDashPowerpointStrings.PresentationPrint
import typings.activexDashPowerpoint.activexDashPowerpointStrings.PresentationSave
import typings.activexDashPowerpoint.activexDashPowerpointStrings.PresentationSync
import typings.activexDashPowerpoint.activexDashPowerpointStrings.ProtViewWindow
import typings.activexDashPowerpoint.activexDashPowerpointStrings.ProtectedViewCloseReason
import typings.activexDashPowerpoint.activexDashPowerpointStrings.ProtectedViewWindowActivate
import typings.activexDashPowerpoint.activexDashPowerpointStrings.ProtectedViewWindowBeforeClose
import typings.activexDashPowerpoint.activexDashPowerpointStrings.ProtectedViewWindowBeforeEdit
import typings.activexDashPowerpoint.activexDashPowerpointStrings.ProtectedViewWindowDeactivate
import typings.activexDashPowerpoint.activexDashPowerpointStrings.ProtectedViewWindowOpen
import typings.activexDashPowerpoint.activexDashPowerpointStrings.Sel
import typings.activexDashPowerpoint.activexDashPowerpointStrings.Sld
import typings.activexDashPowerpoint.activexDashPowerpointStrings.SldRange
import typings.activexDashPowerpoint.activexDashPowerpointStrings.SlideSelectionChanged
import typings.activexDashPowerpoint.activexDashPowerpointStrings.SlideShowBegin
import typings.activexDashPowerpoint.activexDashPowerpointStrings.SlideShowEnd
import typings.activexDashPowerpoint.activexDashPowerpointStrings.SlideShowNextBuild
import typings.activexDashPowerpoint.activexDashPowerpointStrings.SlideShowNextClick
import typings.activexDashPowerpoint.activexDashPowerpointStrings.SlideShowNextSlide
import typings.activexDashPowerpoint.activexDashPowerpointStrings.SlideShowOnNext
import typings.activexDashPowerpoint.activexDashPowerpointStrings.SlideShowOnPrevious
import typings.activexDashPowerpoint.activexDashPowerpointStrings.SyncEventType
import typings.activexDashPowerpoint.activexDashPowerpointStrings.WindowActivate
import typings.activexDashPowerpoint.activexDashPowerpointStrings.WindowBeforeDoubleClick
import typings.activexDashPowerpoint.activexDashPowerpointStrings.WindowBeforeRightClick
import typings.activexDashPowerpoint.activexDashPowerpointStrings.WindowDeactivate
import typings.activexDashPowerpoint.activexDashPowerpointStrings.WindowSelectionChange
import typings.activexDashPowerpoint.activexDashPowerpointStrings.Wn
import typings.activexDashPowerpoint.activexDashPowerpointStrings.nEffect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveXObject extends js.Object {
  def on(
    obj: Application,
    event: AfterNewPresentation,
    argNames: js.Array[Pres],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_Pres, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: AfterPresentationOpen,
    argNames: js.Array[Pres],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_Pres, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ColorSchemeChanged,
    argNames: js.Array[SldRange],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_SldRange, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: NewPresentation,
    argNames: js.Array[Pres],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_Pres, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: PresentationBeforeClose,
    argNames: js.Tuple2[Pres, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_Cancel, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: PresentationBeforeSave,
    argNames: js.Tuple2[Pres, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_Cancel, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: PresentationCloseFinal,
    argNames: js.Array[Pres],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_Pres, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: PresentationClose,
    argNames: js.Array[Pres],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_Pres, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: PresentationNewSlide,
    argNames: js.Array[Sld],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_Sld, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: PresentationOpen,
    argNames: js.Array[Pres],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_Pres, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: PresentationPrint,
    argNames: js.Array[Pres],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_Pres, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: PresentationSave,
    argNames: js.Array[Pres],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_Pres, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: PresentationSync,
    argNames: js.Tuple2[Pres, SyncEventType],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_PresSyncEventType, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ProtectedViewWindowActivate,
    argNames: js.Array[ProtViewWindow],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_ProtViewWindow, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ProtectedViewWindowBeforeClose,
    argNames: js.Tuple3[ProtViewWindow, ProtectedViewCloseReason, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_CancelProtViewWindow, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ProtectedViewWindowBeforeEdit,
    argNames: js.Tuple2[ProtViewWindow, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_CancelProtViewWindowBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ProtectedViewWindowDeactivate,
    argNames: js.Array[ProtViewWindow],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_ProtViewWindow, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ProtectedViewWindowOpen,
    argNames: js.Array[ProtViewWindow],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_ProtViewWindow, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SlideSelectionChanged,
    argNames: js.Array[SldRange],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_SldRange, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SlideShowBegin,
    argNames: js.Array[Wn],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_Wn, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SlideShowEnd,
    argNames: js.Array[Pres],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_Pres, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SlideShowNextBuild,
    argNames: js.Array[Wn],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_Wn, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SlideShowNextClick,
    argNames: js.Tuple2[Wn, nEffect],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_NEffect, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SlideShowNextSlide,
    argNames: js.Array[Wn],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_Wn, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SlideShowOnNext,
    argNames: js.Array[Wn],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_Wn, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SlideShowOnPrevious,
    argNames: js.Array[Wn],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_Wn, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WindowActivate,
    argNames: js.Tuple2[Pres, Wn],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_PresWn, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WindowBeforeDoubleClick,
    argNames: js.Tuple2[Sel, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_CancelSel, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WindowBeforeRightClick,
    argNames: js.Tuple2[Sel, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_CancelSel, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WindowDeactivate,
    argNames: js.Tuple2[Pres, Wn],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_PresWn, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WindowSelectionChange,
    argNames: js.Array[Sel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_Sel, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_GotFocus(
    obj: OLEControl,
    event: GotFocus,
    handler: js.ThisFunction1[/* this */ OLEControl, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_LostFocus(
    obj: OLEControl,
    event: LostFocus,
    handler: js.ThisFunction1[/* this */ OLEControl, /* parameter */ js.Object, Unit]
  ): Unit = js.native
}

