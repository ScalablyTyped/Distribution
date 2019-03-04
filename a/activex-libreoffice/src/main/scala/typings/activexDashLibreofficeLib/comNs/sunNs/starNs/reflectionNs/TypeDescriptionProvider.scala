package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.reflectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This service provides type descriptions, i.e. concrete service implementations read from source like the persistent registry database format. ;
  *
  * This old-style service definition mostly serves documentation purposes. It is not intended that an implementation of this service can be obtained at
  * the global service manager using this service identifier.
  * @see com.sun.star.reflection.TypeDescriptionManager
  * @see com.sun.star.reflection.XTypeDescription
  */
trait TypeDescriptionProvider
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XHierarchicalNameAccess
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent
     with XTypeDescriptionEnumerationAccess

object TypeDescriptionProvider {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    createTypeDescriptionEnumeration: js.Function3[
      java.lang.String, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass], 
      TypeDescriptionSearchDepth, 
      XTypeDescriptionEnumeration
    ],
    dispose: js.Function0[scala.Unit],
    getByHierarchicalName: js.Function1[java.lang.String, js.Any],
    hasByHierarchicalName: js.Function1[java.lang.String, scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit]
  ): TypeDescriptionProvider = {
    val __obj = js.Dynamic.literal(acquire = acquire, addEventListener = addEventListener, createTypeDescriptionEnumeration = createTypeDescriptionEnumeration, dispose = dispose, getByHierarchicalName = getByHierarchicalName, hasByHierarchicalName = hasByHierarchicalName, queryInterface = queryInterface, release = release, removeEventListener = removeEventListener)
  
    __obj.asInstanceOf[TypeDescriptionProvider]
  }
}

