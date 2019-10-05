package typings.androiduix.android.widget

import typings.androiduix.android.content.Context
import typings.androiduix.java.util.Comparator
import typings.androiduix.java.util.List
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.ArrayAdapter")
@js.native
class ArrayAdapter[T] protected () extends BaseAdapter {
  def this(context: Context, resource: String) = this()
  def this(context: Context, resource: String, objects: js.Array[T]) = this()
  def this(context: Context, resource: String, textViewResourceId: String) = this()
  def this(context: Context, resource: String, textViewResourceId: String, objects: js.Array[T]) = this()
  def this(context: Context, resource: String, textViewResourceId: String, objects: List[T]) = this()
  var mContext: js.Any = js.native
  var mDropDownResource: js.Any = js.native
  var mFieldId: js.Any = js.native
  var mInflater: js.Any = js.native
  var mNotifyOnChange: js.Any = js.native
  var mObjects: js.Any = js.native
  var mResource: js.Any = js.native
  def add(`object`: T): Unit = js.native
  def addAll(collection: List[T]): Unit = js.native
  def clear(): Unit = js.native
  /* private */ def createViewFromResource(position: js.Any, convertView: js.Any, parent: js.Any, resource: js.Any): js.Any = js.native
  def getContext(): Context = js.native
  def getPosition(item: T): Double = js.native
  /* private */ def init(context: js.Any, resource: js.Any, textViewResourceId: js.Any, objects: js.Any): js.Any = js.native
  def insert(`object`: T, index: Double): Unit = js.native
  def remove(`object`: T): Unit = js.native
  def setDropDownViewResource(resource: String): Unit = js.native
  def setNotifyOnChange(notifyOnChange: Boolean): Unit = js.native
  def sort(comparator: Comparator[T]): Unit = js.native
}

