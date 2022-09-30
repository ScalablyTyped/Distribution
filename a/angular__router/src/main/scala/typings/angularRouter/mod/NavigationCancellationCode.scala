package typings.angularRouter.mod

import typings.angularRouter.angularRouterInts.`0`
import typings.angularRouter.angularRouterInts.`1`
import typings.angularRouter.angularRouterInts.`2`
import typings.angularRouter.angularRouterInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.angularRouter.angularRouterInts.`0`
  - typings.angularRouter.angularRouterInts.`1`
  - typings.angularRouter.angularRouterInts.`2`
  - typings.angularRouter.angularRouterInts.`3`
*/
trait NavigationCancellationCode extends StObject
object NavigationCancellationCode {
  
  /**
    * A navigation failed because a guard returned `false`.
    */
  inline def GuardRejected: `3` = 3.asInstanceOf[`3`]
  
  /**
    * A navigation failed because one of the resolvers completed without emiting a value.
    */
  inline def NoDataFromResolver: `2` = 2.asInstanceOf[`2`]
  
  /**
    * A navigation failed because a guard returned a `UrlTree` to redirect.
    */
  inline def Redirect: `0` = 0.asInstanceOf[`0`]
  
  /**
    * A navigation failed because a more recent navigation started.
    */
  inline def SupersededByNewNavigation: `1` = 1.asInstanceOf[`1`]
}
