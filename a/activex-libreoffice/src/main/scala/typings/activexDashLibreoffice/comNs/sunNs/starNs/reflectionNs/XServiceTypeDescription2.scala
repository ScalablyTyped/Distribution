package typings.activexDashLibreoffice.comNs.sunNs.starNs.reflectionNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.TypeClass
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Reflects a service, supporting single-interface  -  based services.
  *
  * This type supersedes {@link XServiceTypeDescription} , which only supports obsolete, accumulation-based services.
  * @since OOo 2.0
  */
trait XServiceTypeDescription2 extends XServiceTypeDescription {
  /**
    * Returns the constructors of the service.
    * @returns the reflections of all constructors of the service, in no particular order
    */
  val Constructors: SafeArray[XServiceConstructorDescription]
  /**
    * Returns the interface type associated with the service.
    * @returns the reflection of the interface type associated with the service (of type {@link com.sun.star.reflection.XInterfaceTypeDescription} or, in case o
    */
  val Interface: XTypeDescription
  /**
    * Returns the constructors of the service.
    * @returns the reflections of all constructors of the service, in no particular order
    */
  def getConstructors(): SafeArray[XServiceConstructorDescription]
  /**
    * Returns the interface type associated with the service.
    * @returns the reflection of the interface type associated with the service (of type {@link com.sun.star.reflection.XInterfaceTypeDescription} or, in case o
    */
  def getInterface(): XTypeDescription
  /**
    * Returns whether this object reflects a single-interface  -  based service.
    * @returns `TRUE` if this object reflects a single-interface  -  based service, and `FALSE` if this object reflects an obsolete, accumulation-based service
    */
  def isSingleInterfaceBased(): Boolean
}

object XServiceTypeDescription2 {
  @scala.inline
  def apply(
    Constructors: SafeArray[XServiceConstructorDescription],
    Interface: XTypeDescription,
    MandatoryInterfaces: SafeArray[XInterfaceTypeDescription],
    MandatoryServices: SafeArray[XServiceTypeDescription],
    Name: String,
    OptionalInterfaces: SafeArray[XInterfaceTypeDescription],
    OptionalServices: SafeArray[XServiceTypeDescription],
    Properties: SafeArray[XPropertyTypeDescription],
    TypeClass: TypeClass,
    acquire: () => Unit,
    getConstructors: () => SafeArray[XServiceConstructorDescription],
    getInterface: () => XTypeDescription,
    getMandatoryInterfaces: () => SafeArray[XInterfaceTypeDescription],
    getMandatoryServices: () => SafeArray[XServiceTypeDescription],
    getName: () => String,
    getOptionalInterfaces: () => SafeArray[XInterfaceTypeDescription],
    getOptionalServices: () => SafeArray[XServiceTypeDescription],
    getProperties: () => SafeArray[XPropertyTypeDescription],
    getTypeClass: () => TypeClass,
    isSingleInterfaceBased: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XServiceTypeDescription2 = {
    val __obj = js.Dynamic.literal(Constructors = Constructors, Interface = Interface, MandatoryInterfaces = MandatoryInterfaces, MandatoryServices = MandatoryServices, Name = Name, OptionalInterfaces = OptionalInterfaces, OptionalServices = OptionalServices, Properties = Properties, TypeClass = TypeClass, acquire = js.Any.fromFunction0(acquire), getConstructors = js.Any.fromFunction0(getConstructors), getInterface = js.Any.fromFunction0(getInterface), getMandatoryInterfaces = js.Any.fromFunction0(getMandatoryInterfaces), getMandatoryServices = js.Any.fromFunction0(getMandatoryServices), getName = js.Any.fromFunction0(getName), getOptionalInterfaces = js.Any.fromFunction0(getOptionalInterfaces), getOptionalServices = js.Any.fromFunction0(getOptionalServices), getProperties = js.Any.fromFunction0(getProperties), getTypeClass = js.Any.fromFunction0(getTypeClass), isSingleInterfaceBased = js.Any.fromFunction0(isSingleInterfaceBased), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XServiceTypeDescription2]
  }
}

