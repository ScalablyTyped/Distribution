package typings.awsSdk.clientsSsmincidentsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponsePlanSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the response plan.
    */
  var arn: Arn
  
  /**
    * The human readable name of the response plan. This can include spaces.
    */
  var displayName: js.UndefOr[ResponsePlanDisplayName] = js.undefined
  
  /**
    * The name of the response plan. This can't include spaces.
    */
  var name: ResponsePlanName
}
object ResponsePlanSummary {
  
  inline def apply(arn: Arn, name: ResponsePlanName): ResponsePlanSummary = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponsePlanSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponsePlanSummary] (val x: Self) extends AnyVal {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setDisplayName(value: ResponsePlanDisplayName): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setName(value: ResponsePlanName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
