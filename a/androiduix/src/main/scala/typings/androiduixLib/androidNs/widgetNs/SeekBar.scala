package typings
package androiduixLib.androidNs.widgetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.SeekBar")
@js.native
class SeekBar protected () extends AbsSeekBar {
  def this(context: androiduixLib.androidNs.contentNs.Context) = this()
  def this(context: androiduixLib.androidNs.contentNs.Context, bindElement: stdLib.HTMLElement) = this()
  def this(context: androiduixLib.androidNs.contentNs.Context, bindElement: stdLib.HTMLElement, defStyle: stdLib.Map[java.lang.String, java.lang.String]) = this()
  var mOnSeekBarChangeListener: js.Any = js.native
  def setOnSeekBarChangeListener(l: androiduixLib.androidNs.widgetNs.SeekBarNs.OnSeekBarChangeListener): scala.Unit = js.native
}

