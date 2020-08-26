package typings.activexLibreoffice.com_.sun.star.configuration.backend

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * holds the data needed to identify a template.
  * @since OOo 1.1.2
  */
@js.native
trait TemplateIdentifier extends js.Object {
  /** specifies the component where the template originates. */
  var Component: String = js.native
  /**
    * specifies the name of the template.
    *
    * The name is unique within a component.
    */
  var Name: String = js.native
}

object TemplateIdentifier {
  @scala.inline
  def apply(Component: String, Name: String): TemplateIdentifier = {
    val __obj = js.Dynamic.literal(Component = Component.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateIdentifier]
  }
  @scala.inline
  implicit class TemplateIdentifierOps[Self <: TemplateIdentifier] (val x: Self) extends AnyVal {
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
    def setComponent(value: String): Self = this.set("Component", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
  }
  
}

