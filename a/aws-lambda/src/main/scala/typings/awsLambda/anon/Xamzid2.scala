package typings.awsLambda.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Xamzid2 extends StObject {
  
  var `x-amz-id-2`: String
  
  var `x-amz-request-id`: String
}
object Xamzid2 {
  
  inline def apply(`x-amz-id-2`: String, `x-amz-request-id`: String): Xamzid2 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("x-amz-id-2")(`x-amz-id-2`.asInstanceOf[js.Any])
    __obj.updateDynamic("x-amz-request-id")(`x-amz-request-id`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Xamzid2]
  }
  
  extension [Self <: Xamzid2](x: Self) {
    
    inline def `setX-amz-id-2`(value: String): Self = StObject.set(x, "x-amz-id-2", value.asInstanceOf[js.Any])
    
    inline def `setX-amz-request-id`(value: String): Self = StObject.set(x, "x-amz-request-id", value.asInstanceOf[js.Any])
  }
}
