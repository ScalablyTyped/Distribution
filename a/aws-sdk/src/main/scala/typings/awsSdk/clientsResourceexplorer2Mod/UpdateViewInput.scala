package typings.awsSdk.clientsResourceexplorer2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateViewInput extends StObject {
  
  /**
    * An array of strings that specify which resources are included in the results of queries made using this view. When you use this view in a Search operation, the filter string is combined with the search's QueryString parameter using a logical AND operator. For information about the supported syntax, see Search query reference for Resource Explorer in the Amazon Web Services Resource Explorer User Guide.  This query string in the context of this operation supports only filter prefixes with optional operators. It doesn't support free-form text. For example, the string region:us* service:ec2 -tag:stage=prod includes all Amazon EC2 resources in any Amazon Web Services Region that begins with the letters us and is not tagged with a key Stage that has the value prod. 
    */
  var Filters: js.UndefOr[SearchFilter] = js.undefined
  
  /**
    * Specifies optional fields that you want included in search results from this view. It is a list of objects that each describe a field to include. The default is an empty list, with no optional fields included in the results.
    */
  var IncludedProperties: js.UndefOr[IncludedPropertyList] = js.undefined
  
  /**
    * The Amazon resource name (ARN) of the view that you want to modify.
    */
  var ViewArn: UpdateViewInputViewArnString
}
object UpdateViewInput {
  
  inline def apply(ViewArn: UpdateViewInputViewArnString): UpdateViewInput = {
    val __obj = js.Dynamic.literal(ViewArn = ViewArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateViewInput]
  }
  
  extension [Self <: UpdateViewInput](x: Self) {
    
    inline def setFilters(value: SearchFilter): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setIncludedProperties(value: IncludedPropertyList): Self = StObject.set(x, "IncludedProperties", value.asInstanceOf[js.Any])
    
    inline def setIncludedPropertiesUndefined: Self = StObject.set(x, "IncludedProperties", js.undefined)
    
    inline def setIncludedPropertiesVarargs(value: IncludedProperty*): Self = StObject.set(x, "IncludedProperties", js.Array(value*))
    
    inline def setViewArn(value: UpdateViewInputViewArnString): Self = StObject.set(x, "ViewArn", value.asInstanceOf[js.Any])
  }
}
