package typings.awsSdk.clientsMarketplacecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartChangeSetRequest extends StObject {
  
  /**
    * The catalog related to the request. Fixed value: AWSMarketplace 
    */
  var Catalog: typings.awsSdk.clientsMarketplacecatalogMod.Catalog
  
  /**
    * Array of change object.
    */
  var ChangeSet: RequestedChangeList
  
  /**
    * Optional case sensitive string of up to 100 ASCII characters. The change set name can be used to filter the list of change sets. 
    */
  var ChangeSetName: js.UndefOr[typings.awsSdk.clientsMarketplacecatalogMod.ChangeSetName] = js.undefined
  
  /**
    * A list of objects specifying each key name and value for the ChangeSetTags property.
    */
  var ChangeSetTags: js.UndefOr[TagList] = js.undefined
  
  /**
    * A unique token to identify the request to ensure idempotency.
    */
  var ClientRequestToken: js.UndefOr[typings.awsSdk.clientsMarketplacecatalogMod.ClientRequestToken] = js.undefined
}
object StartChangeSetRequest {
  
  inline def apply(Catalog: Catalog, ChangeSet: RequestedChangeList): StartChangeSetRequest = {
    val __obj = js.Dynamic.literal(Catalog = Catalog.asInstanceOf[js.Any], ChangeSet = ChangeSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartChangeSetRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartChangeSetRequest] (val x: Self) extends AnyVal {
    
    inline def setCatalog(value: Catalog): Self = StObject.set(x, "Catalog", value.asInstanceOf[js.Any])
    
    inline def setChangeSet(value: RequestedChangeList): Self = StObject.set(x, "ChangeSet", value.asInstanceOf[js.Any])
    
    inline def setChangeSetName(value: ChangeSetName): Self = StObject.set(x, "ChangeSetName", value.asInstanceOf[js.Any])
    
    inline def setChangeSetNameUndefined: Self = StObject.set(x, "ChangeSetName", js.undefined)
    
    inline def setChangeSetTags(value: TagList): Self = StObject.set(x, "ChangeSetTags", value.asInstanceOf[js.Any])
    
    inline def setChangeSetTagsUndefined: Self = StObject.set(x, "ChangeSetTags", js.undefined)
    
    inline def setChangeSetTagsVarargs(value: Tag*): Self = StObject.set(x, "ChangeSetTags", js.Array(value*))
    
    inline def setChangeSetVarargs(value: Change*): Self = StObject.set(x, "ChangeSet", js.Array(value*))
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
  }
}
