package typings
package auth0Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object auth0Mod {
  type AppMetadata = org.scalablytyped.runtime.StringDictionary[js.Any]
  type ClientGrant = stdLib.Partial[CreateClientGrant] with auth0Lib.Anon_Id
  type DatabaseClientOptions = BaseClientOptions
  type PasswordLessClientOptions = BaseClientOptions
  type UpdateClientGrant = stdLib.Pick[stdLib.Partial[CreateClientGrant], auth0Lib.auth0LibStrings.scope]
  type UserMetadata = org.scalablytyped.runtime.StringDictionary[js.Any]
}
