package typings.awsSdk.clientsElasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAccountAttributesResult extends StObject {
  
  /**
    * The Elastic Beanstalk resource quotas associated with the calling AWS account.
    */
  var ResourceQuotas: js.UndefOr[typings.awsSdk.clientsElasticbeanstalkMod.ResourceQuotas] = js.undefined
}
object DescribeAccountAttributesResult {
  
  inline def apply(): DescribeAccountAttributesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAccountAttributesResult]
  }
  
  extension [Self <: DescribeAccountAttributesResult](x: Self) {
    
    inline def setResourceQuotas(value: ResourceQuotas): Self = StObject.set(x, "ResourceQuotas", value.asInstanceOf[js.Any])
    
    inline def setResourceQuotasUndefined: Self = StObject.set(x, "ResourceQuotas", js.undefined)
  }
}
