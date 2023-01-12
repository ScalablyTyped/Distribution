package typings.awsSdk.clientsCloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutMetricStreamOutput extends StObject {
  
  /**
    * The ARN of the metric stream.
    */
  var Arn: js.UndefOr[AmazonResourceName] = js.undefined
}
object PutMetricStreamOutput {
  
  inline def apply(): PutMetricStreamOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutMetricStreamOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutMetricStreamOutput] (val x: Self) extends AnyVal {
    
    inline def setArn(value: AmazonResourceName): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
  }
}
