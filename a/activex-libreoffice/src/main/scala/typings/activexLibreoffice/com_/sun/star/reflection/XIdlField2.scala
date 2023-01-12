package typings.activexLibreoffice.com_.sun.star.reflection

import typings.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Reflects an IDL interface attribute, enum or compound type (i.e. struct/exception) member. */
trait XIdlField2
  extends StObject
     with XIdlMember {
  
  /**
    * Returns the access mode of the field, i.e. read-write, read-only or write-only (access mode "const" is deprecated).
    * @returns access mode of the field
    */
  val AccessMode: FieldAccessMode
  
  /**
    * Returns the type of the field.
    * @returns type of the field
    */
  val Type: XIdlClass[Any]
  
  /**
    * Gets the value of the reflected field from the given object, i.e. an interface, enum or compound type (struct/exception). For enums, the given object
    * is ignored; the returned value reflects the constant enum 32-bit value.
    *
    * When setting an interface attribute raises a non {@link com.sun.star.uno.RuntimeException} , it is wrapped in a {@link
    * com.sun.star.lang.WrappedTargetRuntimeException} .
    * @param obj object instance having member of reflected type
    * @returns value of field
    * @throws IllegalAccessException An {@link com.sun.star.lang.IllegalAccessException} is thrown if the given object is no interface, enum or compound type;
    */
  def get(obj: Any): Any
  
  /**
    * Returns the access mode of the field, i.e. read-write, read-only or write-only (access mode "const" is deprecated).
    * @returns access mode of the field
    */
  def getAccessMode(): FieldAccessMode
  
  /**
    * Returns the type of the field.
    * @returns type of the field
    */
  def getType(): XIdlClass[Any]
  
  /**
    * Sets the value of the reflected field of the given object, i.e. an interface or compound type (struct/exception).
    *
    * When setting an interface attribute raises a non {@link com.sun.star.uno.RuntimeException} , it is wrapped in a {@link
    * com.sun.star.lang.WrappedTargetRuntimeException} .
    * @param obj object instance having member of reflected type
    * @param value value to be set
    * @throws IllegalAccessException An {@link com.sun.star.lang.IllegalAccessException} is thrown if the given object is no interface or compound type; or the
    */
  def set(obj: js.Array[Any], value: Any): Unit
}
object XIdlField2 {
  
  inline def apply(
    AccessMode: FieldAccessMode,
    DeclaringClass: XIdlClass[Any],
    Name: String,
    Type: XIdlClass[Any],
    acquire: () => Unit,
    get: Any => Any,
    getAccessMode: () => FieldAccessMode,
    getDeclaringClass: () => XIdlClass[Any],
    getName: () => String,
    getType: () => XIdlClass[Any],
    queryInterface: `type` => Any,
    release: () => Unit,
    set: (js.Array[Any], Any) => Unit
  ): XIdlField2 = {
    val __obj = js.Dynamic.literal(AccessMode = AccessMode.asInstanceOf[js.Any], DeclaringClass = DeclaringClass.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), get = js.Any.fromFunction1(get), getAccessMode = js.Any.fromFunction0(getAccessMode), getDeclaringClass = js.Any.fromFunction0(getDeclaringClass), getName = js.Any.fromFunction0(getName), getType = js.Any.fromFunction0(getType), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[XIdlField2]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XIdlField2] (val x: Self) extends AnyVal {
    
    inline def setAccessMode(value: FieldAccessMode): Self = StObject.set(x, "AccessMode", value.asInstanceOf[js.Any])
    
    inline def setGet(value: Any => Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setGetAccessMode(value: () => FieldAccessMode): Self = StObject.set(x, "getAccessMode", js.Any.fromFunction0(value))
    
    inline def setGetType(value: () => XIdlClass[Any]): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
    
    inline def setSet(value: (js.Array[Any], Any) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    
    inline def setType(value: XIdlClass[Any]): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
