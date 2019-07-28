package typings.androiduix.androiduiNs.widgetNs

import typings.androiduix.androidNs.contentNs.Context
import typings.androiduix.androidNs.widgetNs.BaseAdapter
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("androidui.widget.HtmlDataListAdapter")
@js.native
class HtmlDataListAdapter ()
  extends BaseAdapter
     with HtmlDataAdapter {
  var bindElementData: HTMLElement = js.native
  var mContext: Context = js.native
  /* private */ def checkReplaceWithRef(element: js.Any): js.Any = js.native
  def notifyDataSizeWillChange(): Unit = js.native
  /* private */ def registerHtmlDataObserver(): js.Any = js.native
  /* private */ def removeElementRefAndRestoreToAdapter(childElement: js.Any): js.Any = js.native
}

/* static members */
@JSGlobal("androidui.widget.HtmlDataListAdapter")
@js.native
object HtmlDataListAdapter extends js.Object {
  var BindAdapterProperty: String = js.native
  var RefElementProperty: String = js.native
  var RefElementTag: String = js.native
}

