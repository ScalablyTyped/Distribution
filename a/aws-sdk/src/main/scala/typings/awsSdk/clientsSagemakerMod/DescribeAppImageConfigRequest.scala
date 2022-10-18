package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAppImageConfigRequest extends StObject {
  
  /**
    * The name of the AppImageConfig to describe.
    */
  var AppImageConfigName: typings.awsSdk.clientsSagemakerMod.AppImageConfigName
}
object DescribeAppImageConfigRequest {
  
  inline def apply(AppImageConfigName: AppImageConfigName): DescribeAppImageConfigRequest = {
    val __obj = js.Dynamic.literal(AppImageConfigName = AppImageConfigName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAppImageConfigRequest]
  }
  
  extension [Self <: DescribeAppImageConfigRequest](x: Self) {
    
    inline def setAppImageConfigName(value: AppImageConfigName): Self = StObject.set(x, "AppImageConfigName", value.asInstanceOf[js.Any])
  }
}
