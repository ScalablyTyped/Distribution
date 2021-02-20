package typings.androiduix.global.android.widget

import typings.androiduix.android.content.Context
import typings.std.HTMLElement
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("android.widget.FrameLayout")
@js.native
class FrameLayout protected ()
  extends typings.androiduix.android.widget.FrameLayout {
  def this(context: Context) = this()
  def this(context: Context, bindElement: HTMLElement) = this()
  def this(context: Context, bindElement: js.UndefOr[scala.Nothing], defStyle: Map[String, String]) = this()
  def this(context: Context, bindElement: HTMLElement, defStyle: Map[String, String]) = this()
}
object FrameLayout {
  
  @JSGlobal("android.widget.FrameLayout")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("android.widget.FrameLayout.DEFAULT_CHILD_GRAVITY")
  @js.native
  def DEFAULT_CHILD_GRAVITY: Double = js.native
  @scala.inline
  def DEFAULT_CHILD_GRAVITY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_CHILD_GRAVITY")(x.asInstanceOf[js.Any])
  
  @JSGlobal("android.widget.FrameLayout.LayoutParams")
  @js.native
  class LayoutParams ()
    extends typings.androiduix.android.widget.FrameLayout.LayoutParams {
    def this(source: typings.androiduix.android.view.ViewGroup.LayoutParams) = this()
    def this(context: Context, attrs: HTMLElement) = this()
    def this(width: Double, height: Double) = this()
    def this(width: Double, height: Double, gravity: Double) = this()
  }
}
