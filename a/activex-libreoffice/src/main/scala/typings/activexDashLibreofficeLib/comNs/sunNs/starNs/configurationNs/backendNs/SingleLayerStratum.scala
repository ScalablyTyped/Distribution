package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to a single layer of configuration data */
trait SingleLayerStratum
  extends XSingleLayerStratum
     with XBackendEntities

object SingleLayerStratum {
  @scala.inline
  def apply(
    AdminEntity: java.lang.String,
    OwnerEntity: java.lang.String,
    acquire: () => scala.Unit,
    getAdminEntity: () => java.lang.String,
    getLayer: (java.lang.String, java.lang.String) => XLayer,
    getOwnerEntity: () => java.lang.String,
    getUpdatableLayer: java.lang.String => XUpdatableLayer,
    isEqualEntity: (java.lang.String, java.lang.String) => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    supportsEntity: java.lang.String => scala.Boolean
  ): SingleLayerStratum = {
    val __obj = js.Dynamic.literal(AdminEntity = AdminEntity, OwnerEntity = OwnerEntity, acquire = js.Any.fromFunction0(acquire), getAdminEntity = js.Any.fromFunction0(getAdminEntity), getLayer = js.Any.fromFunction2(getLayer), getOwnerEntity = js.Any.fromFunction0(getOwnerEntity), getUpdatableLayer = js.Any.fromFunction1(getUpdatableLayer), isEqualEntity = js.Any.fromFunction2(isEqualEntity), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), supportsEntity = js.Any.fromFunction1(supportsEntity))
  
    __obj.asInstanceOf[SingleLayerStratum]
  }
}

