package typings.awsSdk.clientsCloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeFilters extends StObject {
  
  /**
    * The category of extensions to return.    REGISTERED: Private extensions that have been registered for this account and region.    ACTIVATED: Public extensions that have been activated for this account and region.    THIRD_PARTY: Extensions available for use from publishers other than Amazon. This includes:   Private extensions registered in the account.   Public extensions from publishers other than Amazon, whether activated or not.      AWS_TYPES: Extensions available for use from Amazon.  
    */
  var Category: js.UndefOr[typings.awsSdk.clientsCloudformationMod.Category] = js.undefined
  
  /**
    * The id of the publisher of the extension. Extensions published by Amazon aren't assigned a publisher ID. Use the AWS_TYPES category to specify a list of types published by Amazon.
    */
  var PublisherId: js.UndefOr[typings.awsSdk.clientsCloudformationMod.PublisherId] = js.undefined
  
  /**
    * A prefix to use as a filter for results.
    */
  var TypeNamePrefix: js.UndefOr[typings.awsSdk.clientsCloudformationMod.TypeNamePrefix] = js.undefined
}
object TypeFilters {
  
  inline def apply(): TypeFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypeFilters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeFilters] (val x: Self) extends AnyVal {
    
    inline def setCategory(value: Category): Self = StObject.set(x, "Category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "Category", js.undefined)
    
    inline def setPublisherId(value: PublisherId): Self = StObject.set(x, "PublisherId", value.asInstanceOf[js.Any])
    
    inline def setPublisherIdUndefined: Self = StObject.set(x, "PublisherId", js.undefined)
    
    inline def setTypeNamePrefix(value: TypeNamePrefix): Self = StObject.set(x, "TypeNamePrefix", value.asInstanceOf[js.Any])
    
    inline def setTypeNamePrefixUndefined: Self = StObject.set(x, "TypeNamePrefix", js.undefined)
  }
}
