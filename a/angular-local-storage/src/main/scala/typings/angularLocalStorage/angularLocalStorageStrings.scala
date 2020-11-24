package typings.angularLocalStorage

import typings.angularLocalStorage.mod.angularAugmentingMod.local.storage.StorageType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object angularLocalStorageStrings {
  
  @scala.inline
  def localStorage: localStorage = "localStorage".asInstanceOf[localStorage]
  
  @scala.inline
  def sessionStorage: sessionStorage = "sessionStorage".asInstanceOf[sessionStorage]
  
  @js.native
  sealed trait localStorage extends StorageType
  
  @js.native
  sealed trait sessionStorage extends StorageType
}
