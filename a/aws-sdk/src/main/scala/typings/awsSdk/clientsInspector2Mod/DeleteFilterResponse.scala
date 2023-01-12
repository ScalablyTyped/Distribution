package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteFilterResponse extends StObject {
  
  /**
    * The Amazon Resource Number (ARN) of the filter that has been deleted.
    */
  var arn: FilterArn
}
object DeleteFilterResponse {
  
  inline def apply(arn: FilterArn): DeleteFilterResponse = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFilterResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteFilterResponse] (val x: Self) extends AnyVal {
    
    inline def setArn(value: FilterArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
  }
}
