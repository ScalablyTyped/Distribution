package typings.activexLibreoffice.com_.sun.star.reflection

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.TypeClass
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Deprecated, UNOIDL does not have a union concept.
  * @deprecated Deprecated
  */
trait XUnionTypeDescription
  extends StObject
     with XTypeDescription {
  
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
  val Discriminants: SafeArray[js.Any]
  
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
  def getDiscriminants(): SafeArray[js.Any]
  
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
    Discriminants: SafeArray[js.Any],
    MemberNames: SafeArray[String],
    MemberTypes: SafeArray[XTypeDescription],
    Name: String,
    TypeClass: TypeClass,
    acquire: () => Unit,
    getDefaultDiscriminant: () => js.Any,
    getDefaultMemberType: () => XTypeDescription,
    getDiscriminantType: () => XTypeDescription,
    getDiscriminants: () => SafeArray[js.Any],
    getMemberNames: () => SafeArray[String],
    getMemberTypes: () => SafeArray[XTypeDescription],
    getName: () => String,
    getTypeClass: () => TypeClass,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XUnionTypeDescription = {
    val __obj = js.Dynamic.literal(DefaultDiscriminant = DefaultDiscriminant.asInstanceOf[js.Any], DefaultMemberType = DefaultMemberType.asInstanceOf[js.Any], DiscriminantType = DiscriminantType.asInstanceOf[js.Any], Discriminants = Discriminants.asInstanceOf[js.Any], MemberNames = MemberNames.asInstanceOf[js.Any], MemberTypes = MemberTypes.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], TypeClass = TypeClass.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getDefaultDiscriminant = js.Any.fromFunction0(getDefaultDiscriminant), getDefaultMemberType = js.Any.fromFunction0(getDefaultMemberType), getDiscriminantType = js.Any.fromFunction0(getDiscriminantType), getDiscriminants = js.Any.fromFunction0(getDiscriminants), getMemberNames = js.Any.fromFunction0(getMemberNames), getMemberTypes = js.Any.fromFunction0(getMemberTypes), getName = js.Any.fromFunction0(getName), getTypeClass = js.Any.fromFunction0(getTypeClass), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XUnionTypeDescription]
  }
  
  @scala.inline
  implicit class XUnionTypeDescriptionMutableBuilder[Self <: XUnionTypeDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultDiscriminant(value: js.Any): Self = StObject.set(x, "DefaultDiscriminant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultMemberType(value: XTypeDescription): Self = StObject.set(x, "DefaultMemberType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscriminantType(value: XTypeDescription): Self = StObject.set(x, "DiscriminantType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscriminants(value: SafeArray[js.Any]): Self = StObject.set(x, "Discriminants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetDefaultDiscriminant(value: () => js.Any): Self = StObject.set(x, "getDefaultDiscriminant", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDefaultMemberType(value: () => XTypeDescription): Self = StObject.set(x, "getDefaultMemberType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDiscriminantType(value: () => XTypeDescription): Self = StObject.set(x, "getDiscriminantType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDiscriminants(value: () => SafeArray[js.Any]): Self = StObject.set(x, "getDiscriminants", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMemberNames(value: () => SafeArray[String]): Self = StObject.set(x, "getMemberNames", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMemberTypes(value: () => SafeArray[XTypeDescription]): Self = StObject.set(x, "getMemberTypes", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMemberNames(value: SafeArray[String]): Self = StObject.set(x, "MemberNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemberTypes(value: SafeArray[XTypeDescription]): Self = StObject.set(x, "MemberTypes", value.asInstanceOf[js.Any])
  }
}
