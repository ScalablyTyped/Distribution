package typings
package asyncDashBusboyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Fields extends js.Object {
  var fields: org.scalablytyped.runtime.StringDictionary[js.Any]
  var files: js.UndefOr[js.Array[nodeLib.fsMod.ReadStream]] = js.undefined
}

object Anon_Fields {
  @scala.inline
  def apply(
    fields: org.scalablytyped.runtime.StringDictionary[js.Any],
    files: js.Array[nodeLib.fsMod.ReadStream] = null
  ): Anon_Fields = {
    val __obj = js.Dynamic.literal(fields = fields)
    if (files != null) __obj.updateDynamic("files")(files)
    __obj.asInstanceOf[Anon_Fields]
  }
}

