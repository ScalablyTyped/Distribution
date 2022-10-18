package typings.awsSdk.clientsApprunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateConnectionRequest extends StObject {
  
  /**
    * A name for the new connection. It must be unique across all App Runner connections for the Amazon Web Services account in the Amazon Web Services Region.
    */
  var ConnectionName: typings.awsSdk.clientsApprunnerMod.ConnectionName
  
  /**
    * The source repository provider.
    */
  var ProviderType: typings.awsSdk.clientsApprunnerMod.ProviderType
  
  /**
    * A list of metadata items that you can associate with your connection resource. A tag is a key-value pair.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateConnectionRequest {
  
  inline def apply(ConnectionName: ConnectionName, ProviderType: ProviderType): CreateConnectionRequest = {
    val __obj = js.Dynamic.literal(ConnectionName = ConnectionName.asInstanceOf[js.Any], ProviderType = ProviderType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateConnectionRequest]
  }
  
  extension [Self <: CreateConnectionRequest](x: Self) {
    
    inline def setConnectionName(value: ConnectionName): Self = StObject.set(x, "ConnectionName", value.asInstanceOf[js.Any])
    
    inline def setProviderType(value: ProviderType): Self = StObject.set(x, "ProviderType", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
