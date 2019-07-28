package typings.androiduix.androidNs.widgetNs

import typings.androiduix.androidNs.databaseNs.DataSetObserver
import typings.androiduix.androidNs.viewNs.View
import typings.androiduix.androidNs.viewNs.ViewGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.BaseAdapter")
@js.native
abstract class BaseAdapter ()
  extends ListAdapter
     with SpinnerAdapter {
  var mDataSetObservable: js.Any = js.native
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
  def notifyDataSetChanged(): Unit = js.native
  def notifyDataSetInvalidated(): Unit = js.native
  /* CompleteClass */
  override def registerDataSetObserver(observer: DataSetObserver): Unit = js.native
  /* CompleteClass */
  override def unregisterDataSetObserver(observer: DataSetObserver): Unit = js.native
}

