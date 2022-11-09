package typings.awsSdk.clientsResourceexplorer2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateViewInput extends StObject {
  
  /**
    * This value helps ensure idempotency. Resource Explorer uses this value to prevent the accidental creation of duplicate versions. We recommend that you generate a UUID-type value to ensure the uniqueness of your views.
    */
  var ClientToken: js.UndefOr[CreateViewInputClientTokenString] = js.undefined
  
  /**
    * An array of strings that specify which resources are included in the results of queries made using this view. When you use this view in a Search operation, the filter string is combined with the search's QueryString parameter using a logical AND operator. For information about the supported syntax, see Search query reference for Resource Explorer in the Amazon Web Services Resource Explorer User Guide.  This query string in the context of this operation supports only filter prefixes with optional operators. It doesn't support free-form text. For example, the string region:us* service:ec2 -tag:stage=prod includes all Amazon EC2 resources in any Amazon Web Services Region that begins with the letters us and is not tagged with a key Stage that has the value prod. 
    */
  var Filters: js.UndefOr[SearchFilter] = js.undefined
  
  /**
    * Specifies optional fields that you want included in search results from this view. It is a list of objects that each describe a field to include. The default is an empty list, with no optional fields included in the results.
    */
  var IncludedProperties: js.UndefOr[IncludedPropertyList] = js.undefined
  
  /**
    * Tag key and value pairs that are attached to the view.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The name of the new view. This name appears in the list of views in Resource Explorer. The name must be no more than 64 characters long, and can include letters, digits, and the dash (-) character. The name must be unique within its Amazon Web Services Region.
    */
  var ViewName: typings.awsSdk.clientsResourceexplorer2Mod.ViewName
}
object CreateViewInput {
  
  inline def apply(ViewName: ViewName): CreateViewInput = {
    val __obj = js.Dynamic.literal(ViewName = ViewName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateViewInput]
  }
  
  extension [Self <: CreateViewInput](x: Self) {
    
    inline def setClientToken(value: CreateViewInputClientTokenString): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setFilters(value: SearchFilter): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setIncludedProperties(value: IncludedPropertyList): Self = StObject.set(x, "IncludedProperties", value.asInstanceOf[js.Any])
    
    inline def setIncludedPropertiesUndefined: Self = StObject.set(x, "IncludedProperties", js.undefined)
    
    inline def setIncludedPropertiesVarargs(value: IncludedProperty*): Self = StObject.set(x, "IncludedProperties", js.Array(value*))
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setViewName(value: ViewName): Self = StObject.set(x, "ViewName", value.asInstanceOf[js.Any])
  }
}
