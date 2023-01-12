package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListManagedJobTemplatesRequest extends StObject {
  
  /**
    * Maximum number of entries that can be returned.
    */
  var maxResults: js.UndefOr[LaserMaxResults] = js.undefined
  
  /**
    * The token to retrieve the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * An optional parameter for template name. If specified, only the versions of the managed job templates that have the specified template name will be returned.
    */
  var templateName: js.UndefOr[ManagedJobTemplateName] = js.undefined
}
object ListManagedJobTemplatesRequest {
  
  inline def apply(): ListManagedJobTemplatesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListManagedJobTemplatesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListManagedJobTemplatesRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: LaserMaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setTemplateName(value: ManagedJobTemplateName): Self = StObject.set(x, "templateName", value.asInstanceOf[js.Any])
    
    inline def setTemplateNameUndefined: Self = StObject.set(x, "templateName", js.undefined)
  }
}
