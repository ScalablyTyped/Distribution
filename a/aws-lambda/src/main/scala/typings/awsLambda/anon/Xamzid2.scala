package typings.awsLambda.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Xamzid2 extends StObject {
  
  var `x-amz-id-2`: String = js.native
  
  var `x-amz-request-id`: String = js.native
}
object Xamzid2 {
  
  @scala.inline
  def apply(`x-amz-id-2`: String, `x-amz-request-id`: String): Xamzid2 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("x-amz-id-2")(`x-amz-id-2`.asInstanceOf[js.Any])
    __obj.updateDynamic("x-amz-request-id")(`x-amz-request-id`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Xamzid2]
  }
  
  @scala.inline
  implicit class Xamzid2MutableBuilder[Self <: Xamzid2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setX-amz-id-2`(value: String): Self = StObject.set(x, "x-amz-id-2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setX-amz-request-id`(value: String): Self = StObject.set(x, "x-amz-request-id", value.asInstanceOf[js.Any])
  }
}
