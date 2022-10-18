package typings.awsSdk.clientsOpsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StackSummary extends StObject {
  
  /**
    * The number of apps.
    */
  var AppsCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The stack's ARN.
    */
  var Arn: js.UndefOr[String] = js.undefined
  
  /**
    * An InstancesCount object with the number of instances in each status.
    */
  var InstancesCount: js.UndefOr[typings.awsSdk.clientsOpsworksMod.InstancesCount] = js.undefined
  
  /**
    * The number of layers.
    */
  var LayersCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The stack name.
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * The stack ID.
    */
  var StackId: js.UndefOr[String] = js.undefined
}
object StackSummary {
  
  inline def apply(): StackSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StackSummary]
  }
  
  extension [Self <: StackSummary](x: Self) {
    
    inline def setAppsCount(value: Integer): Self = StObject.set(x, "AppsCount", value.asInstanceOf[js.Any])
    
    inline def setAppsCountUndefined: Self = StObject.set(x, "AppsCount", js.undefined)
    
    inline def setArn(value: String): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setInstancesCount(value: InstancesCount): Self = StObject.set(x, "InstancesCount", value.asInstanceOf[js.Any])
    
    inline def setInstancesCountUndefined: Self = StObject.set(x, "InstancesCount", js.undefined)
    
    inline def setLayersCount(value: Integer): Self = StObject.set(x, "LayersCount", value.asInstanceOf[js.Any])
    
    inline def setLayersCountUndefined: Self = StObject.set(x, "LayersCount", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setStackId(value: String): Self = StObject.set(x, "StackId", value.asInstanceOf[js.Any])
    
    inline def setStackIdUndefined: Self = StObject.set(x, "StackId", js.undefined)
  }
}
