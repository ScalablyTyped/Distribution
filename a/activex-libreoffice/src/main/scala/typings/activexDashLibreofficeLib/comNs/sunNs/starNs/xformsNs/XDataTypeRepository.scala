package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xformsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies a repository of XSD data types
  *
  * The elements of the repository are instances supporting the {@link com.sun.star.xsd.XDataType} interface.
  */
trait XDataTypeRepository
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumerationAccess
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess {
  /**
    * creates a clone of the given data type, and inserts it into the repository
    * @throws com::sun::star::container::NoSuchElementException if the given name does not refer to a type in the repository
    * @throws com::sun::star::container::ElementExistException if the new name is already used in the repository
    */
  def cloneDataType(sourceName: java.lang.String, newName: java.lang.String): activexDashLibreofficeLib.comNs.sunNs.starNs.xsdNs.XDataType
  /**
    * retrieves the basic type for the given type class
    * @see com.sun.star.xsd.DataTypeClass
    * @throws com::sun::star::container::NoSuchElementException if in the repository, there is no data type with the given class
    */
  def getBasicDataType(dataTypeClass: scala.Double): activexDashLibreofficeLib.comNs.sunNs.starNs.xsdNs.XDataType
  def getDataType(typeName: java.lang.String): activexDashLibreofficeLib.comNs.sunNs.starNs.xsdNs.XDataType
  /**
    * removes a data type given by name from the repository
    * @see com.sun.star.xsd.XDataType
    * @throws com::sun::star::container::NoSuchElementException if the given name does not refer to a type in the repository
    * @throws com::sun::star::util::VetoException if the specified data type is a built-in (basic) data type, and cannot be removed
    */
  def revokeDataType(typeName: java.lang.String): scala.Unit
}

object XDataTypeRepository {
  @scala.inline
  def apply(
    ElementNames: stdLib.SafeArray[java.lang.String],
    ElementType: activexDashLibreofficeLib.`type`,
    acquire: () => scala.Unit,
    cloneDataType: (java.lang.String, java.lang.String) => activexDashLibreofficeLib.comNs.sunNs.starNs.xsdNs.XDataType,
    createEnumeration: () => activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumeration,
    getBasicDataType: scala.Double => activexDashLibreofficeLib.comNs.sunNs.starNs.xsdNs.XDataType,
    getByName: java.lang.String => js.Any,
    getDataType: java.lang.String => activexDashLibreofficeLib.comNs.sunNs.starNs.xsdNs.XDataType,
    getElementNames: () => stdLib.SafeArray[java.lang.String],
    getElementType: () => activexDashLibreofficeLib.`type`,
    hasByName: java.lang.String => scala.Boolean,
    hasElements: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    revokeDataType: java.lang.String => scala.Unit
  ): XDataTypeRepository = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames, ElementType = ElementType, acquire = js.Any.fromFunction0(acquire), cloneDataType = js.Any.fromFunction2(cloneDataType), createEnumeration = js.Any.fromFunction0(createEnumeration), getBasicDataType = js.Any.fromFunction1(getBasicDataType), getByName = js.Any.fromFunction1(getByName), getDataType = js.Any.fromFunction1(getDataType), getElementNames = js.Any.fromFunction0(getElementNames), getElementType = js.Any.fromFunction0(getElementType), hasByName = js.Any.fromFunction1(hasByName), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), revokeDataType = js.Any.fromFunction1(revokeDataType))
  
    __obj.asInstanceOf[XDataTypeRepository]
  }
}

