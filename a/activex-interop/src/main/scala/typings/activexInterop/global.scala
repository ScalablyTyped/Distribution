package typings.activexInterop

import org.scalablytyped.runtime.TopLevel
import typings.activexInterop.anon.Item
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  class Enumerator[T] protected ()
    extends typings.activexInterop.Enumerator[T] {
    def this(collection: Item[T]) = this()
    /**
      * Returns true if the current item is the last one in the collection, or the collection is empty,
      * or the current item is undefined.
      */
    /* CompleteClass */
    override def atEnd(): Boolean = js.native
    /**
      * Returns the current item in the collection
      */
    /* CompleteClass */
    override def item(): T = js.native
    /**
      * Resets the current item in the collection to the first item. If there are no items in the collection,
      * the current item is set to undefined.
      */
    /* CompleteClass */
    override def moveFirst(): Unit = js.native
    /**
      * Moves the current item to the next item in the collection. If the enumerator is at the end of
      * the collection or the collection is empty, the current item is set to undefined.
      */
    /* CompleteClass */
    override def moveNext(): Unit = js.native
  }
  
  /**
    * Represents an Automation SAFEARRAY
    */
  @js.native
  class SafeArray[T] protected ()
    extends typings.activexInterop.SafeArray[T] {
    /* CompleteClass */
    override var SafeArray_typekey: typings.activexInterop.SafeArray[T] = js.native
  }
  
  @js.native
  class VBArray[T] protected ()
    extends typings.activexInterop.VBArray[T] {
    def this(safeArray: typings.activexInterop.SafeArray[T]) = this()
  }
  
  /** Automation date (VT_DATE) */
  @js.native
  class VarDate protected ()
    extends typings.activexInterop.VarDate {
    /* CompleteClass */
    override var VarDate_typekey: typings.activexInterop.VarDate = js.native
  }
  
  var ActiveXObject: typings.activexInterop.ActiveXObject = js.native
  @js.native
  object Enumerator extends TopLevel[EnumeratorConstructor]
  
  @js.native
  object VBArray extends TopLevel[VBArrayConstructor]
  
}

