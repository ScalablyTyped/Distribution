package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainsPiiEntitiesResponse extends StObject {
  
  /**
    * The labels used in the document being analyzed. Individual labels represent personally identifiable information (PII) entity types.
    */
  var Labels: js.UndefOr[ListOfEntityLabels] = js.undefined
}
object ContainsPiiEntitiesResponse {
  
  inline def apply(): ContainsPiiEntitiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainsPiiEntitiesResponse]
  }
  
  extension [Self <: ContainsPiiEntitiesResponse](x: Self) {
    
    inline def setLabels(value: ListOfEntityLabels): Self = StObject.set(x, "Labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "Labels", js.undefined)
    
    inline def setLabelsVarargs(value: EntityLabel*): Self = StObject.set(x, "Labels", js.Array(value*))
  }
}
