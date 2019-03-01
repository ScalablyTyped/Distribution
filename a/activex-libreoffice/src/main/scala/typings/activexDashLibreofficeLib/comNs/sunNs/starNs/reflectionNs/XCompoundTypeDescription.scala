package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.reflectionNs

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
  val MemberNames: activexDashInteropLib.SafeArray[java.lang.String]
  /**
    * Returns the member types of the struct/exception in IDL declaration order.
    *
    * For a polymorphic struct type template, a member of parameterized type is represented by an instance of {@link
    * com.sun.star.reflection.XTypeDescription} whose type class is `UNKNOWN` and whose name is the name of the type parameter.
    * @returns members of struct/exception
    */
  val MemberTypes: activexDashInteropLib.SafeArray[XTypeDescription]
  /**
    * Returns the type of the base type of the compound type. If the compound does not have a base type, the method returns a null interface.
    * @returns base interface or null
    */
  def getBaseType(): XTypeDescription
  /**
    * Returns the member names of the struct/exception in IDL declaration order.
    * @returns members names of struct/exception
    */
  def getMemberNames(): activexDashInteropLib.SafeArray[java.lang.String]
  /**
    * Returns the member types of the struct/exception in IDL declaration order.
    *
    * For a polymorphic struct type template, a member of parameterized type is represented by an instance of {@link
    * com.sun.star.reflection.XTypeDescription} whose type class is `UNKNOWN` and whose name is the name of the type parameter.
    * @returns members of struct/exception
    */
  def getMemberTypes(): activexDashInteropLib.SafeArray[XTypeDescription]
}

object XCompoundTypeDescription {
  @scala.inline
  def apply(
    BaseType: XTypeDescription,
    MemberNames: activexDashInteropLib.SafeArray[java.lang.String],
    MemberTypes: activexDashInteropLib.SafeArray[XTypeDescription],
    Name: java.lang.String,
    TypeClass: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass,
    acquire: js.Function0[scala.Unit],
    getBaseType: js.Function0[XTypeDescription],
    getMemberNames: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    getMemberTypes: js.Function0[activexDashInteropLib.SafeArray[XTypeDescription]],
    getName: js.Function0[java.lang.String],
    getTypeClass: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XCompoundTypeDescription = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("BaseType")(BaseType)
    __obj.updateDynamic("MemberNames")(MemberNames)
    __obj.updateDynamic("MemberTypes")(MemberTypes)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("TypeClass")(TypeClass)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getBaseType")(getBaseType)
    __obj.updateDynamic("getMemberNames")(getMemberNames)
    __obj.updateDynamic("getMemberTypes")(getMemberTypes)
    __obj.updateDynamic("getName")(getName)
    __obj.updateDynamic("getTypeClass")(getTypeClass)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XCompoundTypeDescription]
  }
}

