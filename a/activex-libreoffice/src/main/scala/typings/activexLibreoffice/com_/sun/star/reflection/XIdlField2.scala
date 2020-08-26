package typings.activexLibreoffice.com_.sun.star.reflection

import typings.activexLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Reflects an IDL interface attribute, enum or compound type (i.e. struct/exception) member. */
@js.native
trait XIdlField2 extends XIdlMember {
  /**
    * Returns the access mode of the field, i.e. read-write, read-only or write-only (access mode "const" is deprecated).
    * @returns access mode of the field
    */
  val AccessMode: FieldAccessMode = js.native
  /**
    * Returns the type of the field.
    * @returns type of the field
    */
  val Type: XIdlClass[_] = js.native
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
  def get(obj: js.Any): js.Any = js.native
  /**
    * Returns the access mode of the field, i.e. read-write, read-only or write-only (access mode "const" is deprecated).
    * @returns access mode of the field
    */
  def getAccessMode(): FieldAccessMode = js.native
  /**
    * Returns the type of the field.
    * @returns type of the field
    */
  def getType(): XIdlClass[_] = js.native
  /**
    * Sets the value of the reflected field of the given object, i.e. an interface or compound type (struct/exception).
    *
    * When setting an interface attribute raises a non {@link com.sun.star.uno.RuntimeException} , it is wrapped in a {@link
    * com.sun.star.lang.WrappedTargetRuntimeException} .
    * @param obj object instance having member of reflected type
    * @param value value to be set
    * @throws IllegalAccessException An {@link com.sun.star.lang.IllegalAccessException} is thrown if the given object is no interface or compound type; or the
    */
  def set(obj: js.Array[_], value: js.Any): Unit = js.native
}

object XIdlField2 {
  @scala.inline
  def apply(
    AccessMode: FieldAccessMode,
    DeclaringClass: XIdlClass[_],
    Name: String,
    Type: XIdlClass[_],
    acquire: () => Unit,
    get: js.Any => js.Any,
    getAccessMode: () => FieldAccessMode,
    getDeclaringClass: () => XIdlClass[_],
    getName: () => String,
    getType: () => XIdlClass[_],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    set: (js.Array[_], js.Any) => Unit
  ): XIdlField2 = {
    val __obj = js.Dynamic.literal(AccessMode = AccessMode.asInstanceOf[js.Any], DeclaringClass = DeclaringClass.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), get = js.Any.fromFunction1(get), getAccessMode = js.Any.fromFunction0(getAccessMode), getDeclaringClass = js.Any.fromFunction0(getDeclaringClass), getName = js.Any.fromFunction0(getName), getType = js.Any.fromFunction0(getType), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[XIdlField2]
  }
  @scala.inline
  implicit class XIdlField2Ops[Self <: XIdlField2] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccessMode(value: FieldAccessMode): Self = this.set("AccessMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: XIdlClass[_]): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def setGet(value: js.Any => js.Any): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setGetAccessMode(value: () => FieldAccessMode): Self = this.set("getAccessMode", js.Any.fromFunction0(value))
    @scala.inline
    def setGetType(value: () => XIdlClass[_]): Self = this.set("getType", js.Any.fromFunction0(value))
    @scala.inline
    def setSet(value: (js.Array[_], js.Any) => Unit): Self = this.set("set", js.Any.fromFunction2(value))
  }
  
}

