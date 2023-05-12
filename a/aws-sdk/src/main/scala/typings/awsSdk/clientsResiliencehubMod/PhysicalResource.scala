package typings.awsSdk.clientsResiliencehubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhysicalResource extends StObject {
  
  /**
    * Additional configuration parameters for an Resilience Hub application. If you want to implement additionalInfo through the Resilience Hub console rather than using an API call, see Configure the application configuration parameters.  Currently, this parameter accepts a key-value mapping (in a string format) of only one failover region and one associated account. Key: "failover-regions"  Value: "[{"region":"&lt;REGION&gt;", "accounts":[{"id":"&lt;ACCOUNT_ID&gt;"}]}]"  
    */
  var additionalInfo: js.UndefOr[AdditionalInfoMap] = js.undefined
  
  /**
    * The application components that belong to this resource.
    */
  var appComponents: js.UndefOr[AppComponentList] = js.undefined
  
  /**
    * Indicates if a resource is included or excluded from the assessment.
    */
  var excluded: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * The logical identifier of the resource.
    */
  var logicalResourceId: LogicalResourceId
  
  /**
    * The name of the parent resource.
    */
  var parentResourceName: js.UndefOr[EntityName] = js.undefined
  
  /**
    * The physical identifier of the resource.
    */
  var physicalResourceId: PhysicalResourceId
  
  /**
    * The name of the resource.
    */
  var resourceName: js.UndefOr[EntityName] = js.undefined
  
  /**
    * The type of resource.
    */
  var resourceType: String255
  
  /**
    * The type of input source.
    */
  var sourceType: js.UndefOr[ResourceSourceType] = js.undefined
}
object PhysicalResource {
  
  inline def apply(
    logicalResourceId: LogicalResourceId,
    physicalResourceId: PhysicalResourceId,
    resourceType: String255
  ): PhysicalResource = {
    val __obj = js.Dynamic.literal(logicalResourceId = logicalResourceId.asInstanceOf[js.Any], physicalResourceId = physicalResourceId.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhysicalResource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PhysicalResource] (val x: Self) extends AnyVal {
    
    inline def setAdditionalInfo(value: AdditionalInfoMap): Self = StObject.set(x, "additionalInfo", value.asInstanceOf[js.Any])
    
    inline def setAdditionalInfoUndefined: Self = StObject.set(x, "additionalInfo", js.undefined)
    
    inline def setAppComponents(value: AppComponentList): Self = StObject.set(x, "appComponents", value.asInstanceOf[js.Any])
    
    inline def setAppComponentsUndefined: Self = StObject.set(x, "appComponents", js.undefined)
    
    inline def setAppComponentsVarargs(value: AppComponent*): Self = StObject.set(x, "appComponents", js.Array(value*))
    
    inline def setExcluded(value: BooleanOptional): Self = StObject.set(x, "excluded", value.asInstanceOf[js.Any])
    
    inline def setExcludedUndefined: Self = StObject.set(x, "excluded", js.undefined)
    
    inline def setLogicalResourceId(value: LogicalResourceId): Self = StObject.set(x, "logicalResourceId", value.asInstanceOf[js.Any])
    
    inline def setParentResourceName(value: EntityName): Self = StObject.set(x, "parentResourceName", value.asInstanceOf[js.Any])
    
    inline def setParentResourceNameUndefined: Self = StObject.set(x, "parentResourceName", js.undefined)
    
    inline def setPhysicalResourceId(value: PhysicalResourceId): Self = StObject.set(x, "physicalResourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceName(value: EntityName): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    inline def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
    
    inline def setResourceType(value: String255): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setSourceType(value: ResourceSourceType): Self = StObject.set(x, "sourceType", value.asInstanceOf[js.Any])
    
    inline def setSourceTypeUndefined: Self = StObject.set(x, "sourceType", js.undefined)
  }
}
