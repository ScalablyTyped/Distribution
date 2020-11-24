package typings.ascii2mathml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ascii2mathmlStrings {
  
  @scala.inline
  def block: block = "block".asInstanceOf[block]
  
  @scala.inline
  def `inline`: `inline` = "inline".asInstanceOf[`inline`]
  
  @scala.inline
  def ltr: ltr = "ltr".asInstanceOf[ltr]
  
  @scala.inline
  def rtl: rtl = "rtl".asInstanceOf[rtl]
  
  @js.native
  sealed trait block extends js.Object
  
  @js.native
  sealed trait `inline` extends js.Object
  
  @js.native
  sealed trait ltr extends js.Object
  
  @js.native
  sealed trait rtl extends js.Object
}
