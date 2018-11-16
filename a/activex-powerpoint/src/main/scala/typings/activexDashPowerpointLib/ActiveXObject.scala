package typings
package activexDashPowerpointLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveXObject extends js.Object {
  def on(
    obj: activexDashPowerpointLib.PowerPointNs.Application,
    event: activexDashPowerpointLib.activexDashPowerpointLibStrings.AfterNewPresentation,
    argNames: js.Array[activexDashPowerpointLib.activexDashPowerpointLibStrings.Pres],
    handler: js.ThisFunction1[
      /* this */ activexDashPowerpointLib.PowerPointNs.Application, 
      /* parameter */ Anon_Pres, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashPowerpointLib.PowerPointNs.Application,
    event: activexDashPowerpointLib.activexDashPowerpointLibStrings.AfterPresentationOpen,
    argNames: js.Array[activexDashPowerpointLib.activexDashPowerpointLibStrings.Pres],
    handler: js.ThisFunction1[
      /* this */ activexDashPowerpointLib.PowerPointNs.Application, 
      /* parameter */ Anon_Pres, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashPowerpointLib.PowerPointNs.Application,
    event: activexDashPowerpointLib.activexDashPowerpointLibStrings.ColorSchemeChanged,
    argNames: js.Array[activexDashPowerpointLib.activexDashPowerpointLibStrings.SldRange],
    handler: js.ThisFunction1[
      /* this */ activexDashPowerpointLib.PowerPointNs.Application, 
      /* parameter */ Anon_SldRange, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashPowerpointLib.PowerPointNs.Application,
    event: activexDashPowerpointLib.activexDashPowerpointLibStrings.NewPresentation,
    argNames: js.Array[activexDashPowerpointLib.activexDashPowerpointLibStrings.Pres],
    handler: js.ThisFunction1[
      /* this */ activexDashPowerpointLib.PowerPointNs.Application, 
      /* parameter */ Anon_Pres, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashPowerpointLib.PowerPointNs.Application,
    event: activexDashPowerpointLib.activexDashPowerpointLibStrings.PresentationBeforeClose,
    argNames: js.Tuple2[
      activexDashPowerpointLib.activexDashPowerpointLibStrings.Pres, 
      activexDashPowerpointLib.activexDashPowerpointLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashPowerpointLib.PowerPointNs.Application, 
      /* parameter */ Anon_PresCancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashPowerpointLib.PowerPointNs.Application,
    event: activexDashPowerpointLib.activexDashPowerpointLibStrings.PresentationBeforeSave,
    argNames: js.Tuple2[
      activexDashPowerpointLib.activexDashPowerpointLibStrings.Pres, 
      activexDashPowerpointLib.activexDashPowerpointLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashPowerpointLib.PowerPointNs.Application, 
      /* parameter */ Anon_PresCancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashPowerpointLib.PowerPointNs.Application,
    event: activexDashPowerpointLib.activexDashPowerpointLibStrings.PresentationCloseFinal,
    argNames: js.Array[activexDashPowerpointLib.activexDashPowerpointLibStrings.Pres],
    handler: js.ThisFunction1[
      /* this */ activexDashPowerpointLib.PowerPointNs.Application, 
      /* parameter */ Anon_Pres, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashPowerpointLib.PowerPointNs.Application,
    event: activexDashPowerpointLib.activexDashPowerpointLibStrings.PresentationClose,
    argNames: js.Array[activexDashPowerpointLib.activexDashPowerpointLibStrings.Pres],
    handler: js.ThisFunction1[
      /* this */ activexDashPowerpointLib.PowerPointNs.Application, 
      /* parameter */ Anon_Pres, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashPowerpointLib.PowerPointNs.Application,
    event: activexDashPowerpointLib.activexDashPowerpointLibStrings.PresentationNewSlide,
    argNames: js.Array[activexDashPowerpointLib.activexDashPowerpointLibStrings.Sld],
    handler: js.ThisFunction1[
      /* this */ activexDashPowerpointLib.PowerPointNs.Application, 
      /* parameter */ Anon_Sld, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashPowerpointLib.PowerPointNs.Application,
    event: activexDashPowerpointLib.activexDashPowerpointLibStrings.PresentationOpen,
    argNames: js.Array[activexDashPowerpointLib.activexDashPowerpointLibStrings.Pres],
    handler: js.ThisFunction1[
      /* this */ activexDashPowerpointLib.PowerPointNs.Application, 
      /* parameter */ Anon_Pres, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashPowerpointLib.PowerPointNs.Application,
    event: activexDashPowerpointLib.activexDashPowerpointLibStrings.PresentationPrint,
    argNames: js.Array[activexDashPowerpointLib.activexDashPowerpointLibStrings.Pres],
    handler: js.ThisFunction1[
      /* this */ activexDashPowerpointLib.PowerPointNs.Application, 
      /* parameter */ Anon_Pres, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashPowerpointLib.PowerPointNs.Application,
    event: activexDashPowerpointLib.activexDashPowerpointLibStrings.PresentationSave,
    argNames: js.Array[activexDashPowerpointLib.activexDashPowerpointLibStrings.Pres],
    handler: js.ThisFunction1[
      /* this */ activexDashPowerpointLib.PowerPointNs.Application, 
      /* parameter */ Anon_Pres, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashPowerpointLib.PowerPointNs.Application,
    event: activexDashPowerpointLib.activexDashPowerpointLibStrings.PresentationSync,
    argNames: js.Tuple2[
      activexDashPowerpointLib.activexDashPowerpointLibStrings.Pres, 
      activexDashPowerpointLib.activexDashPowerpointLibStrings.SyncEventType
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashPowerpointLib.PowerPointNs.Application, 
      /* parameter */ Anon_PresSyncEventType, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashPowerpointLib.PowerPointNs.Application,
    event: activexDashPowerpointLib.activexDashPowerpointLibStrings.ProtectedViewWindowActivate,
    argNames: js.Array[activexDashPowerpointLib.activexDashPowerpointLibStrings.ProtViewWindow],
    handler: js.ThisFunction1[
      /* this */ activexDashPowerpointLib.PowerPointNs.Application, 
      /* parameter */ Anon_ProtViewWindow, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashPowerpointLib.PowerPointNs.Application,
    event: activexDashPowerpointLib.activexDashPowerpointLibStrings.ProtectedViewWindowBeforeClose,
    argNames: js.Tuple3[
      activexDashPowerpointLib.activexDashPowerpointLibStrings.ProtViewWindow, 
      activexDashPowerpointLib.activexDashPowerpointLibStrings.ProtectedViewCloseReason, 
      activexDashPowerpointLib.activexDashPowerpointLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashPowerpointLib.PowerPointNs.Application, 
      /* parameter */ Anon_Cancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashPowerpointLib.PowerPointNs.Application,
    event: activexDashPowerpointLib.activexDashPowerpointLibStrings.ProtectedViewWindowBeforeEdit,
    argNames: js.Tuple2[
      activexDashPowerpointLib.activexDashPowerpointLibStrings.ProtViewWindow, 
      activexDashPowerpointLib.activexDashPowerpointLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashPowerpointLib.PowerPointNs.Application, 
      /* parameter */ Anon_CancelProtViewWindow, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashPowerpointLib.PowerPointNs.Application,
    event: activexDashPowerpointLib.activexDashPowerpointLibStrings.ProtectedViewWindowDeactivate,
    argNames: js.Array[activexDashPowerpointLib.activexDashPowerpointLibStrings.ProtViewWindow],
    handler: js.ThisFunction1[
      /* this */ activexDashPowerpointLib.PowerPointNs.Application, 
      /* parameter */ Anon_ProtViewWindow, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashPowerpointLib.PowerPointNs.Application,
    event: activexDashPowerpointLib.activexDashPowerpointLibStrings.ProtectedViewWindowOpen,
    argNames: js.Array[activexDashPowerpointLib.activexDashPowerpointLibStrings.ProtViewWindow],
    handler: js.ThisFunction1[
      /* this */ activexDashPowerpointLib.PowerPointNs.Application, 
      /* parameter */ Anon_ProtViewWindow, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashPowerpointLib.PowerPointNs.Application,
    event: activexDashPowerpointLib.activexDashPowerpointLibStrings.SlideSelectionChanged,
    argNames: js.Array[activexDashPowerpointLib.activexDashPowerpointLibStrings.SldRange],
    handler: js.ThisFunction1[
      /* this */ activexDashPowerpointLib.PowerPointNs.Application, 
      /* parameter */ Anon_SldRange, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashPowerpointLib.PowerPointNs.Application,
    event: activexDashPowerpointLib.activexDashPowerpointLibStrings.SlideShowBegin,
    argNames: js.Array[activexDashPowerpointLib.activexDashPowerpointLibStrings.Wn],
    handler: js.ThisFunction1[
      /* this */ activexDashPowerpointLib.PowerPointNs.Application, 
      /* parameter */ Anon_Wn, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashPowerpointLib.PowerPointNs.Application,
    event: activexDashPowerpointLib.activexDashPowerpointLibStrings.SlideShowEnd,
    argNames: js.Array[activexDashPowerpointLib.activexDashPowerpointLibStrings.Pres],
    handler: js.ThisFunction1[
      /* this */ activexDashPowerpointLib.PowerPointNs.Application, 
      /* parameter */ Anon_Pres, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashPowerpointLib.PowerPointNs.Application,
    event: activexDashPowerpointLib.activexDashPowerpointLibStrings.SlideShowNextBuild,
    argNames: js.Array[activexDashPowerpointLib.activexDashPowerpointLibStrings.Wn],
    handler: js.ThisFunction1[
      /* this */ activexDashPowerpointLib.PowerPointNs.Application, 
      /* parameter */ Anon_Wn, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashPowerpointLib.PowerPointNs.Application,
    event: activexDashPowerpointLib.activexDashPowerpointLibStrings.SlideShowNextClick,
    argNames: js.Tuple2[
      activexDashPowerpointLib.activexDashPowerpointLibStrings.Wn, 
      activexDashPowerpointLib.activexDashPowerpointLibStrings.nEffect
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashPowerpointLib.PowerPointNs.Application, 
      /* parameter */ Anon_WnNEffect, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashPowerpointLib.PowerPointNs.Application,
    event: activexDashPowerpointLib.activexDashPowerpointLibStrings.SlideShowNextSlide,
    argNames: js.Array[activexDashPowerpointLib.activexDashPowerpointLibStrings.Wn],
    handler: js.ThisFunction1[
      /* this */ activexDashPowerpointLib.PowerPointNs.Application, 
      /* parameter */ Anon_Wn, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashPowerpointLib.PowerPointNs.Application,
    event: activexDashPowerpointLib.activexDashPowerpointLibStrings.SlideShowOnNext,
    argNames: js.Array[activexDashPowerpointLib.activexDashPowerpointLibStrings.Wn],
    handler: js.ThisFunction1[
      /* this */ activexDashPowerpointLib.PowerPointNs.Application, 
      /* parameter */ Anon_Wn, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashPowerpointLib.PowerPointNs.Application,
    event: activexDashPowerpointLib.activexDashPowerpointLibStrings.SlideShowOnPrevious,
    argNames: js.Array[activexDashPowerpointLib.activexDashPowerpointLibStrings.Wn],
    handler: js.ThisFunction1[
      /* this */ activexDashPowerpointLib.PowerPointNs.Application, 
      /* parameter */ Anon_Wn, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashPowerpointLib.PowerPointNs.Application,
    event: activexDashPowerpointLib.activexDashPowerpointLibStrings.WindowActivate,
    argNames: js.Tuple2[
      activexDashPowerpointLib.activexDashPowerpointLibStrings.Pres, 
      activexDashPowerpointLib.activexDashPowerpointLibStrings.Wn
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashPowerpointLib.PowerPointNs.Application, 
      /* parameter */ Anon_PresWn, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashPowerpointLib.PowerPointNs.Application,
    event: activexDashPowerpointLib.activexDashPowerpointLibStrings.WindowBeforeDoubleClick,
    argNames: js.Tuple2[
      activexDashPowerpointLib.activexDashPowerpointLibStrings.Sel, 
      activexDashPowerpointLib.activexDashPowerpointLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashPowerpointLib.PowerPointNs.Application, 
      /* parameter */ Anon_CancelSel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashPowerpointLib.PowerPointNs.Application,
    event: activexDashPowerpointLib.activexDashPowerpointLibStrings.WindowBeforeRightClick,
    argNames: js.Tuple2[
      activexDashPowerpointLib.activexDashPowerpointLibStrings.Sel, 
      activexDashPowerpointLib.activexDashPowerpointLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashPowerpointLib.PowerPointNs.Application, 
      /* parameter */ Anon_CancelSel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashPowerpointLib.PowerPointNs.Application,
    event: activexDashPowerpointLib.activexDashPowerpointLibStrings.WindowDeactivate,
    argNames: js.Tuple2[
      activexDashPowerpointLib.activexDashPowerpointLibStrings.Pres, 
      activexDashPowerpointLib.activexDashPowerpointLibStrings.Wn
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashPowerpointLib.PowerPointNs.Application, 
      /* parameter */ Anon_PresWn, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashPowerpointLib.PowerPointNs.Application,
    event: activexDashPowerpointLib.activexDashPowerpointLibStrings.WindowSelectionChange,
    argNames: js.Array[activexDashPowerpointLib.activexDashPowerpointLibStrings.Sel],
    handler: js.ThisFunction1[
      /* this */ activexDashPowerpointLib.PowerPointNs.Application, 
      /* parameter */ Anon_Sel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_GotFocus(
    obj: activexDashPowerpointLib.PowerPointNs.OLEControl,
    event: activexDashPowerpointLib.activexDashPowerpointLibStrings.GotFocus,
    handler: js.ThisFunction1[
      /* this */ activexDashPowerpointLib.PowerPointNs.OLEControl, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_LostFocus(
    obj: activexDashPowerpointLib.PowerPointNs.OLEControl,
    event: activexDashPowerpointLib.activexDashPowerpointLibStrings.LostFocus,
    handler: js.ThisFunction1[
      /* this */ activexDashPowerpointLib.PowerPointNs.OLEControl, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

