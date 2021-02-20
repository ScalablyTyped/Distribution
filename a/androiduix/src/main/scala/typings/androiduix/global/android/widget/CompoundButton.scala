package typings.androiduix.global.android.widget

import typings.androiduix.android.content.Context
import typings.std.HTMLElement
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("android.widget.CompoundButton")
@js.native
abstract class CompoundButton protected ()
  extends typings.androiduix.android.widget.CompoundButton {
  def this(context: Context) = this()
  def this(context: Context, bindElement: HTMLElement) = this()
  def this(context: Context, bindElement: js.UndefOr[scala.Nothing], defStyle: Map[String, String]) = this()
  def this(context: Context, bindElement: HTMLElement, defStyle: Map[String, String]) = this()
}
object CompoundButton {
  
  @JSGlobal("android.widget.CompoundButton")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("android.widget.CompoundButton.CHECKED_STATE_SET")
  @js.native
  def CHECKED_STATE_SET: js.Any = js.native
  @scala.inline
  def CHECKED_STATE_SET_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHECKED_STATE_SET")(x.asInstanceOf[js.Any])
}
