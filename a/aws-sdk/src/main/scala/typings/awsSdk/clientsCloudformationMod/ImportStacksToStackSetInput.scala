package typings.awsSdk.clientsCloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportStacksToStackSetInput extends StObject {
  
  /**
    * By default, SELF is specified. Use SELF for stack sets with self-managed permissions.   If you are signed in to the management account, specify SELF.   For service managed stack sets, specify DELEGATED_ADMIN.  
    */
  var CallAs: js.UndefOr[typings.awsSdk.clientsCloudformationMod.CallAs] = js.undefined
  
  /**
    * A unique, user defined, identifier for the stack set operation.
    */
  var OperationId: js.UndefOr[ClientRequestToken] = js.undefined
  
  var OperationPreferences: js.UndefOr[StackSetOperationPreferences] = js.undefined
  
  /**
    * The list of OU ID's to which the stacks being imported has to be mapped as deployment target.
    */
  var OrganizationalUnitIds: js.UndefOr[OrganizationalUnitIdList] = js.undefined
  
  /**
    * The IDs of the stacks you are importing into a stack set. You import up to 10 stacks per stack set at a time. Specify either StackIds or StackIdsUrl.
    */
  var StackIds: js.UndefOr[StackIdList] = js.undefined
  
  /**
    * The Amazon S3 URL which contains list of stack ids to be inputted. Specify either StackIds or StackIdsUrl.
    */
  var StackIdsUrl: js.UndefOr[typings.awsSdk.clientsCloudformationMod.StackIdsUrl] = js.undefined
  
  /**
    * The name of the stack set. The name must be unique in the Region where you create your stack set.
    */
  var StackSetName: StackSetNameOrId
}
object ImportStacksToStackSetInput {
  
  inline def apply(StackSetName: StackSetNameOrId): ImportStacksToStackSetInput = {
    val __obj = js.Dynamic.literal(StackSetName = StackSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportStacksToStackSetInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImportStacksToStackSetInput] (val x: Self) extends AnyVal {
    
    inline def setCallAs(value: CallAs): Self = StObject.set(x, "CallAs", value.asInstanceOf[js.Any])
    
    inline def setCallAsUndefined: Self = StObject.set(x, "CallAs", js.undefined)
    
    inline def setOperationId(value: ClientRequestToken): Self = StObject.set(x, "OperationId", value.asInstanceOf[js.Any])
    
    inline def setOperationIdUndefined: Self = StObject.set(x, "OperationId", js.undefined)
    
    inline def setOperationPreferences(value: StackSetOperationPreferences): Self = StObject.set(x, "OperationPreferences", value.asInstanceOf[js.Any])
    
    inline def setOperationPreferencesUndefined: Self = StObject.set(x, "OperationPreferences", js.undefined)
    
    inline def setOrganizationalUnitIds(value: OrganizationalUnitIdList): Self = StObject.set(x, "OrganizationalUnitIds", value.asInstanceOf[js.Any])
    
    inline def setOrganizationalUnitIdsUndefined: Self = StObject.set(x, "OrganizationalUnitIds", js.undefined)
    
    inline def setOrganizationalUnitIdsVarargs(value: OrganizationalUnitId*): Self = StObject.set(x, "OrganizationalUnitIds", js.Array(value*))
    
    inline def setStackIds(value: StackIdList): Self = StObject.set(x, "StackIds", value.asInstanceOf[js.Any])
    
    inline def setStackIdsUndefined: Self = StObject.set(x, "StackIds", js.undefined)
    
    inline def setStackIdsUrl(value: StackIdsUrl): Self = StObject.set(x, "StackIdsUrl", value.asInstanceOf[js.Any])
    
    inline def setStackIdsUrlUndefined: Self = StObject.set(x, "StackIdsUrl", js.undefined)
    
    inline def setStackIdsVarargs(value: StackId*): Self = StObject.set(x, "StackIds", js.Array(value*))
    
    inline def setStackSetName(value: StackSetNameOrId): Self = StObject.set(x, "StackSetName", value.asInstanceOf[js.Any])
  }
}
