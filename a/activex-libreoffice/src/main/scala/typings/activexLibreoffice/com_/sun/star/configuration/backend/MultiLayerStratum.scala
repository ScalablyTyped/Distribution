package typings.activexLibreoffice.com_.sun.star.configuration.backend

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to a singe layer of configuration data */
@js.native
trait MultiLayerStratum
  extends XMultiLayerStratum
     with XBackendEntities
object MultiLayerStratum {
  
  @scala.inline
  def apply(
    AdminEntity: String,
    OwnerEntity: String,
    acquire: () => Unit,
    getAdminEntity: () => String,
    getLayer: (String, String) => XLayer,
    getLayers: (SeqEquiv[String], String) => SafeArray[XLayer],
    getMultipleLayers: (SeqEquiv[String], SeqEquiv[String]) => SafeArray[XLayer],
    getOwnerEntity: () => String,
    getUpdatableLayer: String => XUpdatableLayer,
    getUpdateLayerId: (String, String) => String,
    isEqualEntity: (String, String) => Boolean,
    listLayerIds: (String, String) => SafeArray[String],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    supportsEntity: String => Boolean
  ): MultiLayerStratum = {
    val __obj = js.Dynamic.literal(AdminEntity = AdminEntity.asInstanceOf[js.Any], OwnerEntity = OwnerEntity.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getAdminEntity = js.Any.fromFunction0(getAdminEntity), getLayer = js.Any.fromFunction2(getLayer), getLayers = js.Any.fromFunction2(getLayers), getMultipleLayers = js.Any.fromFunction2(getMultipleLayers), getOwnerEntity = js.Any.fromFunction0(getOwnerEntity), getUpdatableLayer = js.Any.fromFunction1(getUpdatableLayer), getUpdateLayerId = js.Any.fromFunction2(getUpdateLayerId), isEqualEntity = js.Any.fromFunction2(isEqualEntity), listLayerIds = js.Any.fromFunction2(listLayerIds), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), supportsEntity = js.Any.fromFunction1(supportsEntity))
    __obj.asInstanceOf[MultiLayerStratum]
  }
}
