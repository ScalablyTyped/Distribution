package typings.awsSdk.clientsStepfunctionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateMapRunInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of a Map Run.
    */
  var mapRunArn: LongArn
  
  /**
    * The maximum number of child workflow executions that can be specified to run in parallel for the Map Run at the same time.
    */
  var maxConcurrency: js.UndefOr[MaxConcurrency] = js.undefined
  
  /**
    * The maximum number of failed items before the Map Run fails.
    */
  var toleratedFailureCount: js.UndefOr[ToleratedFailureCount] = js.undefined
  
  /**
    * The maximum percentage of failed items before the Map Run fails.
    */
  var toleratedFailurePercentage: js.UndefOr[ToleratedFailurePercentage] = js.undefined
}
object UpdateMapRunInput {
  
  inline def apply(mapRunArn: LongArn): UpdateMapRunInput = {
    val __obj = js.Dynamic.literal(mapRunArn = mapRunArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateMapRunInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateMapRunInput] (val x: Self) extends AnyVal {
    
    inline def setMapRunArn(value: LongArn): Self = StObject.set(x, "mapRunArn", value.asInstanceOf[js.Any])
    
    inline def setMaxConcurrency(value: MaxConcurrency): Self = StObject.set(x, "maxConcurrency", value.asInstanceOf[js.Any])
    
    inline def setMaxConcurrencyUndefined: Self = StObject.set(x, "maxConcurrency", js.undefined)
    
    inline def setToleratedFailureCount(value: ToleratedFailureCount): Self = StObject.set(x, "toleratedFailureCount", value.asInstanceOf[js.Any])
    
    inline def setToleratedFailureCountUndefined: Self = StObject.set(x, "toleratedFailureCount", js.undefined)
    
    inline def setToleratedFailurePercentage(value: ToleratedFailurePercentage): Self = StObject.set(x, "toleratedFailurePercentage", value.asInstanceOf[js.Any])
    
    inline def setToleratedFailurePercentageUndefined: Self = StObject.set(x, "toleratedFailurePercentage", js.undefined)
  }
}
