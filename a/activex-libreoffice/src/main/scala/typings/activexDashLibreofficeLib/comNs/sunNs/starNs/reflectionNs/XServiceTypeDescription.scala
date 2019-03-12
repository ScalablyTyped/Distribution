package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.reflectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Reflects a service.
  *
  * This type is superseded by {@link XServiceTypeDescription2} , which supports single-interface  -  based services, in addition to the obsolete,
  * accumulation-based services.
  *
  * The type class of this type is com::sun::star::uno::TypeClass::SERVICE.
  * @since OOo 1.1.2
  */
trait XServiceTypeDescription extends XTypeDescription {
  /**
    * Returns the type descriptions of the mandatory interfaces defined for this service.
    * @returns a sequence containing interface type descriptions, for an obsolete, accumulation-based service; for a single-interface  -  based service, an empt
    */
  val MandatoryInterfaces: stdLib.SafeArray[XInterfaceTypeDescription]
  /**
    * Returns the type descriptions of the mandatory services defined for this service.
    * @returns a sequence containing service type descriptions, for an obsolete, accumulation-based service; for a single-interface  -  based service, an empty
    */
  val MandatoryServices: stdLib.SafeArray[XServiceTypeDescription]
  /**
    * Returns the type descriptions of the optional interface defined for this service.
    * @returns a sequence containing interface type descriptions, for an obsolete, accumulation-based service; for a single-interface  -  based service, an empt
    */
  val OptionalInterfaces: stdLib.SafeArray[XInterfaceTypeDescription]
  /**
    * Returns the type descriptions of the optional services defined for this service.
    * @returns a sequence containing service type descriptions, for an obsolete, accumulation-based service; for a single-interface  -  based service, an empty
    */
  val OptionalServices: stdLib.SafeArray[XServiceTypeDescription]
  /**
    * Returns the properties defined for this service.
    * @returns a sequence containing property descriptions, for an obsolete, accumulation-based service; for a single-interface  -  based service, an empty sequ
    */
  val Properties: stdLib.SafeArray[XPropertyTypeDescription]
  /**
    * Returns the type descriptions of the mandatory interfaces defined for this service.
    * @returns a sequence containing interface type descriptions, for an obsolete, accumulation-based service; for a single-interface  -  based service, an empt
    */
  def getMandatoryInterfaces(): stdLib.SafeArray[XInterfaceTypeDescription]
  /**
    * Returns the type descriptions of the mandatory services defined for this service.
    * @returns a sequence containing service type descriptions, for an obsolete, accumulation-based service; for a single-interface  -  based service, an empty
    */
  def getMandatoryServices(): stdLib.SafeArray[XServiceTypeDescription]
  /**
    * Returns the type descriptions of the optional interface defined for this service.
    * @returns a sequence containing interface type descriptions, for an obsolete, accumulation-based service; for a single-interface  -  based service, an empt
    */
  def getOptionalInterfaces(): stdLib.SafeArray[XInterfaceTypeDescription]
  /**
    * Returns the type descriptions of the optional services defined for this service.
    * @returns a sequence containing service type descriptions, for an obsolete, accumulation-based service; for a single-interface  -  based service, an empty
    */
  def getOptionalServices(): stdLib.SafeArray[XServiceTypeDescription]
  /**
    * Returns the properties defined for this service.
    * @returns a sequence containing property descriptions, for an obsolete, accumulation-based service; for a single-interface  -  based service, an empty sequ
    */
  def getProperties(): stdLib.SafeArray[XPropertyTypeDescription]
}

object XServiceTypeDescription {
  @scala.inline
  def apply(
    MandatoryInterfaces: stdLib.SafeArray[XInterfaceTypeDescription],
    MandatoryServices: stdLib.SafeArray[XServiceTypeDescription],
    Name: java.lang.String,
    OptionalInterfaces: stdLib.SafeArray[XInterfaceTypeDescription],
    OptionalServices: stdLib.SafeArray[XServiceTypeDescription],
    Properties: stdLib.SafeArray[XPropertyTypeDescription],
    TypeClass: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass,
    acquire: () => scala.Unit,
    getMandatoryInterfaces: () => stdLib.SafeArray[XInterfaceTypeDescription],
    getMandatoryServices: () => stdLib.SafeArray[XServiceTypeDescription],
    getName: () => java.lang.String,
    getOptionalInterfaces: () => stdLib.SafeArray[XInterfaceTypeDescription],
    getOptionalServices: () => stdLib.SafeArray[XServiceTypeDescription],
    getProperties: () => stdLib.SafeArray[XPropertyTypeDescription],
    getTypeClass: () => activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XServiceTypeDescription = {
    val __obj = js.Dynamic.literal(MandatoryInterfaces = MandatoryInterfaces, MandatoryServices = MandatoryServices, Name = Name, OptionalInterfaces = OptionalInterfaces, OptionalServices = OptionalServices, Properties = Properties, TypeClass = TypeClass, acquire = js.Any.fromFunction0(acquire), getMandatoryInterfaces = js.Any.fromFunction0(getMandatoryInterfaces), getMandatoryServices = js.Any.fromFunction0(getMandatoryServices), getName = js.Any.fromFunction0(getName), getOptionalInterfaces = js.Any.fromFunction0(getOptionalInterfaces), getOptionalServices = js.Any.fromFunction0(getOptionalServices), getProperties = js.Any.fromFunction0(getProperties), getTypeClass = js.Any.fromFunction0(getTypeClass), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XServiceTypeDescription]
  }
}

