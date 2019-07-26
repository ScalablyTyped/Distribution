package typings
package atAngularRouterLib.atAngularRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Allowed values in an `ExtraOptions` object that configure
  * when the router performs the initial navigation operation.
  *
  * * 'enabled' (Default) The initial navigation starts before the root component is created.
  * The bootstrap is blocked until the initial navigation is complete.
  * * 'disabled' - The initial navigation is not performed. The location listener is set up before
  * the root component gets created. Use if there is a reason to have
  * more control over when the router starts its initial navigation due to some complex
  * initialization logic.
  * * 'legacy_enabled'- The initial navigation starts after the root component has been created.
  * The bootstrap is not blocked until the initial navigation is complete. @deprecated
  * * 'legacy_disabled'- The initial navigation is not performed. The location listener is set up
  * after the root component gets created. @deprecated
  * * `true` - same as 'legacy_enabled'. @deprecated since v4
  * * `false` - same as 'legacy_disabled'. @deprecated since v4
  *
  * The 'legacy_enabled' and 'legacy_disabled' should not be used for new applications.
  *
  * @see `forRoot()`
  *
  * @publicApi
  */
/* Rewritten from type alias, can be one of: 
  - atAngularRouterLib.atAngularRouterLibNumbers.`true`
  - atAngularRouterLib.atAngularRouterLibNumbers.`false`
  - atAngularRouterLib.atAngularRouterLibStrings.enabled
  - atAngularRouterLib.atAngularRouterLibStrings.disabled
  - atAngularRouterLib.atAngularRouterLibStrings.legacy_enabled
  - atAngularRouterLib.atAngularRouterLibStrings.legacy_disabled
*/
trait InitialNavigation extends js.Object

