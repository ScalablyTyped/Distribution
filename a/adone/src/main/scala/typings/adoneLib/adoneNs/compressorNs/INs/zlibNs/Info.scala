package typings
package adoneLib.adoneNs.compressorNs.INs.zlibNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Info[T] extends js.Object {
  var buffer: nodeLib.Buffer
  var engine: T
}

object Info {
  @scala.inline
  def apply[T](buffer: nodeLib.Buffer, engine: T): Info[T] = {
    val __obj = js.Dynamic.literal(buffer = buffer, engine = engine.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Info[T]]
  }
}

