package typings.awsSdk.clientsResourceexplorer2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait View extends StObject {
  
  /**
    * An array of SearchFilter objects that specify which resources can be included in the results of queries made using this view.
    */
  var Filters: js.UndefOr[SearchFilter] = js.undefined
  
  /**
    * A structure that contains additional information about the view.
    */
  var IncludedProperties: js.UndefOr[IncludedPropertyList] = js.undefined
  
  /**
    * The date and time when this view was last modified.
    */
  var LastUpdatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Web Services account that owns this view.
    */
  var Owner: js.UndefOr[String] = js.undefined
  
  /**
    * An Amazon resource name (ARN) of an Amazon Web Services account, an organization, or an organizational unit (OU) that specifies whether this view includes resources from only the specified Amazon Web Services account, all accounts in the specified organization, or all accounts in the specified OU. If not specified, the value defaults to the Amazon Web Services account used to call this operation.
    */
  var Scope: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon resource name (ARN) of the view.
    */
  var ViewArn: js.UndefOr[String] = js.undefined
}
object View {
  
  inline def apply(): View = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[View]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: View] (val x: Self) extends AnyVal {
    
    inline def setFilters(value: SearchFilter): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setIncludedProperties(value: IncludedPropertyList): Self = StObject.set(x, "IncludedProperties", value.asInstanceOf[js.Any])
    
    inline def setIncludedPropertiesUndefined: Self = StObject.set(x, "IncludedProperties", js.undefined)
    
    inline def setIncludedPropertiesVarargs(value: IncludedProperty*): Self = StObject.set(x, "IncludedProperties", js.Array(value*))
    
    inline def setLastUpdatedAt(value: js.Date): Self = StObject.set(x, "LastUpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedAtUndefined: Self = StObject.set(x, "LastUpdatedAt", js.undefined)
    
    inline def setOwner(value: String): Self = StObject.set(x, "Owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "Owner", js.undefined)
    
    inline def setScope(value: String): Self = StObject.set(x, "Scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "Scope", js.undefined)
    
    inline def setViewArn(value: String): Self = StObject.set(x, "ViewArn", value.asInstanceOf[js.Any])
    
    inline def setViewArnUndefined: Self = StObject.set(x, "ViewArn", js.undefined)
  }
}
