package typings
package antdLib.libTransferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderResultObject extends js.Object {
  var label: reactLib.reactMod.ReactElement[_]
  var value: java.lang.String
}

object RenderResultObject {
  @scala.inline
  def apply(label: reactLib.reactMod.ReactElement[_], value: java.lang.String): RenderResultObject = {
    val __obj = js.Dynamic.literal(label = label, value = value)
  
    __obj.asInstanceOf[RenderResultObject]
  }
}

