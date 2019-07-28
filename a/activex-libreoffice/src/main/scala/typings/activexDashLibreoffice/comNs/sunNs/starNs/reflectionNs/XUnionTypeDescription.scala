package typings.activexDashLibreoffice.comNs.sunNs.starNs.reflectionNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.TypeClass
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Deprecated, UNOIDL does not have a union concept.
  * @deprecated Deprecated
  */
trait XUnionTypeDescription extends XTypeDescription {
  /**
    * Returns the default discriminant value.
    * @returns default discriminant value
    */
  val DefaultDiscriminant: js.Any
  /**
    * Returns the type of the default value.
    * @returns type of the default value
    */
  val DefaultMemberType: XTypeDescription
  /**
    * Returns the (ordinal) discriminant type.
    * @returns type of the discriminant
    */
  val DiscriminantType: XTypeDescription
  /**
    * Returns discriminants of all members in order of IDL declaration.
    * @returns discriminants of all members
    */
  val Discriminants: SafeArray[_]
  /**
    * Returns names of all members in order of IDL declaration.
    * @returns names of all members
    */
  val MemberNames: SafeArray[String]
  /**
    * Returns types of all members in order of IDL declaration.
    * @returns types of all members
    */
  val MemberTypes: SafeArray[XTypeDescription]
  /**
    * Returns the default discriminant value.
    * @returns default discriminant value
    */
  def getDefaultDiscriminant(): js.Any
  /**
    * Returns the type of the default value.
    * @returns type of the default value
    */
  def getDefaultMemberType(): XTypeDescription
  /**
    * Returns the (ordinal) discriminant type.
    * @returns type of the discriminant
    */
  def getDiscriminantType(): XTypeDescription
  /**
    * Returns discriminants of all members in order of IDL declaration.
    * @returns discriminants of all members
    */
  def getDiscriminants(): SafeArray[_]
  /**
    * Returns names of all members in order of IDL declaration.
    * @returns names of all members
    */
  def getMemberNames(): SafeArray[String]
  /**
    * Returns types of all members in order of IDL declaration.
    * @returns types of all members
    */
  def getMemberTypes(): SafeArray[XTypeDescription]
}

object XUnionTypeDescription {
  @scala.inline
  def apply(
    DefaultDiscriminant: js.Any,
    DefaultMemberType: XTypeDescription,
    DiscriminantType: XTypeDescription,
    Discriminants: SafeArray[_],
    MemberNames: SafeArray[String],
    MemberTypes: SafeArray[XTypeDescription],
    Name: String,
    TypeClass: TypeClass,
    acquire: () => Unit,
    getDefaultDiscriminant: () => js.Any,
    getDefaultMemberType: () => XTypeDescription,
    getDiscriminantType: () => XTypeDescription,
    getDiscriminants: () => SafeArray[_],
    getMemberNames: () => SafeArray[String],
    getMemberTypes: () => SafeArray[XTypeDescription],
    getName: () => String,
    getTypeClass: () => TypeClass,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XUnionTypeDescription = {
    val __obj = js.Dynamic.literal(DefaultDiscriminant = DefaultDiscriminant, DefaultMemberType = DefaultMemberType, DiscriminantType = DiscriminantType, Discriminants = Discriminants, MemberNames = MemberNames, MemberTypes = MemberTypes, Name = Name, TypeClass = TypeClass, acquire = js.Any.fromFunction0(acquire), getDefaultDiscriminant = js.Any.fromFunction0(getDefaultDiscriminant), getDefaultMemberType = js.Any.fromFunction0(getDefaultMemberType), getDiscriminantType = js.Any.fromFunction0(getDiscriminantType), getDiscriminants = js.Any.fromFunction0(getDiscriminants), getMemberNames = js.Any.fromFunction0(getMemberNames), getMemberTypes = js.Any.fromFunction0(getMemberTypes), getName = js.Any.fromFunction0(getName), getTypeClass = js.Any.fromFunction0(getTypeClass), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XUnionTypeDescription]
  }
}

