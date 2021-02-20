package typings.appBuilderLib

import typings.appBuilderLib.commonWindowsInstallerConfigurationMod.CommonWindowsInstallerConfiguration
import typings.appBuilderLib.coreMod.TargetSpecificOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object msiOptionsMod {
  
  @js.native
  trait MsiOptions
    extends CommonWindowsInstallerConfiguration
       with TargetSpecificOptions {
    
    /**
      * The [upgrade code](https://msdn.microsoft.com/en-us/library/windows/desktop/aa372375(v=vs.85).aspx). Optional, by default generated using app id.
      */
    val upgradeCode: js.UndefOr[String | Null] = js.native
    
    /**
      * If `warningsAsErrors` is `true` (default): treat warnings as errors. If `warningsAsErrors` is `false`: allow warnings.
      * @default true
      */
    val warningsAsErrors: js.UndefOr[Boolean] = js.native
  }
  object MsiOptions {
    
    @scala.inline
    def apply(): MsiOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MsiOptions]
    }
    
    @scala.inline
    implicit class MsiOptionsMutableBuilder[Self <: MsiOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUpgradeCode(value: String): Self = StObject.set(x, "upgradeCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpgradeCodeNull: Self = StObject.set(x, "upgradeCode", null)
      
      @scala.inline
      def setUpgradeCodeUndefined: Self = StObject.set(x, "upgradeCode", js.undefined)
      
      @scala.inline
      def setWarningsAsErrors(value: Boolean): Self = StObject.set(x, "warningsAsErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarningsAsErrorsUndefined: Self = StObject.set(x, "warningsAsErrors", js.undefined)
    }
  }
}
