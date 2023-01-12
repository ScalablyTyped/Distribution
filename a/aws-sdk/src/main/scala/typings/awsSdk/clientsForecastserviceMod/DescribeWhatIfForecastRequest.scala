package typings.awsSdk.clientsForecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeWhatIfForecastRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the what-if forecast that you are interested in.
    */
  var WhatIfForecastArn: LongArn
}
object DescribeWhatIfForecastRequest {
  
  inline def apply(WhatIfForecastArn: LongArn): DescribeWhatIfForecastRequest = {
    val __obj = js.Dynamic.literal(WhatIfForecastArn = WhatIfForecastArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeWhatIfForecastRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeWhatIfForecastRequest] (val x: Self) extends AnyVal {
    
    inline def setWhatIfForecastArn(value: LongArn): Self = StObject.set(x, "WhatIfForecastArn", value.asInstanceOf[js.Any])
  }
}
