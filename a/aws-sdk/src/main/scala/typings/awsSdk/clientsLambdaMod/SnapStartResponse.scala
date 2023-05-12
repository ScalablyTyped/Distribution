package typings.awsSdk.clientsLambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnapStartResponse extends StObject {
  
  /**
    * When set to PublishedVersions, Lambda creates a snapshot of the execution environment when you publish a function version.
    */
  var ApplyOn: js.UndefOr[SnapStartApplyOn] = js.undefined
  
  /**
    * When you provide a qualified Amazon Resource Name (ARN), this response element indicates whether SnapStart is activated for the specified function version.
    */
  var OptimizationStatus: js.UndefOr[SnapStartOptimizationStatus] = js.undefined
}
object SnapStartResponse {
  
  inline def apply(): SnapStartResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnapStartResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SnapStartResponse] (val x: Self) extends AnyVal {
    
    inline def setApplyOn(value: SnapStartApplyOn): Self = StObject.set(x, "ApplyOn", value.asInstanceOf[js.Any])
    
    inline def setApplyOnUndefined: Self = StObject.set(x, "ApplyOn", js.undefined)
    
    inline def setOptimizationStatus(value: SnapStartOptimizationStatus): Self = StObject.set(x, "OptimizationStatus", value.asInstanceOf[js.Any])
    
    inline def setOptimizationStatusUndefined: Self = StObject.set(x, "OptimizationStatus", js.undefined)
  }
}
