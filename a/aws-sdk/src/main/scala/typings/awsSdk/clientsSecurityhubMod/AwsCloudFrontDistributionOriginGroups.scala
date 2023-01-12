package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsCloudFrontDistributionOriginGroups extends StObject {
  
  /**
    * The list of origin groups.
    */
  var Items: js.UndefOr[AwsCloudFrontDistributionOriginGroupsItemList] = js.undefined
}
object AwsCloudFrontDistributionOriginGroups {
  
  inline def apply(): AwsCloudFrontDistributionOriginGroups = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsCloudFrontDistributionOriginGroups]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsCloudFrontDistributionOriginGroups] (val x: Self) extends AnyVal {
    
    inline def setItems(value: AwsCloudFrontDistributionOriginGroupsItemList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    inline def setItemsVarargs(value: AwsCloudFrontDistributionOriginGroup*): Self = StObject.set(x, "Items", js.Array(value*))
  }
}
