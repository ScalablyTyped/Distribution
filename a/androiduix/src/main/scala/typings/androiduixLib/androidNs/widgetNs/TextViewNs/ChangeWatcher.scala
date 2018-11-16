package typings
package androiduixLib.androidNs.widgetNs.TextViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.TextView.ChangeWatcher")
@js.native
class ChangeWatcher protected ()
  extends androiduixLib.androidNs.textNs.TextWatcher
     with androiduixLib.androidNs.textNs.SpanWatcher {
  def this(arg: androiduixLib.androidNs.widgetNs.TextView) = this()
  var _TextView_this: androiduixLib.androidNs.widgetNs.TextView = js.native
  var mBeforeText: js.Any = js.native
  /* CompleteClass */
  override def afterTextChanged(s: java.lang.String): scala.Unit = js.native
  /* CompleteClass */
  override def beforeTextChanged(s: java.lang.String, start: scala.Double, count: scala.Double, after: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def onSpanAdded(
    text: androiduixLib.androidNs.textNs.Spannable,
    what: js.Any,
    start: scala.Double,
    end: scala.Double
  ): scala.Unit = js.native
  /* CompleteClass */
  override def onSpanChanged(
    text: androiduixLib.androidNs.textNs.Spannable,
    what: js.Any,
    ostart: scala.Double,
    oend: scala.Double,
    nstart: scala.Double,
    nend: scala.Double
  ): scala.Unit = js.native
  /* CompleteClass */
  override def onSpanRemoved(
    text: androiduixLib.androidNs.textNs.Spannable,
    what: js.Any,
    start: scala.Double,
    end: scala.Double
  ): scala.Unit = js.native
  /* CompleteClass */
  override def onTextChanged(s: java.lang.String, start: scala.Double, before: scala.Double, count: scala.Double): scala.Unit = js.native
}

