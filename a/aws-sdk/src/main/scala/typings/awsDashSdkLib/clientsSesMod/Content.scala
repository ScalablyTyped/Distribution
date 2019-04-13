package typings
package awsDashSdkLib.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Content extends js.Object {
  /**
    * The character set of the content.
    */
  var Charset: js.UndefOr[Charset] = js.undefined
  /**
    * The textual data of the content.
    */
  var Data: MessageData
}

object Content {
  @scala.inline
  def apply(Data: MessageData, Charset: Charset = null): Content = {
    val __obj = js.Dynamic.literal(Data = Data)
    if (Charset != null) __obj.updateDynamic("Charset")(Charset)
    __obj.asInstanceOf[Content]
  }
}

