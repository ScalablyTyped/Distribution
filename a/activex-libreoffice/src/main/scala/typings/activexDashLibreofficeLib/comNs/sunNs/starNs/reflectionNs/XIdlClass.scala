package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.reflectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information reflecting an UNO type. */
trait XIdlClass[T]
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
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
  val Classes: stdLib.SafeArray[XIdlClass[_]]
  /**
    * If the reflected type is an array or sequence, then this method returns a {@link XIdlClass} interface reflecting the element.
    * @returns reflection interface of the element type of an array or sequence type (null-reference otherwise).
    */
  val ComponentType: XIdlClass[_]
  /**
    * If the reflected type is an interface, struct or union, then you get a sequence of {@link XIdlField} interfaces reflecting all fields (/interface
    * attributes). This also includes all inherited fields (/interface attributes) of the interface, struct of union. ;  If the reflected type is not an
    * interface, struct or union or the interface, struct or union does not have any field (/interface attribute), then an empty sequence is returned.
    * @returns all field (/interface attribute) reflections (or empty sequence)
    */
  val Fields: stdLib.SafeArray[XIdlField]
  /**
    * Deprecated. Do not call.
    * @deprecated Deprecated
    */
  val Interfaces: stdLib.SafeArray[XIdlClass[_]]
  /**
    * If the reflected type is an interface, then you get a sequence of {@link XIdlMethod} interfaces reflecting all methods of the interface. This also
    * includes the inherited methods of the interface. ;  If the reflected type is not an interface or the interface does not have any methods, then a
    * null-reference is returned.
    * @returns all method reflections (or empty sequence)
    */
  val Methods: stdLib.SafeArray[XIdlMethod]
  /**
    * Returns the fully-qualified name of the reflected type.
    * @returns the fully-qualified name of the type
    */
  val Name: java.lang.String
  /**
    * If the reflected type is an interface, then the returned sequence of {@link XIdlClass} reflect the base interfaces. ;  If the reflected type is not an
    * interface or an interface that is not derived from another, then an empty sequence is returned.
    * @returns all base interfaces of an interface type or an empty sequence.
    */
  val Superclasses: stdLib.SafeArray[XIdlClass[_]]
  /**
    * Returns the {@link com.sun.star.uno.TypeClass} of the reflected type.
    * @returns type class of the reflected type.
    */
  val TypeClass: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass
  /**
    * Deprecated. Do not call.
    * @deprecated Deprecated
    */
  val Uik: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Uik
  /**
    * This method creates instances of the reflected type.
    * @param obj pure out parameter to pass the created instance
    */
  def createObject(obj: js.Array[T]): scala.Unit
  /**
    * Tests whether two reflecting objects reflect the same type.
    * @returns true, if the objects reflect the same type, false otherwise.
    */
  def equals(Type: XIdlClass[_]): scala.Boolean
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
  def getClass(aName: java.lang.String): XIdlClass[_]
  /**
    * Deprecated. Do not call.
    * @deprecated Deprecated
    */
  def getClasses(): stdLib.SafeArray[XIdlClass[_]]
  /**
    * If the reflected type is an array or sequence, then this method returns a {@link XIdlClass} interface reflecting the element.
    * @returns reflection interface of the element type of an array or sequence type (null-reference otherwise).
    */
  def getComponentType(): XIdlClass[_]
  /**
    * If the reflected type is an interface, struct or union, then you get a {@link XIdlField} interface reflecting the demanded field (/interface
    * attribute) by name. ;  If the reflected type is not an interface, struct or union or the interface, struct or union does not have a field (/interface
    * attribute) with the demanded name, then a null-reference is returned.
    * @param aName name of the demanded field reflection
    * @returns demanded field (/interface attribute) reflection (or null-reference)
    */
  def getField(aName: java.lang.String): XIdlField
  /**
    * If the reflected type is an interface, struct or union, then you get a sequence of {@link XIdlField} interfaces reflecting all fields (/interface
    * attributes). This also includes all inherited fields (/interface attributes) of the interface, struct of union. ;  If the reflected type is not an
    * interface, struct or union or the interface, struct or union does not have any field (/interface attribute), then an empty sequence is returned.
    * @returns all field (/interface attribute) reflections (or empty sequence)
    */
  def getFields(): stdLib.SafeArray[XIdlField]
  /**
    * Deprecated. Do not call.
    * @deprecated Deprecated
    */
  def getInterfaces(): stdLib.SafeArray[XIdlClass[_]]
  /**
    * If the reflected type is an interface, then you get a {@link XIdlMethod} interface reflecting the demanded method by name. ;  If the reflected type is
    * not an interface or the interface does not have a method with the demanded name (including inherited methods), then a null-reference is returned.
    * @param aName name of demanded method reflection
    * @returns demanded method reflection (or null-reference)
    */
  def getMethod(aName: java.lang.String): XIdlMethod
  /**
    * If the reflected type is an interface, then you get a sequence of {@link XIdlMethod} interfaces reflecting all methods of the interface. This also
    * includes the inherited methods of the interface. ;  If the reflected type is not an interface or the interface does not have any methods, then a
    * null-reference is returned.
    * @returns all method reflections (or empty sequence)
    */
  def getMethods(): stdLib.SafeArray[XIdlMethod]
  /**
    * Returns the fully-qualified name of the reflected type.
    * @returns the fully-qualified name of the type
    */
  def getName(): java.lang.String
  /**
    * If the reflected type is an interface, then the returned sequence of {@link XIdlClass} reflect the base interfaces. ;  If the reflected type is not an
    * interface or an interface that is not derived from another, then an empty sequence is returned.
    * @returns all base interfaces of an interface type or an empty sequence.
    */
  def getSuperclasses(): stdLib.SafeArray[XIdlClass[_]]
  /**
    * Returns the {@link com.sun.star.uno.TypeClass} of the reflected type.
    * @returns type class of the reflected type.
    */
  def getTypeClass(): activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass
  /**
    * Deprecated. Do not call.
    * @deprecated Deprecated
    */
  def getUik(): activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Uik
  /**
    * Tests whether values of this reflected type are assignable from values of a second one ( `xType` ).
    * @param xType another reflected type
    * @returns true, if values of this reflected type are assignable from values of `xType` .
    */
  def isAssignableFrom(xType: XIdlClass[_]): scala.Boolean
}

