package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkInsightsAccessScope extends StObject {
  
  /**
    * The creation date.
    */
  var CreatedDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the Network Access Scope.
    */
  var NetworkInsightsAccessScopeArn: js.UndefOr[ResourceArn] = js.undefined
  
  /**
    * The ID of the Network Access Scope.
    */
  var NetworkInsightsAccessScopeId: js.UndefOr[typings.awsSdk.clientsEc2Mod.NetworkInsightsAccessScopeId] = js.undefined
  
  /**
    * The tags.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The last updated date.
    */
  var UpdatedDate: js.UndefOr[js.Date] = js.undefined
}
object NetworkInsightsAccessScope {
  
  inline def apply(): NetworkInsightsAccessScope = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkInsightsAccessScope]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NetworkInsightsAccessScope] (val x: Self) extends AnyVal {
    
    inline def setCreatedDate(value: js.Date): Self = StObject.set(x, "CreatedDate", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateUndefined: Self = StObject.set(x, "CreatedDate", js.undefined)
    
    inline def setNetworkInsightsAccessScopeArn(value: ResourceArn): Self = StObject.set(x, "NetworkInsightsAccessScopeArn", value.asInstanceOf[js.Any])
    
    inline def setNetworkInsightsAccessScopeArnUndefined: Self = StObject.set(x, "NetworkInsightsAccessScopeArn", js.undefined)
    
    inline def setNetworkInsightsAccessScopeId(value: NetworkInsightsAccessScopeId): Self = StObject.set(x, "NetworkInsightsAccessScopeId", value.asInstanceOf[js.Any])
    
    inline def setNetworkInsightsAccessScopeIdUndefined: Self = StObject.set(x, "NetworkInsightsAccessScopeId", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setUpdatedDate(value: js.Date): Self = StObject.set(x, "UpdatedDate", value.asInstanceOf[js.Any])
    
    inline def setUpdatedDateUndefined: Self = StObject.set(x, "UpdatedDate", js.undefined)
  }
}
