package typings.awsSdk.clientsNeptuneMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionGroupMembership extends StObject {
  
  /**
    * Not supported by Neptune.
    */
  var OptionGroupName: js.UndefOr[String] = js.undefined
  
  /**
    * Not supported by Neptune.
    */
  var Status: js.UndefOr[String] = js.undefined
}
object OptionGroupMembership {
  
  inline def apply(): OptionGroupMembership = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionGroupMembership]
  }
  
  extension [Self <: OptionGroupMembership](x: Self) {
    
    inline def setOptionGroupName(value: String): Self = StObject.set(x, "OptionGroupName", value.asInstanceOf[js.Any])
    
    inline def setOptionGroupNameUndefined: Self = StObject.set(x, "OptionGroupName", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
