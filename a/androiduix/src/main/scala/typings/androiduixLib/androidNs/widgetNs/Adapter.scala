package typings
package androiduixLib.androidNs.widgetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Adapter extends js.Object {
  def getCount(): scala.Double
  def getItem(position: scala.Double): js.Any
  def getItemId(position: scala.Double): scala.Double
  def getItemViewType(position: scala.Double): scala.Double
  def getView(
    position: scala.Double,
    convertView: androiduixLib.androidNs.viewNs.View,
    parent: androiduixLib.androidNs.viewNs.ViewGroup
  ): androiduixLib.androidNs.viewNs.View
  def getViewTypeCount(): scala.Double
  def hasStableIds(): scala.Boolean
  def isEmpty(): scala.Boolean
  def registerDataSetObserver(observer: androiduixLib.androidNs.databaseNs.DataSetObserver): scala.Unit
  def unregisterDataSetObserver(observer: androiduixLib.androidNs.databaseNs.DataSetObserver): scala.Unit
}

