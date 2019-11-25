package typings.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bordered extends js.Object {
  var bordered: Boolean
  var expandIconPosition: String
  var openAnimation: Anon_Appear
}

object Anon_Bordered {
  @scala.inline
  def apply(bordered: Boolean, expandIconPosition: String, openAnimation: Anon_Appear): Anon_Bordered = {
    val __obj = js.Dynamic.literal(bordered = bordered.asInstanceOf[js.Any], expandIconPosition = expandIconPosition.asInstanceOf[js.Any], openAnimation = openAnimation.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Bordered]
  }
}

