package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.reflectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Reflects an IDL interface attribute, enum or compound type (i.e. struct/exception) member. */
trait XIdlField2 extends XIdlMember {
  /**
    * Returns the access mode of the field, i.e. read-write, read-only or write-only (access mode "const" is deprecated).
    * @returns access mode of the field
    */
  val AccessMode: FieldAccessMode
  /**
    * Returns the type of the field.
    * @returns type of the field
    */
  val Type: XIdlClass[_]
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
  def getType(): XIdlClass[_]
  /**
    * Sets the value of the reflected field of the given object, i.e. an interface or compound type (struct/exception).
    *
    * When setting an interface attribute raises a non {@link com.sun.star.uno.RuntimeException} , it is wrapped in a {@link
    * com.sun.star.lang.WrappedTargetRuntimeException} .
    * @param obj object instance having member of reflected type
    * @param value value to be set
    * @throws IllegalAccessException An {@link com.sun.star.lang.IllegalAccessException} is thrown if the given object is no interface or compound type; or the
    */
  def set(obj: js.Array[_], value: js.Any): scala.Unit
}

object XIdlField2 {
  @scala.inline
  def apply(
    AccessMode: FieldAccessMode,
    DeclaringClass: XIdlClass[_],
    Name: java.lang.String,
    Type: XIdlClass[_],
    acquire: js.Function0[scala.Unit],
    get: js.Function1[js.Any, js.Any],
    getAccessMode: js.Function0[FieldAccessMode],
    getDeclaringClass: js.Function0[XIdlClass[_]],
    getName: js.Function0[java.lang.String],
    getType: js.Function0[XIdlClass[_]],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    set: js.Function2[js.Array[_], js.Any, scala.Unit]
  ): XIdlField2 = {
    val __obj = js.Dynamic.literal(AccessMode = AccessMode, DeclaringClass = DeclaringClass, Name = Name, Type = Type, acquire = acquire, get = get, getAccessMode = getAccessMode, getDeclaringClass = getDeclaringClass, getName = getName, getType = getType, queryInterface = queryInterface, release = release, set = set)
  
    __obj.asInstanceOf[XIdlField2]
  }
}

