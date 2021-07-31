package typings.activexInterop

import typings.activexInterop.anon.Item
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("ActiveXObject")
  @js.native
  def ActiveXObject: typings.activexInterop.ActiveXObject = js.native
  @scala.inline
  def ActiveXObject_=(x: ActiveXObject): Unit = js.Dynamic.global.updateDynamic("ActiveXObject")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("Enumerator")
  @js.native
  class Enumerator[T] protected ()
    extends StObject
       with typings.activexInterop.Enumerator[T] {
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
  @JSGlobal("Enumerator")
  @js.native
  def Enumerator: EnumeratorConstructor = js.native
  @scala.inline
  def Enumerator_=(x: EnumeratorConstructor): Unit = js.Dynamic.global.updateDynamic("Enumerator")(x.asInstanceOf[js.Any])
  
  /**
    * Represents an Automation SAFEARRAY
    */
  @JSGlobal("SafeArray")
  @js.native
  class SafeArray[T] protected ()
    extends StObject
       with typings.activexInterop.SafeArray[T] {
    
    /* CompleteClass */
    var SafeArray_typekey: typings.activexInterop.SafeArray[T] = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("VBArray")
  @js.native
  class VBArray[T] protected ()
    extends StObject
       with typings.activexInterop.VBArray[T] {
    def this(safeArray: typings.activexInterop.SafeArray[T]) = this()
  }
  @JSGlobal("VBArray")
  @js.native
  def VBArray: VBArrayConstructor = js.native
  @scala.inline
  def VBArray_=(x: VBArrayConstructor): Unit = js.Dynamic.global.updateDynamic("VBArray")(x.asInstanceOf[js.Any])
  
  /** Automation date (VT_DATE) */
  @JSGlobal("VarDate")
  @js.native
  class VarDate protected ()
    extends StObject
       with typings.activexInterop.VarDate {
    
    /* CompleteClass */
    var VarDate_typekey: typings.activexInterop.VarDate = js.native
  }
}
