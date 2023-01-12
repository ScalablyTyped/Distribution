package typings.activexLibreoffice.com_.sun.star.reflection

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.TypeClass
import typings.activexLibreoffice.com_.sun.star.uno.Uik
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information reflecting an UNO type. */
trait XIdlClass[T]
  extends StObject
     with XInterface {
  
  /**
    * If the reflected type is an array, then you get a {@link XIdlArray} interface to modify instances of the array type. ;  If the reflected type is not
    * an array, then a null-reference is returned.
    * @returns interface to modify array instances (or null-reference)
    */
  val Array: XIdlArray
  
  /**
    * Deprecated. Do not call.
    * @deprecated Deprecated
    */
  val Classes: SafeArray[XIdlClass[Any]]
  
  /**
    * If the reflected type is an array or sequence, then this method returns a {@link XIdlClass} interface reflecting the element.
    * @returns reflection interface of the element type of an array or sequence type (null-reference otherwise).
    */
  val ComponentType: XIdlClass[Any]
  
  /**
    * If the reflected type is an interface, struct or union, then you get a sequence of {@link XIdlField} interfaces reflecting all fields (/interface
    * attributes). This also includes all inherited fields (/interface attributes) of the interface, struct of union. ;  If the reflected type is not an
    * interface, struct or union or the interface, struct or union does not have any field (/interface attribute), then an empty sequence is returned.
    * @returns all field (/interface attribute) reflections (or empty sequence)
    */
  val Fields: SafeArray[XIdlField]
  
  /**
    * Deprecated. Do not call.
    * @deprecated Deprecated
    */
  val Interfaces: SafeArray[XIdlClass[Any]]
  
  /**
    * If the reflected type is an interface, then you get a sequence of {@link XIdlMethod} interfaces reflecting all methods of the interface. This also
    * includes the inherited methods of the interface. ;  If the reflected type is not an interface or the interface does not have any methods, then a
    * null-reference is returned.
    * @returns all method reflections (or empty sequence)
    */
  val Methods: SafeArray[XIdlMethod]
  
  /**
    * Returns the fully-qualified name of the reflected type.
    * @returns the fully-qualified name of the type
    */
  val Name: String
  
  /**
    * If the reflected type is an interface, then the returned sequence of {@link XIdlClass} reflect the base interfaces. ;  If the reflected type is not an
    * interface or an interface that is not derived from another, then an empty sequence is returned.
    * @returns all base interfaces of an interface type or an empty sequence.
    */
  val Superclasses: SafeArray[XIdlClass[Any]]
  
  /**
    * Returns the {@link com.sun.star.uno.TypeClass} of the reflected type.
    * @returns type class of the reflected type.
    */
  val TypeClass: typings.activexLibreoffice.com_.sun.star.uno.TypeClass
  
  /**
    * Deprecated. Do not call.
    * @deprecated Deprecated
    */
  val Uik: typings.activexLibreoffice.com_.sun.star.uno.Uik
  
  /**
    * This method creates instances of the reflected type.
    * @param obj pure out parameter to pass the created instance
    */
  def createObject(obj: js.Array[T]): Unit
  
  /**
    * Tests whether two reflecting objects reflect the same type.
    * @returns true, if the objects reflect the same type, false otherwise.
    */
  def equals(Type: XIdlClass[Any]): Boolean
  
  /**
    * If the reflected type is an array, then you get a {@link XIdlArray} interface to modify instances of the array type. ;  If the reflected type is not
    * an array, then a null-reference is returned.
    * @returns interface to modify array instances (or null-reference)
    */
  def getArray(): XIdlArray
  
  /**
    * Deprecated. Do not call.
    * @deprecated Deprecated
    */
  def getClass(aName: String): XIdlClass[Any]
  
  /**
    * Deprecated. Do not call.
    * @deprecated Deprecated
    */
  def getClasses(): SafeArray[XIdlClass[Any]]
  
  /**
    * If the reflected type is an array or sequence, then this method returns a {@link XIdlClass} interface reflecting the element.
    * @returns reflection interface of the element type of an array or sequence type (null-reference otherwise).
    */
  def getComponentType(): XIdlClass[Any]
  
  /**
    * If the reflected type is an interface, struct or union, then you get a {@link XIdlField} interface reflecting the demanded field (/interface
    * attribute) by name. ;  If the reflected type is not an interface, struct or union or the interface, struct or union does not have a field (/interface
    * attribute) with the demanded name, then a null-reference is returned.
    * @param aName name of the demanded field reflection
    * @returns demanded field (/interface attribute) reflection (or null-reference)
    */
  def getField(aName: String): XIdlField
  
  /**
    * If the reflected type is an interface, struct or union, then you get a sequence of {@link XIdlField} interfaces reflecting all fields (/interface
    * attributes). This also includes all inherited fields (/interface attributes) of the interface, struct of union. ;  If the reflected type is not an
    * interface, struct or union or the interface, struct or union does not have any field (/interface attribute), then an empty sequence is returned.
    * @returns all field (/interface attribute) reflections (or empty sequence)
    */
  def getFields(): SafeArray[XIdlField]
  
  /**
    * Deprecated. Do not call.
    * @deprecated Deprecated
    */
  def getInterfaces(): SafeArray[XIdlClass[Any]]
  
  /**
    * If the reflected type is an interface, then you get a {@link XIdlMethod} interface reflecting the demanded method by name. ;  If the reflected type is
    * not an interface or the interface does not have a method with the demanded name (including inherited methods), then a null-reference is returned.
    * @param aName name of demanded method reflection
    * @returns demanded method reflection (or null-reference)
    */
  def getMethod(aName: String): XIdlMethod
  
  /**
    * If the reflected type is an interface, then you get a sequence of {@link XIdlMethod} interfaces reflecting all methods of the interface. This also
    * includes the inherited methods of the interface. ;  If the reflected type is not an interface or the interface does not have any methods, then a
    * null-reference is returned.
    * @returns all method reflections (or empty sequence)
    */
  def getMethods(): SafeArray[XIdlMethod]
  
  /**
    * Returns the fully-qualified name of the reflected type.
    * @returns the fully-qualified name of the type
    */
  def getName(): String
  
  /**
    * If the reflected type is an interface, then the returned sequence of {@link XIdlClass} reflect the base interfaces. ;  If the reflected type is not an
    * interface or an interface that is not derived from another, then an empty sequence is returned.
    * @returns all base interfaces of an interface type or an empty sequence.
    */
  def getSuperclasses(): SafeArray[XIdlClass[Any]]
  
  /**
    * Returns the {@link com.sun.star.uno.TypeClass} of the reflected type.
    * @returns type class of the reflected type.
    */
  def getTypeClass(): typings.activexLibreoffice.com_.sun.star.uno.TypeClass
  
  /**
    * Deprecated. Do not call.
    * @deprecated Deprecated
    */
  def getUik(): typings.activexLibreoffice.com_.sun.star.uno.Uik
  
  /**
    * Tests whether values of this reflected type are assignable from values of a second one ( `xType` ).
    * @param xType another reflected type
    * @returns true, if values of this reflected type are assignable from values of `xType` .
    */
  def isAssignableFrom(xType: XIdlClass[Any]): Boolean
}
object XIdlClass {
  
