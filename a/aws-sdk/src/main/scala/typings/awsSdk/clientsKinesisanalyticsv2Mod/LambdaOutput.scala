package typings.awsSdk.clientsKinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LambdaOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the destination Lambda function to write to.  To specify an earlier version of the Lambda function than the latest, include the Lambda function version in the Lambda function ARN. For more information about Lambda ARNs, see Example ARNs: Amazon Lambda  
    */
  var ResourceARN: typings.awsSdk.clientsKinesisanalyticsv2Mod.ResourceARN
}
object LambdaOutput {
  
  inline def apply(ResourceARN: ResourceARN): LambdaOutput = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[LambdaOutput]
  }
  
  extension [Self <: LambdaOutput](x: Self) {
    
    inline def setResourceARN(value: ResourceARN): Self = StObject.set(x, "ResourceARN", value.asInstanceOf[js.Any])
  }
}
