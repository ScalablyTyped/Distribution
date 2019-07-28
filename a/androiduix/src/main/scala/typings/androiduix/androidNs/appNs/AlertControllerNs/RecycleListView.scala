package typings.androiduix.androidNs.appNs.AlertControllerNs

import typings.androiduix.androidNs.contentNs.Context
import typings.androiduix.androidNs.widgetNs.ListView
import typings.std.HTMLElement
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.app.AlertController.RecycleListView")
@js.native
class RecycleListView protected () extends ListView {
  def this(context: Context) = this()
  def this(context: Context, bindElement: HTMLElement) = this()
  def this(context: Context, bindElement: HTMLElement, defStyle: Map[String, String]) = this()
  var mRecycleOnMeasure: Boolean = js.native
}

