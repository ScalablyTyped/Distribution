package typings
package asanaLib.asanaMod.asanaNs.resourcesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NextPage extends js.Object {
  var offset: java.lang.String
  var path: java.lang.String
  var uri: java.lang.String
}

object NextPage {
  @scala.inline
  def apply(offset: java.lang.String, path: java.lang.String, uri: java.lang.String): NextPage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("offset")(offset)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("uri")(uri)
    __obj.asInstanceOf[NextPage]
  }
}

