package typings.awsSdk.clientsCloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeChangeSetHooksOutput extends StObject {
  
  /**
    * The change set identifier (stack ID).
    */
  var ChangeSetId: js.UndefOr[typings.awsSdk.clientsCloudformationMod.ChangeSetId] = js.undefined
  
  /**
    * The change set name.
    */
  var ChangeSetName: js.UndefOr[typings.awsSdk.clientsCloudformationMod.ChangeSetName] = js.undefined
  
  /**
    * List of hook objects.
    */
  var Hooks: js.UndefOr[ChangeSetHooks] = js.undefined
  
  /**
    * Pagination token, null or empty if no more results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsCloudformationMod.NextToken] = js.undefined
  
  /**
    * The stack identifier (stack ID).
    */
  var StackId: js.UndefOr[typings.awsSdk.clientsCloudformationMod.StackId] = js.undefined
  
  /**
    * The stack name.
    */
  var StackName: js.UndefOr[typings.awsSdk.clientsCloudformationMod.StackName] = js.undefined
  
  /**
    * Provides the status of the change set hook.
    */
  var Status: js.UndefOr[ChangeSetHooksStatus] = js.undefined
}
object DescribeChangeSetHooksOutput {
  
  inline def apply(): DescribeChangeSetHooksOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeChangeSetHooksOutput]
  }
  
  extension [Self <: DescribeChangeSetHooksOutput](x: Self) {
    
    inline def setChangeSetId(value: ChangeSetId): Self = StObject.set(x, "ChangeSetId", value.asInstanceOf[js.Any])
    
    inline def setChangeSetIdUndefined: Self = StObject.set(x, "ChangeSetId", js.undefined)
    
    inline def setChangeSetName(value: ChangeSetName): Self = StObject.set(x, "ChangeSetName", value.asInstanceOf[js.Any])
    
    inline def setChangeSetNameUndefined: Self = StObject.set(x, "ChangeSetName", js.undefined)
    
    inline def setHooks(value: ChangeSetHooks): Self = StObject.set(x, "Hooks", value.asInstanceOf[js.Any])
    
    inline def setHooksUndefined: Self = StObject.set(x, "Hooks", js.undefined)
    
    inline def setHooksVarargs(value: ChangeSetHook*): Self = StObject.set(x, "Hooks", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStackId(value: StackId): Self = StObject.set(x, "StackId", value.asInstanceOf[js.Any])
    
    inline def setStackIdUndefined: Self = StObject.set(x, "StackId", js.undefined)
    
    inline def setStackName(value: StackName): Self = StObject.set(x, "StackName", value.asInstanceOf[js.Any])
    
    inline def setStackNameUndefined: Self = StObject.set(x, "StackName", js.undefined)
    
    inline def setStatus(value: ChangeSetHooksStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
