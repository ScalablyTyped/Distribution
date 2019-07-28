package typings.activexDashLibreoffice.comNs.sunNs.starNs.configurationNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is implemented by objects that are instances of a named template to provide information about the template.
  *
  * Template names are similar to service names, but apply to structure and content, rather than to type.
  *
  * Often a template description can be retrieved from a repository and then be interpreted by a factory object. Templates provide a means to build new
  * kinds of objects dynamically.
  * @see XTemplateContainer
  */
trait XTemplateInstance extends XInterface {
  /**
    * retrieves the name of the template
    * @returns the name of the template this object was built from or conforms to.
    */
  val TemplateName: String
  /**
    * retrieves the name of the template
    * @returns the name of the template this object was built from or conforms to.
    */
  def getTemplateName(): String
}

object XTemplateInstance {
  @scala.inline
  def apply(
    TemplateName: String,
    acquire: () => Unit,
    getTemplateName: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XTemplateInstance = {
    val __obj = js.Dynamic.literal(TemplateName = TemplateName, acquire = js.Any.fromFunction0(acquire), getTemplateName = js.Any.fromFunction0(getTemplateName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XTemplateInstance]
  }
}

