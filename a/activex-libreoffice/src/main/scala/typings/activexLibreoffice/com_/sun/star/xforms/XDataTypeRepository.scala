package typings.activexLibreoffice.com_.sun.star.xforms

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XEnumeration
import typings.activexLibreoffice.com_.sun.star.container.XEnumerationAccess
import typings.activexLibreoffice.com_.sun.star.container.XNameAccess
import typings.activexLibreoffice.com_.sun.star.xsd.XDataType
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies a repository of XSD data types
  *
  * The elements of the repository are instances supporting the {@link com.sun.star.xsd.XDataType} interface.
  */
@js.native
trait XDataTypeRepository
  extends XEnumerationAccess
     with XNameAccess {
  /**
    * creates a clone of the given data type, and inserts it into the repository
    * @throws com::sun::star::container::NoSuchElementException if the given name does not refer to a type in the repository
    * @throws com::sun::star::container::ElementExistException if the new name is already used in the repository
    */
  def cloneDataType(sourceName: String, newName: String): XDataType = js.native
  /**
    * retrieves the basic type for the given type class
    * @see com.sun.star.xsd.DataTypeClass
    * @throws com::sun::star::container::NoSuchElementException if in the repository, there is no data type with the given class
    */
  def getBasicDataType(dataTypeClass: Double): XDataType = js.native
  def getDataType(typeName: String): XDataType = js.native
  /**
    * removes a data type given by name from the repository
    * @see com.sun.star.xsd.XDataType
    * @throws com::sun::star::container::NoSuchElementException if the given name does not refer to a type in the repository
    * @throws com::sun::star::util::VetoException if the specified data type is a built-in (basic) data type, and cannot be removed
    */
  def revokeDataType(typeName: String): Unit = js.native
}

object XDataTypeRepository {
  @scala.inline
  def apply(
    ElementNames: SafeArray[String],
    ElementType: `type`,
    acquire: () => Unit,
    cloneDataType: (String, String) => XDataType,
    createEnumeration: () => XEnumeration,
    getBasicDataType: Double => XDataType,
    getByName: String => js.Any,
    getDataType: String => XDataType,
    getElementNames: () => SafeArray[String],
    getElementType: () => `type`,
    hasByName: String => Boolean,
    hasElements: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    revokeDataType: String => Unit
  ): XDataTypeRepository = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), cloneDataType = js.Any.fromFunction2(cloneDataType), createEnumeration = js.Any.fromFunction0(createEnumeration), getBasicDataType = js.Any.fromFunction1(getBasicDataType), getByName = js.Any.fromFunction1(getByName), getDataType = js.Any.fromFunction1(getDataType), getElementNames = js.Any.fromFunction0(getElementNames), getElementType = js.Any.fromFunction0(getElementType), hasByName = js.Any.fromFunction1(hasByName), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), revokeDataType = js.Any.fromFunction1(revokeDataType))
    __obj.asInstanceOf[XDataTypeRepository]
  }
  @scala.inline
  implicit class XDataTypeRepositoryOps[Self <: XDataTypeRepository] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCloneDataType(value: (String, String) => XDataType): Self = this.set("cloneDataType", js.Any.fromFunction2(value))
    @scala.inline
    def setGetBasicDataType(value: Double => XDataType): Self = this.set("getBasicDataType", js.Any.fromFunction1(value))
    @scala.inline
    def setGetDataType(value: String => XDataType): Self = this.set("getDataType", js.Any.fromFunction1(value))
    @scala.inline
    def setRevokeDataType(value: String => Unit): Self = this.set("revokeDataType", js.Any.fromFunction1(value))
  }
  
}

