package typings.activexLibreoffice.com_.sun.star.reflection

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.TypeClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base interface for reflected interface members.
  * @see XInterfaceAttributeTypeDescription
  * @see XInterfaceMethodTypeDescription
  */
trait XInterfaceMemberTypeDescription
  extends StObject
     with XTypeDescription {
  
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
  
  inline def apply(
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
    val __obj = js.Dynamic.literal(MemberName = MemberName.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], TypeClass = TypeClass.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getMemberName = js.Any.fromFunction0(getMemberName), getName = js.Any.fromFunction0(getName), getPosition = js.Any.fromFunction0(getPosition), getTypeClass = js.Any.fromFunction0(getTypeClass), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XInterfaceMemberTypeDescription]
  }
  
  extension [Self <: XInterfaceMemberTypeDescription](x: Self) {
    
    inline def setGetMemberName(value: () => String): Self = StObject.set(x, "getMemberName", js.Any.fromFunction0(value))
    
    inline def setGetPosition(value: () => Double): Self = StObject.set(x, "getPosition", js.Any.fromFunction0(value))
    
    inline def setMemberName(value: String): Self = StObject.set(x, "MemberName", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Double): Self = StObject.set(x, "Position", value.asInstanceOf[js.Any])
  }
}
