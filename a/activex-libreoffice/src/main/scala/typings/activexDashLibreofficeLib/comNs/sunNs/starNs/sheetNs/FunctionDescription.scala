package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * collects all properties used to describe a function.
  * @see com.sun.star.sheet.FunctionDescriptions
  */
trait FunctionDescription extends js.Object {
  /** returns a sequence of localized descriptions of the function's arguments (in the order specified by the function). */
  var Arguments: stdLib.SafeArray[FunctionArgument]
  /**
    * returns the function's category.
    * @see com.sun.star.sheet.FunctionCategory
    */
  var Category: scala.Double
  /** returns a localized description of the function. */
  var Description: java.lang.String
  /**
    * returns the function's unique identifier.
    * @see com.sun.star.sheet.XFunctionDescriptions
    */
  var Id: scala.Double
  /** returns the localized function's name. */
  var Name: java.lang.String
}

object FunctionDescription {
  @scala.inline
  def apply(
    Arguments: stdLib.SafeArray[FunctionArgument],
    Category: scala.Double,
    Description: java.lang.String,
    Id: scala.Double,
    Name: java.lang.String
  ): FunctionDescription = {
    val __obj = js.Dynamic.literal(Arguments = Arguments, Category = Category, Description = Description, Id = Id, Name = Name)
  
    __obj.asInstanceOf[FunctionDescription]
  }
}

