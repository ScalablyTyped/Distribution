package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.activexLibreofficeNumbers.`0`
import typings.activexLibreoffice.activexLibreofficeNumbers.`1`
import typings.activexLibreoffice.activexLibreofficeNumbers.`2`
import typings.activexLibreoffice.activexLibreofficeNumbers.`3`
import typings.activexLibreoffice.activexLibreofficeNumbers.`4`
import typings.activexLibreoffice.activexLibreofficeNumbers.`5`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Codes for content creation errors. */
/* Rewritten from type alias, can be one of: 
  - typings.activexLibreoffice.activexLibreofficeNumbers.`5`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`3`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`1`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`4`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`2`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`0`
*/
trait ContentCreationError extends StObject
object ContentCreationError {
  
  /** Provider was unable to create the content instance. */
  @scala.inline
  def CONTENT_CREATION_FAILED: `5` = 5.asInstanceOf[`5`]
  
  /** Creation of content identifier failed. */
  @scala.inline
  def IDENTIFIER_CREATION_FAILED: `3` = 3.asInstanceOf[`3`]
  
  /** @deprecated Deprecated */
  @scala.inline
  def NO_CONTENT_BROKER: `1` = 1.asInstanceOf[`1`]
  
  /** No {@link Content} Provider for given content identifier available. */
  @scala.inline
  def NO_CONTENT_PROVIDER: `4` = 4.asInstanceOf[`4`]
  
  /** @deprecated Deprecated */
  @scala.inline
  def NO_IDENTIFIER_FACTORY: `2` = 2.asInstanceOf[`2`]
  
  /**
    * Unknown.
    *
    * An unknown I/O error has occurred.
    */
  @scala.inline
  def UNKNOWN: `0` = 0.asInstanceOf[`0`]
}
