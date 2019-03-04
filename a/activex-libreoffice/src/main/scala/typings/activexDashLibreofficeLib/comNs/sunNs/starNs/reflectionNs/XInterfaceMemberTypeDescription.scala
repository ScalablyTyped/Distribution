package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.reflectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Base interface for reflected interface members.
  * @see XInterfaceAttributeTypeDescription
  * @see XInterfaceMethodTypeDescription
  */
trait XInterfaceMemberTypeDescription extends XTypeDescription {
  /**
    * Returns name of member
    * @returns member name
    */
  val MemberName: java.lang.String
  /**
    * Returns the position the member including all inherited members of base interfaces.
    * @returns position of member
    */
  val Position: scala.Double
  /**
    * Returns name of member
    * @returns member name
    */
  def getMemberName(): java.lang.String
  /**
    * Returns the position the member including all inherited members of base interfaces.
    * @returns position of member
    */
  def getPosition(): scala.Double
}

object XInterfaceMemberTypeDescription {
  @scala.inline
  def apply(
    MemberName: java.lang.String,
    Name: java.lang.String,
    Position: scala.Double,
    TypeClass: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass,
    acquire: js.Function0[scala.Unit],
    getMemberName: js.Function0[java.lang.String],
    getName: js.Function0[java.lang.String],
    getPosition: js.Function0[scala.Double],
    getTypeClass: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XInterfaceMemberTypeDescription = {
    val __obj = js.Dynamic.literal(MemberName = MemberName, Name = Name, Position = Position, TypeClass = TypeClass, acquire = acquire, getMemberName = getMemberName, getName = getName, getPosition = getPosition, getTypeClass = getTypeClass, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XInterfaceMemberTypeDescription]
  }
}

