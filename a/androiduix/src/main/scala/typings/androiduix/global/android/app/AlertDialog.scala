package typings.androiduix.global.android.app

import typings.androiduix.android.content.Context
import typings.androiduix.android.content.DialogInterface.OnCancelListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("android.app.AlertDialog")
@js.native
class AlertDialog protected ()
  extends typings.androiduix.android.app.AlertDialog {
  def this(context: Context) = this()
  def this(context: Context, cancelable: Boolean) = this()
  def this(context: Context, cancelable: js.UndefOr[scala.Nothing], cancelListener: OnCancelListener) = this()
  def this(context: Context, cancelable: Boolean, cancelListener: OnCancelListener) = this()
}
/* static members */
@JSGlobal("android.app.AlertDialog")
@js.native
object AlertDialog extends js.Object {
  
  var THEME_DEVICE_DEFAULT_DARK: Double = js.native
  
  var THEME_DEVICE_DEFAULT_LIGHT: Double = js.native
  
  var THEME_HOLO_DARK: Double = js.native
  
  var THEME_HOLO_LIGHT: Double = js.native
  
  var THEME_TRADITIONAL: Double = js.native
  
  @js.native
  class Builder protected ()
    extends typings.androiduix.android.app.AlertDialog.Builder {
    def this(context: Context) = this()
  }
}
