package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.reflectionNs

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
  val Constructors: stdLib.SafeArray[XServiceConstructorDescription]
  /**
    * Returns the interface type associated with the service.
    * @returns the reflection of the interface type associated with the service (of type {@link com.sun.star.reflection.XInterfaceTypeDescription} or, in case o
    */
  val Interface: XTypeDescription
  /**
    * Returns the constructors of the service.
    * @returns the reflections of all constructors of the service, in no particular order
    */
  def getConstructors(): stdLib.SafeArray[XServiceConstructorDescription]
  /**
    * Returns the interface type associated with the service.
    * @returns the reflection of the interface type associated with the service (of type {@link com.sun.star.reflection.XInterfaceTypeDescription} or, in case o
    */
  def getInterface(): XTypeDescription
  /**
    * Returns whether this object reflects a single-interface  -  based service.
    * @returns `TRUE` if this object reflects a single-interface  -  based service, and `FALSE` if this object reflects an obsolete, accumulation-based service
    */
  def isSingleInterfaceBased(): scala.Boolean
}

object XServiceTypeDescription2 {
  @scala.inline
  def apply(
    Constructors: stdLib.SafeArray[XServiceConstructorDescription],
    Interface: XTypeDescription,
    MandatoryInterfaces: stdLib.SafeArray[XInterfaceTypeDescription],
    MandatoryServices: stdLib.SafeArray[XServiceTypeDescription],
    Name: java.lang.String,
    OptionalInterfaces: stdLib.SafeArray[XInterfaceTypeDescription],
    OptionalServices: stdLib.SafeArray[XServiceTypeDescription],
    Properties: stdLib.SafeArray[XPropertyTypeDescription],
    TypeClass: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass,
    acquire: () => scala.Unit,
    getConstructors: () => stdLib.SafeArray[XServiceConstructorDescription],
    getInterface: () => XTypeDescription,
    getMandatoryInterfaces: () => stdLib.SafeArray[XInterfaceTypeDescription],
    getMandatoryServices: () => stdLib.SafeArray[XServiceTypeDescription],
    getName: () => java.lang.String,
    getOptionalInterfaces: () => stdLib.SafeArray[XInterfaceTypeDescription],
    getOptionalServices: () => stdLib.SafeArray[XServiceTypeDescription],
    getProperties: () => stdLib.SafeArray[XPropertyTypeDescription],
    getTypeClass: () => activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass,
    isSingleInterfaceBased: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XServiceTypeDescription2 = {
    val __obj = js.Dynamic.literal(Constructors = Constructors, Interface = Interface, MandatoryInterfaces = MandatoryInterfaces, MandatoryServices = MandatoryServices, Name = Name, OptionalInterfaces = OptionalInterfaces, OptionalServices = OptionalServices, Properties = Properties, TypeClass = TypeClass, acquire = js.Any.fromFunction0(acquire), getConstructors = js.Any.fromFunction0(getConstructors), getInterface = js.Any.fromFunction0(getInterface), getMandatoryInterfaces = js.Any.fromFunction0(getMandatoryInterfaces), getMandatoryServices = js.Any.fromFunction0(getMandatoryServices), getName = js.Any.fromFunction0(getName), getOptionalInterfaces = js.Any.fromFunction0(getOptionalInterfaces), getOptionalServices = js.Any.fromFunction0(getOptionalServices), getProperties = js.Any.fromFunction0(getProperties), getTypeClass = js.Any.fromFunction0(getTypeClass), isSingleInterfaceBased = js.Any.fromFunction0(isSingleInterfaceBased), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XServiceTypeDescription2]
  }
}

