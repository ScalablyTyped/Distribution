package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsRdsDbOptionGroupMembership extends StObject {
  
  /**
    * The name of the option group.
    */
  var OptionGroupName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The status of the option group membership.
    */
  var Status: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsRdsDbOptionGroupMembership {
  
  inline def apply(): AwsRdsDbOptionGroupMembership = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsRdsDbOptionGroupMembership]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsRdsDbOptionGroupMembership] (val x: Self) extends AnyVal {
    
    inline def setOptionGroupName(value: NonEmptyString): Self = StObject.set(x, "OptionGroupName", value.asInstanceOf[js.Any])
    
    inline def setOptionGroupNameUndefined: Self = StObject.set(x, "OptionGroupName", js.undefined)
    
    inline def setStatus(value: NonEmptyString): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
