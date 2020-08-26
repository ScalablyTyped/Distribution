package typings.acorn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object acornStrings {
  @js.native
  sealed trait module extends js.Object
  
  @js.native
  sealed trait never extends js.Object
  
  @js.native
  sealed trait script extends js.Object
  
  @scala.inline
  def module: module = "module".asInstanceOf[module]
  @scala.inline
  def never: never = "never".asInstanceOf[never]
  @scala.inline
  def script: script = "script".asInstanceOf[script]
}

