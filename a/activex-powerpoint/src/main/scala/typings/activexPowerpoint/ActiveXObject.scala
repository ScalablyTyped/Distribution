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
import typings.activexPowerpoint.anon.CancelProtViewWindow
import typings.activexPowerpoint.anon.NEffect
import typings.activexPowerpoint.anon.PresWn
import typings.activexPowerpoint.anon.SelSelection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActiveXObject extends StObject {
  
  def on(
    obj: Application,
    event: AfterNewPresentation | AfterPresentationOpen | ColorSchemeChanged | NewPresentation | PresentationClose | PresentationCloseFinal | PresentationOpen | PresentationPrint | PresentationSave | ProtectedViewWindowActivate | ProtectedViewWindowDeactivate | ProtectedViewWindowOpen | SlideSelectionChanged | SlideShowBegin | SlideShowEnd | SlideShowNextBuild | SlideShowNextSlide | SlideShowOnNext | SlideShowOnPrevious,
    argNames: js.Array[Pres | ProtViewWindow | SldRange | Wn],
    handler: js.ThisFunction1[
      /* this */ Application, 
      (/* parameter */ typings.activexPowerpoint.anon.Pres) | (/* parameter */ typings.activexPowerpoint.anon.ProtViewWindow) | (/* parameter */ typings.activexPowerpoint.anon.SldRange) | (/* parameter */ typings.activexPowerpoint.anon.Wn), 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Application,
    event: PresentationBeforeClose | PresentationBeforeSave | WindowActivate | WindowBeforeDoubleClick | WindowBeforeRightClick | WindowDeactivate,
    argNames: js.Tuple2[Pres | Sel, Cancel | Wn],
    handler: js.ThisFunction1[
      /* this */ Application, 
      (/* parameter */ typings.activexPowerpoint.anon.Cancel) | (/* parameter */ PresWn) | (/* parameter */ typings.activexPowerpoint.anon.Sel), 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Application,
    event: PresentationNewSlide,
    argNames: js.Array[Sld],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ typings.activexPowerpoint.anon.Sld, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: PresentationSync,
    argNames: js.Tuple2[Pres, SyncEventType],
    handler: js.ThisFunction1[
      /* this */ Application, 
      /* parameter */ typings.activexPowerpoint.anon.SyncEventType, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ProtectedViewWindowBeforeClose,
    argNames: js.Tuple3[ProtViewWindow, ProtectedViewCloseReason, Cancel],
    handler: js.ThisFunction1[
      /* this */ Application, 
      /* parameter */ typings.activexPowerpoint.anon.ProtectedViewCloseReason, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ProtectedViewWindowBeforeEdit,
    argNames: js.Tuple2[ProtViewWindow, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ CancelProtViewWindow, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SlideShowNextClick,
    argNames: js.Tuple2[Wn, nEffect],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ NEffect, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WindowSelectionChange,
    argNames: js.Array[Sel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ SelSelection, Unit]
  ): Unit = js.native
  def on(
    obj: OLEControl,
    event: GotFocus | LostFocus,
    handler: js.ThisFunction1[/* this */ OLEControl, /* parameter */ js.Object, Unit]
  ): Unit = js.native
}
