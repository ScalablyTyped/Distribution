package typings.activexLibreoffice.com_.sun.star.reflection

import typings.activexLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Deprecated. Use {@link com.sun.star.reflection.XIdlField2} instead.
  * @deprecated Deprecated
  */
@js.native
trait XIdlField extends XIdlMember {
  val AccessMode: FieldAccessMode = js.native
  val Type: XIdlClass[_] = js.native
  def get(obj: js.Any): js.Any = js.native
  def getAccessMode(): FieldAccessMode = js.native
  def getType(): XIdlClass[_] = js.native
  def set(obj: js.Any, value: js.Any): Unit = js.native
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
  @scala.inline
  implicit class XIdlFieldOps[Self <: XIdlField] (val x: Self) extends AnyVal {
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
    def setSet(value: (js.Any, js.Any) => Unit): Self = this.set("set", js.Any.fromFunction2(value))
  }
  
}