  inline def apply[T](
    Array: XIdlArray,
    Classes: SafeArray[XIdlClass[Any]],
    ComponentType: XIdlClass[Any],
    Fields: SafeArray[XIdlField],
    Interfaces: SafeArray[XIdlClass[Any]],
    Methods: SafeArray[XIdlMethod],
    Name: String,
    Superclasses: SafeArray[XIdlClass[Any]],
    TypeClass: TypeClass,
    Uik: Uik,
    acquire: () => Unit,
    createObject: js.Array[T] => Unit,
    equals_ : XIdlClass[Any] => Boolean,
    getArray: () => XIdlArray,
    getClass_ : String => XIdlClass[Any],
    getClasses: () => SafeArray[XIdlClass[Any]],
    getComponentType: () => XIdlClass[Any],
    getField: String => XIdlField,
    getFields: () => SafeArray[XIdlField],
    getInterfaces: () => SafeArray[XIdlClass[Any]],
    getMethod: String => XIdlMethod,
    getMethods: () => SafeArray[XIdlMethod],
    getName: () => String,
    getSuperclasses: () => SafeArray[XIdlClass[Any]],
    getTypeClass: () => TypeClass,
    getUik: () => Uik,
    isAssignableFrom: XIdlClass[Any] => Boolean,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XIdlClass[T] = {
    val __obj = js.Dynamic.literal(Array = Array.asInstanceOf[js.Any], Classes = Classes.asInstanceOf[js.Any], ComponentType = ComponentType.asInstanceOf[js.Any], Fields = Fields.asInstanceOf[js.Any], Interfaces = Interfaces.asInstanceOf[js.Any], Methods = Methods.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Superclasses = Superclasses.asInstanceOf[js.Any], TypeClass = TypeClass.asInstanceOf[js.Any], Uik = Uik.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), createObject = js.Any.fromFunction1(createObject), getArray = js.Any.fromFunction0(getArray), getClasses = js.Any.fromFunction0(getClasses), getComponentType = js.Any.fromFunction0(getComponentType), getField = js.Any.fromFunction1(getField), getFields = js.Any.fromFunction0(getFields), getInterfaces = js.Any.fromFunction0(getInterfaces), getMethod = js.Any.fromFunction1(getMethod), getMethods = js.Any.fromFunction0(getMethods), getName = js.Any.fromFunction0(getName), getSuperclasses = js.Any.fromFunction0(getSuperclasses), getTypeClass = js.Any.fromFunction0(getTypeClass), getUik = js.Any.fromFunction0(getUik), isAssignableFrom = js.Any.fromFunction1(isAssignableFrom), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.updateDynamic("getClass")(js.Any.fromFunction1(getClass_))
    __obj.asInstanceOf[XIdlClass[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XIdlClass[?], T] (val x: Self & XIdlClass[T]) extends AnyVal {
    
    inline def setArray(value: XIdlArray): Self = StObject.set(x, "Array", value.asInstanceOf[js.Any])
    
    inline def setClasses(value: SafeArray[XIdlClass[Any]]): Self = StObject.set(x, "Classes", value.asInstanceOf[js.Any])
    
    inline def setComponentType(value: XIdlClass[Any]): Self = StObject.set(x, "ComponentType", value.asInstanceOf[js.Any])
    
    inline def setCreateObject(value: js.Array[T] => Unit): Self = StObject.set(x, "createObject", js.Any.fromFunction1(value))
    
    inline def setEquals_(value: XIdlClass[Any] => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    inline def setFields(value: SafeArray[XIdlField]): Self = StObject.set(x, "Fields", value.asInstanceOf[js.Any])
    
    inline def setGetArray(value: () => XIdlArray): Self = StObject.set(x, "getArray", js.Any.fromFunction0(value))
    
    inline def setGetClass_(value: String => XIdlClass[Any]): Self = StObject.set(x, "getClass", js.Any.fromFunction1(value))
    
    inline def setGetClasses(value: () => SafeArray[XIdlClass[Any]]): Self = StObject.set(x, "getClasses", js.Any.fromFunction0(value))
    
    inline def setGetComponentType(value: () => XIdlClass[Any]): Self = StObject.set(x, "getComponentType", js.Any.fromFunction0(value))
    
    inline def setGetField(value: String => XIdlField): Self = StObject.set(x, "getField", js.Any.fromFunction1(value))
    
    inline def setGetFields(value: () => SafeArray[XIdlField]): Self = StObject.set(x, "getFields", js.Any.fromFunction0(value))
    
    inline def setGetInterfaces(value: () => SafeArray[XIdlClass[Any]]): Self = StObject.set(x, "getInterfaces", js.Any.fromFunction0(value))
    
    inline def setGetMethod(value: String => XIdlMethod): Self = StObject.set(x, "getMethod", js.Any.fromFunction1(value))
    
    inline def setGetMethods(value: () => SafeArray[XIdlMethod]): Self = StObject.set(x, "getMethods", js.Any.fromFunction0(value))
    
    inline def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
    
    inline def setGetSuperclasses(value: () => SafeArray[XIdlClass[Any]]): Self = StObject.set(x, "getSuperclasses", js.Any.fromFunction0(value))
    
    inline def setGetTypeClass(value: () => TypeClass): Self = StObject.set(x, "getTypeClass", js.Any.fromFunction0(value))
    
    inline def setGetUik(value: () => Uik): Self = StObject.set(x, "getUik", js.Any.fromFunction0(value))
    
    inline def setInterfaces(value: SafeArray[XIdlClass[Any]]): Self = StObject.set(x, "Interfaces", value.asInstanceOf[js.Any])
    
    inline def setIsAssignableFrom(value: XIdlClass[Any] => Boolean): Self = StObject.set(x, "isAssignableFrom", js.Any.fromFunction1(value))
    
    inline def setMethods(value: SafeArray[XIdlMethod]): Self = StObject.set(x, "Methods", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setSuperclasses(value: SafeArray[XIdlClass[Any]]): Self = StObject.set(x, "Superclasses", value.asInstanceOf[js.Any])
    
    inline def setTypeClass(value: TypeClass): Self = StObject.set(x, "TypeClass", value.asInstanceOf[js.Any])
    
    inline def setUik(value: Uik): Self = StObject.set(x, "Uik", value.asInstanceOf[js.Any])
  }
}
