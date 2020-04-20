package typings.angularCore.mod

import typings.angularCore.angularCoreNumbers.`1`
import typings.angularCore.angularCoreNumbers.`2`
import typings.angularCore.angularCoreNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A series of flags to instruct a style sanitizer to either validate
  * or sanitize a value.
  *
  * Because sanitization is dependent on the style property (i.e. style
  * sanitization for `width` is much different than for `background-image`)
  * the sanitization function (e.g. `StyleSanitizerFn`) needs to check a
  * property value first before it actually sanitizes any values.
  *
  * This enum exist to allow a style sanitization function to either only
  * do validation (check the property to see whether a value will be
  * sanitized or not) or to sanitize the value (or both).
  *
  * @publicApi
  */
/* Rewritten from type alias, can be one of: 
  - typings.angularCore.angularCoreNumbers.`1`
  - typings.angularCore.angularCoreNumbers.`2`
  - typings.angularCore.angularCoreNumbers.`3`
*/
trait StyleSanitizeMode extends js.Object

object StyleSanitizeMode {
  /** Skip checking the property; just sanitize the value */
  @scala.inline
  def SanitizeOnly: `2` = 2.asInstanceOf[`2`]
  /** Check the property and (if true) then sanitize the value */
  @scala.inline
  def ValidateAndSanitize: `3` = 3.asInstanceOf[`3`]
  /** Just check to see if the property is required to be sanitized or not */
  @scala.inline
  def ValidateProperty: `1` = 1.asInstanceOf[`1`]
}

