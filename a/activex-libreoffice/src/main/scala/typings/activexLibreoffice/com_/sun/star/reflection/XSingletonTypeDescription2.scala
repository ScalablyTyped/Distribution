package typings.activexLibreoffice.com_.sun.star.reflection

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.TypeClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Reflects a singleton, supporting interface-based singletons.
  *
  * This type supersedes {@link XSingletonTypeDescription} , which only supports obsolete, service-based singletons.
  * @since OOo 2.0
  */
@js.native
trait XSingletonTypeDescription2 extends XSingletonTypeDescription {
  /**
    * Returns the interface type associated with the singleton.
    * @returns the reflection of the interface type associated with the singleton (of type {@link com.sun.star.reflection.XInterfaceTypeDescription} or, in case
    */
  val Interface: XTypeDescription = js.native
  /**
    * Returns the interface type associated with the singleton.
    * @returns the reflection of the interface type associated with the singleton (of type {@link com.sun.star.reflection.XInterfaceTypeDescription} or, in case
    */
  def getInterface(): XTypeDescription = js.native
  /**
    * Returns whether this object reflects an interface-based singleton.
    * @returns `TRUE` if this object reflects an interface-based singleton, and `FALSE` if this object reflects an obsolete, service-based singleton
    */
  def isInterfaceBased(): Boolean = js.native
}

object XSingletonTypeDescription2 {
  @scala.inline
  def apply(
    Interface: XTypeDescription,
    Name: String,
    Service: XServiceTypeDescription,
    TypeClass: TypeClass,
    acquire: () => Unit,
    getInterface: () => XTypeDescription,
    getName: () => String,
    getService: () => XServiceTypeDescription,
    getTypeClass: () => TypeClass,
    isInterfaceBased: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XSingletonTypeDescription2 = {
    val __obj = js.Dynamic.literal(Interface = Interface.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Service = Service.asInstanceOf[js.Any], TypeClass = TypeClass.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getInterface = js.Any.fromFunction0(getInterface), getName = js.Any.fromFunction0(getName), getService = js.Any.fromFunction0(getService), getTypeClass = js.Any.fromFunction0(getTypeClass), isInterfaceBased = js.Any.fromFunction0(isInterfaceBased), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XSingletonTypeDescription2]
  }
  @scala.inline
  implicit class XSingletonTypeDescription2Ops[Self <: XSingletonTypeDescription2] (val x: Self) extends AnyVal {
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
    def setInterface(value: XTypeDescription): Self = this.set("Interface", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetInterface(value: () => XTypeDescription): Self = this.set("getInterface", js.Any.fromFunction0(value))
    @scala.inline
    def setIsInterfaceBased(value: () => Boolean): Self = this.set("isInterfaceBased", js.Any.fromFunction0(value))
  }
  
}

