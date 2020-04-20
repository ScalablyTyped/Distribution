package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable1
import typings.arcgisJsApi.AnonItems
import typings.arcgisJsApi.IHandle
import typings.arcgisJsApi.arcgisJsApiStrings.`after-add`
import typings.arcgisJsApi.arcgisJsApiStrings.`after-changes`
import typings.arcgisJsApi.arcgisJsApiStrings.`after-remove`
import typings.arcgisJsApi.arcgisJsApiStrings.`before-add`
import typings.arcgisJsApi.arcgisJsApiStrings.`before-changes`
import typings.arcgisJsApi.arcgisJsApiStrings.`before-remove`
import typings.arcgisJsApi.arcgisJsApiStrings.change
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.arcgisJsApi.esri.Evented because Inheritance from two classes. Inlined emit, emit, hasEventListener, on, on */ @JSGlobal("__esri.Collection")
@js.native
class Collection[T] () extends Accessor {
  def this(values: js.Array[_]) = this()
  def this(values: Collection[_]) = this()
  val length: Double = js.native
  def add(item: T): Unit = js.native
  def add(item: T, index: Double): Unit = js.native
  def addMany(items: js.Array[T]): Unit = js.native
  def addMany(items: js.Array[T], index: Double): Unit = js.native
  def addMany(items: Collection[T]): Unit = js.native
  def addMany(items: Collection[T], index: Double): Unit = js.native
  def concat(value: js.Array[T]): Collection[T] = js.native
  def concat(value: Collection[T]): Collection[T] = js.native
  /**
    * Emits an event on the instance. This method should only be used when creating subclasses of this class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Evented.html#emit)
    *
    * @param type The name of the event.
    * @param event The event payload.
    *
    */
  def emit(`type`: String): Boolean = js.native
  def emit(`type`: String, event: js.Any): Boolean = js.native
  def every(callback: ItemTestCallback[T]): Boolean = js.native
  def filter(callback: ItemTestCallback[T]): Collection[T] = js.native
  @JSName("filter")
  def filter_S_T[S /* <: T */](callback: js.Function2[/* item */ T, /* index */ Double, /* is S */ Boolean]): Collection[S] = js.native
  def find(callback: ItemTestCallback[T]): T = js.native
  def findIndex(callback: ItemTestCallback[T]): Double = js.native
  def flatten(callback: js.Function2[/* item */ T, /* index */ Double, js.Array[T] | Collection[T]]): Collection[T] = js.native
  @JSName("flatten")
  def flatten_U[U](callback: js.Function2[/* item */ U, /* index */ Double, js.Array[U] | Collection[U]]): Collection[U] = js.native
  def forEach(callback: ItemCallback[T]): Unit = js.native
  def getItemAt(index: Double): T = js.native
  /**
    * Indicates whether there is an event listener on the instance that matches the provided event name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Evented.html#hasEventListener)
    *
    * @param type The name of the event.
    *
    */
  def hasEventListener(`type`: String): Boolean = js.native
  def includes(searchElement: T): Boolean = js.native
  def indexOf(searchElement: T): Double = js.native
  def indexOf(searchElement: T, fromIndex: Double): Double = js.native
  def join(): String = js.native
  def join(separator: String): String = js.native
  def lastIndexOf(searchElement: T): Double = js.native
  def lastIndexOf(searchElement: T, fromIndex: Double): Double = js.native
  def map[R](callback: ItemMapCallback[T, R]): Collection[R] = js.native
  /**
    * Registers an event handler on the instance. Call this method to hook an event with a listener.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Evented.html#on)
    *
    * @param type A event type, or an array of event types, to listen for.
    * @param listener The function to call when the event is fired.
    *
    */
  def on(`type`: String, listener: EventHandler | (js.Function1[/* event */ js.Any, Unit])): IHandle = js.native
  def on(`type`: js.Array[String], listener: EventHandler): IHandle = js.native
  @JSName("on")
  def on_afteradd(`type`: `after-add`, listener: CollectionAfterAddEventHandler[T]): IHandle = js.native
  @JSName("on")
  def on_afterchanges(`type`: `after-changes`, listener: CollectionAfterChangesEventHandler[T]): IHandle = js.native
  @JSName("on")
  def on_afterremove(`type`: `after-remove`, listener: CollectionAfterRemoveEventHandler[T]): IHandle = js.native
  @JSName("on")
  def on_beforeadd(`type`: `before-add`, listener: CollectionBeforeAddEventHandler[T]): IHandle = js.native
  @JSName("on")
  def on_beforechanges(`type`: `before-changes`, listener: CollectionBeforeChangesEventHandler[T]): IHandle = js.native
  @JSName("on")
  def on_beforeremove(`type`: `before-remove`, listener: CollectionBeforeRemoveEventHandler[T]): IHandle = js.native
  @JSName("on")
  def on_change(`type`: change, listener: CollectionChangeEventHandler[T]): IHandle = js.native
  def pop(): T = js.native
  def push(item: T): Double = js.native
  def reduce[R](callback: ItemReduceCallback[T, R]): R = js.native
  def reduce[R](callback: ItemReduceCallback[T, R], initialValue: R): R = js.native
  def reduceRight[R](callback: ItemReduceCallback[T, R]): R = js.native
  def reduceRight[R](callback: ItemReduceCallback[T, R], initialValue: R): R = js.native
  def remove(item: T): Unit = js.native
  def removeAll(): Unit = js.native
  def removeAt(index: Double): js.Any = js.native
  def removeMany(items: js.Array[T]): js.Array[T] = js.native
  def removeMany(items: Collection[T]): js.Array[T] = js.native
  def reorder(item: T, index: Double): T = js.native
  def reverse(): Collection[T] = js.native
  def shift(): T = js.native
  def slice(): Collection[T] = js.native
  def slice(begin: Double): Collection[T] = js.native
  def slice(begin: Double, end: Double): Collection[T] = js.native
  def some(callback: ItemCallback[T]): Boolean = js.native
  def sort(): Unit = js.native
  def sort(compareFunction: ItemCompareCallback[T]): Unit = js.native
  def splice(start: Double, deleteCount: Double, items: T*): js.Array[T] = js.native
  def toArray(): js.Array[T] = js.native
  def unshift(items: T*): Double = js.native
}

/* static members */
@JSGlobal("__esri.Collection")
@js.native
object Collection extends js.Object {
  def isCollection[T](value: js.Any): /* is arcgis-js-api.__esri.Collection<T> */ Boolean = js.native
  def isCollection[T](value: Collection[T]): /* is arcgis-js-api.__esri.Collection<T> */ Boolean = js.native
  def ofType[T /* <: Base */, Base](`type`: Constructor[T]): Instantiable1[js.UndefOr[js.Array[T] | Collection[T] | (AnonItems[T, Base])], Collection[T]] = js.native
  def ofType[T /* <: Base */, Base](`type`: Types[T, Base]): Instantiable1[js.UndefOr[js.Array[T] | Collection[T] | (AnonItems[T, Base])], Collection[T]] = js.native
}

