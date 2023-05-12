package typings.angularRouter.mod

import typings.angularRouter.angularRouterInts.`0`
import typings.angularRouter.angularRouterInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.angularRouter.angularRouterInts.`0`
  - typings.angularRouter.angularRouterInts.`1`
*/
trait NavigationSkippedCode extends StObject
object NavigationSkippedCode {
  
  /**
    * A navigation was skipped because the configured `UrlHandlingStrategy` return `false` for both
    * the current Router URL and the target of the navigation.
    *
    * @see UrlHandlingStrategy
    */
  inline def IgnoredByUrlHandlingStrategy: `1` = 1.asInstanceOf[`1`]
  
  /**
    * A navigation was skipped because the navigation URL was the same as the current Router URL.
    */
  inline def IgnoredSameUrlNavigation: `0` = 0.asInstanceOf[`0`]
}
