package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObfuscationSetting extends StObject {
  
  /**
    * Value that determines whether Amazon Lex obscures slot values in conversation logs. The default is to obscure the values.
    */
  var obfuscationSettingType: ObfuscationSettingType
}
object ObfuscationSetting {
  
  inline def apply(obfuscationSettingType: ObfuscationSettingType): ObfuscationSetting = {
    val __obj = js.Dynamic.literal(obfuscationSettingType = obfuscationSettingType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObfuscationSetting]
  }
  
  extension [Self <: ObfuscationSetting](x: Self) {
    
    inline def setObfuscationSettingType(value: ObfuscationSettingType): Self = StObject.set(x, "obfuscationSettingType", value.asInstanceOf[js.Any])
  }
}
