package typings
package acornLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object acornLibStrings {
  @js.native
  sealed trait module extends js.Object
  
  @js.native
  sealed trait script extends js.Object
  
  def module: module = "module".asInstanceOf[module]
  def script: script = "script".asInstanceOf[script]
}

