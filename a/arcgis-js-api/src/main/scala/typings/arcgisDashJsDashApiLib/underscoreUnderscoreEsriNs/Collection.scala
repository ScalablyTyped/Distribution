package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("__esri.Collection")
@js.native
class Collection[T] ()
  extends Accessor
     with Evented {
  def this(values: Collection[_]) = this()
  def this(values: js.Array[_]) = this()
  val length: scala.Double = js.native
  def add(item: T): scala.Unit = js.native
  def add(item: T, index: scala.Double): scala.Unit = js.native
  def addMany(items: Collection[T]): scala.Unit = js.native
  def addMany(items: Collection[T], index: scala.Double): scala.Unit = js.native
  def addMany(items: js.Array[T]): scala.Unit = js.native
  def addMany(items: js.Array[T], index: scala.Double): scala.Unit = js.native
  def concat(value: Collection[T]): Collection[T] = js.native
  def concat(value: js.Array[T]): Collection[T] = js.native
  def every(callback: ItemTestCallback[T]): scala.Boolean = js.native
  def filter(callback: ItemTestCallback[T]): Collection[T] = js.native
  def find(callback: ItemTestCallback[T]): T = js.native
  def findIndex(callback: ItemTestCallback[T]): scala.Double = js.native
  def flatten(callback: ItemCallback[T]): Collection[T] = js.native
  def forEach(callback: ItemCallback[T]): scala.Unit = js.native
  def getItemAt(index: scala.Double): T = js.native
  def includes(searchElement: T): scala.Boolean = js.native
  def indexOf(searchElement: T): scala.Double = js.native
  def indexOf(searchElement: T, fromIndex: scala.Double): scala.Double = js.native
  def join(): java.lang.String = js.native
  def join(separator: java.lang.String): java.lang.String = js.native
  def lastIndexOf(searchElement: T): scala.Double = js.native
  def lastIndexOf(searchElement: T, fromIndex: scala.Double): scala.Double = js.native
  def map[R](callback: ItemMapCallback[T, R]): Collection[R] = js.native
  @JSName("on")
  def `on_after-add`(
    `type`: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`after-add`,
    listener: CollectionAfterAddEventHandler[T]
  ): arcgisDashJsDashApiLib.IHandle = js.native
  @JSName("on")
  def `on_after-changes`(
    `type`: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`after-changes`,
    listener: CollectionAfterChangesEventHandler[T]
  ): arcgisDashJsDashApiLib.IHandle = js.native
  @JSName("on")
  def `on_after-remove`(
    `type`: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`after-remove`,
    listener: CollectionAfterRemoveEventHandler[T]
  ): arcgisDashJsDashApiLib.IHandle = js.native
  @JSName("on")
  def `on_before-add`(
    `type`: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`before-add`,
    listener: CollectionBeforeAddEventHandler[T]
  ): arcgisDashJsDashApiLib.IHandle = js.native
  @JSName("on")
  def `on_before-changes`(
    `type`: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`before-changes`,
    listener: CollectionBeforeChangesEventHandler[T]
  ): arcgisDashJsDashApiLib.IHandle = js.native
  @JSName("on")
  def `on_before-remove`(
    `type`: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`before-remove`,
    listener: CollectionBeforeRemoveEventHandler[T]
  ): arcgisDashJsDashApiLib.IHandle = js.native
  @JSName("on")
  def on_change(
    `type`: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.change,
    listener: CollectionChangeEventHandler[T]
  ): arcgisDashJsDashApiLib.IHandle = js.native
  def pop(): T = js.native
  def push(item: T): scala.Double = js.native
  def reduce[R](callback: ItemReduceCallback[T, R]): R = js.native
  def reduce[R](callback: ItemReduceCallback[T, R], initialValue: R): R = js.native
  def reduceRight[R](callback: ItemReduceCallback[T, R]): R = js.native
  def reduceRight[R](callback: ItemReduceCallback[T, R], initialValue: R): R = js.native
  def remove(item: T): scala.Unit = js.native
  def removeAll(): scala.Unit = js.native
  def removeAt(index: scala.Double): js.Any = js.native
  def removeMany(items: Collection[T]): js.Array[T] = js.native
  def removeMany(items: js.Array[T]): js.Array[T] = js.native
  def reorder(item: T, index: scala.Double): T = js.native
  def reverse(): Collection[T] = js.native
  def shift(): T = js.native
  def slice(): Collection[T] = js.native
  def slice(begin: scala.Double): Collection[T] = js.native
  def slice(begin: scala.Double, end: scala.Double): Collection[T] = js.native
  def some(callback: ItemCallback[T]): scala.Boolean = js.native
  def sort(): scala.Unit = js.native
  def sort(compareFunction: ItemCompareCallback[T]): scala.Unit = js.native
  def splice(start: scala.Double, deleteCount: scala.Double, items: T*): js.Array[T] = js.native
  def toArray(): js.Array[T] = js.native
  def unshift(items: T*): scala.Double = js.native
}

/* static members */
@JSGlobal("__esri.Collection")
@js.native
object Collection extends js.Object {
  def isCollection[T](value: arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.Collection[T]): /* is arcgis-js-api.__esri.Collection<T> */ scala.Boolean = js.native
  def isCollection[T](value: js.Any): /* is arcgis-js-api.__esri.Collection<T> */ scala.Boolean = js.native
  def ofType[T /* <: Base */, Base](`type`: arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.Constructor[T]): org.scalablytyped.runtime.Instantiable1[
    js.UndefOr[
      js.Array[T] | arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.Collection[T] | arcgisDashJsDashApiLib.Anon_Items[T]
    ], 
    arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.Collection[T]
  ] = js.native
  def ofType[T /* <: Base */, Base](`type`: arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.Types[T, Base]): org.scalablytyped.runtime.Instantiable1[
    js.UndefOr[
      js.Array[T] | arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.Collection[T] | arcgisDashJsDashApiLib.Anon_Items[T]
    ], 
    arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.Collection[T]
  ] = js.native
}

