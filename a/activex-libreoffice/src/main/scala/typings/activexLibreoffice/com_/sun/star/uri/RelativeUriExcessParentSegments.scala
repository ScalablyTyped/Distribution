package typings.activexLibreoffice.com_.sun.star.uri

import typings.activexLibreoffice.activexLibreofficeNumbers.`0`
import typings.activexLibreoffice.activexLibreofficeNumbers.`1`
import typings.activexLibreoffice.activexLibreofficeNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * details how excess special parent segments ( "`..`" ) are handled when resolving a relative URI reference to absolute form.
  * @see com.sun.star.uri.XUriReferenceFactory.makeAbsolute for a method that uses this enumeration.
  * @since OOo 2.0
  */
/* Rewritten from type alias, can be one of: 
  - typings.activexLibreoffice.activexLibreofficeNumbers.`0`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`2`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`1`
*/
trait RelativeUriExcessParentSegments extends js.Object
object RelativeUriExcessParentSegments {
  
  /** causes excess special parent segments to be treated as an error. */
  @scala.inline
  def ERROR: `0` = 0.asInstanceOf[`0`]
  
  /** causes excess special parent segments to be removed. */
  @scala.inline
  def REMOVE: `2` = 2.asInstanceOf[`2`]
  
  /** causes excess special parent segments to be retained, treating them like ordinary segments. */
  @scala.inline
  def RETAIN: `1` = 1.asInstanceOf[`1`]
}
