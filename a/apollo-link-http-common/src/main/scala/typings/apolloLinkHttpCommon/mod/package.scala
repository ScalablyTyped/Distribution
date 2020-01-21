package typings.apolloLinkHttpCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ClientParseError = typings.tsInvariant.mod.InvariantError with typings.apolloLinkHttpCommon.AnonParseError
  type ServerError = typings.std.Error with typings.apolloLinkHttpCommon.AnonResponse
  type ServerParseError = typings.std.Error with typings.apolloLinkHttpCommon.AnonBodyText
  type UriFunction = js.Function1[/* operation */ typings.apolloLink.typesMod.Operation, java.lang.String]
}
