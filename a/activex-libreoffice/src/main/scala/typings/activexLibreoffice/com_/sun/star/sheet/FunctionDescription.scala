package typings.activexLibreoffice.com_.sun.star.sheet

import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * collects all properties used to describe a function.
  * @see com.sun.star.sheet.FunctionDescriptions
  */
trait FunctionDescription extends js.Object {
  /** returns a sequence of localized descriptions of the function's arguments (in the order specified by the function). */
  var Arguments: SafeArray[FunctionArgument]
  /**
    * returns the function's category.
    * @see com.sun.star.sheet.FunctionCategory
    */
  var Category: Double
  /** returns a localized description of the function. */
  var Description: String
  /**
    * returns the function's unique identifier.
    * @see com.sun.star.sheet.XFunctionDescriptions
    */
  var Id: Double
  /** returns the localized function's name. */
  var Name: String
}

object FunctionDescription {
  @scala.inline
  def apply(
    Arguments: SafeArray[FunctionArgument],
    Category: Double,
    Description: String,
    Id: Double,
    Name: String
  ): FunctionDescription = {
    val __obj = js.Dynamic.literal(Arguments = Arguments.asInstanceOf[js.Any], Category = Category.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionDescription]
  }
}

