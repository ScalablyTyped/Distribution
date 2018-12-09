package typings
package adoneLib.adoneNs.dataNs.mpakNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object INs {
  type DecodeFunction = js.Function1[/* buf */ adoneLib.adoneNs.collectionNs.ByteArray, js.Any]
  type EncodeCheckFunction = js.Function1[/* x */ js.Any, scala.Boolean]
  type EncodeFunction = js.Function1[/* x */ js.Any, adoneLib.adoneNs.collectionNs.ByteArray]
  type Type = java.lang.String | scala.Double
}
