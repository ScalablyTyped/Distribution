package typings.activexLibreoffice.com_.sun.star.reflection

import typings.activexLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Deprecated. Use {@link com.sun.star.reflection.XIdlField2} instead.
  * @deprecated Deprecated
  */
trait XIdlField extends XIdlMember {
  val AccessMode: FieldAccessMode
  val Type: XIdlClass[_]
  def get(obj: js.Any): js.Any
  def getAccessMode(): FieldAccessMode
  def getType(): XIdlClass[_]
  def set(obj: js.Any, value: js.Any): Unit
}

object XIdlField {
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
    set: (js.Any, js.Any) => Unit
  ): XIdlField = {
    val __obj = js.Dynamic.literal(AccessMode = AccessMode.asInstanceOf[js.Any], DeclaringClass = DeclaringClass.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), get = js.Any.fromFunction1(get), getAccessMode = js.Any.fromFunction0(getAccessMode), getDeclaringClass = js.Any.fromFunction0(getDeclaringClass), getName = js.Any.fromFunction0(getName), getType = js.Any.fromFunction0(getType), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[XIdlField]
  }
}

