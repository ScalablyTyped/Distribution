package typings.ariaQuery

import typings.ariaQuery.mod.ARIAPropertyCurrent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ariaQueryBooleans {
  @js.native
  sealed trait `false` extends ARIAPropertyCurrent
  
  @js.native
  sealed trait `true` extends ARIAPropertyCurrent
  
  @scala.inline
  def `false`: `false` = false.asInstanceOf[`false`]
  @scala.inline
  def `true`: `true` = true.asInstanceOf[`true`]
}

