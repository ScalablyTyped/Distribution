package typings.activexDashLibreoffice.comNs.sunNs.starNs.configurationNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
trait XTemplateContainer extends XInterface {
  /**
    * retrieves the name of the template
    *
    * If instances of multiple templates are accepted by the container, this is the name of the basic or primary template.
    *
    * Instances of the template must be created using an appropriate factory.
    * @returns the name of the (default) template for elements.
    */
  val ElementTemplateName: String
  /**
    * retrieves the name of the template
    *
    * If instances of multiple templates are accepted by the container, this is the name of the basic or primary template.
    *
    * Instances of the template must be created using an appropriate factory.
    * @returns the name of the (default) template for elements.
    */
  def getElementTemplateName(): String
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
    val __obj = js.Dynamic.literal(ElementTemplateName = ElementTemplateName, acquire = js.Any.fromFunction0(acquire), getElementTemplateName = js.Any.fromFunction0(getElementTemplateName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XTemplateContainer]
  }
}

