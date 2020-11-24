package typings.androiduix.androidui.widget

import typings.androiduix.android.content.Context
import typings.androiduix.android.widget.BaseAdapter
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HtmlDataListAdapter
  extends BaseAdapter
     with HtmlDataAdapter {
  
  var bindElementData: HTMLElement = js.native
  
  /* private */ def checkReplaceWithRef(element: js.Any): js.Any = js.native
  
  var mContext: Context = js.native
  
  def notifyDataSizeWillChange(): Unit = js.native
  
  /* private */ def registerHtmlDataObserver(): js.Any = js.native
  
  /* private */ def removeElementRefAndRestoreToAdapter(childElement: js.Any): js.Any = js.native
}
