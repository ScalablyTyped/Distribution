package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/core", "TransferState")
@js.native
open class TransferState () extends StObject {
  
  /**
    * Get the value corresponding to a key. Return `defaultValue` if key is not found.
    */
  def get[T](key: StateKey[T], defaultValue: T): T = js.native
  
  /**
    * Test whether a key exists in the store.
    */
  def hasKey[T](key: StateKey[T]): Boolean = js.native
  
  /**
    * Indicates whether the state is empty.
    */
  def isEmpty: Boolean = js.native
  
  /**
    * Register a callback to provide the value for a key when `toJson` is called.
    */
  def onSerialize[T](key: StateKey[T], callback: js.Function0[T]): Unit = js.native
  
  /* private */ var onSerializeCallbacks: Any = js.native
  
  /**
    * Remove a key from the store.
    */
  def remove[T](key: StateKey[T]): Unit = js.native
  
  /**
    * Set the value corresponding to a key.
    */
  def set[T](key: StateKey[T], value: T): Unit = js.native
  
  /**
    * Serialize the current state of the store to JSON.
    */
  def toJson(): String = js.native
}
/* static members */
object TransferState {
  
  @JSImport("@angular/core", "TransferState")
  @js.native
  val ^ : js.Any = js.native
  
  /** @nocollapse */
  @JSImport("@angular/core", "TransferState.\u0275prov")
  @js.native
  def ɵprov: Any = js.native
  inline def ɵprov_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275prov")(x.asInstanceOf[js.Any])
}
