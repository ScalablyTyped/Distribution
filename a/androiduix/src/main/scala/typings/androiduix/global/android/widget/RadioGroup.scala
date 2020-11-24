package typings.androiduix.global.android.widget

import typings.androiduix.android.content.Context
import typings.std.HTMLElement
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("android.widget.RadioGroup")
@js.native
class RadioGroup protected ()
  extends typings.androiduix.android.widget.RadioGroup {
  def this(context: Context) = this()
  def this(context: Context, bindElement: HTMLElement) = this()
  def this(context: Context, bindElement: js.UndefOr[scala.Nothing], defStyle: Map[String, String]) = this()
  def this(context: Context, bindElement: HTMLElement, defStyle: Map[String, String]) = this()
}
@JSGlobal("android.widget.RadioGroup")
@js.native
object RadioGroup extends js.Object {
  
  @js.native
  class CheckedStateTracker protected ()
    extends typings.androiduix.android.widget.RadioGroup.CheckedStateTracker {
    def this(arg: typings.androiduix.android.widget.RadioGroup) = this()
  }
  
  @js.native
  class LayoutParams ()
    extends typings.androiduix.android.widget.RadioGroup.LayoutParams
  
  @js.native
  class PassThroughHierarchyChangeListener protected ()
    extends typings.androiduix.android.widget.RadioGroup.PassThroughHierarchyChangeListener {
    def this(arg: typings.androiduix.android.widget.RadioGroup) = this()
  }
}
