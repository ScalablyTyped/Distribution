package typings.awsSdk.clientsCodecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDifferencesOutput extends StObject {
  
  /**
    * An enumeration token that can be used in a request to return the next batch of the results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsCodecommitMod.NextToken] = js.undefined
  
  /**
    * A data type object that contains information about the differences, including whether the difference is added, modified, or deleted (A, D, M).
    */
  var differences: js.UndefOr[DifferenceList] = js.undefined
}
object GetDifferencesOutput {
  
  inline def apply(): GetDifferencesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDifferencesOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetDifferencesOutput] (val x: Self) extends AnyVal {
    
    inline def setDifferences(value: DifferenceList): Self = StObject.set(x, "differences", value.asInstanceOf[js.Any])
    
    inline def setDifferencesUndefined: Self = StObject.set(x, "differences", js.undefined)
    
    inline def setDifferencesVarargs(value: Difference*): Self = StObject.set(x, "differences", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
