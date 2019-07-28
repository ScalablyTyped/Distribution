package typings.adone.adoneNs.dataNs.mpakNs

import typings.adone.adoneNs.collectionNs.ByteArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object INs {
  type DecodeFunction = js.Function1[/* buf */ ByteArray, js.Any]
  type EncodeCheckFunction = js.Function1[/* x */ js.Any, Boolean]
  type EncodeFunction = js.Function1[/* x */ js.Any, ByteArray]
  type Type = String | Double
}
