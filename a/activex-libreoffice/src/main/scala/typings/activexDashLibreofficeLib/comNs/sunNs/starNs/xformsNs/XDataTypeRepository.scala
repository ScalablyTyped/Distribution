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
    ElementNames: activexDashInteropLib.SafeArray[java.lang.String],
    ElementType: activexDashLibreofficeLib.`type`,
    acquire: js.Function0[scala.Unit],
    cloneDataType: js.Function2[
      java.lang.String, 
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.xsdNs.XDataType
    ],
    createEnumeration: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumeration],
    getBasicDataType: js.Function1[scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.xsdNs.XDataType],
    getByName: js.Function1[java.lang.String, js.Any],
    getDataType: js.Function1[java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.xsdNs.XDataType],
    getElementNames: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    getElementType: js.Function0[activexDashLibreofficeLib.`type`],
    hasByName: js.Function1[java.lang.String, scala.Boolean],
    hasElements: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    revokeDataType: js.Function1[java.lang.String, scala.Unit]
  ): XDataTypeRepository = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames, ElementType = ElementType, acquire = acquire, cloneDataType = cloneDataType, createEnumeration = createEnumeration, getBasicDataType = getBasicDataType, getByName = getByName, getDataType = getDataType, getElementNames = getElementNames, getElementType = getElementType, hasByName = hasByName, hasElements = hasElements, queryInterface = queryInterface, release = release, revokeDataType = revokeDataType)
  
    __obj.asInstanceOf[XDataTypeRepository]
  }
}

