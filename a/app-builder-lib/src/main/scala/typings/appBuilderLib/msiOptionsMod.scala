package typings.appBuilderLib

import typings.appBuilderLib.commonWindowsInstallerConfigurationMod.CommonWindowsInstallerConfiguration
import typings.appBuilderLib.coreMod.TargetSpecificOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object msiOptionsMod {
  
  trait MsiOptions
    extends StObject
       with CommonWindowsInstallerConfiguration
       with TargetSpecificOptions {
    
    /**
      * Any additional arguments to be passed to the WiX installer compiler, such as `["-ext", "WixUtilExtension"]`
      */
    val additionalWixArgs: js.UndefOr[js.Array[String] | Null] = js.undefined
    
    /**
      * The [upgrade code](https://msdn.microsoft.com/en-us/library/windows/desktop/aa372375(v=vs.85).aspx). Optional, by default generated using app id.
      */
    val upgradeCode: js.UndefOr[String | Null] = js.undefined
    
    /**
      * If `warningsAsErrors` is `true` (default): treat warnings as errors. If `warningsAsErrors` is `false`: allow warnings.
      * @default true
      */
    val warningsAsErrors: js.UndefOr[Boolean] = js.undefined
  }
  object MsiOptions {
    
    inline def apply(): MsiOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MsiOptions]
    }
    
    extension [Self <: MsiOptions](x: Self) {
      
      inline def setAdditionalWixArgs(value: js.Array[String]): Self = StObject.set(x, "additionalWixArgs", value.asInstanceOf[js.Any])
      
      inline def setAdditionalWixArgsNull: Self = StObject.set(x, "additionalWixArgs", null)
      
      inline def setAdditionalWixArgsUndefined: Self = StObject.set(x, "additionalWixArgs", js.undefined)
      
      inline def setAdditionalWixArgsVarargs(value: String*): Self = StObject.set(x, "additionalWixArgs", js.Array(value*))
      
      inline def setUpgradeCode(value: String): Self = StObject.set(x, "upgradeCode", value.asInstanceOf[js.Any])
      
      inline def setUpgradeCodeNull: Self = StObject.set(x, "upgradeCode", null)
      
      inline def setUpgradeCodeUndefined: Self = StObject.set(x, "upgradeCode", js.undefined)
      
      inline def setWarningsAsErrors(value: Boolean): Self = StObject.set(x, "warningsAsErrors", value.asInstanceOf[js.Any])
      
      inline def setWarningsAsErrorsUndefined: Self = StObject.set(x, "warningsAsErrors", js.undefined)
    }
  }
}
