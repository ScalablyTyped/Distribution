package typings.auth0

import org.scalablytyped.runtime.StringDictionary
import typings.auth0.Anon_Id
import typings.auth0.auth0Strings.scope
import typings.std.Partial
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object auth0Mod {
  type AppMetadata = StringDictionary[js.Any]
  type ClientGrant = Partial[CreateClientGrant] with Anon_Id
  type DatabaseClientOptions = BaseClientOptions
  type PasswordLessClientOptions = BaseClientOptions
  type UpdateClientGrant = Pick[Partial[CreateClientGrant], scope]
  type UserMetadata = StringDictionary[js.Any]
}
