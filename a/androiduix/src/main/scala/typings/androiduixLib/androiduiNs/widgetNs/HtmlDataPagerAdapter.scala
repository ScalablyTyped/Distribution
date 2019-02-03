package typings
package androiduixLib.androiduiNs.widgetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("androidui.widget.HtmlDataPagerAdapter")
@js.native
class HtmlDataPagerAdapter ()
  extends androiduixLib.androidNs.supportNs.v4Ns.viewNs.PagerAdapter
     with HtmlDataAdapter {
  var bindElementData: stdLib.HTMLElement = js.native
  var mContext: androiduixLib.androidNs.contentNs.Context = js.native
  /* private */ def checkReplaceWithRef(element: js.Any): js.Any = js.native
  def getItem(position: scala.Double): stdLib.Element = js.native
  def notifyDataSizeWillChange(): scala.Unit = js.native
  /* private */ def registerHtmlDataObserver(): js.Any = js.native
  /* private */ def removeElementRefAndRestoreToAdapter(childElement: js.Any): js.Any = js.native
}

/* static members */
@JSGlobal("androidui.widget.HtmlDataPagerAdapter")
@js.native
object HtmlDataPagerAdapter extends js.Object {
  var BindAdapterProperty: java.lang.String = js.native
  var RefElementProperty: java.lang.String = js.native
  var RefElementTag: java.lang.String = js.native
}

