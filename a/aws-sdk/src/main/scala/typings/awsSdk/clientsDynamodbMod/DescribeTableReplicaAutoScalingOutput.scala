package typings.awsSdk.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTableReplicaAutoScalingOutput extends StObject {
  
  /**
    * Represents the auto scaling properties of the table.
    */
  var TableAutoScalingDescription: js.UndefOr[typings.awsSdk.clientsDynamodbMod.TableAutoScalingDescription] = js.undefined
}
object DescribeTableReplicaAutoScalingOutput {
  
  inline def apply(): DescribeTableReplicaAutoScalingOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTableReplicaAutoScalingOutput]
  }
  
  extension [Self <: DescribeTableReplicaAutoScalingOutput](x: Self) {
    
    inline def setTableAutoScalingDescription(value: TableAutoScalingDescription): Self = StObject.set(x, "TableAutoScalingDescription", value.asInstanceOf[js.Any])
    
    inline def setTableAutoScalingDescriptionUndefined: Self = StObject.set(x, "TableAutoScalingDescription", js.undefined)
  }
}
