package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContentsReadable extends js.Object {
  var contents: nodeLib.streamMod.Readable
}

object Anon_ContentsReadable {
  @scala.inline
  def apply(contents: nodeLib.streamMod.Readable): Anon_ContentsReadable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("contents")(contents)
    __obj.asInstanceOf[Anon_ContentsReadable]
  }
}

