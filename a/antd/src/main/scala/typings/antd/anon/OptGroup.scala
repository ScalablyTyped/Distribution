package typings.antd.anon

import typings.rcSelect.libOptGroupMod.OptionGroupFC
import typings.rcSelect.libOptionMod.OptionFC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptGroup extends StObject {
  
  var OptGroup: OptionGroupFC
  
  var Option: OptionFC
  
  var SECRET_COMBOBOX_MODE_DO_NOT_USE: String
}
object OptGroup {
  
  inline def apply(OptGroup: OptionGroupFC, Option: OptionFC, SECRET_COMBOBOX_MODE_DO_NOT_USE: String): OptGroup = {
    val __obj = js.Dynamic.literal(OptGroup = OptGroup.asInstanceOf[js.Any], Option = Option.asInstanceOf[js.Any], SECRET_COMBOBOX_MODE_DO_NOT_USE = SECRET_COMBOBOX_MODE_DO_NOT_USE.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptGroup]
  }
  
  extension [Self <: OptGroup](x: Self) {
    
    inline def setOptGroup(value: OptionGroupFC): Self = StObject.set(x, "OptGroup", value.asInstanceOf[js.Any])
    
    inline def setOption(value: OptionFC): Self = StObject.set(x, "Option", value.asInstanceOf[js.Any])
    
    inline def setSECRET_COMBOBOX_MODE_DO_NOT_USE(value: String): Self = StObject.set(x, "SECRET_COMBOBOX_MODE_DO_NOT_USE", value.asInstanceOf[js.Any])
  }
}
