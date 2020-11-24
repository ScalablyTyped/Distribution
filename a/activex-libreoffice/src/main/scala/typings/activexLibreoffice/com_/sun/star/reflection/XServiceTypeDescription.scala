package typings.activexLibreoffice.com_.sun.star.reflection

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.TypeClass
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Reflects a service.
  *
  * This type is superseded by {@link XServiceTypeDescription2} , which supports single-interface  -  based services, in addition to the obsolete,
  * accumulation-based services.
  *
  * The type class of this type is com::sun::star::uno::TypeClass::SERVICE.
  * @since OOo 1.1.2
  */
@js.native
trait XServiceTypeDescription extends XTypeDescription {
  
  /**
    * Returns the type descriptions of the mandatory interfaces defined for this service.
    * @returns a sequence containing interface type descriptions, for an obsolete, accumulation-based service; for a single-interface  -  based service, an empt
    */
  val MandatoryInterfaces: SafeArray[XInterfaceTypeDescription] = js.native
  
  /**
    * Returns the type descriptions of the mandatory services defined for this service.
    * @returns a sequence containing service type descriptions, for an obsolete, accumulation-based service; for a single-interface  -  based service, an empty
    */
  val MandatoryServices: SafeArray[XServiceTypeDescription] = js.native
  
  /**
    * Returns the type descriptions of the optional interface defined for this service.
    * @returns a sequence containing interface type descriptions, for an obsolete, accumulation-based service; for a single-interface  -  based service, an empt
    */
  val OptionalInterfaces: SafeArray[XInterfaceTypeDescription] = js.native
  
  /**
    * Returns the type descriptions of the optional services defined for this service.
    * @returns a sequence containing service type descriptions, for an obsolete, accumulation-based service; for a single-interface  -  based service, an empty
    */
  val OptionalServices: SafeArray[XServiceTypeDescription] = js.native
  
  /**
    * Returns the properties defined for this service.
    * @returns a sequence containing property descriptions, for an obsolete, accumulation-based service; for a single-interface  -  based service, an empty sequ
    */
  val Properties: SafeArray[XPropertyTypeDescription] = js.native
  
  /**
    * Returns the type descriptions of the mandatory interfaces defined for this service.
    * @returns a sequence containing interface type descriptions, for an obsolete, accumulation-based service; for a single-interface  -  based service, an empt
    */
  def getMandatoryInterfaces(): SafeArray[XInterfaceTypeDescription] = js.native
  
  /**
    * Returns the type descriptions of the mandatory services defined for this service.
    * @returns a sequence containing service type descriptions, for an obsolete, accumulation-based service; for a single-interface  -  based service, an empty
    */
  def getMandatoryServices(): SafeArray[XServiceTypeDescription] = js.native
  
  /**
    * Returns the type descriptions of the optional interface defined for this service.
    * @returns a sequence containing interface type descriptions, for an obsolete, accumulation-based service; for a single-interface  -  based service, an empt
    */
  def getOptionalInterfaces(): SafeArray[XInterfaceTypeDescription] = js.native
  
  /**
    * Returns the type descriptions of the optional services defined for this service.
    * @returns a sequence containing service type descriptions, for an obsolete, accumulation-based service; for a single-interface  -  based service, an empty
    */
  def getOptionalServices(): SafeArray[XServiceTypeDescription] = js.native
  
  /**
    * Returns the properties defined for this service.
    * @returns a sequence containing property descriptions, for an obsolete, accumulation-based service; for a single-interface  -  based service, an empty sequ
    */
  def getProperties(): SafeArray[XPropertyTypeDescription] = js.native
}
object XServiceTypeDescription {
  
  @scala.inline
  def apply(
    MandatoryInterfaces: SafeArray[XInterfaceTypeDescription],
    MandatoryServices: SafeArray[XServiceTypeDescription],
    Name: String,
    OptionalInterfaces: SafeArray[XInterfaceTypeDescription],
    OptionalServices: SafeArray[XServiceTypeDescription],
    Properties: SafeArray[XPropertyTypeDescription],
    TypeClass: TypeClass,
    acquire: () => Unit,
    getMandatoryInterfaces: () => SafeArray[XInterfaceTypeDescription],
    getMandatoryServices: () => SafeArray[XServiceTypeDescription],
    getName: () => String,
    getOptionalInterfaces: () => SafeArray[XInterfaceTypeDescription],
    getOptionalServices: () => SafeArray[XServiceTypeDescription],
    getProperties: () => SafeArray[XPropertyTypeDescription],
    getTypeClass: () => TypeClass,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XServiceTypeDescription = {
    val __obj = js.Dynamic.literal(MandatoryInterfaces = MandatoryInterfaces.asInstanceOf[js.Any], MandatoryServices = MandatoryServices.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], OptionalInterfaces = OptionalInterfaces.asInstanceOf[js.Any], OptionalServices = OptionalServices.asInstanceOf[js.Any], Properties = Properties.asInstanceOf[js.Any], TypeClass = TypeClass.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getMandatoryInterfaces = js.Any.fromFunction0(getMandatoryInterfaces), getMandatoryServices = js.Any.fromFunction0(getMandatoryServices), getName = js.Any.fromFunction0(getName), getOptionalInterfaces = js.Any.fromFunction0(getOptionalInterfaces), getOptionalServices = js.Any.fromFunction0(getOptionalServices), getProperties = js.Any.fromFunction0(getProperties), getTypeClass = js.Any.fromFunction0(getTypeClass), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XServiceTypeDescription]
  }
  
  @scala.inline
  implicit class XServiceTypeDescriptionOps[Self <: XServiceTypeDescription] (val x: Self) extends AnyVal {
    
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
    def setMandatoryInterfaces(value: SafeArray[XInterfaceTypeDescription]): Self = this.set("MandatoryInterfaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMandatoryServices(value: SafeArray[XServiceTypeDescription]): Self = this.set("MandatoryServices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionalInterfaces(value: SafeArray[XInterfaceTypeDescription]): Self = this.set("OptionalInterfaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionalServices(value: SafeArray[XServiceTypeDescription]): Self = this.set("OptionalServices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: SafeArray[XPropertyTypeDescription]): Self = this.set("Properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetMandatoryInterfaces(value: () => SafeArray[XInterfaceTypeDescription]): Self = this.set("getMandatoryInterfaces", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMandatoryServices(value: () => SafeArray[XServiceTypeDescription]): Self = this.set("getMandatoryServices", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetOptionalInterfaces(value: () => SafeArray[XInterfaceTypeDescription]): Self = this.set("getOptionalInterfaces", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetOptionalServices(value: () => SafeArray[XServiceTypeDescription]): Self = this.set("getOptionalServices", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetProperties(value: () => SafeArray[XPropertyTypeDescription]): Self = this.set("getProperties", js.Any.fromFunction0(value))
  }
}
