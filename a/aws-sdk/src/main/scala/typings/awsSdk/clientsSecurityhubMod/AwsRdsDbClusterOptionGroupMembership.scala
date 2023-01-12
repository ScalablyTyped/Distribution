package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsRdsDbClusterOptionGroupMembership extends StObject {
  
  /**
    * The name of the DB cluster option group.
    */
  var DbClusterOptionGroupName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The status of the DB cluster option group.
    */
  var Status: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsRdsDbClusterOptionGroupMembership {
  
  inline def apply(): AwsRdsDbClusterOptionGroupMembership = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsRdsDbClusterOptionGroupMembership]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsRdsDbClusterOptionGroupMembership] (val x: Self) extends AnyVal {
    
    inline def setDbClusterOptionGroupName(value: NonEmptyString): Self = StObject.set(x, "DbClusterOptionGroupName", value.asInstanceOf[js.Any])
    
    inline def setDbClusterOptionGroupNameUndefined: Self = StObject.set(x, "DbClusterOptionGroupName", js.undefined)
    
    inline def setStatus(value: NonEmptyString): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
