package typings.angularDashSanitize.angularDashSanitizeMod.angularMod

import typings.angularDashSanitize.angularDashSanitizeMod.angularMod.sanitizeNs.filterNs.ILinky
import typings.angularDashSanitize.angularDashSanitizeStrings.linky
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sanitizeNs {
  ///////////////////////////////////////////////////////////////////////////////
  // Extend angular $filter declarations to include filters from angular.sanitize module
  ///////////////////////////////////////////////////////////////////////////////
  type IFilterService = js.Function1[linky, ILinky]
  /**
    * Sanitizes an html string by stripping all potentially dangerous tokens.
    *
    * The input is sanitized by parsing the HTML into tokens.
    * All safe tokens (from a whitelist) are then serialized back to a properly escaped HTML string.
    * This means that no unsafe input can make it into the returned string.
    *
    * The whitelist for URL sanitization of attribute values is configured using the functions aHrefSanitizationWhitelist and imgSrcSanitizationWhitelist of $compileProvider.
    * The input may also contain SVG markup if this is enabled via $sanitizeProvider.
    *
    * @param html HTML input.
    */
  type ISanitizeService = js.Function1[/* html */ String, String]
}
