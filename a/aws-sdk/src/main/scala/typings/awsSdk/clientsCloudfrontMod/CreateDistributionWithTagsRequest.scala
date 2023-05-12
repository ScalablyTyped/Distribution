package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDistributionWithTagsRequest extends StObject {
  
  /**
    * The distribution's configuration information.
    */
  var DistributionConfigWithTags: typings.awsSdk.clientsCloudfrontMod.DistributionConfigWithTags
}
object CreateDistributionWithTagsRequest {
  
  inline def apply(DistributionConfigWithTags: DistributionConfigWithTags): CreateDistributionWithTagsRequest = {
    val __obj = js.Dynamic.literal(DistributionConfigWithTags = DistributionConfigWithTags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDistributionWithTagsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateDistributionWithTagsRequest] (val x: Self) extends AnyVal {
    
    inline def setDistributionConfigWithTags(value: DistributionConfigWithTags): Self = StObject.set(x, "DistributionConfigWithTags", value.asInstanceOf[js.Any])
  }
}
