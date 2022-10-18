package typings.awsSdk.clientsCloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeStackResourceInput extends StObject {
  
  /**
    * The logical name of the resource as specified in the template. Default: There is no default value.
    */
  var LogicalResourceId: typings.awsSdk.clientsCloudformationMod.LogicalResourceId
  
  /**
    * The name or the unique stack ID that's associated with the stack, which aren't always interchangeable:   Running stacks: You can specify either the stack's name or its unique stack ID.   Deleted stacks: You must specify the unique stack ID.   Default: There is no default value.
    */
  var StackName: typings.awsSdk.clientsCloudformationMod.StackName
}
object DescribeStackResourceInput {
  
  inline def apply(LogicalResourceId: LogicalResourceId, StackName: StackName): DescribeStackResourceInput = {
    val __obj = js.Dynamic.literal(LogicalResourceId = LogicalResourceId.asInstanceOf[js.Any], StackName = StackName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStackResourceInput]
  }
  
  extension [Self <: DescribeStackResourceInput](x: Self) {
    
    inline def setLogicalResourceId(value: LogicalResourceId): Self = StObject.set(x, "LogicalResourceId", value.asInstanceOf[js.Any])
    
    inline def setStackName(value: StackName): Self = StObject.set(x, "StackName", value.asInstanceOf[js.Any])
  }
}
