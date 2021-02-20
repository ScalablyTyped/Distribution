package typings.activexLibreoffice.com_.sun.star.configuration.backend

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.XInitialization
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides access to a configuration data composed of one or more platform backends containing settings used by software modules. */
@js.native
trait SystemIntegration
  extends XBackend
     with XInitialization
object SystemIntegration {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    getOwnUpdateHandler: String => XUpdateHandler,
    getUpdateHandler: (String, String) => XUpdateHandler,
    initialize: SeqEquiv[_] => Unit,
    listLayers: (String, String) => SafeArray[XLayer],
    listOwnLayers: String => SafeArray[XLayer],
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): SystemIntegration = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getOwnUpdateHandler = js.Any.fromFunction1(getOwnUpdateHandler), getUpdateHandler = js.Any.fromFunction2(getUpdateHandler), initialize = js.Any.fromFunction1(initialize), listLayers = js.Any.fromFunction2(listLayers), listOwnLayers = js.Any.fromFunction1(listOwnLayers), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[SystemIntegration]
  }
}
