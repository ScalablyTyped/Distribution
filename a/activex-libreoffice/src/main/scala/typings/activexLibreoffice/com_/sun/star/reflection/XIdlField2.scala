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
  val Type: XIdlClass[js.Any]
  
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
  def get(obj: js.Any): js.Any
  
  /**
    * Returns the access mode of the field, i.e. read-write, read-only or write-only (access mode "const" is deprecated).
    * @returns access mode of the field
    */
  def getAccessMode(): FieldAccessMode
  
  /**
    * Returns the type of the field.
    * @returns type of the field
    */
  def getType(): XIdlClass[js.Any]
  
  /**
    * Sets the value of the reflected field of the given object, i.e. an interface or compound type (struct/exception).
    *
    * When setting an interface attribute raises a non {@link com.sun.star.uno.RuntimeException} , it is wrapped in a {@link
    * com.sun.star.lang.WrappedTargetRuntimeException} .
    * @param obj object instance having member of reflected type
    * @param value value to be set
    * @throws IllegalAccessException An {@link com.sun.star.lang.IllegalAccessException} is thrown if the given object is no interface or compound type; or the
    */
  def set(obj: js.Array[js.Any], value: js.Any): Unit
}
object XIdlField2 {
  
  @scala.inline
  def apply(
    AccessMode: FieldAccessMode,
    DeclaringClass: XIdlClass[js.Any],
    Name: String,
    Type: XIdlClass[js.Any],
    acquire: () => Unit,
    get: js.Any => js.Any,
    getAccessMode: () => FieldAccessMode,
    getDeclaringClass: () => XIdlClass[js.Any],
    getName: () => String,
    getType: () => XIdlClass[js.Any],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    set: (js.Array[js.Any], js.Any) => Unit
  ): XIdlField2 = {
    val __obj = js.Dynamic.literal(AccessMode = AccessMode.asInstanceOf[js.Any], DeclaringClass = DeclaringClass.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), get = js.Any.fromFunction1(get), getAccessMode = js.Any.fromFunction0(getAccessMode), getDeclaringClass = js.Any.fromFunction0(getDeclaringClass), getName = js.Any.fromFunction0(getName), getType = js.Any.fromFunction0(getType), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[XIdlField2]
  }
  
  @scala.inline
  implicit class XIdlField2MutableBuilder[Self <: XIdlField2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessMode(value: FieldAccessMode): Self = StObject.set(x, "AccessMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGet(value: js.Any => js.Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetAccessMode(value: () => FieldAccessMode): Self = StObject.set(x, "getAccessMode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetType(value: () => XIdlClass[js.Any]): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSet(value: (js.Array[js.Any], js.Any) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    
    @scala.inline
    def setType(value: XIdlClass[js.Any]): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
