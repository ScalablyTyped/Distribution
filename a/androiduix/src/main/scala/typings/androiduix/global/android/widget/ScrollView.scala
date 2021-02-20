package typings.androiduix.global.android.widget

import typings.androiduix.android.content.Context
import typings.std.HTMLElement
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("android.widget.ScrollView")
@js.native
class ScrollView protected ()
  extends typings.androiduix.android.widget.ScrollView {
  def this(context: Context) = this()
  def this(context: Context, bindElement: HTMLElement) = this()
  def this(context: Context, bindElement: js.UndefOr[scala.Nothing], defStyle: Map[String, String]) = this()
  def this(context: Context, bindElement: HTMLElement, defStyle: Map[String, String]) = this()
}
object ScrollView {
  
  @JSGlobal("android.widget.ScrollView")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("android.widget.ScrollView.ANIMATED_SCROLL_GAP")
  @js.native
  def ANIMATED_SCROLL_GAP: Double = js.native
  @scala.inline
  def ANIMATED_SCROLL_GAP_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ANIMATED_SCROLL_GAP")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.widget.ScrollView.INVALID_POINTER")
  @js.native
  def INVALID_POINTER: js.Any = js.native
  @scala.inline
  def INVALID_POINTER_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_POINTER")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.widget.ScrollView.MAX_SCROLL_FACTOR")
  @js.native
  def MAX_SCROLL_FACTOR: Double = js.native
  @scala.inline
  def MAX_SCROLL_FACTOR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_SCROLL_FACTOR")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.widget.ScrollView.TAG")
  @js.native
  def TAG: js.Any = js.native
  @scala.inline
  def TAG_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TAG")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.widget.ScrollView.clamp")
  @js.native
  def clamp(n: js.Any, my: js.Any, child: js.Any): js.Any = js.native
  
  /* static member */
  @JSGlobal("android.widget.ScrollView.isViewDescendantOf")
  @js.native
  def isViewDescendantOf(child: js.Any, parent: js.Any): js.Any = js.native
}
