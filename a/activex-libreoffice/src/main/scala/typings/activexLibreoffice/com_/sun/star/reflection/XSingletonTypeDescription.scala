package typings.activexLibreoffice.com_.sun.star.reflection

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.TypeClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Reflects a singleton.
  *
  * This type is superseded by {@link XSingletonTypeDescription2} , which supports interface-based singletons, in addition to the obsolete, service-based
  * singletons.
  *
  * The type class of this type is com::sun::star::uno::TypeClass::SINGLETON.
  * @since OOo 1.1.2
  */
@js.native
trait XSingletonTypeDescription extends XTypeDescription {
  
  /**
    * Returns the service associated with the singleton.
    * @returns the reflection of the service associated with the singleton, for an obsolete, service-based singleton; for an interface-based singleton, `NULL` i
    */
  val Service: XServiceTypeDescription = js.native
  
  /**
    * Returns the service associated with the singleton.
    * @returns the reflection of the service associated with the singleton, for an obsolete, service-based singleton; for an interface-based singleton, `NULL` i
    */
  def getService(): XServiceTypeDescription = js.native
}
object XSingletonTypeDescription {
  
  @scala.inline
  def apply(
    Name: String,
    Service: XServiceTypeDescription,
    TypeClass: TypeClass,
    acquire: () => Unit,
    getName: () => String,
    getService: () => XServiceTypeDescription,
    getTypeClass: () => TypeClass,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XSingletonTypeDescription = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Service = Service.asInstanceOf[js.Any], TypeClass = TypeClass.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getName = js.Any.fromFunction0(getName), getService = js.Any.fromFunction0(getService), getTypeClass = js.Any.fromFunction0(getTypeClass), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XSingletonTypeDescription]
  }
  
  @scala.inline
  implicit class XSingletonTypeDescriptionOps[Self <: XSingletonTypeDescription] (val x: Self) extends AnyVal {
    
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
    def setService(value: XServiceTypeDescription): Self = this.set("Service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetService(value: () => XServiceTypeDescription): Self = this.set("getService", js.Any.fromFunction0(value))
  }
}
