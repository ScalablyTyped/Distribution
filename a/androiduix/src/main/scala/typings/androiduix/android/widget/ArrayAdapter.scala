package typings.androiduix.android.widget

import typings.androiduix.android.content.Context
import typings.androiduix.android.database.DataSetObserver
import typings.androiduix.android.view.View
import typings.androiduix.android.view.ViewGroup
import typings.androiduix.java_.util.Comparator
import typings.androiduix.java_.util.List
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArrayAdapter[T] extends BaseAdapter {
  
  def add(`object`: T): Unit = js.native
  
  def addAll(collection: List[T]): Unit = js.native
  
  def clear(): Unit = js.native
  
  /* private */ def createViewFromResource(position: js.Any, convertView: js.Any, parent: js.Any, resource: js.Any): js.Any = js.native
  
  def getContext(): Context = js.native
  
  def getPosition(item: T): Double = js.native
  
  /* private */ def init(context: js.Any, resource: js.Any, textViewResourceId: js.Any, objects: js.Any): js.Any = js.native
  
  def insert(`object`: T, index: Double): Unit = js.native
  
  var mContext: js.Any = js.native
  
  var mDropDownResource: js.Any = js.native
  
  var mFieldId: js.Any = js.native
  
  var mInflater: js.Any = js.native
  
  var mNotifyOnChange: js.Any = js.native
  
  var mObjects: js.Any = js.native
  
  var mResource: js.Any = js.native
  
  def remove(`object`: T): Unit = js.native
  
  def setDropDownViewResource(resource: String): Unit = js.native
  
  def setNotifyOnChange(notifyOnChange: Boolean): Unit = js.native
  
  def sort(comparator: Comparator[T]): Unit = js.native
}
object ArrayAdapter {
  
  @scala.inline
  def apply[T](
    add: T => Unit,
    addAll: List[T] => Unit,
    areAllItemsEnabled: () => Boolean,
    clear: () => Unit,
    createViewFromResource: (js.Any, js.Any, js.Any, js.Any) => js.Any,
    getContext: () => Context,
    getCount: () => Double,
    getDropDownView: (Double, View, ViewGroup) => View,
    getItem: Double => js.Any,
    getItemId: Double => Double,
    getItemViewType: Double => Double,
    getPosition: T => Double,
    getView: (Double, View, ViewGroup) => View,
    getViewTypeCount: () => Double,
    hasStableIds: () => Boolean,
    init: (js.Any, js.Any, js.Any, js.Any) => js.Any,
    insert: (T, Double) => Unit,
    isEmpty: () => Boolean,
    isEnabled: Double => Boolean,
    mContext: js.Any,
    mDataSetObservable: js.Any,
    mDropDownResource: js.Any,
    mFieldId: js.Any,
    mInflater: js.Any,
    mNotifyOnChange: js.Any,
    mObjects: js.Any,
    mResource: js.Any,
    notifyDataSetChanged: () => Unit,
    notifyDataSetInvalidated: () => Unit,
    registerDataSetObserver: DataSetObserver => Unit,
    remove: T => Unit,
    setDropDownViewResource: String => Unit,
    setNotifyOnChange: Boolean => Unit,
    sort: Comparator[T] => Unit,
    unregisterDataSetObserver: DataSetObserver => Unit
  ): ArrayAdapter[T] = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), addAll = js.Any.fromFunction1(addAll), areAllItemsEnabled = js.Any.fromFunction0(areAllItemsEnabled), clear = js.Any.fromFunction0(clear), createViewFromResource = js.Any.fromFunction4(createViewFromResource), getContext = js.Any.fromFunction0(getContext), getCount = js.Any.fromFunction0(getCount), getDropDownView = js.Any.fromFunction3(getDropDownView), getItem = js.Any.fromFunction1(getItem), getItemId = js.Any.fromFunction1(getItemId), getItemViewType = js.Any.fromFunction1(getItemViewType), getPosition = js.Any.fromFunction1(getPosition), getView = js.Any.fromFunction3(getView), getViewTypeCount = js.Any.fromFunction0(getViewTypeCount), hasStableIds = js.Any.fromFunction0(hasStableIds), init = js.Any.fromFunction4(init), insert = js.Any.fromFunction2(insert), isEmpty = js.Any.fromFunction0(isEmpty), isEnabled = js.Any.fromFunction1(isEnabled), mContext = mContext.asInstanceOf[js.Any], mDataSetObservable = mDataSetObservable.asInstanceOf[js.Any], mDropDownResource = mDropDownResource.asInstanceOf[js.Any], mFieldId = mFieldId.asInstanceOf[js.Any], mInflater = mInflater.asInstanceOf[js.Any], mNotifyOnChange = mNotifyOnChange.asInstanceOf[js.Any], mObjects = mObjects.asInstanceOf[js.Any], mResource = mResource.asInstanceOf[js.Any], notifyDataSetChanged = js.Any.fromFunction0(notifyDataSetChanged), notifyDataSetInvalidated = js.Any.fromFunction0(notifyDataSetInvalidated), registerDataSetObserver = js.Any.fromFunction1(registerDataSetObserver), remove = js.Any.fromFunction1(remove), setDropDownViewResource = js.Any.fromFunction1(setDropDownViewResource), setNotifyOnChange = js.Any.fromFunction1(setNotifyOnChange), sort = js.Any.fromFunction1(sort), unregisterDataSetObserver = js.Any.fromFunction1(unregisterDataSetObserver))
    __obj.asInstanceOf[ArrayAdapter[T]]
  }
  
  @scala.inline
  implicit class ArrayAdapterMutableBuilder[Self <: ArrayAdapter[_], T] (val x: Self with ArrayAdapter[T]) extends AnyVal {
    
    @scala.inline
    def setAdd(value: T => Unit): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddAll(value: List[T] => Unit): Self = StObject.set(x, "addAll", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreateViewFromResource(value: (js.Any, js.Any, js.Any, js.Any) => js.Any): Self = StObject.set(x, "createViewFromResource", js.Any.fromFunction4(value))
    
    @scala.inline
    def setGetContext(value: () => Context): Self = StObject.set(x, "getContext", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPosition(value: T => Double): Self = StObject.set(x, "getPosition", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInit(value: (js.Any, js.Any, js.Any, js.Any) => js.Any): Self = StObject.set(x, "init", js.Any.fromFunction4(value))
    
    @scala.inline
    def setInsert(value: (T, Double) => Unit): Self = StObject.set(x, "insert", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMContext(value: js.Any): Self = StObject.set(x, "mContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMDropDownResource(value: js.Any): Self = StObject.set(x, "mDropDownResource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMFieldId(value: js.Any): Self = StObject.set(x, "mFieldId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMInflater(value: js.Any): Self = StObject.set(x, "mInflater", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMNotifyOnChange(value: js.Any): Self = StObject.set(x, "mNotifyOnChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMObjects(value: js.Any): Self = StObject.set(x, "mObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMResource(value: js.Any): Self = StObject.set(x, "mResource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemove(value: T => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetDropDownViewResource(value: String => Unit): Self = StObject.set(x, "setDropDownViewResource", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetNotifyOnChange(value: Boolean => Unit): Self = StObject.set(x, "setNotifyOnChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSort(value: Comparator[T] => Unit): Self = StObject.set(x, "sort", js.Any.fromFunction1(value))
  }
}
