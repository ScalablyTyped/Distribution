package typings.androiduix.global.android.widget

import typings.androiduix.android.content.Context
import typings.std.HTMLElement
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("android.widget.AbsSeekBar")
@js.native
abstract class AbsSeekBar protected ()
  extends typings.androiduix.android.widget.AbsSeekBar {
  def this(context: Context) = this()
  def this(context: Context, bindElement: HTMLElement) = this()
  def this(context: Context, bindElement: js.UndefOr[scala.Nothing], defStyle: Map[String, String]) = this()
  def this(context: Context, bindElement: HTMLElement, defStyle: Map[String, String]) = this()
}
object AbsSeekBar {
  
  @JSGlobal("android.widget.AbsSeekBar")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("android.widget.AbsSeekBar.NO_ALPHA")
  @js.native
  def NO_ALPHA: js.Any = js.native
  @scala.inline
  def NO_ALPHA_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NO_ALPHA")(x.asInstanceOf[js.Any])
}
