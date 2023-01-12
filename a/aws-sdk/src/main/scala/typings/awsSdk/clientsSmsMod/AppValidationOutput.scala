package typings.awsSdk.clientsSmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppValidationOutput extends StObject {
  
  /**
    * Output from using SSM to validate the application.
    */
  var ssmOutput: js.UndefOr[SSMOutput] = js.undefined
}
object AppValidationOutput {
  
  inline def apply(): AppValidationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppValidationOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppValidationOutput] (val x: Self) extends AnyVal {
    
    inline def setSsmOutput(value: SSMOutput): Self = StObject.set(x, "ssmOutput", value.asInstanceOf[js.Any])
    
    inline def setSsmOutputUndefined: Self = StObject.set(x, "ssmOutput", js.undefined)
  }
}
