package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs

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
trait XTemplateContainer
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * retrieves the name of the template
    *
    * If instances of multiple templates are accepted by the container, this is the name of the basic or primary template.
    *
    * Instances of the template must be created using an appropriate factory.
    * @returns the name of the (default) template for elements.
    */
  val ElementTemplateName: java.lang.String
  /**
    * retrieves the name of the template
    *
    * If instances of multiple templates are accepted by the container, this is the name of the basic or primary template.
    *
    * Instances of the template must be created using an appropriate factory.
    * @returns the name of the (default) template for elements.
    */
  def getElementTemplateName(): java.lang.String
}

object XTemplateContainer {
  @scala.inline
  def apply(
    ElementTemplateName: java.lang.String,
    acquire: js.Function0[scala.Unit],
    getElementTemplateName: js.Function0[java.lang.String],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XTemplateContainer = {
    val __obj = js.Dynamic.literal(ElementTemplateName = ElementTemplateName, acquire = acquire, getElementTemplateName = getElementTemplateName, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XTemplateContainer]
  }
}

