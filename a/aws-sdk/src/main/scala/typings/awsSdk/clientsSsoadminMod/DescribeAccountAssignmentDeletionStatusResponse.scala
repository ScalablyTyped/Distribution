package typings.awsSdk.clientsSsoadminMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAccountAssignmentDeletionStatusResponse extends StObject {
  
  /**
    * The status object for the account assignment deletion operation.
    */
  var AccountAssignmentDeletionStatus: js.UndefOr[AccountAssignmentOperationStatus] = js.undefined
}
object DescribeAccountAssignmentDeletionStatusResponse {
  
  inline def apply(): DescribeAccountAssignmentDeletionStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAccountAssignmentDeletionStatusResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeAccountAssignmentDeletionStatusResponse] (val x: Self) extends AnyVal {
    
    inline def setAccountAssignmentDeletionStatus(value: AccountAssignmentOperationStatus): Self = StObject.set(x, "AccountAssignmentDeletionStatus", value.asInstanceOf[js.Any])
    
    inline def setAccountAssignmentDeletionStatusUndefined: Self = StObject.set(x, "AccountAssignmentDeletionStatus", js.undefined)
  }
}
