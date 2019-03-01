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
  val MandatoryInterfaces: activexDashInteropLib.SafeArray[XInterfaceTypeDescription]
  /**
    * Returns the type descriptions of the mandatory services defined for this service.
    * @returns a sequence containing service type descriptions, for an obsolete, accumulation-based service; for a single-interface  -  based service, an empty
    */
  val MandatoryServices: activexDashInteropLib.SafeArray[XServiceTypeDescription]
  /**
    * Returns the type descriptions of the optional interface defined for this service.
    * @returns a sequence containing interface type descriptions, for an obsolete, accumulation-based service; for a single-interface  -  based service, an empt
    */
  val OptionalInterfaces: activexDashInteropLib.SafeArray[XInterfaceTypeDescription]
  /**
    * Returns the type descriptions of the optional services defined for this service.
    * @returns a sequence containing service type descriptions, for an obsolete, accumulation-based service; for a single-interface  -  based service, an empty
    */
  val OptionalServices: activexDashInteropLib.SafeArray[XServiceTypeDescription]
  /**
    * Returns the properties defined for this service.
    * @returns a sequence containing property descriptions, for an obsolete, accumulation-based service; for a single-interface  -  based service, an empty sequ
    */
  val Properties: activexDashInteropLib.SafeArray[XPropertyTypeDescription]
  /**
    * Returns the type descriptions of the mandatory interfaces defined for this service.
    * @returns a sequence containing interface type descriptions, for an obsolete, accumulation-based service; for a single-interface  -  based service, an empt
    */
  def getMandatoryInterfaces(): activexDashInteropLib.SafeArray[XInterfaceTypeDescription]
  /**
    * Returns the type descriptions of the mandatory services defined for this service.
    * @returns a sequence containing service type descriptions, for an obsolete, accumulation-based service; for a single-interface  -  based service, an empty
    */
  def getMandatoryServices(): activexDashInteropLib.SafeArray[XServiceTypeDescription]
  /**
    * Returns the type descriptions of the optional interface defined for this service.
    * @returns a sequence containing interface type descriptions, for an obsolete, accumulation-based service; for a single-interface  -  based service, an empt
    */
  def getOptionalInterfaces(): activexDashInteropLib.SafeArray[XInterfaceTypeDescription]
  /**
    * Returns the type descriptions of the optional services defined for this service.
    * @returns a sequence containing service type descriptions, for an obsolete, accumulation-based service; for a single-interface  -  based service, an empty
    */
  def getOptionalServices(): activexDashInteropLib.SafeArray[XServiceTypeDescription]
  /**
    * Returns the properties defined for this service.
    * @returns a sequence containing property descriptions, for an obsolete, accumulation-based service; for a single-interface  -  based service, an empty sequ
    */
  def getProperties(): activexDashInteropLib.SafeArray[XPropertyTypeDescription]
}

object XServiceTypeDescription {
  @scala.inline
  def apply(
    MandatoryInterfaces: activexDashInteropLib.SafeArray[XInterfaceTypeDescription],
    MandatoryServices: activexDashInteropLib.SafeArray[XServiceTypeDescription],
    Name: java.lang.String,
    OptionalInterfaces: activexDashInteropLib.SafeArray[XInterfaceTypeDescription],
    OptionalServices: activexDashInteropLib.SafeArray[XServiceTypeDescription],
    Properties: activexDashInteropLib.SafeArray[XPropertyTypeDescription],
    TypeClass: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass,
    acquire: js.Function0[scala.Unit],
    getMandatoryInterfaces: js.Function0[activexDashInteropLib.SafeArray[XInterfaceTypeDescription]],
    getMandatoryServices: js.Function0[activexDashInteropLib.SafeArray[XServiceTypeDescription]],
    getName: js.Function0[java.lang.String],
    getOptionalInterfaces: js.Function0[activexDashInteropLib.SafeArray[XInterfaceTypeDescription]],
    getOptionalServices: js.Function0[activexDashInteropLib.SafeArray[XServiceTypeDescription]],
    getProperties: js.Function0[activexDashInteropLib.SafeArray[XPropertyTypeDescription]],
    getTypeClass: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XServiceTypeDescription = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("MandatoryInterfaces")(MandatoryInterfaces)
    __obj.updateDynamic("MandatoryServices")(MandatoryServices)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("OptionalInterfaces")(OptionalInterfaces)
    __obj.updateDynamic("OptionalServices")(OptionalServices)
    __obj.updateDynamic("Properties")(Properties)
    __obj.updateDynamic("TypeClass")(TypeClass)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getMandatoryInterfaces")(getMandatoryInterfaces)
    __obj.updateDynamic("getMandatoryServices")(getMandatoryServices)
    __obj.updateDynamic("getName")(getName)
    __obj.updateDynamic("getOptionalInterfaces")(getOptionalInterfaces)
    __obj.updateDynamic("getOptionalServices")(getOptionalServices)
    __obj.updateDynamic("getProperties")(getProperties)
    __obj.updateDynamic("getTypeClass")(getTypeClass)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XServiceTypeDescription]
  }
}

