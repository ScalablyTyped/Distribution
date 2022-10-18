package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTransformJobRequest extends StObject {
  
  /**
    * The name of the transform job that you want to view details of.
    */
  var TransformJobName: typings.awsSdk.clientsSagemakerMod.TransformJobName
}
object DescribeTransformJobRequest {
  
  inline def apply(TransformJobName: TransformJobName): DescribeTransformJobRequest = {
    val __obj = js.Dynamic.literal(TransformJobName = TransformJobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTransformJobRequest]
  }
  
  extension [Self <: DescribeTransformJobRequest](x: Self) {
    
    inline def setTransformJobName(value: TransformJobName): Self = StObject.set(x, "TransformJobName", value.asInstanceOf[js.Any])
  }
}
