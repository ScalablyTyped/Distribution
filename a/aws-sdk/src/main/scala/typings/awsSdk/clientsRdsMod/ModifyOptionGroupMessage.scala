package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyOptionGroupMessage extends StObject {
  
  /**
    * A value that indicates whether to apply the change immediately or during the next maintenance window for each instance associated with the option group.
    */
  var ApplyImmediately: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the option group to be modified. Permanent options, such as the TDE option for Oracle Advanced Security TDE, can't be removed from an option group, and that option group can't be removed from a DB instance once it is associated with a DB instance
    */
  var OptionGroupName: String
  
  /**
    * Options in this list are added to the option group or, if already present, the specified configuration is used to update the existing configuration.
    */
  var OptionsToInclude: js.UndefOr[OptionConfigurationList] = js.undefined
  
  /**
    * Options in this list are removed from the option group.
    */
  var OptionsToRemove: js.UndefOr[OptionNamesList] = js.undefined
}
object ModifyOptionGroupMessage {
  
  inline def apply(OptionGroupName: String): ModifyOptionGroupMessage = {
    val __obj = js.Dynamic.literal(OptionGroupName = OptionGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyOptionGroupMessage]
  }
  
  extension [Self <: ModifyOptionGroupMessage](x: Self) {
    
    inline def setApplyImmediately(value: Boolean): Self = StObject.set(x, "ApplyImmediately", value.asInstanceOf[js.Any])
    
    inline def setApplyImmediatelyUndefined: Self = StObject.set(x, "ApplyImmediately", js.undefined)
    
    inline def setOptionGroupName(value: String): Self = StObject.set(x, "OptionGroupName", value.asInstanceOf[js.Any])
    
    inline def setOptionsToInclude(value: OptionConfigurationList): Self = StObject.set(x, "OptionsToInclude", value.asInstanceOf[js.Any])
    
    inline def setOptionsToIncludeUndefined: Self = StObject.set(x, "OptionsToInclude", js.undefined)
    
    inline def setOptionsToIncludeVarargs(value: OptionConfiguration*): Self = StObject.set(x, "OptionsToInclude", js.Array(value*))
    
    inline def setOptionsToRemove(value: OptionNamesList): Self = StObject.set(x, "OptionsToRemove", value.asInstanceOf[js.Any])
    
    inline def setOptionsToRemoveUndefined: Self = StObject.set(x, "OptionsToRemove", js.undefined)
    
    inline def setOptionsToRemoveVarargs(value: String*): Self = StObject.set(x, "OptionsToRemove", js.Array(value*))
  }
}
