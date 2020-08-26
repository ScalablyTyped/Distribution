package typings.activexLibreoffice.com_.sun.star.reflection

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XEnumeration
import typings.activexLibreoffice.com_.sun.star.container.XHierarchicalNameAccess
import typings.activexLibreoffice.com_.sun.star.container.XSet
import typings.activexLibreoffice.com_.sun.star.lang.XComponent
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.uno.TypeClass
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
@js.native
trait TypeDescriptionManager
  extends XSet
     with XHierarchicalNameAccess
     with XComponent
     with XTypeDescriptionEnumerationAccess

object TypeDescriptionManager {
  @scala.inline
  def apply(
    ElementType: `type`,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    createEnumeration: () => XEnumeration,
    createTypeDescriptionEnumeration: (String, SeqEquiv[TypeClass], TypeDescriptionSearchDepth) => XTypeDescriptionEnumeration,
    dispose: () => Unit,
    getByHierarchicalName: String => js.Any,
    getElementType: () => `type`,
    has: js.Any => Boolean,
    hasByHierarchicalName: String => Boolean,
    hasElements: () => Boolean,
    insert: js.Any => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    remove: js.Any => Unit,
    removeEventListener: XEventListener => Unit
  ): TypeDescriptionManager = {
    val __obj = js.Dynamic.literal(ElementType = ElementType.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), createEnumeration = js.Any.fromFunction0(createEnumeration), createTypeDescriptionEnumeration = js.Any.fromFunction3(createTypeDescriptionEnumeration), dispose = js.Any.fromFunction0(dispose), getByHierarchicalName = js.Any.fromFunction1(getByHierarchicalName), getElementType = js.Any.fromFunction0(getElementType), has = js.Any.fromFunction1(has), hasByHierarchicalName = js.Any.fromFunction1(hasByHierarchicalName), hasElements = js.Any.fromFunction0(hasElements), insert = js.Any.fromFunction1(insert), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), remove = js.Any.fromFunction1(remove), removeEventListener = js.Any.fromFunction1(removeEventListener))
    __obj.asInstanceOf[TypeDescriptionManager]
  }
}

