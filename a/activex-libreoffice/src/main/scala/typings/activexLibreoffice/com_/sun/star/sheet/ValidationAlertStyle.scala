package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.activexLibreofficeNumbers.`0`
import typings.activexLibreoffice.activexLibreofficeNumbers.`1`
import typings.activexLibreoffice.activexLibreofficeNumbers.`2`
import typings.activexLibreoffice.activexLibreofficeNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** used to specify how invalid cell contents are treated. */
/* Rewritten from type alias, can be one of: 
  - typings.activexLibreoffice.activexLibreofficeNumbers.`2`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`3`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`0`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`1`
*/
trait ValidationAlertStyle extends js.Object
object ValidationAlertStyle {
  
  /** information message is shown and the user is asked whether the change will be accepted (defaulted to "Yes"). */
  @scala.inline
  def INFO: `2` = 2.asInstanceOf[`2`]
  
  /** macro is executed. */
  @scala.inline
  def MACRO: `3` = 3.asInstanceOf[`3`]
  
  /** error message is shown and the change is rejected. */
  @scala.inline
  def STOP: `0` = 0.asInstanceOf[`0`]
  
  /** warning message is shown and the user is asked whether the change will be accepted (defaulted to "No"). */
  @scala.inline
  def WARNING: `1` = 1.asInstanceOf[`1`]
}
