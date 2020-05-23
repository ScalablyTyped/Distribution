package typings.activexInfopath.InfoPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Button extends js.Object {
  @JSName("InfoPath.Button_typekey")
  var InfoPathDotButton_typekey: Button
}

object Button {
  @scala.inline
  def apply(InfoPathDotButton_typekey: Button): Button = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("InfoPath.Button_typekey")(InfoPathDotButton_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Button]
  }
}

