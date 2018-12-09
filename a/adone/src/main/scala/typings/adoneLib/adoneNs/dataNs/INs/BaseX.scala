package typings
package adoneLib.adoneNs.dataNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait BaseX extends js.Object {
  def decode(str: java.lang.String): nodeLib.Buffer
  def decodeUnsafe(str: java.lang.String): nodeLib.Buffer
  def encode(buf: nodeLib.Buffer): java.lang.String
}

