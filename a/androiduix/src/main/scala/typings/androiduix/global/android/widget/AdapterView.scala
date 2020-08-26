package typings.androiduix.global.android.widget

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.AdapterView")
@js.native
abstract class AdapterView[T /* <: typings.androiduix.android.widget.Adapter */] ()
  extends typings.androiduix.android.widget.AdapterView[T]

/* static members */
@JSGlobal("android.widget.AdapterView")
@js.native
object AdapterView extends js.Object {
  @js.native
  class AdapterDataSetObserver protected ()
    extends typings.androiduix.android.widget.AdapterView.AdapterDataSetObserver {
    def this(AdapterView_this: typings.androiduix.android.widget.AdapterView[_]) = this()
  }
  
  var INVALID_POSITION: Double = js.native
  var INVALID_ROW_ID: Double = js.native
  var ITEM_VIEW_TYPE_HEADER_OR_FOOTER: Double = js.native
  var ITEM_VIEW_TYPE_IGNORE: Double = js.native
  var SYNC_FIRST_POSITION: Double = js.native
  var SYNC_MAX_DURATION_MILLIS: Double = js.native
  var SYNC_SELECTED_POSITION: Double = js.native
}

