package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.activexLibreofficeInts.`0`
import typings.activexLibreoffice.activexLibreofficeInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * These are the possible values for the property "DocumentStoreMode".
  * @see XCommandProcessor
  * @see Content
  */
/* Rewritten from type alias, can be one of: 
  - typings.activexLibreoffice.activexLibreofficeInts.`1`
  - typings.activexLibreoffice.activexLibreofficeInts.`0`
*/
trait DocumentStoreMode extends StObject
object DocumentStoreMode {
  
  /** Document contents are stored locally. */
  inline def LOCAL: `1` = 1.asInstanceOf[`1`]
  
  /** Document contents are not stored locally. */
  inline def REMOTE: `0` = 0.asInstanceOf[`0`]
}
