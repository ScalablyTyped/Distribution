package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.activexLibreofficeInts.`0`
import typings.activexLibreoffice.activexLibreofficeInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An indication used in a {@link com.sun.star.ucb.RemoteContentProviderChangeEvent} to specify whether a remote content provider has been added to or
  * removed from an {@link com.sun.star.ucb.XRemoteContentProviderSupplier} .
  * @author Stephan Bergmann
  * @version 1.0
  */
/* Rewritten from type alias, can be one of: 
  - typings.activexLibreoffice.activexLibreofficeInts.`0`
  - typings.activexLibreoffice.activexLibreofficeInts.`1`
*/
trait RemoteContentProviderChangeAction extends StObject
object RemoteContentProviderChangeAction {
  
  /** The indicator that a remote content provider has been added. */
  inline def ADDED: `0` = 0.asInstanceOf[`0`]
  
  /** The indicator that a remote content provider has been removed. */
  inline def REMOVED: `1` = 1.asInstanceOf[`1`]
}
