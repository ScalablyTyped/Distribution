package typings.awsSdk.clientsSsoadminMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribePermissionSetResponse extends StObject {
  
  /**
    * Describes the level of access on an AWS account.
    */
  var PermissionSet: js.UndefOr[typings.awsSdk.clientsSsoadminMod.PermissionSet] = js.undefined
}
object DescribePermissionSetResponse {
  
  inline def apply(): DescribePermissionSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePermissionSetResponse]
  }
  
  extension [Self <: DescribePermissionSetResponse](x: Self) {
    
    inline def setPermissionSet(value: PermissionSet): Self = StObject.set(x, "PermissionSet", value.asInstanceOf[js.Any])
    
    inline def setPermissionSetUndefined: Self = StObject.set(x, "PermissionSet", js.undefined)
  }
}
