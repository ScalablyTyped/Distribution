package typings.activexDashLibreoffice.comNs.sunNs.starNs.reflectionNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.TypeClass
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Reflects a compound type, i.e. a struct or exception.
  *
  * For struct types, this type is superseded by {@link XStructTypeDescription} , which supports polymorphic struct types.
  */
trait XCompoundTypeDescription extends XTypeDescription {
  /**
    * Returns the type of the base type of the compound type. If the compound does not have a base type, the method returns a null interface.
    * @returns base interface or null
    */
  val BaseType: XTypeDescription
  /**
    * Returns the member names of the struct/exception in IDL declaration order.
    * @returns members names of struct/exception
    */
  val MemberNames: SafeArray[String]
  /**
    * Returns the member types of the struct/exception in IDL declaration order.
    *
    * For a polymorphic struct type template, a member of parameterized type is represented by an instance of {@link
    * com.sun.star.reflection.XTypeDescription} whose type class is `UNKNOWN` and whose name is the name of the type parameter.
    * @returns members of struct/exception
    */
  val MemberTypes: SafeArray[XTypeDescription]
  /**
    * Returns the type of the base type of the compound type. If the compound does not have a base type, the method returns a null interface.
    * @returns base interface or null
    */
  def getBaseType(): XTypeDescription
  /**
    * Returns the member names of the struct/exception in IDL declaration order.
    * @returns members names of struct/exception
    */
  def getMemberNames(): SafeArray[String]
  /**
    * Returns the member types of the struct/exception in IDL declaration order.
    *
    * For a polymorphic struct type template, a member of parameterized type is represented by an instance of {@link
    * com.sun.star.reflection.XTypeDescription} whose type class is `UNKNOWN` and whose name is the name of the type parameter.
    * @returns members of struct/exception
    */
  def getMemberTypes(): SafeArray[XTypeDescription]
}

object XCompoundTypeDescription {
  @scala.inline
  def apply(
    BaseType: XTypeDescription,
    MemberNames: SafeArray[String],
    MemberTypes: SafeArray[XTypeDescription],
    Name: String,
    TypeClass: TypeClass,
    acquire: () => Unit,
    getBaseType: () => XTypeDescription,
    getMemberNames: () => SafeArray[String],
    getMemberTypes: () => SafeArray[XTypeDescription],
    getName: () => String,
    getTypeClass: () => TypeClass,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XCompoundTypeDescription = {
    val __obj = js.Dynamic.literal(BaseType = BaseType, MemberNames = MemberNames, MemberTypes = MemberTypes, Name = Name, TypeClass = TypeClass, acquire = js.Any.fromFunction0(acquire), getBaseType = js.Any.fromFunction0(getBaseType), getMemberNames = js.Any.fromFunction0(getMemberNames), getMemberTypes = js.Any.fromFunction0(getMemberTypes), getName = js.Any.fromFunction0(getName), getTypeClass = js.Any.fromFunction0(getTypeClass), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XCompoundTypeDescription]
  }
}

