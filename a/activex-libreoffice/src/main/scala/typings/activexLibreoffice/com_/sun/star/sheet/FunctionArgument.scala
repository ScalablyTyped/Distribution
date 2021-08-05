package typings.activexLibreoffice.com_.sun.star.sheet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * contains the description of a single argument within a spreadsheet function.
  * @see com.sun.star.sheet.FunctionDescription
  */
trait FunctionArgument extends StObject {
  
  /** a description of the argument. */
  var Description: String
  
  /** determines whether the argument is optional. */
  var IsOptional: Boolean
  
  /** the name of the argument. */
  var Name: String
}
object FunctionArgument {
  
  inline def apply(Description: String, IsOptional: Boolean, Name: String): FunctionArgument = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], IsOptional = IsOptional.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionArgument]
  }
  
  extension [Self <: FunctionArgument](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setIsOptional(value: Boolean): Self = StObject.set(x, "IsOptional", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
