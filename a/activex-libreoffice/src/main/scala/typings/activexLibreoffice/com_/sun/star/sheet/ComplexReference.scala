package typings.activexLibreoffice.com_.sun.star.sheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** contains a reference to a cell range. */
trait ComplexReference extends js.Object {
  /** is the first reference. */
  var Reference1: SingleReference
  /** is the second reference. */
  var Reference2: SingleReference
}

object ComplexReference {
  @scala.inline
  def apply(Reference1: SingleReference, Reference2: SingleReference): ComplexReference = {
    val __obj = js.Dynamic.literal(Reference1 = Reference1.asInstanceOf[js.Any], Reference2 = Reference2.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComplexReference]
  }
}

