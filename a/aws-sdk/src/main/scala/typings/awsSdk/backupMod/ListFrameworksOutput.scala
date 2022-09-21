package typings.awsSdk.backupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFrameworksOutput extends StObject {
  
  /**
    * A list of frameworks with details for each framework, including the framework name, Amazon Resource Name (ARN), description, number of controls, creation time, and deployment status.
    */
  var Frameworks: js.UndefOr[FrameworkList] = js.undefined
  
  /**
    * An identifier that was returned from the previous call to this operation, which can be used to return the next set of items in the list.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListFrameworksOutput {
  
  inline def apply(): ListFrameworksOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFrameworksOutput]
  }
  
  extension [Self <: ListFrameworksOutput](x: Self) {
    
    inline def setFrameworks(value: FrameworkList): Self = StObject.set(x, "Frameworks", value.asInstanceOf[js.Any])
    
    inline def setFrameworksUndefined: Self = StObject.set(x, "Frameworks", js.undefined)
    
    inline def setFrameworksVarargs(value: Framework*): Self = StObject.set(x, "Frameworks", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
