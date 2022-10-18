package typings.awsSdk.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricsFilter extends StObject {
  
  /**
    * The access point ARN used when evaluating a metrics filter.
    */
  var AccessPointArn: js.UndefOr[typings.awsSdk.clientsS3Mod.AccessPointArn] = js.undefined
  
  /**
    * A conjunction (logical AND) of predicates, which is used in evaluating a metrics filter. The operator must have at least two predicates, and an object must match all of the predicates in order for the filter to apply.
    */
  var And: js.UndefOr[MetricsAndOperator] = js.undefined
  
  /**
    * The prefix used when evaluating a metrics filter.
    */
  var Prefix: js.UndefOr[typings.awsSdk.clientsS3Mod.Prefix] = js.undefined
  
  /**
    * The tag used when evaluating a metrics filter.
    */
  var Tag: js.UndefOr[typings.awsSdk.clientsS3Mod.Tag] = js.undefined
}
object MetricsFilter {
  
  inline def apply(): MetricsFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricsFilter]
  }
  
  extension [Self <: MetricsFilter](x: Self) {
    
    inline def setAccessPointArn(value: AccessPointArn): Self = StObject.set(x, "AccessPointArn", value.asInstanceOf[js.Any])
    
    inline def setAccessPointArnUndefined: Self = StObject.set(x, "AccessPointArn", js.undefined)
    
    inline def setAnd(value: MetricsAndOperator): Self = StObject.set(x, "And", value.asInstanceOf[js.Any])
    
    inline def setAndUndefined: Self = StObject.set(x, "And", js.undefined)
    
    inline def setPrefix(value: Prefix): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "Prefix", js.undefined)
    
    inline def setTag(value: Tag): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
  }
}
