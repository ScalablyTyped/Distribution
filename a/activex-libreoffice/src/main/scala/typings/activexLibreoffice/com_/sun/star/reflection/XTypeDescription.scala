package typings.activexLibreoffice.com_.sun.star.reflection

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.TypeClass
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Reflects a UNOIDL entity.
  * @see XPublished
  * @see XIndirectTypeDescription
  * @see XEnumTypeDescription
  * @see XStructTypeDescription
  * @see XCompoundTypeDescription
  * @see XInterfaceTypeDescription2
  * @see XInterfaceAttributeTypeDescription2
  * @see XInterfaceMethodTypeDescription
  * @see XConstantTypeDescription
  * @see XConstantsTypeDescription
  * @see XServiceTypeDescription2
  * @see XPropertyTypeDescription2
  * @see XSingletonTypeDescription2
  */
trait XTypeDescription
  extends StObject
     with XInterface {
  
  /**
    * Returns the fully qualified name of the UNOIDL entity.
    * @returns fully qualified name of the entity
    */
  val Name: String
  
  /**
    * Returns the type class of the reflected UNOIDL entity.
    * @returns type class of the entity
    */
  val TypeClass: typings.activexLibreoffice.com_.sun.star.uno.TypeClass
  
  /**
    * Returns the fully qualified name of the UNOIDL entity.
    * @returns fully qualified name of the entity
    */
  def getName(): String
  
  /**
    * Returns the type class of the reflected UNOIDL entity.
    * @returns type class of the entity
    */
  def getTypeClass(): typings.activexLibreoffice.com_.sun.star.uno.TypeClass
}
object XTypeDescription {
  
  inline def apply(
    Name: String,
    TypeClass: TypeClass,
    acquire: () => Unit,
    getName: () => String,
    getTypeClass: () => TypeClass,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XTypeDescription = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], TypeClass = TypeClass.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getName = js.Any.fromFunction0(getName), getTypeClass = js.Any.fromFunction0(getTypeClass), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XTypeDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XTypeDescription] (val x: Self) extends AnyVal {
    
    inline def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
    
    inline def setGetTypeClass(value: () => TypeClass): Self = StObject.set(x, "getTypeClass", js.Any.fromFunction0(value))
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setTypeClass(value: TypeClass): Self = StObject.set(x, "TypeClass", value.asInstanceOf[js.Any])
  }
}
