package typings.asyncDashBusboy

import org.scalablytyped.runtime.StringDictionary
import typings.node.fsMod.ReadStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Fields extends js.Object {
  var fields: StringDictionary[js.Any]
  var files: js.UndefOr[js.Array[ReadStream]] = js.undefined
}

object Anon_Fields {
  @scala.inline
  def apply(fields: StringDictionary[js.Any], files: js.Array[ReadStream] = null): Anon_Fields = {
    val __obj = js.Dynamic.literal(fields = fields)
    if (files != null) __obj.updateDynamic("files")(files)
    __obj.asInstanceOf[Anon_Fields]
  }
}

