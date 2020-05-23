package typings.asyncBusboy.anon

import org.scalablytyped.runtime.StringDictionary
import typings.node.fsMod.ReadStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fields extends js.Object {
  var fields: StringDictionary[js.Any]
  var files: js.UndefOr[js.Array[ReadStream]] = js.undefined
}

object Fields {
  @scala.inline
  def apply(fields: StringDictionary[js.Any], files: js.Array[ReadStream] = null): Fields = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fields]
  }
}

