package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListManagedJobTemplatesResponse extends StObject {
  
  /**
    * A list of managed job templates that are returned.
    */
  var managedJobTemplates: js.UndefOr[ManagedJobTemplatesSummaryList] = js.undefined
  
  /**
    * The token to retrieve the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListManagedJobTemplatesResponse {
  
  inline def apply(): ListManagedJobTemplatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListManagedJobTemplatesResponse]
  }
  
  extension [Self <: ListManagedJobTemplatesResponse](x: Self) {
    
    inline def setManagedJobTemplates(value: ManagedJobTemplatesSummaryList): Self = StObject.set(x, "managedJobTemplates", value.asInstanceOf[js.Any])
    
    inline def setManagedJobTemplatesUndefined: Self = StObject.set(x, "managedJobTemplates", js.undefined)
    
    inline def setManagedJobTemplatesVarargs(value: ManagedJobTemplateSummary*): Self = StObject.set(x, "managedJobTemplates", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
