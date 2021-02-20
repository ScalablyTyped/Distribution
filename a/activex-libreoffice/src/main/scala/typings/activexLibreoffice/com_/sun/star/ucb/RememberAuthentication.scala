package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.activexLibreofficeNumbers.`0`
import typings.activexLibreoffice.activexLibreofficeNumbers.`1`
import typings.activexLibreoffice.activexLibreofficeNumbers.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A specification of how long to remember some authentication data. */
/* Rewritten from type alias, can be one of: 
  - typings.activexLibreoffice.activexLibreofficeNumbers.`0`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`2`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`1`
*/
trait RememberAuthentication extends StObject
object RememberAuthentication {
  
  /** Do not remember the authentication data (use it once and immediately forget about it). */
  @scala.inline
  def NO: `0` = 0.asInstanceOf[`0`]
  
  /** Remember the authentication data "forever". */
  @scala.inline
  def PERSISTENT: `2` = 2.asInstanceOf[`2`]
  
  /** Remember the authentication data, but only until the end of the current session. */
  @scala.inline
  def SESSION: `1` = 1.asInstanceOf[`1`]
}
