package typings
package atAngularRouterLib.srcRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Navigation extends js.Object {
  /**
    * The initial target URL after being parsed with {@link UrlSerializer.extract()}.
    */
  var extractedUrl: atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlTree
  /**
    * The NavigationExtras used in this navigation. See {@link NavigationExtras} for more info.
    */
  var extras: NavigationExtras
  /**
    * Extracted URL after redirects have been applied. This URL may not be available immediately,
    * therefore this property can be `undefined`. It is guaranteed to be set after the
    * {@link RoutesRecognized} event fires.
    */
  var finalUrl: js.UndefOr[atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlTree] = js.undefined
  /**
    * The ID of the current navigation.
    */
  var id: scala.Double
  /**
    * Target URL passed into the {@link Router#navigateByUrl} call before navigation. This is
    * the value before the router has parsed or applied redirects to it.
    */
  var initialUrl: java.lang.String | atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlTree
  /**
    * Previously successful Navigation object. Only a single previous Navigation is available,
    * therefore this previous Navigation will always have a `null` value for `previousNavigation`.
    */
  var previousNavigation: (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias @angular/router.@angular/router/src/router.Navigation */ js.Object) | scala.Null
  /**
    * Identifies the trigger of the navigation.
    *
    * * 'imperative'--triggered by `router.navigateByUrl` or `router.navigate`.
    * * 'popstate'--triggered by a popstate event
    * * 'hashchange'--triggered by a hashchange event
    */
  var trigger: atAngularRouterLib.atAngularRouterLibStrings.imperative | atAngularRouterLib.atAngularRouterLibStrings.popstate | atAngularRouterLib.atAngularRouterLibStrings.hashchange
}

