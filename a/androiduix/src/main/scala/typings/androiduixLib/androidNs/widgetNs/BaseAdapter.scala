package typings
package androiduixLib.androidNs.widgetNs

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
  override def areAllItemsEnabled(): scala.Boolean = js.native
  /* CompleteClass */
  override def getCount(): scala.Double = js.native
  /* CompleteClass */
  override def getDropDownView(
    position: scala.Double,
    convertView: androiduixLib.androidNs.viewNs.View,
    parent: androiduixLib.androidNs.viewNs.ViewGroup
  ): androiduixLib.androidNs.viewNs.View = js.native
  /* CompleteClass */
  override def getItem(position: scala.Double): js.Any = js.native
  /* CompleteClass */
  override def getItemId(position: scala.Double): scala.Double = js.native
  /* CompleteClass */
  override def getItemViewType(position: scala.Double): scala.Double = js.native
  /* CompleteClass */
  override def getView(
    position: scala.Double,
    convertView: androiduixLib.androidNs.viewNs.View,
    parent: androiduixLib.androidNs.viewNs.ViewGroup
  ): androiduixLib.androidNs.viewNs.View = js.native
  /* CompleteClass */
  override def getViewTypeCount(): scala.Double = js.native
  /* CompleteClass */
  override def hasStableIds(): scala.Boolean = js.native
  /* CompleteClass */
  override def isEmpty(): scala.Boolean = js.native
  /* CompleteClass */
  override def isEnabled(position: scala.Double): scala.Boolean = js.native
  def notifyDataSetChanged(): scala.Unit = js.native
  def notifyDataSetInvalidated(): scala.Unit = js.native
  /* CompleteClass */
  override def registerDataSetObserver(observer: androiduixLib.androidNs.databaseNs.DataSetObserver): scala.Unit = js.native
  /* CompleteClass */
  override def unregisterDataSetObserver(observer: androiduixLib.androidNs.databaseNs.DataSetObserver): scala.Unit = js.native
}

