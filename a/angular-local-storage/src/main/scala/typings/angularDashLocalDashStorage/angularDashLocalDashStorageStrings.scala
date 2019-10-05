package typings.angularDashLocalDashStorage

import typings.angularDashLocalDashStorage.angularDashLocalDashStorageMod.angularMod.local.storage.StorageType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object angularDashLocalDashStorageStrings {
  @js.native
  sealed trait localStorage extends StorageType
  
  @js.native
  sealed trait sessionStorage extends StorageType
  
  @scala.inline
  def localStorage: localStorage = "localStorage".asInstanceOf[localStorage]
  @scala.inline
  def sessionStorage: sessionStorage = "sessionStorage".asInstanceOf[sessionStorage]
}

