package typings.awsSdk.clientsCloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListImportsOutput extends StObject {
  
  /**
    * A list of stack names that are importing the specified exported output value.
    */
  var Imports: js.UndefOr[typings.awsSdk.clientsCloudformationMod.Imports] = js.undefined
  
  /**
    * A string that identifies the next page of exports. If there is no additional page, this value is null.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsCloudformationMod.NextToken] = js.undefined
}
object ListImportsOutput {
  
  inline def apply(): ListImportsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListImportsOutput]
  }
  
  extension [Self <: ListImportsOutput](x: Self) {
    
    inline def setImports(value: Imports): Self = StObject.set(x, "Imports", value.asInstanceOf[js.Any])
    
    inline def setImportsUndefined: Self = StObject.set(x, "Imports", js.undefined)
    
    inline def setImportsVarargs(value: StackName*): Self = StObject.set(x, "Imports", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
