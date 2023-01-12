package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyOptionGroupResult extends StObject {
  
  var OptionGroup: js.UndefOr[typings.awsSdk.clientsRdsMod.OptionGroup] = js.undefined
}
object ModifyOptionGroupResult {
  
  inline def apply(): ModifyOptionGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyOptionGroupResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModifyOptionGroupResult] (val x: Self) extends AnyVal {
    
    inline def setOptionGroup(value: OptionGroup): Self = StObject.set(x, "OptionGroup", value.asInstanceOf[js.Any])
    
    inline def setOptionGroupUndefined: Self = StObject.set(x, "OptionGroup", js.undefined)
  }
}
