package typings
package appDashBuilderDashLibLib.outOptionsMsiOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MsiOptions
  extends appDashBuilderDashLibLib.outOptionsCommonWindowsInstallerConfigurationMod.CommonWindowsInstallerConfiguration
     with appDashBuilderDashLibLib.outCoreMod.TargetSpecificOptions {
  /**
       * The [upgrade code](https://msdn.microsoft.com/en-us/library/windows/desktop/aa372375(v=vs.85).aspx). Optional, by default generated using app id.
       */
  val upgradeCode: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
       * If `warningsAsErrors` is `true` (default): treat warnings as errors. If `warningsAsErrors` is `false`: allow warnings.
       * @default true
       */
  val warningsAsErrors: js.UndefOr[scala.Boolean] = js.undefined
}

