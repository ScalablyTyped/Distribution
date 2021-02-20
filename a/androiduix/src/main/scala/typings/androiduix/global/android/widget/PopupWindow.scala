package typings.androiduix.global.android.widget

import typings.androiduix.android.content.Context
import typings.androiduix.android.view.View
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("android.widget.PopupWindow")
@js.native
class PopupWindow protected ()
  extends typings.androiduix.android.widget.PopupWindow {
  def this(contentView: View) = this()
  def this(context: Context) = this()
  def this(contentView: View, width: Double) = this()
  def this(context: Context, styleAttr: Map[String, String]) = this()
  def this(contentView: View, width: js.UndefOr[scala.Nothing], height: Double) = this()
  def this(contentView: View, width: Double, height: Double) = this()
  def this(
    contentView: View,
    width: js.UndefOr[scala.Nothing],
    height: js.UndefOr[scala.Nothing],
    focusable: Boolean
  ) = this()
  def this(contentView: View, width: js.UndefOr[scala.Nothing], height: Double, focusable: Boolean) = this()
  def this(contentView: View, width: Double, height: js.UndefOr[scala.Nothing], focusable: Boolean) = this()
  def this(contentView: View, width: Double, height: Double, focusable: Boolean) = this()
}
object PopupWindow {
  
  @JSGlobal("android.widget.PopupWindow")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("android.widget.PopupWindow.DEFAULT_ANCHORED_GRAVITY")
  @js.native
  def DEFAULT_ANCHORED_GRAVITY: js.Any = js.native
  @scala.inline
  def DEFAULT_ANCHORED_GRAVITY_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_ANCHORED_GRAVITY")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.widget.PopupWindow.INPUT_METHOD_FROM_FOCUSABLE")
  @js.native
  def INPUT_METHOD_FROM_FOCUSABLE: Double = js.native
  @scala.inline
  def INPUT_METHOD_FROM_FOCUSABLE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INPUT_METHOD_FROM_FOCUSABLE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.widget.PopupWindow.INPUT_METHOD_NEEDED")
  @js.native
  def INPUT_METHOD_NEEDED: Double = js.native
  @scala.inline
  def INPUT_METHOD_NEEDED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INPUT_METHOD_NEEDED")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.widget.PopupWindow.INPUT_METHOD_NOT_NEEDED")
  @js.native
  def INPUT_METHOD_NOT_NEEDED: Double = js.native
  @scala.inline
  def INPUT_METHOD_NOT_NEEDED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INPUT_METHOD_NOT_NEEDED")(x.asInstanceOf[js.Any])
}
