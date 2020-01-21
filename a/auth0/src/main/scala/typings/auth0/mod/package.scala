package typings.auth0

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AppMetadata = org.scalablytyped.runtime.StringDictionary[js.Any]
  type ClientGrant = typings.std.Partial[typings.auth0.mod.CreateClientGrant] with typings.auth0.AnonId
  type DatabaseClientOptions = typings.auth0.mod.BaseClientOptions
  type PasswordLessClientOptions = typings.auth0.mod.BaseClientOptions
  type UpdateClientGrant = typings.std.Pick[
    typings.std.Partial[typings.auth0.mod.CreateClientGrant], 
    typings.auth0.auth0Strings.scope
  ]
  type UserMetadata = org.scalablytyped.runtime.StringDictionary[js.Any]
}
