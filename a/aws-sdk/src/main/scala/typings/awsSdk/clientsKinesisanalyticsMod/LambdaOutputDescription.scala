package typings.awsSdk.clientsKinesisanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LambdaOutputDescription extends StObject {
  
  /**
    * Amazon Resource Name (ARN) of the destination Lambda function.
    */
  var ResourceARN: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsMod.ResourceARN] = js.undefined
  
  /**
    * ARN of the IAM role that Amazon Kinesis Analytics can assume to write to the destination function.
    */
  var RoleARN: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsMod.RoleARN] = js.undefined
}
object LambdaOutputDescription {
  
  inline def apply(): LambdaOutputDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LambdaOutputDescription]
  }
  
  extension [Self <: LambdaOutputDescription](x: Self) {
    
    inline def setResourceARN(value: ResourceARN): Self = StObject.set(x, "ResourceARN", value.asInstanceOf[js.Any])
    
    inline def setResourceARNUndefined: Self = StObject.set(x, "ResourceARN", js.undefined)
    
    inline def setRoleARN(value: RoleARN): Self = StObject.set(x, "RoleARN", value.asInstanceOf[js.Any])
    
    inline def setRoleARNUndefined: Self = StObject.set(x, "RoleARN", js.undefined)
  }
}
