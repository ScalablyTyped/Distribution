package typings
package androiduixLib.androiduiNs.widgetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("androidui.widget.HtmlDataListAdapter")
@js.native
class HtmlDataListAdapter ()
  extends androiduixLib.androidNs.widgetNs.BaseAdapter
     with HtmlDataAdapter {
  var bindElementData: stdLib.HTMLElement = js.native
  var mContext: androiduixLib.androidNs.contentNs.Context = js.native
  /* private */ def checkReplaceWithRef(element: js.Any): js.Any = js.native
  def notifyDataSizeWillChange(): scala.Unit = js.native
  /* private */ def registerHtmlDataObserver(): js.Any = js.native
  /* private */ def removeElementRefAndRestoreToAdapter(childElement: js.Any): js.Any = js.native
}

@JSGlobal("androidui.widget.HtmlDataListAdapter")
@js.native
object HtmlDataListAdapter extends js.Object {
  var BindAdapterProperty: java.lang.String = js.native
  var RefElementProperty: java.lang.String = js.native
  var RefElementTag: java.lang.String = js.native
}

