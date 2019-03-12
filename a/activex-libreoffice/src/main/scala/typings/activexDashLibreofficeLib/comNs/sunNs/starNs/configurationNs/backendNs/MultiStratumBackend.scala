package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * implements {@link Backend} provides access to a configuration database composed of one or more storage backends containing settings used by software
  * modules.
  */
trait MultiStratumBackend
  extends Backend
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XInitialization

object MultiStratumBackend {
  @scala.inline
  def apply(
    AdminEntity: java.lang.String,
    OwnerEntity: java.lang.String,
    acquire: () => scala.Unit,
    getAdminEntity: () => java.lang.String,
    getComponentSchema: java.lang.String => XSchema,
    getOwnUpdateHandler: java.lang.String => XUpdateHandler,
    getOwnerEntity: () => java.lang.String,
    getUpdateHandler: (java.lang.String, java.lang.String) => XUpdateHandler,
    initialize: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_] => scala.Unit,
    isEqualEntity: (java.lang.String, java.lang.String) => scala.Boolean,
    listLayers: (java.lang.String, java.lang.String) => stdLib.SafeArray[XLayer],
    listOwnLayers: java.lang.String => stdLib.SafeArray[XLayer],
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    supportsEntity: java.lang.String => scala.Boolean
  ): MultiStratumBackend = {
    val __obj = js.Dynamic.literal(AdminEntity = AdminEntity, OwnerEntity = OwnerEntity, acquire = js.Any.fromFunction0(acquire), getAdminEntity = js.Any.fromFunction0(getAdminEntity), getComponentSchema = js.Any.fromFunction1(getComponentSchema), getOwnUpdateHandler = js.Any.fromFunction1(getOwnUpdateHandler), getOwnerEntity = js.Any.fromFunction0(getOwnerEntity), getUpdateHandler = js.Any.fromFunction2(getUpdateHandler), initialize = js.Any.fromFunction1(initialize), isEqualEntity = js.Any.fromFunction2(isEqualEntity), listLayers = js.Any.fromFunction2(listLayers), listOwnLayers = js.Any.fromFunction1(listOwnLayers), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), supportsEntity = js.Any.fromFunction1(supportsEntity))
  
    __obj.asInstanceOf[MultiStratumBackend]
  }
}

