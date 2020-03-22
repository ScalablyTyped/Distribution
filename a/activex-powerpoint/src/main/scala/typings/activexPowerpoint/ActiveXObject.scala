package typings.activexPowerpoint

import typings.activexPowerpoint.PowerPoint.Application
import typings.activexPowerpoint.PowerPoint.OLEControl
import typings.activexPowerpoint.activexPowerpointStrings.AfterNewPresentation
import typings.activexPowerpoint.activexPowerpointStrings.AfterPresentationOpen
import typings.activexPowerpoint.activexPowerpointStrings.Cancel
import typings.activexPowerpoint.activexPowerpointStrings.ColorSchemeChanged
import typings.activexPowerpoint.activexPowerpointStrings.GotFocus
import typings.activexPowerpoint.activexPowerpointStrings.LostFocus
import typings.activexPowerpoint.activexPowerpointStrings.NewPresentation
import typings.activexPowerpoint.activexPowerpointStrings.Pres
import typings.activexPowerpoint.activexPowerpointStrings.PresentationBeforeClose
import typings.activexPowerpoint.activexPowerpointStrings.PresentationBeforeSave
import typings.activexPowerpoint.activexPowerpointStrings.PresentationClose
import typings.activexPowerpoint.activexPowerpointStrings.PresentationCloseFinal
import typings.activexPowerpoint.activexPowerpointStrings.PresentationNewSlide
import typings.activexPowerpoint.activexPowerpointStrings.PresentationOpen
import typings.activexPowerpoint.activexPowerpointStrings.PresentationPrint
import typings.activexPowerpoint.activexPowerpointStrings.PresentationSave
import typings.activexPowerpoint.activexPowerpointStrings.PresentationSync
import typings.activexPowerpoint.activexPowerpointStrings.ProtViewWindow
import typings.activexPowerpoint.activexPowerpointStrings.ProtectedViewCloseReason
import typings.activexPowerpoint.activexPowerpointStrings.ProtectedViewWindowActivate
import typings.activexPowerpoint.activexPowerpointStrings.ProtectedViewWindowBeforeClose
import typings.activexPowerpoint.activexPowerpointStrings.ProtectedViewWindowBeforeEdit
import typings.activexPowerpoint.activexPowerpointStrings.ProtectedViewWindowDeactivate
import typings.activexPowerpoint.activexPowerpointStrings.ProtectedViewWindowOpen
import typings.activexPowerpoint.activexPowerpointStrings.Sel
import typings.activexPowerpoint.activexPowerpointStrings.Sld
import typings.activexPowerpoint.activexPowerpointStrings.SldRange
import typings.activexPowerpoint.activexPowerpointStrings.SlideSelectionChanged
import typings.activexPowerpoint.activexPowerpointStrings.SlideShowBegin
import typings.activexPowerpoint.activexPowerpointStrings.SlideShowEnd
import typings.activexPowerpoint.activexPowerpointStrings.SlideShowNextBuild
import typings.activexPowerpoint.activexPowerpointStrings.SlideShowNextClick
import typings.activexPowerpoint.activexPowerpointStrings.SlideShowNextSlide
import typings.activexPowerpoint.activexPowerpointStrings.SlideShowOnNext
import typings.activexPowerpoint.activexPowerpointStrings.SlideShowOnPrevious
import typings.activexPowerpoint.activexPowerpointStrings.SyncEventType
import typings.activexPowerpoint.activexPowerpointStrings.WindowActivate
import typings.activexPowerpoint.activexPowerpointStrings.WindowBeforeDoubleClick
import typings.activexPowerpoint.activexPowerpointStrings.WindowBeforeRightClick
import typings.activexPowerpoint.activexPowerpointStrings.WindowDeactivate
import typings.activexPowerpoint.activexPowerpointStrings.WindowSelectionChange
import typings.activexPowerpoint.activexPowerpointStrings.Wn
import typings.activexPowerpoint.activexPowerpointStrings.nEffect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveXObject extends js.Object {
  def on(
    obj: Application,
    event: AfterNewPresentation,
    argNames: js.Array[Pres],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonPres, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: AfterPresentationOpen,
    argNames: js.Array[Pres],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonPres, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ColorSchemeChanged,
    argNames: js.Array[SldRange],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonSldRange, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: NewPresentation,
    argNames: js.Array[Pres],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonPres, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: PresentationBeforeClose,
    argNames: js.Tuple2[Pres, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: PresentationBeforeSave,
    argNames: js.Tuple2[Pres, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: PresentationCloseFinal,
    argNames: js.Array[Pres],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonPres, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: PresentationClose,
    argNames: js.Array[Pres],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonPres, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: PresentationNewSlide,
    argNames: js.Array[Sld],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonSld, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: PresentationOpen,
    argNames: js.Array[Pres],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonPres, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: PresentationPrint,
    argNames: js.Array[Pres],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonPres, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: PresentationSave,
    argNames: js.Array[Pres],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonPres, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: PresentationSync,
    argNames: js.Tuple2[Pres, SyncEventType],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonSyncEventType, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ProtectedViewWindowActivate,
    argNames: js.Array[ProtViewWindow],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonProtViewWindow, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ProtectedViewWindowBeforeClose,
    argNames: js.Tuple3[ProtViewWindow, ProtectedViewCloseReason, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonProtectedViewCloseReason, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ProtectedViewWindowBeforeEdit,
    argNames: js.Tuple2[ProtViewWindow, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonCancelProtViewWindow, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ProtectedViewWindowDeactivate,
    argNames: js.Array[ProtViewWindow],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonProtViewWindow, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ProtectedViewWindowOpen,
    argNames: js.Array[ProtViewWindow],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonProtViewWindow, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SlideSelectionChanged,
    argNames: js.Array[SldRange],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonSldRange, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SlideShowBegin,
    argNames: js.Array[Wn],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonWn, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SlideShowEnd,
    argNames: js.Array[Pres],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonPres, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SlideShowNextBuild,
    argNames: js.Array[Wn],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonWn, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SlideShowNextClick,
    argNames: js.Tuple2[Wn, nEffect],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonNEffect, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SlideShowNextSlide,
    argNames: js.Array[Wn],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonWn, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SlideShowOnNext,
    argNames: js.Array[Wn],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonWn, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SlideShowOnPrevious,
    argNames: js.Array[Wn],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonWn, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WindowActivate,
    argNames: js.Tuple2[Pres, Wn],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonPresWn, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WindowBeforeDoubleClick,
    argNames: js.Tuple2[Sel, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonSel, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WindowBeforeRightClick,
    argNames: js.Tuple2[Sel, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonSel, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WindowDeactivate,
    argNames: js.Tuple2[Pres, Wn],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonPresWn, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WindowSelectionChange,
    argNames: js.Array[Sel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonSelSelection, Unit]
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

