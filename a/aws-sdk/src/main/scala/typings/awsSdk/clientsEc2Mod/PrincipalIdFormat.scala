package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrincipalIdFormat extends StObject {
  
  /**
    * PrincipalIdFormatARN description
    */
  var Arn: js.UndefOr[String] = js.undefined
  
  /**
    * PrincipalIdFormatStatuses description
    */
  var Statuses: js.UndefOr[IdFormatList] = js.undefined
}
object PrincipalIdFormat {
  
  inline def apply(): PrincipalIdFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrincipalIdFormat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PrincipalIdFormat] (val x: Self) extends AnyVal {
    
    inline def setArn(value: String): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setStatuses(value: IdFormatList): Self = StObject.set(x, "Statuses", value.asInstanceOf[js.Any])
    
    inline def setStatusesUndefined: Self = StObject.set(x, "Statuses", js.undefined)
    
    inline def setStatusesVarargs(value: IdFormat*): Self = StObject.set(x, "Statuses", js.Array(value*))
  }
}
