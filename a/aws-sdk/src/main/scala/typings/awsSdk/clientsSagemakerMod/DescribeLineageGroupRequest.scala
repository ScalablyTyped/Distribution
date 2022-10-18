package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeLineageGroupRequest extends StObject {
  
  /**
    * The name of the lineage group.
    */
  var LineageGroupName: ExperimentEntityName
}
object DescribeLineageGroupRequest {
  
  inline def apply(LineageGroupName: ExperimentEntityName): DescribeLineageGroupRequest = {
    val __obj = js.Dynamic.literal(LineageGroupName = LineageGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLineageGroupRequest]
  }
  
  extension [Self <: DescribeLineageGroupRequest](x: Self) {
    
    inline def setLineageGroupName(value: ExperimentEntityName): Self = StObject.set(x, "LineageGroupName", value.asInstanceOf[js.Any])
  }
}
