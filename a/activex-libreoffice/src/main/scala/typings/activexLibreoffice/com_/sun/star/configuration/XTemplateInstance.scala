package typings.activexLibreoffice.com_.sun.star.configuration

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
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
@js.native
trait XTemplateInstance extends XInterface {
  /**
    * retrieves the name of the template
    * @returns the name of the template this object was built from or conforms to.
    */
  val TemplateName: String = js.native
  /**
    * retrieves the name of the template
    * @returns the name of the template this object was built from or conforms to.
    */
  def getTemplateName(): String = js.native
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
    val __obj = js.Dynamic.literal(TemplateName = TemplateName.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getTemplateName = js.Any.fromFunction0(getTemplateName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XTemplateInstance]
  }
  @scala.inline
  implicit class XTemplateInstanceOps[Self <: XTemplateInstance] (val x: Self) extends AnyVal {
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
    def setTemplateName(value: String): Self = this.set("TemplateName", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetTemplateName(value: () => String): Self = this.set("getTemplateName", js.Any.fromFunction0(value))
  }
  
}

