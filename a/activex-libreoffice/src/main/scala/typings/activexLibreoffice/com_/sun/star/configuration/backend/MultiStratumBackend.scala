package typings.activexLibreoffice.com_.sun.star.configuration.backend

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.XInitialization
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * implements {@link Backend} provides access to a configuration database composed of one or more storage backends containing settings used by software
  * modules.
  */
trait MultiStratumBackend
  extends StObject
     with Backend
     with XInitialization
object MultiStratumBackend {
  
  inline def apply(
    AdminEntity: String,
    OwnerEntity: String,
    acquire: () => Unit,
    getAdminEntity: () => String,
    getComponentSchema: String => XSchema,
    getOwnUpdateHandler: String => XUpdateHandler,
    getOwnerEntity: () => String,
    getUpdateHandler: (String, String) => XUpdateHandler,
    initialize: SeqEquiv[Any] => Unit,
    isEqualEntity: (String, String) => Boolean,
    listLayers: (String, String) => SafeArray[XLayer],
    listOwnLayers: String => SafeArray[XLayer],
    queryInterface: `type` => Any,
    release: () => Unit,
    supportsEntity: String => Boolean
  ): MultiStratumBackend = {
    val __obj = js.Dynamic.literal(AdminEntity = AdminEntity.asInstanceOf[js.Any], OwnerEntity = OwnerEntity.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getAdminEntity = js.Any.fromFunction0(getAdminEntity), getComponentSchema = js.Any.fromFunction1(getComponentSchema), getOwnUpdateHandler = js.Any.fromFunction1(getOwnUpdateHandler), getOwnerEntity = js.Any.fromFunction0(getOwnerEntity), getUpdateHandler = js.Any.fromFunction2(getUpdateHandler), initialize = js.Any.fromFunction1(initialize), isEqualEntity = js.Any.fromFunction2(isEqualEntity), listLayers = js.Any.fromFunction2(listLayers), listOwnLayers = js.Any.fromFunction1(listOwnLayers), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), supportsEntity = js.Any.fromFunction1(supportsEntity))
    __obj.asInstanceOf[MultiStratumBackend]
  }
}
