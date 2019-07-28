package typings.activexDashLibreoffice.comNs.sunNs.starNs.reflectionNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.TypeClass
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
  val MemberName: String
  /**
    * Returns the position the member including all inherited members of base interfaces.
    * @returns position of member
    */
  val Position: Double
  /**
    * Returns name of member
    * @returns member name
    */
  def getMemberName(): String
  /**
    * Returns the position the member including all inherited members of base interfaces.
    * @returns position of member
    */
  def getPosition(): Double
}

object XInterfaceMemberTypeDescription {
  @scala.inline
  def apply(
    MemberName: String,
    Name: String,
    Position: Double,
    TypeClass: TypeClass,
    acquire: () => Unit,
    getMemberName: () => String,
    getName: () => String,
    getPosition: () => Double,
    getTypeClass: () => TypeClass,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XInterfaceMemberTypeDescription = {
    val __obj = js.Dynamic.literal(MemberName = MemberName, Name = Name, Position = Position, TypeClass = TypeClass, acquire = js.Any.fromFunction0(acquire), getMemberName = js.Any.fromFunction0(getMemberName), getName = js.Any.fromFunction0(getName), getPosition = js.Any.fromFunction0(getPosition), getTypeClass = js.Any.fromFunction0(getTypeClass), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XInterfaceMemberTypeDescription]
  }
}