object XIdlClass {
  @scala.inline
  def apply[T](
    Array: XIdlArray,
    Classes: stdLib.SafeArray[XIdlClass[_]],
    ComponentType: XIdlClass[_],
    Fields: stdLib.SafeArray[XIdlField],
    Interfaces: stdLib.SafeArray[XIdlClass[_]],
    Methods: stdLib.SafeArray[XIdlMethod],
    Name: java.lang.String,
    Superclasses: stdLib.SafeArray[XIdlClass[_]],
    TypeClass: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass,
    Uik: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Uik,
    acquire: () => scala.Unit,
    createObject: js.Array[T] => scala.Unit,
    equals: XIdlClass[_] => scala.Boolean,
    getArray: () => XIdlArray,
    getClass: java.lang.String => XIdlClass[_],
    getClasses: () => stdLib.SafeArray[XIdlClass[_]],
    getComponentType: () => XIdlClass[_],
    getField: java.lang.String => XIdlField,
    getFields: () => stdLib.SafeArray[XIdlField],
    getInterfaces: () => stdLib.SafeArray[XIdlClass[_]],
    getMethod: java.lang.String => XIdlMethod,
    getMethods: () => stdLib.SafeArray[XIdlMethod],
    getName: () => java.lang.String,
    getSuperclasses: () => stdLib.SafeArray[XIdlClass[_]],
    getTypeClass: () => activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass,
    getUik: () => activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Uik,
    isAssignableFrom: XIdlClass[_] => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XIdlClass[T] = {
    val __obj = js.Dynamic.literal(Array = Array, Classes = Classes, ComponentType = ComponentType, Fields = Fields, Interfaces = Interfaces, Methods = Methods, Name = Name, Superclasses = Superclasses, TypeClass = TypeClass, Uik = Uik, acquire = js.Any.fromFunction0(acquire), createObject = js.Any.fromFunction1(createObject), equals = js.Any.fromFunction1(equals), getArray = js.Any.fromFunction0(getArray), getClass = js.Any.fromFunction1(getClass), getClasses = js.Any.fromFunction0(getClasses), getComponentType = js.Any.fromFunction0(getComponentType), getField = js.Any.fromFunction1(getField), getFields = js.Any.fromFunction0(getFields), getInterfaces = js.Any.fromFunction0(getInterfaces), getMethod = js.Any.fromFunction1(getMethod), getMethods = js.Any.fromFunction0(getMethods), getName = js.Any.fromFunction0(getName), getSuperclasses = js.Any.fromFunction0(getSuperclasses), getTypeClass = js.Any.fromFunction0(getTypeClass), getUik = js.Any.fromFunction0(getUik), isAssignableFrom = js.Any.fromFunction1(isAssignableFrom), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XIdlClass[T]]
  }
}

