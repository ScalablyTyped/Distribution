package typings.activexLibreoffice.com_.sun.star.util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This structure describes a single change that is part of a batch of changes. */
trait ElementChange extends js.Object {
  /**
    * This contains the accessor to the element which changed.
    *
    * The type and the value of the accessor depends on the service.
    */
  var Accessor: js.Any
  /** This contains the element that was inserted or changed. */
  var Element: js.Any
  /** This contains the element that was replaced or removed. */
  var ReplacedElement: js.Any
}

object ElementChange {
  @scala.inline
  def apply(Accessor: js.Any, Element: js.Any, ReplacedElement: js.Any): ElementChange = {
    val __obj = js.Dynamic.literal(Accessor = Accessor.asInstanceOf[js.Any], Element = Element.asInstanceOf[js.Any], ReplacedElement = ReplacedElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementChange]
  }
}

