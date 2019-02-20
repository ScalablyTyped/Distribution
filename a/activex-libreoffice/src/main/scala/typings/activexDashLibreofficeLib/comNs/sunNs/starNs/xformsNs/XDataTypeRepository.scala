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

