package typings.activexLibreoffice.com_.sun.star.reflection

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.TypeClass
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Reflects a compound type, i.e. a struct or exception.
  *
  * For struct types, this type is superseded by {@link XStructTypeDescription} , which supports polymorphic struct types.
  */
@js.native
trait XCompoundTypeDescription extends XTypeDescription {
  
  /**
    * Returns the type of the base type of the compound type. If the compound does not have a base type, the method returns a null interface.
    * @returns base interface or null
    */
  val BaseType: XTypeDescription = js.native
  
  /**
    * Returns the member names of the struct/exception in IDL declaration order.
    * @returns members names of struct/exception
    */
  val MemberNames: SafeArray[String] = js.native
  
  /**
    * Returns the member types of the struct/exception in IDL declaration order.
    *
    * For a polymorphic struct type template, a member of parameterized type is represented by an instance of {@link
    * com.sun.star.reflection.XTypeDescription} whose type class is `UNKNOWN` and whose name is the name of the type parameter.
    * @returns members of struct/exception
    */
  val MemberTypes: SafeArray[XTypeDescription] = js.native
  
  /**
    * Returns the type of the base type of the compound type. If the compound does not have a base type, the method returns a null interface.
    * @returns base interface or null
    */
  def getBaseType(): XTypeDescription = js.native
  
  /**
    * Returns the member names of the struct/exception in IDL declaration order.
    * @returns members names of struct/exception
    */
  def getMemberNames(): SafeArray[String] = js.native
  
  /**
    * Returns the member types of the struct/exception in IDL declaration order.
    *
    * For a polymorphic struct type template, a member of parameterized type is represented by an instance of {@link
    * com.sun.star.reflection.XTypeDescription} whose type class is `UNKNOWN` and whose name is the name of the type parameter.
    * @returns members of struct/exception
    */
  def getMemberTypes(): SafeArray[XTypeDescription] = js.native
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
    val __obj = js.Dynamic.literal(BaseType = BaseType.asInstanceOf[js.Any], MemberNames = MemberNames.asInstanceOf[js.Any], MemberTypes = MemberTypes.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], TypeClass = TypeClass.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getBaseType = js.Any.fromFunction0(getBaseType), getMemberNames = js.Any.fromFunction0(getMemberNames), getMemberTypes = js.Any.fromFunction0(getMemberTypes), getName = js.Any.fromFunction0(getName), getTypeClass = js.Any.fromFunction0(getTypeClass), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XCompoundTypeDescription]
  }
  
  @scala.inline
  implicit class XCompoundTypeDescriptionOps[Self <: XCompoundTypeDescription] (val x: Self) extends AnyVal {
    
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
    def setBaseType(value: XTypeDescription): Self = this.set("BaseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemberNames(value: SafeArray[String]): Self = this.set("MemberNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemberTypes(value: SafeArray[XTypeDescription]): Self = this.set("MemberTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetBaseType(value: () => XTypeDescription): Self = this.set("getBaseType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMemberNames(value: () => SafeArray[String]): Self = this.set("getMemberNames", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMemberTypes(value: () => SafeArray[XTypeDescription]): Self = this.set("getMemberTypes", js.Any.fromFunction0(value))
  }
}
