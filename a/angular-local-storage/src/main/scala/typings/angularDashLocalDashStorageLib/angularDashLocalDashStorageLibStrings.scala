package typings
package angularDashLocalDashStorageLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object angularDashLocalDashStorageLibStrings {
  @js.native
  sealed trait localStorage extends js.Object
  
  @js.native
  sealed trait sessionStorage extends js.Object
  
  def localStorage: localStorage = "localStorage".asInstanceOf[localStorage]
  def sessionStorage: sessionStorage = "sessionStorage".asInstanceOf[sessionStorage]
}

