package typings.angularPlatformBrowser.mod

import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.angularCore.mod.ɵɵInjectableDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/platform-browser", "TransferState")
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
  
  /* private */ var store: Any = js.native
  
  /**
    * Serialize the current state of the store to JSON.
    */
  def toJson(): String = js.native
}
/* static members */
object TransferState {
  
  @JSImport("@angular/platform-browser", "TransferState")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/platform-browser", "TransferState.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[TransferState, scala.Nothing] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[TransferState, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/platform-browser", "TransferState.\u0275prov")
  @js.native
  def ɵprov: ɵɵInjectableDeclaration[TransferState] = js.native
  inline def ɵprov_=(x: ɵɵInjectableDeclaration[TransferState]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275prov")(x.asInstanceOf[js.Any])
}
