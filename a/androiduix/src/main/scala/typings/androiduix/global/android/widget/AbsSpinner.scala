package typings.androiduix.global.android.widget

import typings.androiduix.android.content.Context
import typings.std.HTMLElement
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.AbsSpinner")
@js.native
abstract class AbsSpinner protected ()
  extends typings.androiduix.android.widget.AbsSpinner {
  def this(context: Context) = this()
  def this(context: Context, bindElement: HTMLElement) = this()
  def this(context: Context, bindElement: js.UndefOr[scala.Nothing], defStyle: Map[String, String]) = this()
  def this(context: Context, bindElement: HTMLElement, defStyle: Map[String, String]) = this()
}

@JSGlobal("android.widget.AbsSpinner")
@js.native
object AbsSpinner extends js.Object {
  @js.native
  class RecycleBin protected ()
    extends typings.androiduix.android.widget.AbsSpinner.RecycleBin {
    def this(arg: typings.androiduix.android.widget.AbsSpinner) = this()
  }
  
}

