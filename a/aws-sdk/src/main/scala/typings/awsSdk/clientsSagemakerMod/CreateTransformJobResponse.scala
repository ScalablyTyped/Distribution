package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTransformJobResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the transform job.
    */
  var TransformJobArn: typings.awsSdk.clientsSagemakerMod.TransformJobArn
}
object CreateTransformJobResponse {
  
  inline def apply(TransformJobArn: TransformJobArn): CreateTransformJobResponse = {
    val __obj = js.Dynamic.literal(TransformJobArn = TransformJobArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTransformJobResponse]
  }
  
  extension [Self <: CreateTransformJobResponse](x: Self) {
    
    inline def setTransformJobArn(value: TransformJobArn): Self = StObject.set(x, "TransformJobArn", value.asInstanceOf[js.Any])
  }
}
