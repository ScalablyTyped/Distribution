package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSampleFindingsRequest extends StObject {
  
  /**
    * An array of finding types, one for each type of sample finding to create. To create a sample of every type of finding that Amazon Macie supports, don't include this array in your request.
    */
  var findingTypes: js.UndefOr[listOfFindingType] = js.undefined
}
object CreateSampleFindingsRequest {
  
  inline def apply(): CreateSampleFindingsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSampleFindingsRequest]
  }
  
  extension [Self <: CreateSampleFindingsRequest](x: Self) {
    
    inline def setFindingTypes(value: listOfFindingType): Self = StObject.set(x, "findingTypes", value.asInstanceOf[js.Any])
    
    inline def setFindingTypesUndefined: Self = StObject.set(x, "findingTypes", js.undefined)
    
    inline def setFindingTypesVarargs(value: FindingType*): Self = StObject.set(x, "findingTypes", js.Array(value*))
  }
}
