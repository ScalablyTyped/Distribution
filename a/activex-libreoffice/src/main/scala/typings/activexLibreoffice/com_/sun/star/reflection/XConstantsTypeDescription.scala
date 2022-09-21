package typings.activexLibreoffice.com_.sun.star.reflection

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.TypeClass
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Reflects a constants group.
  *
  * The type class of this type is com::sun::star::uno::TypeClass::CONSTANTS.
  * @since OOo 1.1.2
  */
trait XConstantsTypeDescription
  extends StObject
     with XTypeDescription {
  
  /**
    * Returns the contstants defined for this constants group.
    * @returns a sequence containing constants descriptions.
    */
  val Constants: SafeArray[XConstantTypeDescription]
  
  /**
    * Returns the contstants defined for this constants group.
    * @returns a sequence containing constants descriptions.
    */
  def getConstants(): SafeArray[XConstantTypeDescription]
}
object XConstantsTypeDescription {
  
  inline def apply(
    Constants: SafeArray[XConstantTypeDescription],
    Name: String,
    TypeClass: TypeClass,
    acquire: () => Unit,
    getConstants: () => SafeArray[XConstantTypeDescription],
    getName: () => String,
    getTypeClass: () => TypeClass,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XConstantsTypeDescription = {
    val __obj = js.Dynamic.literal(Constants = Constants.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], TypeClass = TypeClass.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getConstants = js.Any.fromFunction0(getConstants), getName = js.Any.fromFunction0(getName), getTypeClass = js.Any.fromFunction0(getTypeClass), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XConstantsTypeDescription]
  }
  
  extension [Self <: XConstantsTypeDescription](x: Self) {
    
    inline def setConstants(value: SafeArray[XConstantTypeDescription]): Self = StObject.set(x, "Constants", value.asInstanceOf[js.Any])
    
    inline def setGetConstants(value: () => SafeArray[XConstantTypeDescription]): Self = StObject.set(x, "getConstants", js.Any.fromFunction0(value))
  }
}
