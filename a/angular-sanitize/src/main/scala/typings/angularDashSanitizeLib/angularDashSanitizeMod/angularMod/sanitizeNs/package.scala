package typings
package angularDashSanitizeLib.angularDashSanitizeMod.angularMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sanitizeNs {
  ///////////////////////////////////////////////////////////////////////////////
  // Extend angular $filter declarations to include filters from angular.sanitize module
  ///////////////////////////////////////////////////////////////////////////////
  type IFilterService = js.Function1[
    angularDashSanitizeLib.angularDashSanitizeLibStrings.linky, 
    angularDashSanitizeLib.angularDashSanitizeMod.angularMod.sanitizeNs.filterNs.ILinky
  ]
  ///////////////////////////////////////////////////////////////////////////
  // SanitizeService
  // see http://docs.angularjs.org/api/ngSanitize.$sanitize
  ///////////////////////////////////////////////////////////////////////////
  type ISanitizeService = js.Function1[/* html */ java.lang.String, java.lang.String]
}
