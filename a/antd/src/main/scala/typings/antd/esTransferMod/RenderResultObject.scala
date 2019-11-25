package typings.antd.esTransferMod

import typings.react.reactMod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderResultObject extends js.Object {
  var label: ReactElement
  var value: String
}

object RenderResultObject {
  @scala.inline
  def apply(label: ReactElement, value: String): RenderResultObject = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RenderResultObject]
  }
}

