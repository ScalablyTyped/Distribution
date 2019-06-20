package typings
package antdLib.esTransferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderResultObject extends js.Object {
  var label: reactLib.reactMod.ReactElement
  var value: java.lang.String
}

object RenderResultObject {
  @scala.inline
  def apply(label: reactLib.reactMod.ReactElement, value: java.lang.String): RenderResultObject = {
    val __obj = js.Dynamic.literal(label = label, value = value)
  
    __obj.asInstanceOf[RenderResultObject]
  }
}

