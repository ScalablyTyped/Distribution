package typings.androiduix.global.android

import typings.androiduix.android.content.Context
import typings.androiduix.android.content.DialogInterface
import typings.androiduix.android.content.DialogInterface.OnCancelListener
import typings.androiduix.android.view.Window
import typings.androiduix.androidui.AndroidUI
import typings.std.HTMLElement
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object app {
  
  @JSGlobal("android.app.ActionBar")
  @js.native
  class ActionBar protected ()
    extends typings.androiduix.android.app.ActionBar {
    def this(context: Context) = this()
    def this(context: Context, bindElement: HTMLElement) = this()
    def this(context: Context, bindElement: js.UndefOr[scala.Nothing], defStyle: js.Any) = this()
    def this(context: Context, bindElement: HTMLElement, defStyle: js.Any) = this()
  }
  
  @JSGlobal("android.app.ActionBarActivity")
  @js.native
  class ActionBarActivity ()
    extends typings.androiduix.android.app.ActionBarActivity
  
  @JSGlobal("android.app.Activity")
  @js.native
  class Activity protected ()
    extends typings.androiduix.android.app.Activity {
    def this(androidUI: AndroidUI) = this()
  }
  object Activity {
    
    @JSGlobal("android.app.Activity")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("android.app.Activity.DEBUG_LIFECYCLE")
    @js.native
    def DEBUG_LIFECYCLE: js.Any = js.native
    @scala.inline
    def DEBUG_LIFECYCLE_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEBUG_LIFECYCLE")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("android.app.Activity.RESULT_CANCELED")
    @js.native
    def RESULT_CANCELED: Double = js.native
    @scala.inline
    def RESULT_CANCELED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RESULT_CANCELED")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("android.app.Activity.RESULT_FIRST_USER")
    @js.native
    def RESULT_FIRST_USER: Double = js.native
    @scala.inline
    def RESULT_FIRST_USER_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RESULT_FIRST_USER")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("android.app.Activity.RESULT_OK")
    @js.native
    def RESULT_OK: Double = js.native
    @scala.inline
    def RESULT_OK_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RESULT_OK")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("android.app.Activity.TAG")
    @js.native
    def TAG: js.Any = js.native
    @scala.inline
    def TAG_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TAG")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("android.app.ActivityThread")
  @js.native
  class ActivityThread protected ()
    extends typings.androiduix.android.app.ActivityThread {
    def this(androidUI: AndroidUI) = this()
  }
  object ActivityThread {
    
    /* static member */
    @JSGlobal("android.app.ActivityThread.getActivityName")
    @js.native
    def getActivityName(activity: js.Any): js.Any = js.native
  }
  
  @JSGlobal("android.app.AlertController")
  @js.native
  class AlertController protected ()
    extends typings.androiduix.android.app.AlertController {
    def this(context: Context, di: DialogInterface, window: Window) = this()
  }
  object AlertController {
    
    @JSGlobal("android.app.AlertController.AlertParams")
    @js.native
    class AlertParams protected ()
      extends typings.androiduix.android.app.AlertController.AlertParams {
      def this(context: Context) = this()
    }
    
    @JSGlobal("android.app.AlertController.ButtonHandler")
    @js.native
    class ButtonHandler protected ()
      extends typings.androiduix.android.app.AlertController.ButtonHandler {
      def this(dialog: DialogInterface) = this()
    }
    object ButtonHandler {
      
      @JSGlobal("android.app.AlertController.ButtonHandler")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSGlobal("android.app.AlertController.ButtonHandler.MSG_DISMISS_DIALOG")
      @js.native
      def MSG_DISMISS_DIALOG: js.Any = js.native
      @scala.inline
      def MSG_DISMISS_DIALOG_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MSG_DISMISS_DIALOG")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("android.app.AlertController.RecycleListView")
    @js.native
    class RecycleListView protected ()
      extends typings.androiduix.android.app.AlertController.RecycleListView {
      def this(context: Context) = this()
      def this(context: Context, bindElement: HTMLElement) = this()
      def this(context: Context, bindElement: js.UndefOr[scala.Nothing], defStyle: Map[String, String]) = this()
      def this(context: Context, bindElement: HTMLElement, defStyle: Map[String, String]) = this()
    }
    
    /* static member */
    @JSGlobal("android.app.AlertController.shouldCenterSingleButton")
    @js.native
    def shouldCenterSingleButton(context: js.Any): js.Any = js.native
  }
  
  @JSGlobal("android.app.AlertDialog")
  @js.native
  class AlertDialog protected ()
    extends typings.androiduix.android.app.AlertDialog {
    def this(context: Context) = this()
    def this(context: Context, cancelable: Boolean) = this()
    def this(context: Context, cancelable: js.UndefOr[scala.Nothing], cancelListener: OnCancelListener) = this()
    def this(context: Context, cancelable: Boolean, cancelListener: OnCancelListener) = this()
  }
  object AlertDialog {
    
    @JSGlobal("android.app.AlertDialog")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("android.app.AlertDialog.Builder")
    @js.native
    class Builder protected ()
      extends typings.androiduix.android.app.AlertDialog.Builder {
      def this(context: Context) = this()
    }
    
    /* static member */
    @JSGlobal("android.app.AlertDialog.THEME_DEVICE_DEFAULT_DARK")
    @js.native
    def THEME_DEVICE_DEFAULT_DARK: Double = js.native
    @scala.inline
    def THEME_DEVICE_DEFAULT_DARK_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("THEME_DEVICE_DEFAULT_DARK")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("android.app.AlertDialog.THEME_DEVICE_DEFAULT_LIGHT")
    @js.native
    def THEME_DEVICE_DEFAULT_LIGHT: Double = js.native
    @scala.inline
    def THEME_DEVICE_DEFAULT_LIGHT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("THEME_DEVICE_DEFAULT_LIGHT")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("android.app.AlertDialog.THEME_HOLO_DARK")
    @js.native
    def THEME_HOLO_DARK: Double = js.native
    @scala.inline
    def THEME_HOLO_DARK_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("THEME_HOLO_DARK")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("android.app.AlertDialog.THEME_HOLO_LIGHT")
    @js.native
    def THEME_HOLO_LIGHT: Double = js.native
    @scala.inline
    def THEME_HOLO_LIGHT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("THEME_HOLO_LIGHT")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("android.app.AlertDialog.THEME_TRADITIONAL")
    @js.native
    def THEME_TRADITIONAL: Double = js.native
    @scala.inline
    def THEME_TRADITIONAL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("THEME_TRADITIONAL")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("android.app.Application")
  @js.native
  class Application ()
    extends typings.androiduix.android.app.Application
  
  @JSGlobal("android.app.Dialog")
  @js.native
  class Dialog protected ()
    extends typings.androiduix.android.app.Dialog {
    def this(context: Context) = this()
    def this(context: Context, cancelable: Boolean) = this()
    def this(context: Context, cancelable: js.UndefOr[scala.Nothing], cancelListener: OnCancelListener) = this()
    def this(context: Context, cancelable: Boolean, cancelListener: OnCancelListener) = this()
  }
  object Dialog {
    
    @JSGlobal("android.app.Dialog")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("android.app.Dialog.CANCEL")
    @js.native
    def CANCEL: js.Any = js.native
    @scala.inline
    def CANCEL_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CANCEL")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("android.app.Dialog.DIALOG_HIERARCHY_TAG")
    @js.native
    def DIALOG_HIERARCHY_TAG: js.Any = js.native
    @scala.inline
    def DIALOG_HIERARCHY_TAG_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DIALOG_HIERARCHY_TAG")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("android.app.Dialog.DIALOG_SHOWING_TAG")
    @js.native
    def DIALOG_SHOWING_TAG: js.Any = js.native
    @scala.inline
    def DIALOG_SHOWING_TAG_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DIALOG_SHOWING_TAG")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("android.app.Dialog.DISMISS")
    @js.native
    def DISMISS: js.Any = js.native
    @scala.inline
    def DISMISS_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DISMISS")(x.asInstanceOf[js.Any])
    
    @JSGlobal("android.app.Dialog.ListenersHandler")
    @js.native
    class ListenersHandler protected ()
      extends typings.androiduix.android.app.Dialog.ListenersHandler {
      def this(dialog: typings.androiduix.android.app.Dialog) = this()
    }
    
    /* static member */
    @JSGlobal("android.app.Dialog.SHOW")
    @js.native
    def SHOW: js.Any = js.native
    @scala.inline
    def SHOW_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHOW")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("android.app.Dialog.TAG")
    @js.native
    def TAG: js.Any = js.native
    @scala.inline
    def TAG_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TAG")(x.asInstanceOf[js.Any])
  }
}
