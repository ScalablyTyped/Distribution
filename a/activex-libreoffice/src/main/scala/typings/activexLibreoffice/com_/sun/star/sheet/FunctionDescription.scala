package typings.activexLibreoffice.com_.sun.star.sheet

import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * collects all properties used to describe a function.
  * @see com.sun.star.sheet.FunctionDescriptions
  */
trait FunctionDescription extends StObject {
  
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
  
  @scala.inline
  implicit class FunctionDescriptionMutableBuilder[Self <: FunctionDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArguments(value: SafeArray[FunctionArgument]): Self = StObject.set(x, "Arguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategory(value: Double): Self = StObject.set(x, "Category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
