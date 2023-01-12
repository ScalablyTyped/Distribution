package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsRdsDbParameterGroup extends StObject {
  
  /**
    * The name of the parameter group.
    */
  var DbParameterGroupName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The status of parameter updates.
    */
  var ParameterApplyStatus: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsRdsDbParameterGroup {
  
  inline def apply(): AwsRdsDbParameterGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsRdsDbParameterGroup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsRdsDbParameterGroup] (val x: Self) extends AnyVal {
    
    inline def setDbParameterGroupName(value: NonEmptyString): Self = StObject.set(x, "DbParameterGroupName", value.asInstanceOf[js.Any])
    
    inline def setDbParameterGroupNameUndefined: Self = StObject.set(x, "DbParameterGroupName", js.undefined)
    
    inline def setParameterApplyStatus(value: NonEmptyString): Self = StObject.set(x, "ParameterApplyStatus", value.asInstanceOf[js.Any])
    
    inline def setParameterApplyStatusUndefined: Self = StObject.set(x, "ParameterApplyStatus", js.undefined)
  }
}
