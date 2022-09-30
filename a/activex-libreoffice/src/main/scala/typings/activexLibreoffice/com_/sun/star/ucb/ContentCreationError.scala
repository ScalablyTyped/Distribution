package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.activexLibreofficeInts.`0`
import typings.activexLibreoffice.activexLibreofficeInts.`1`
import typings.activexLibreoffice.activexLibreofficeInts.`2`
import typings.activexLibreoffice.activexLibreofficeInts.`3`
import typings.activexLibreoffice.activexLibreofficeInts.`4`
import typings.activexLibreoffice.activexLibreofficeInts.`5`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Codes for content creation errors. */
/* Rewritten from type alias, can be one of: 
  - typings.activexLibreoffice.activexLibreofficeInts.`5`
  - typings.activexLibreoffice.activexLibreofficeInts.`3`
  - typings.activexLibreoffice.activexLibreofficeInts.`1`
  - typings.activexLibreoffice.activexLibreofficeInts.`4`
  - typings.activexLibreoffice.activexLibreofficeInts.`2`
  - typings.activexLibreoffice.activexLibreofficeInts.`0`
*/
trait ContentCreationError extends StObject
object ContentCreationError {
  
  /** Provider was unable to create the content instance. */
  inline def CONTENT_CREATION_FAILED: `5` = 5.asInstanceOf[`5`]
  
  /** Creation of content identifier failed. */
  inline def IDENTIFIER_CREATION_FAILED: `3` = 3.asInstanceOf[`3`]
  
  /** @deprecated Deprecated */
  inline def NO_CONTENT_BROKER: `1` = 1.asInstanceOf[`1`]
  
  /** No {@link Content} Provider for given content identifier available. */
  inline def NO_CONTENT_PROVIDER: `4` = 4.asInstanceOf[`4`]
  
  /** @deprecated Deprecated */
  inline def NO_IDENTIFIER_FACTORY: `2` = 2.asInstanceOf[`2`]
  
  /**
    * Unknown.
    *
    * An unknown I/O error has occurred.
    */
  inline def UNKNOWN: `0` = 0.asInstanceOf[`0`]
}
