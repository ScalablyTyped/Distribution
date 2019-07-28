package typings.androiduix.androidNs.widgetNs

import typings.androiduix.androidNs.contentNs.Context
import typings.androiduix.androidNs.widgetNs.SeekBarNs.OnSeekBarChangeListener
import typings.std.HTMLElement
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.SeekBar")
@js.native
class SeekBar protected () extends AbsSeekBar {
  def this(context: Context) = this()
  def this(context: Context, bindElement: HTMLElement) = this()
  def this(context: Context, bindElement: HTMLElement, defStyle: Map[String, String]) = this()
  var mOnSeekBarChangeListener: js.Any = js.native
  def setOnSeekBarChangeListener(l: OnSeekBarChangeListener): Unit = js.native
}

