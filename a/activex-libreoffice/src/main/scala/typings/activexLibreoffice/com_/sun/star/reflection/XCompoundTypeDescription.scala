package typings.activexLibreoffice.com_.sun.star.reflection

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.TypeClass
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Reflects a compound type, i.e. a struct or exception.
  *
  * For struct types, this type is superseded by {@link XStructTypeDescription} , which supports polymorphic struct types.
  */
trait XCompoundTypeDescription
  extends StObject
     with XTypeDescription {
  
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
  
  inline def apply(
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
    val __obj = js.Dynamic.literal(BaseType = BaseType.asInstanceOf[js.Any], MemberNames = MemberNames.asInstanceOf[js.Any], MemberTypes = MemberTypes.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], TypeClass = TypeClass.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getBaseType = js.Any.fromFunction0(getBaseType), getMemberNames = js.Any.fromFunction0(getMemberNames), getMemberTypes = js.Any.fromFunction0(getMemberTypes), getName = js.Any.fromFunction0(getName), getTypeClass = js.Any.fromFunction0(getTypeClass), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XCompoundTypeDescription]
  }
  
  extension [Self <: XCompoundTypeDescription](x: Self) {
    
    inline def setBaseType(value: XTypeDescription): Self = StObject.set(x, "BaseType", value.asInstanceOf[js.Any])
    
    inline def setGetBaseType(value: () => XTypeDescription): Self = StObject.set(x, "getBaseType", js.Any.fromFunction0(value))
    
    inline def setGetMemberNames(value: () => SafeArray[String]): Self = StObject.set(x, "getMemberNames", js.Any.fromFunction0(value))
    
    inline def setGetMemberTypes(value: () => SafeArray[XTypeDescription]): Self = StObject.set(x, "getMemberTypes", js.Any.fromFunction0(value))
    
    inline def setMemberNames(value: SafeArray[String]): Self = StObject.set(x, "MemberNames", value.asInstanceOf[js.Any])
    
    inline def setMemberTypes(value: SafeArray[XTypeDescription]): Self = StObject.set(x, "MemberTypes", value.asInstanceOf[js.Any])
  }
}
