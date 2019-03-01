package typings
package angularDashLocalDashStorageLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object angularDashLocalDashStorageLibStrings {
  @js.native
  sealed trait localStorage
    extends angularDashLocalDashStorageLib.angularDashLocalDashStorageMod.angularMod.localNs.storageNs.StorageType
  
  @js.native
  sealed trait sessionStorage
    extends angularDashLocalDashStorageLib.angularDashLocalDashStorageMod.angularMod.localNs.storageNs.StorageType
  
  @scala.inline
  def localStorage: localStorage = "localStorage".asInstanceOf[localStorage]
  @scala.inline
  def sessionStorage: sessionStorage = "sessionStorage".asInstanceOf[sessionStorage]
}

