package typings.awsSdk.clientsEmrcontainersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeJobTemplateRequest extends StObject {
  
  /**
    * The ID of the job template that will be described.
    */
  var id: ResourceIdString
}
object DescribeJobTemplateRequest {
  
  inline def apply(id: ResourceIdString): DescribeJobTemplateRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeJobTemplateRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeJobTemplateRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: ResourceIdString): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
