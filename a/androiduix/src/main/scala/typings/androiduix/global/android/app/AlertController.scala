package typings.androiduix.global.android.app

import typings.androiduix.android.content.Context
import typings.androiduix.android.content.DialogInterface
import typings.androiduix.android.view.Window
import typings.std.HTMLElement
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("android.app.AlertController")
@js.native
class AlertController protected ()
  extends typings.androiduix.android.app.AlertController {
  def this(context: Context, di: DialogInterface, window: Window) = this()
}
/* static members */
@JSGlobal("android.app.AlertController")
@js.native
object AlertController extends js.Object {
  
  /* private */ def shouldCenterSingleButton(context: js.Any): js.Any = js.native
  
  @js.native
  class AlertParams protected ()
    extends typings.androiduix.android.app.AlertController.AlertParams {
    def this(context: Context) = this()
  }
  
  @js.native
  class ButtonHandler protected ()
    extends typings.androiduix.android.app.AlertController.ButtonHandler {
    def this(dialog: DialogInterface) = this()
  }
  /* static members */
  @js.native
  object ButtonHandler extends js.Object {
    
    var MSG_DISMISS_DIALOG: js.Any = js.native
  }
  
  @js.native
  class RecycleListView protected ()
    extends typings.androiduix.android.app.AlertController.RecycleListView {
    def this(context: Context) = this()
    def this(context: Context, bindElement: HTMLElement) = this()
    def this(context: Context, bindElement: js.UndefOr[scala.Nothing], defStyle: Map[String, String]) = this()
    def this(context: Context, bindElement: HTMLElement, defStyle: Map[String, String]) = this()
  }
}
