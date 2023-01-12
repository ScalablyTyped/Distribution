package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregateResourceIdentifier extends StObject {
  
  /**
    * The ID of the Amazon Web Services resource.
    */
  var ResourceId: typings.awsSdk.clientsConfigserviceMod.ResourceId
  
  /**
    * The name of the Amazon Web Services resource.
    */
  var ResourceName: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.ResourceName] = js.undefined
  
  /**
    * The type of the Amazon Web Services resource.
    */
  var ResourceType: typings.awsSdk.clientsConfigserviceMod.ResourceType
  
  /**
    * The 12-digit account ID of the source account.
    */
  var SourceAccountId: AccountId
  
  /**
    * The source region where data is aggregated.
    */
  var SourceRegion: AwsRegion
}
object AggregateResourceIdentifier {
  
  inline def apply(
    ResourceId: ResourceId,
    ResourceType: ResourceType,
    SourceAccountId: AccountId,
    SourceRegion: AwsRegion
  ): AggregateResourceIdentifier = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any], SourceAccountId = SourceAccountId.asInstanceOf[js.Any], SourceRegion = SourceRegion.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregateResourceIdentifier]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregateResourceIdentifier] (val x: Self) extends AnyVal {
    
    inline def setResourceId(value: ResourceId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceName(value: ResourceName): Self = StObject.set(x, "ResourceName", value.asInstanceOf[js.Any])
    
    inline def setResourceNameUndefined: Self = StObject.set(x, "ResourceName", js.undefined)
    
    inline def setResourceType(value: ResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setSourceAccountId(value: AccountId): Self = StObject.set(x, "SourceAccountId", value.asInstanceOf[js.Any])
    
    inline def setSourceRegion(value: AwsRegion): Self = StObject.set(x, "SourceRegion", value.asInstanceOf[js.Any])
  }
}
