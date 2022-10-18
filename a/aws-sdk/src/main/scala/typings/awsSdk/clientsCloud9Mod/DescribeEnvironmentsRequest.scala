package typings.awsSdk.clientsCloud9Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEnvironmentsRequest extends StObject {
  
  /**
    * The IDs of individual environments to get information about.
    */
  var environmentIds: BoundedEnvironmentIdList
}
object DescribeEnvironmentsRequest {
  
  inline def apply(environmentIds: BoundedEnvironmentIdList): DescribeEnvironmentsRequest = {
    val __obj = js.Dynamic.literal(environmentIds = environmentIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEnvironmentsRequest]
  }
  
  extension [Self <: DescribeEnvironmentsRequest](x: Self) {
    
    inline def setEnvironmentIds(value: BoundedEnvironmentIdList): Self = StObject.set(x, "environmentIds", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentIdsVarargs(value: EnvironmentId*): Self = StObject.set(x, "environmentIds", js.Array(value*))
  }
}
