package typings.awsSdk.clientsCodestarMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeProjectRequest extends StObject {
  
  /**
    * The ID of the project.
    */
  var id: ProjectId
}
object DescribeProjectRequest {
  
  inline def apply(id: ProjectId): DescribeProjectRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeProjectRequest]
  }
  
  extension [Self <: DescribeProjectRequest](x: Self) {
    
    inline def setId(value: ProjectId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
