package typings.activexLibreoffice.com_.sun.star.reflection

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.TypeClass
import typings.activexLibreoffice.com_.sun.star.uno.Uik
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Reflects an interface type, supporting multiple inheritance.
  *
  * This type supersedes {@link XInterfaceTypeDescription} , which only supported single inheritance.
  * @since OOo 2.0
  */
trait XInterfaceTypeDescription2
  extends StObject
     with XInterfaceTypeDescription {
  
  /**
    * Returns a sequence of all directly inherited (mandatory) base interface types.
    * @returns a sequence of all directly inherited (mandatory) base interface types, in the correct order; each element of the returned sequence will be the re
    */
  val BaseTypes: SafeArray[XTypeDescription]
  
  /**
    * Returns a sequence of all directly inherited optional base interface types.
    * @returns a sequence of all directly inherited optional base interface types, in the correct order; each element of the returned sequence will be the refle
    */
  val OptionalBaseTypes: SafeArray[XTypeDescription]
  
  /**
    * Returns a sequence of all directly inherited (mandatory) base interface types.
    * @returns a sequence of all directly inherited (mandatory) base interface types, in the correct order; each element of the returned sequence will be the re
    */
  def getBaseTypes(): SafeArray[XTypeDescription]
  
  /**
    * Returns a sequence of all directly inherited optional base interface types.
    * @returns a sequence of all directly inherited optional base interface types, in the correct order; each element of the returned sequence will be the refle
    */
  def getOptionalBaseTypes(): SafeArray[XTypeDescription]
}
object XInterfaceTypeDescription2 {
  
  inline def apply(
    BaseType: XTypeDescription,
    BaseTypes: SafeArray[XTypeDescription],
    Members: SafeArray[XInterfaceMemberTypeDescription],
    Name: String,
    OptionalBaseTypes: SafeArray[XTypeDescription],
    TypeClass: TypeClass,
    Uik: Uik,
    acquire: () => Unit,
    getBaseType: () => XTypeDescription,
    getBaseTypes: () => SafeArray[XTypeDescription],
    getMembers: () => SafeArray[XInterfaceMemberTypeDescription],
    getName: () => String,
    getOptionalBaseTypes: () => SafeArray[XTypeDescription],
    getTypeClass: () => TypeClass,
    getUik: () => Uik,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XInterfaceTypeDescription2 = {
    val __obj = js.Dynamic.literal(BaseType = BaseType.asInstanceOf[js.Any], BaseTypes = BaseTypes.asInstanceOf[js.Any], Members = Members.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], OptionalBaseTypes = OptionalBaseTypes.asInstanceOf[js.Any], TypeClass = TypeClass.asInstanceOf[js.Any], Uik = Uik.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getBaseType = js.Any.fromFunction0(getBaseType), getBaseTypes = js.Any.fromFunction0(getBaseTypes), getMembers = js.Any.fromFunction0(getMembers), getName = js.Any.fromFunction0(getName), getOptionalBaseTypes = js.Any.fromFunction0(getOptionalBaseTypes), getTypeClass = js.Any.fromFunction0(getTypeClass), getUik = js.Any.fromFunction0(getUik), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XInterfaceTypeDescription2]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XInterfaceTypeDescription2] (val x: Self) extends AnyVal {
    
    inline def setBaseTypes(value: SafeArray[XTypeDescription]): Self = StObject.set(x, "BaseTypes", value.asInstanceOf[js.Any])
    
    inline def setGetBaseTypes(value: () => SafeArray[XTypeDescription]): Self = StObject.set(x, "getBaseTypes", js.Any.fromFunction0(value))
    
    inline def setGetOptionalBaseTypes(value: () => SafeArray[XTypeDescription]): Self = StObject.set(x, "getOptionalBaseTypes", js.Any.fromFunction0(value))
    
    inline def setOptionalBaseTypes(value: SafeArray[XTypeDescription]): Self = StObject.set(x, "OptionalBaseTypes", value.asInstanceOf[js.Any])
  }
}
