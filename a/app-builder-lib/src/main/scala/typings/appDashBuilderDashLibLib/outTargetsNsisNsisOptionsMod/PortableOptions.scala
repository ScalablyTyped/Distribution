package typings
package appDashBuilderDashLibLib.outTargetsNsisNsisOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PortableOptions
  extends appDashBuilderDashLibLib.outCoreMod.TargetSpecificOptions
     with CommonNsisOptions {
  /**
       * The [requested execution level](http://nsis.sourceforge.net/Reference/RequestExecutionLevel) for Windows.
       * @default user
       */
  val requestExecutionLevel: js.UndefOr[
    appDashBuilderDashLibLib.appDashBuilderDashLibLibStrings.user | appDashBuilderDashLibLib.appDashBuilderDashLibLibStrings.highest | appDashBuilderDashLibLib.appDashBuilderDashLibLibStrings.admin
  ] = js.undefined
}

