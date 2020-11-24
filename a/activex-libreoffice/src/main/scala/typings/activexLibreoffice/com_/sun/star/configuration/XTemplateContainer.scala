package typings.activexLibreoffice.com_.sun.star.configuration

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is implemented by objects that contain instances of a named template to provide information about the template.
  *
  * An implementation will also implement {@link com.sun.star.lang.XSingleServiceFactory} , in which case that interface creates instances of the
  * specified template.
  *
  * If multiple templates are supported, the supported factory interface may be {@link com.sun.star.lang.XMultiServiceFactory} , in which case the
  * `string` returned from {@link XTemplateContainer.getElementTemplateName()} can be used as the service name argument.
  * @see XTemplateInstance
  */
@js.native
trait XTemplateContainer extends XInterface {
  
  /**
    * retrieves the name of the template
    *
    * If instances of multiple templates are accepted by the container, this is the name of the basic or primary template.
    *
    * Instances of the template must be created using an appropriate factory.
    * @returns the name of the (default) template for elements.
    */
  val ElementTemplateName: String = js.native
  
  /**
    * retrieves the name of the template
    *
    * If instances of multiple templates are accepted by the container, this is the name of the basic or primary template.
    *
    * Instances of the template must be created using an appropriate factory.
    * @returns the name of the (default) template for elements.
    */
  def getElementTemplateName(): String = js.native
}
object XTemplateContainer {
  
  @scala.inline
  def apply(
    ElementTemplateName: String,
    acquire: () => Unit,
    getElementTemplateName: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XTemplateContainer = {
    val __obj = js.Dynamic.literal(ElementTemplateName = ElementTemplateName.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getElementTemplateName = js.Any.fromFunction0(getElementTemplateName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XTemplateContainer]
  }
  
  @scala.inline
  implicit class XTemplateContainerOps[Self <: XTemplateContainer] (val x: Self) extends AnyVal {
    
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
    def setElementTemplateName(value: String): Self = this.set("ElementTemplateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetElementTemplateName(value: () => String): Self = this.set("getElementTemplateName", js.Any.fromFunction0(value))
  }
}
