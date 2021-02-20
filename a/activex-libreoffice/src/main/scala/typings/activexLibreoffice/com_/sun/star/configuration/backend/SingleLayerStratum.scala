package typings.activexLibreoffice.com_.sun.star.configuration.backend

import typings.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to a single layer of configuration data */
@js.native
trait SingleLayerStratum
  extends XSingleLayerStratum
     with XBackendEntities
object SingleLayerStratum {
  
  @scala.inline
  def apply(
    AdminEntity: String,
    OwnerEntity: String,
    acquire: () => Unit,
    getAdminEntity: () => String,
    getLayer: (String, String) => XLayer,
    getOwnerEntity: () => String,
    getUpdatableLayer: String => XUpdatableLayer,
    isEqualEntity: (String, String) => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    supportsEntity: String => Boolean
  ): SingleLayerStratum = {
    val __obj = js.Dynamic.literal(AdminEntity = AdminEntity.asInstanceOf[js.Any], OwnerEntity = OwnerEntity.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getAdminEntity = js.Any.fromFunction0(getAdminEntity), getLayer = js.Any.fromFunction2(getLayer), getOwnerEntity = js.Any.fromFunction0(getOwnerEntity), getUpdatableLayer = js.Any.fromFunction1(getUpdatableLayer), isEqualEntity = js.Any.fromFunction2(isEqualEntity), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), supportsEntity = js.Any.fromFunction1(supportsEntity))
    __obj.asInstanceOf[SingleLayerStratum]
  }
}
