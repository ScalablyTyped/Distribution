package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VerifiedAccessInstance extends StObject {
  
  /**
    * The creation time.
    */
  var CreationTime: js.UndefOr[String] = js.undefined
  
  /**
    * A description for the Amazon Web Services Verified Access instance.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The last updated time.
    */
  var LastUpdatedTime: js.UndefOr[String] = js.undefined
  
  /**
    * The tags.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The ID of the Amazon Web Services Verified Access instance.
    */
  var VerifiedAccessInstanceId: js.UndefOr[String] = js.undefined
  
  /**
    * The IDs of the Amazon Web Services Verified Access trust providers.
    */
  var VerifiedAccessTrustProviders: js.UndefOr[VerifiedAccessTrustProviderCondensedList] = js.undefined
}
object VerifiedAccessInstance {
  
  inline def apply(): VerifiedAccessInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VerifiedAccessInstance]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VerifiedAccessInstance] (val x: Self) extends AnyVal {
    
    inline def setCreationTime(value: String): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setLastUpdatedTime(value: String): Self = StObject.set(x, "LastUpdatedTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimeUndefined: Self = StObject.set(x, "LastUpdatedTime", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setVerifiedAccessInstanceId(value: String): Self = StObject.set(x, "VerifiedAccessInstanceId", value.asInstanceOf[js.Any])
    
    inline def setVerifiedAccessInstanceIdUndefined: Self = StObject.set(x, "VerifiedAccessInstanceId", js.undefined)
    
    inline def setVerifiedAccessTrustProviders(value: VerifiedAccessTrustProviderCondensedList): Self = StObject.set(x, "VerifiedAccessTrustProviders", value.asInstanceOf[js.Any])
    
    inline def setVerifiedAccessTrustProvidersUndefined: Self = StObject.set(x, "VerifiedAccessTrustProviders", js.undefined)
    
    inline def setVerifiedAccessTrustProvidersVarargs(value: VerifiedAccessTrustProviderCondensed*): Self = StObject.set(x, "VerifiedAccessTrustProviders", js.Array(value*))
  }
}
