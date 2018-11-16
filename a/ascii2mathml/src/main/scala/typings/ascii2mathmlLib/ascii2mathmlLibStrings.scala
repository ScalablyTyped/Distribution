package typings
package ascii2mathmlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ascii2mathmlLibStrings {
  @js.native
  sealed trait block extends js.Object
  
  @js.native
  sealed trait `inline` extends js.Object
  
  @js.native
  sealed trait ltr extends js.Object
  
  @js.native
  sealed trait rtl extends js.Object
  
  def block: block = "block".asInstanceOf[block]
  def `inline`: `inline` = "inline".asInstanceOf[`inline`]
  def ltr: ltr = "ltr".asInstanceOf[ltr]
  def rtl: rtl = "rtl".asInstanceOf[rtl]
}

