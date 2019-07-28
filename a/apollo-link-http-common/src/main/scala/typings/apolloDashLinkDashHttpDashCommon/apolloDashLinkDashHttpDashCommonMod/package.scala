package typings.apolloDashLinkDashHttpDashCommon

import typings.apolloDashLink.libTypesMod.Operation
import typings.apolloDashLinkDashHttpDashCommon.Anon_BodyText
import typings.apolloDashLinkDashHttpDashCommon.Anon_ParseError
import typings.apolloDashLinkDashHttpDashCommon.Anon_Response
import typings.std.Error
import typings.tsDashInvariant.tsDashInvariantMod.InvariantError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object apolloDashLinkDashHttpDashCommonMod {
  type ClientParseError = InvariantError with Anon_ParseError
  type ServerError = Error with Anon_Response
  type ServerParseError = Error with Anon_BodyText
  type UriFunction = js.Function1[/* operation */ Operation, String]
}
