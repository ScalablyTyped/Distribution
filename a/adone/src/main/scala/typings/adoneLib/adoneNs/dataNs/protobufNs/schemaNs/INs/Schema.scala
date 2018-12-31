package typings
package adoneLib.adoneNs.dataNs.protobufNs.schemaNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Schema extends js.Object {
  var enums: js.Array[Enum]
  var `extends`: js.Array[Extend]
  var imports: js.Array[java.lang.String]
  var messages: js.Array[Message]
  var options: js.Object
   // ??
  var `package`: java.lang.String | scala.Null
  var services: js.UndefOr[js.Array[Service]] = js.undefined
  var syntax: js.Any
}

