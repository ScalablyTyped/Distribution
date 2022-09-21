package typings.activexLibreoffice.com_.sun.star.reflection

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.TypeClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Reflects a constant.
  *
  * The type class of this type is com::sun::star::uno::TypeClass::CONSTANT.
  *
  * Constants may be contained in constants groups and modules.
  * @see XModuleTypeDescription
  * @see XConstantsTypeDescription
  * @since OOo 1.1.2
  */
trait XConstantTypeDescription
  extends StObject
     with XTypeDescription {
  
  /** @returns the value of the constant.  Following types are allowed for constants: booleanbyteshortunsigned shortlongunsigned longhyperunsigned hyperfloatdouble */
  val ConstantValue: Any
  
  /** @returns the value of the constant.  Following types are allowed for constants: booleanbyteshortunsigned shortlongunsigned longhyperunsigned hyperfloatdouble */
  def getConstantValue(): Any
}
object XConstantTypeDescription {
  
  inline def apply(
    ConstantValue: Any,
    Name: String,
    TypeClass: TypeClass,
    acquire: () => Unit,
    getConstantValue: () => Any,
    getName: () => String,
    getTypeClass: () => TypeClass,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XConstantTypeDescription = {
    val __obj = js.Dynamic.literal(ConstantValue = ConstantValue.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], TypeClass = TypeClass.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getConstantValue = js.Any.fromFunction0(getConstantValue), getName = js.Any.fromFunction0(getName), getTypeClass = js.Any.fromFunction0(getTypeClass), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XConstantTypeDescription]
  }
  
  extension [Self <: XConstantTypeDescription](x: Self) {
    
    inline def setConstantValue(value: Any): Self = StObject.set(x, "ConstantValue", value.asInstanceOf[js.Any])
    
    inline def setGetConstantValue(value: () => Any): Self = StObject.set(x, "getConstantValue", js.Any.fromFunction0(value))
  }
}
