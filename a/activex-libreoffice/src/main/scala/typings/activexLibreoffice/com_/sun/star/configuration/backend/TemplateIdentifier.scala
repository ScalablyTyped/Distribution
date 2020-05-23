package typings.activexLibreoffice.com_.sun.star.configuration.backend

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * holds the data needed to identify a template.
  * @since OOo 1.1.2
  */
trait TemplateIdentifier extends js.Object {
  /** specifies the component where the template originates. */
  var Component: String
  /**
    * specifies the name of the template.
    *
    * The name is unique within a component.
    */
  var Name: String
}

object TemplateIdentifier {
  @scala.inline
  def apply(Component: String, Name: String): TemplateIdentifier = {
    val __obj = js.Dynamic.literal(Component = Component.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateIdentifier]
  }
}

