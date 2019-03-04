package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.reflectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This service manages type descriptions and acts as a central access point to every type description. It delegates calls for demanded types to
  * subsequent com::sun::star::reflection::TypeDescriptionProviders and may cache type descriptions. ;  Using cppuhelper's bootstrapping routines
  * bootstrapping an initial component context, there is a singleton accessible via key "/singletons/com.sun.star.reflection.theTypeDescriptionManager".
  * This singleton object is hooked into the C UNO runtime typelib and lives until the context is shut down. ;
  * @see com.sun.star.reflection.TypeDescriptionProvider
  * @see com.sun.star.reflection.XTypeDescription
  */
trait TypeDescriptionManager
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XSet
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XHierarchicalNameAccess
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent
     with XTypeDescriptionEnumerationAccess

object TypeDescriptionManager {
  @scala.inline
  def apply(
    ElementType: activexDashLibreofficeLib.`type`,
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    createEnumeration: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumeration],
    createTypeDescriptionEnumeration: js.Function3[
      java.lang.String, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass], 
      TypeDescriptionSearchDepth, 
      XTypeDescriptionEnumeration
    ],
    dispose: js.Function0[scala.Unit],
    getByHierarchicalName: js.Function1[java.lang.String, js.Any],
    getElementType: js.Function0[activexDashLibreofficeLib.`type`],
    has: js.Function1[js.Any, scala.Boolean],
    hasByHierarchicalName: js.Function1[java.lang.String, scala.Boolean],
    hasElements: js.Function0[scala.Boolean],
    insert: js.Function1[js.Any, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    remove: js.Function1[js.Any, scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit]
  ): TypeDescriptionManager = {
    val __obj = js.Dynamic.literal(ElementType = ElementType, acquire = acquire, addEventListener = addEventListener, createEnumeration = createEnumeration, createTypeDescriptionEnumeration = createTypeDescriptionEnumeration, dispose = dispose, getByHierarchicalName = getByHierarchicalName, getElementType = getElementType, has = has, hasByHierarchicalName = hasByHierarchicalName, hasElements = hasElements, insert = insert, queryInterface = queryInterface, release = release, remove = remove, removeEventListener = removeEventListener)
  
    __obj.asInstanceOf[TypeDescriptionManager]
  }
}

