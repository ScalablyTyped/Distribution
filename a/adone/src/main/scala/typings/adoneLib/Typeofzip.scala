package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofzip extends js.Object {
  /**
    * zip packer
    */
  val packNs: Typeofpack
  /**
    * zip unpacker
    */
  val unpackNs: Typeofunpack
}

object Typeofzip {
  @scala.inline
  def apply(packNs: Typeofpack, unpackNs: Typeofunpack): Typeofzip = {
    val __obj = js.Dynamic.literal(packNs = packNs, unpackNs = unpackNs)
  
    __obj.asInstanceOf[Typeofzip]
  }
}

