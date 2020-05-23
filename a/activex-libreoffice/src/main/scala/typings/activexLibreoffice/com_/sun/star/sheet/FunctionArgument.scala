package typings.activexLibreoffice.com_.sun.star.sheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * contains the description of a single argument within a spreadsheet function.
  * @see com.sun.star.sheet.FunctionDescription
  */
trait FunctionArgument extends js.Object {
  /** a description of the argument. */
  var Description: String
  /** determines whether the argument is optional. */
  var IsOptional: Boolean
  /** the name of the argument. */
  var Name: String
}

object FunctionArgument {
  @scala.inline
  def apply(Description: String, IsOptional: Boolean, Name: String): FunctionArgument = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], IsOptional = IsOptional.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionArgument]
  }
}

