package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs

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
trait XTemplateInstance
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * retrieves the name of the template
    * @returns the name of the template this object was built from or conforms to.
    */
  val TemplateName: java.lang.String
  /**
    * retrieves the name of the template
    * @returns the name of the template this object was built from or conforms to.
    */
  def getTemplateName(): java.lang.String
}

object XTemplateInstance {
  @scala.inline
  def apply(
    TemplateName: java.lang.String,
    acquire: js.Function0[scala.Unit],
    getTemplateName: js.Function0[java.lang.String],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XTemplateInstance = {
    val __obj = js.Dynamic.literal(TemplateName = TemplateName, acquire = acquire, getTemplateName = getTemplateName, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XTemplateInstance]
  }
}

