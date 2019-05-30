package typings
package atAngularRouterLib.atAngularRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @description
  *
  * Represents an option to configure when the initial navigation is performed.
  *
  * * 'enabled' - the initial navigation starts before the root component is created.
  * The bootstrap is blocked until the initial navigation is complete.
  * * 'disabled' - the initial navigation is not performed. The location listener is set up before
  * the root component gets created.
  * * 'legacy_enabled'- the initial navigation starts after the root component has been created.
  * The bootstrap is not blocked until the initial navigation is complete. @deprecated
  * * 'legacy_disabled'- the initial navigation is not performed. The location listener is set up
  * after @deprecated
  * the root component gets created.
  * * `true` - same as 'legacy_enabled'. @deprecated since v4
  * * `false` - same as 'legacy_disabled'. @deprecated since v4
  *
  * The 'enabled' option should be used for applications unless there is a reason to have
  * more control over when the router starts its initial navigation due to some complex
  * initialization logic. In this case, 'disabled' should be used.
  *
  * The 'legacy_enabled' and 'legacy_disabled' should not be used for new applications.
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

