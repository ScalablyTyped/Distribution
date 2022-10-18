package typings.awsSdk.clientsBackupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFrameworksInput extends StObject {
  
  /**
    * The number of desired results from 1 to 1000. Optional. If unspecified, the query will return 1 MB of data.
    */
  var MaxResults: js.UndefOr[MaxFrameworkInputs] = js.undefined
  
  /**
    * An identifier that was returned from the previous call to this operation, which can be used to return the next set of items in the list.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListFrameworksInput {
  
  inline def apply(): ListFrameworksInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFrameworksInput]
  }
  
  extension [Self <: ListFrameworksInput](x: Self) {
    
    inline def setMaxResults(value: MaxFrameworkInputs): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
