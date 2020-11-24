package typings.antDesignPro

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object authorizedRouteMod {
  
  type AuthorizedRoute = typings.react.mod.Component[typings.antDesignPro.authorizedRouteMod.IAuthorizedRouteProps, js.Any, js.Any]
  
  type authority = java.lang.String | js.Array[java.lang.String] | typings.antDesignPro.authorizedRouteMod.authorityFN | js.Promise[js.Any]
  
  type authorityFN = js.Function1[/* currentAuthority */ js.UndefOr[java.lang.String], scala.Boolean]
}
