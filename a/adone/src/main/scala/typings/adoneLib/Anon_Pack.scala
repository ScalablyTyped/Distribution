package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Pack extends js.Object {
  /**
    * zip packer
    */
  val packNs: Anon_ZipFile
  /**
    * zip unpacker
    */
  val unpackNs: Anon_BufferFdFilename
}

object Anon_Pack {
  @scala.inline
  def apply(packNs: Anon_ZipFile, unpackNs: Anon_BufferFdFilename): Anon_Pack = {
    val __obj = js.Dynamic.literal(packNs = packNs, unpackNs = unpackNs)
  
    __obj.asInstanceOf[Anon_Pack]
  }
}

