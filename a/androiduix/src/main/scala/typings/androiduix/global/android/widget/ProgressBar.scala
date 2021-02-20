package typings.androiduix.global.android.widget

import typings.androiduix.android.content.Context
import typings.std.HTMLElement
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("android.widget.ProgressBar")
@js.native
class ProgressBar protected ()
  extends typings.androiduix.android.widget.ProgressBar {
  def this(context: Context) = this()
  def this(context: Context, bindElement: HTMLElement) = this()
  def this(context: Context, bindElement: js.UndefOr[scala.Nothing], defStyle: Map[String, String]) = this()
  def this(context: Context, bindElement: HTMLElement, defStyle: Map[String, String]) = this()
}
object ProgressBar {
  
  @JSGlobal("android.widget.ProgressBar")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("android.widget.ProgressBar.MAX_LEVEL")
  @js.native
  def MAX_LEVEL: js.Any = js.native
  @scala.inline
  def MAX_LEVEL_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_LEVEL")(x.asInstanceOf[js.Any])
  
  @JSGlobal("android.widget.ProgressBar.RefreshData")
  @js.native
  class RefreshData ()
    extends typings.androiduix.android.widget.ProgressBar.RefreshData
  object RefreshData {
    
    @JSGlobal("android.widget.ProgressBar.RefreshData")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("android.widget.ProgressBar.RefreshData.POOL_MAX")
    @js.native
    def POOL_MAX: js.Any = js.native
    @scala.inline
    def POOL_MAX_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("POOL_MAX")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("android.widget.ProgressBar.RefreshData.obtain")
    @js.native
    def obtain(id: String, progress: Double, fromUser: Boolean): typings.androiduix.android.widget.ProgressBar.RefreshData = js.native
    
    /* static member */
    @JSGlobal("android.widget.ProgressBar.RefreshData.sPool")
    @js.native
    def sPool: js.Any = js.native
    @scala.inline
    def sPool_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sPool")(x.asInstanceOf[js.Any])
  }
  
  /* static member */
  @JSGlobal("android.widget.ProgressBar.TIMEOUT_SEND_ACCESSIBILITY_EVENT")
  @js.native
  def TIMEOUT_SEND_ACCESSIBILITY_EVENT: js.Any = js.native
  @scala.inline
  def TIMEOUT_SEND_ACCESSIBILITY_EVENT_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TIMEOUT_SEND_ACCESSIBILITY_EVENT")(x.asInstanceOf[js.Any])
}
