package typings.angularRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Identifies the call or event that triggered a navigation.
  *
  * * 'imperative': Triggered by `router.navigateByUrl()` or `router.navigate()`.
  * * 'popstate' : Triggered by a `popstate` event.
  * * 'hashchange'-: Triggered by a `hashchange` event.
  *
  * @publicApi
  */
/* Rewritten from type alias, can be one of: 
  - typings.angularRouter.angularRouterStrings.imperative
  - typings.angularRouter.angularRouterStrings.popstate
  - typings.angularRouter.angularRouterStrings.hashchange
*/
trait NavigationTrigger extends StObject
object NavigationTrigger {
  
  inline def hashchange: typings.angularRouter.angularRouterStrings.hashchange = "hashchange".asInstanceOf[typings.angularRouter.angularRouterStrings.hashchange]
  
  inline def imperative: typings.angularRouter.angularRouterStrings.imperative = "imperative".asInstanceOf[typings.angularRouter.angularRouterStrings.imperative]
  
  inline def popstate: typings.angularRouter.angularRouterStrings.popstate = "popstate".asInstanceOf[typings.angularRouter.angularRouterStrings.popstate]
}
