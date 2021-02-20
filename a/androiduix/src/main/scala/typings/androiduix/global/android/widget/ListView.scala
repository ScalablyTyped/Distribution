package typings.androiduix.global.android.widget

import typings.androiduix.android.content.Context
import typings.std.HTMLElement
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("android.widget.ListView")
@js.native
class ListView protected ()
  extends typings.androiduix.android.widget.ListView {
  def this(context: Context) = this()
  def this(context: Context, bindElement: HTMLElement) = this()
  def this(context: Context, bindElement: js.UndefOr[scala.Nothing], defStyle: Map[String, String]) = this()
  def this(context: Context, bindElement: HTMLElement, defStyle: Map[String, String]) = this()
}
object ListView {
  
  @JSGlobal("android.widget.ListView")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("android.widget.ListView.ArrowScrollFocusResult")
  @js.native
  class ArrowScrollFocusResult ()
    extends typings.androiduix.android.widget.ListView.ArrowScrollFocusResult
  
  @JSGlobal("android.widget.ListView.FixedViewInfo")
  @js.native
  class FixedViewInfo protected ()
    extends typings.androiduix.android.widget.ListView.FixedViewInfo {
    def this(arg: typings.androiduix.android.widget.ListView) = this()
  }
  
  @JSGlobal("android.widget.ListView.FocusSelector")
  @js.native
  class FocusSelector protected ()
    extends typings.androiduix.android.widget.ListView.FocusSelector {
    def this(arg: typings.androiduix.android.widget.ListView) = this()
  }
  
  /* static member */
  @JSGlobal("android.widget.ListView.MAX_SCROLL_FACTOR")
  @js.native
  def MAX_SCROLL_FACTOR: js.Any = js.native
  @scala.inline
  def MAX_SCROLL_FACTOR_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_SCROLL_FACTOR")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.widget.ListView.MIN_SCROLL_PREVIEW_PIXELS")
  @js.native
  def MIN_SCROLL_PREVIEW_PIXELS: js.Any = js.native
  @scala.inline
  def MIN_SCROLL_PREVIEW_PIXELS_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIN_SCROLL_PREVIEW_PIXELS")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.widget.ListView.NO_POSITION")
  @js.native
  def NO_POSITION: Double = js.native
  @scala.inline
  def NO_POSITION_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NO_POSITION")(x.asInstanceOf[js.Any])
}
