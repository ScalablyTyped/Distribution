package typings.activexInterop

import typings.activexInterop.anon.Item
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
    extends typings.activexInterop.Enumerator[T] {
    def this(collection: Item[T]) = this()
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
    extends typings.activexInterop.SafeArray[T]
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("VBArray")
  @js.native
  class VBArray[T] protected ()
    extends typings.activexInterop.VBArray[T] {
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
    extends typings.activexInterop.VarDate
}
