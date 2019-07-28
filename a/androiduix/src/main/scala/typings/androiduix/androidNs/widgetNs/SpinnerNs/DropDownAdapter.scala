package typings.androiduix.androidNs.widgetNs.SpinnerNs

import typings.androiduix.androidNs.databaseNs.DataSetObserver
import typings.androiduix.androidNs.viewNs.View
import typings.androiduix.androidNs.viewNs.ViewGroup
import typings.androiduix.androidNs.widgetNs.ListAdapter
import typings.androiduix.androidNs.widgetNs.SpinnerAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.Spinner.DropDownAdapter")
@js.native
class DropDownAdapter protected ()
  extends ListAdapter
     with SpinnerAdapter {
  def this(adapter: SpinnerAdapter) = this()
  var mAdapter: js.Any = js.native
  var mListAdapter: js.Any = js.native
  /* CompleteClass */
  override def areAllItemsEnabled(): Boolean = js.native
  /* CompleteClass */
  override def getCount(): Double = js.native
  /* CompleteClass */
  override def getDropDownView(position: Double, convertView: View, parent: ViewGroup): View = js.native
  /* CompleteClass */
  override def getItem(position: Double): js.Any = js.native
  /* CompleteClass */
  override def getItemId(position: Double): Double = js.native
  /* CompleteClass */
  override def getItemViewType(position: Double): Double = js.native
  /* CompleteClass */
  override def getView(position: Double, convertView: View, parent: ViewGroup): View = js.native
  /* CompleteClass */
  override def getViewTypeCount(): Double = js.native
  /* CompleteClass */
  override def hasStableIds(): Boolean = js.native
  /* CompleteClass */
  override def isEmpty(): Boolean = js.native
  /* CompleteClass */
  override def isEnabled(position: Double): Boolean = js.native
  /* CompleteClass */
  override def registerDataSetObserver(observer: DataSetObserver): Unit = js.native
  /* CompleteClass */
  override def unregisterDataSetObserver(observer: DataSetObserver): Unit = js.native
}

