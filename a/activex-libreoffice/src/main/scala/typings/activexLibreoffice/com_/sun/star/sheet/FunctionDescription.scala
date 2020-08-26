package typings.activexLibreoffice.com_.sun.star.sheet

import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * collects all properties used to describe a function.
  * @see com.sun.star.sheet.FunctionDescriptions
  */
@js.native
trait FunctionDescription extends js.Object {
  /** returns a sequence of localized descriptions of the function's arguments (in the order specified by the function). */
  var Arguments: SafeArray[FunctionArgument] = js.native
  /**
    * returns the function's category.
    * @see com.sun.star.sheet.FunctionCategory
    */
  var Category: Double = js.native
  /** returns a localized description of the function. */
  var Description: String = js.native
  /**
    * returns the function's unique identifier.
    * @see com.sun.star.sheet.XFunctionDescriptions
    */
  var Id: Double = js.native
  /** returns the localized function's name. */
  var Name: String = js.native
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
  @scala.inline
  implicit class FunctionDescriptionOps[Self <: FunctionDescription] (val x: Self) extends AnyVal {
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
    def setArguments(value: SafeArray[FunctionArgument]): Self = this.set("Arguments", value.asInstanceOf[js.Any])
    @scala.inline
    def setCategory(value: Double): Self = this.set("Category", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
  }
  
}

