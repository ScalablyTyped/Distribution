package typings.awsSdk.clientsCloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeStackResourcesInput extends StObject {
  
  /**
    * The logical name of the resource as specified in the template. Default: There is no default value.
    */
  var LogicalResourceId: js.UndefOr[typings.awsSdk.clientsCloudformationMod.LogicalResourceId] = js.undefined
  
  /**
    * The name or unique identifier that corresponds to a physical instance ID of a resource supported by CloudFormation. For example, for an Amazon Elastic Compute Cloud (EC2) instance, PhysicalResourceId corresponds to the InstanceId. You can pass the EC2 InstanceId to DescribeStackResources to find which stack the instance belongs to and what other resources are part of the stack. Required: Conditional. If you don't specify PhysicalResourceId, you must specify StackName. Default: There is no default value.
    */
  var PhysicalResourceId: js.UndefOr[typings.awsSdk.clientsCloudformationMod.PhysicalResourceId] = js.undefined
  
  /**
    * The name or the unique stack ID that is associated with the stack, which aren't always interchangeable:   Running stacks: You can specify either the stack's name or its unique stack ID.   Deleted stacks: You must specify the unique stack ID.   Default: There is no default value. Required: Conditional. If you don't specify StackName, you must specify PhysicalResourceId.
    */
  var StackName: js.UndefOr[typings.awsSdk.clientsCloudformationMod.StackName] = js.undefined
}
object DescribeStackResourcesInput {
  
  inline def apply(): DescribeStackResourcesInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeStackResourcesInput]
  }
  
  extension [Self <: DescribeStackResourcesInput](x: Self) {
    
    inline def setLogicalResourceId(value: LogicalResourceId): Self = StObject.set(x, "LogicalResourceId", value.asInstanceOf[js.Any])
    
    inline def setLogicalResourceIdUndefined: Self = StObject.set(x, "LogicalResourceId", js.undefined)
    
    inline def setPhysicalResourceId(value: PhysicalResourceId): Self = StObject.set(x, "PhysicalResourceId", value.asInstanceOf[js.Any])
    
    inline def setPhysicalResourceIdUndefined: Self = StObject.set(x, "PhysicalResourceId", js.undefined)
    
    inline def setStackName(value: StackName): Self = StObject.set(x, "StackName", value.asInstanceOf[js.Any])
    
    inline def setStackNameUndefined: Self = StObject.set(x, "StackName", js.undefined)
  }
}
