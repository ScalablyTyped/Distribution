package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeIndexRequest extends StObject {
  
  /**
    * The identifier of the index you want to get information on.
    */
  var Id: IndexId
}
object DescribeIndexRequest {
  
  inline def apply(Id: IndexId): DescribeIndexRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeIndexRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeIndexRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: IndexId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
