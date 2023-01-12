package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OriginGroupFailoverCriteria extends StObject {
  
  /**
    * The status codes that, when returned from the primary origin, will trigger CloudFront to failover to the second origin.
    */
  var StatusCodes: typings.awsSdk.clientsCloudfrontMod.StatusCodes
}
object OriginGroupFailoverCriteria {
  
  inline def apply(StatusCodes: StatusCodes): OriginGroupFailoverCriteria = {
    val __obj = js.Dynamic.literal(StatusCodes = StatusCodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginGroupFailoverCriteria]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OriginGroupFailoverCriteria] (val x: Self) extends AnyVal {
    
    inline def setStatusCodes(value: StatusCodes): Self = StObject.set(x, "StatusCodes", value.asInstanceOf[js.Any])
  }
}
