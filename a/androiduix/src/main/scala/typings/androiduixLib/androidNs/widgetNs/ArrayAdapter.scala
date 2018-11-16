package typings
package androiduixLib.androidNs.widgetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.ArrayAdapter")
@js.native
class ArrayAdapter[T] protected () extends BaseAdapter {
  def this(context: androiduixLib.androidNs.contentNs.Context, resource: java.lang.String) = this()
  def this(context: androiduixLib.androidNs.contentNs.Context, resource: java.lang.String, objects: js.Array[T]) = this()
  def this(context: androiduixLib.androidNs.contentNs.Context, resource: java.lang.String, textViewResourceId: java.lang.String) = this()
  def this(context: androiduixLib.androidNs.contentNs.Context, resource: java.lang.String, textViewResourceId: java.lang.String, objects: androiduixLib.javaNs.utilNs.List[T]) = this()
  def this(context: androiduixLib.androidNs.contentNs.Context, resource: java.lang.String, textViewResourceId: java.lang.String, objects: js.Array[T]) = this()
  var mContext: js.Any = js.native
  var mDropDownResource: js.Any = js.native
  var mFieldId: js.Any = js.native
  var mInflater: js.Any = js.native
  var mNotifyOnChange: js.Any = js.native
  var mObjects: js.Any = js.native
  var mResource: js.Any = js.native
  def add(`object`: T): scala.Unit = js.native
  def addAll(collection: androiduixLib.javaNs.utilNs.List[T]): scala.Unit = js.native
  def clear(): scala.Unit = js.native
  /* private */ def createViewFromResource(position: js.Any, convertView: js.Any, parent: js.Any, resource: js.Any): js.Any = js.native
  def getContext(): androiduixLib.androidNs.contentNs.Context = js.native
  def getPosition(item: T): scala.Double = js.native
  /* private */ def init(context: js.Any, resource: js.Any, textViewResourceId: js.Any, objects: js.Any): js.Any = js.native
  def insert(`object`: T, index: scala.Double): scala.Unit = js.native
  def remove(`object`: T): scala.Unit = js.native
  def setDropDownViewResource(resource: java.lang.String): scala.Unit = js.native
  def setNotifyOnChange(notifyOnChange: scala.Boolean): scala.Unit = js.native
  def sort(comparator: androiduixLib.javaNs.utilNs.Comparator[T]): scala.Unit = js.native
}

