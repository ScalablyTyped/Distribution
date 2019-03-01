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

object PortableOptions {
  @scala.inline
  def apply(
    artifactName: java.lang.String = null,
    guid: java.lang.String = null,
    publish: builderDashUtilDashRuntimeLib.outPublishOptionsMod.Publish = null,
    requestExecutionLevel: appDashBuilderDashLibLib.appDashBuilderDashLibLibStrings.user | appDashBuilderDashLibLib.appDashBuilderDashLibLibStrings.highest | appDashBuilderDashLibLib.appDashBuilderDashLibLibStrings.admin = null,
    unicode: js.UndefOr[scala.Boolean] = js.undefined,
    useZip: js.UndefOr[scala.Boolean] = js.undefined,
    warningsAsErrors: js.UndefOr[scala.Boolean] = js.undefined
  ): PortableOptions = {
    val __obj = js.Dynamic.literal()
    if (artifactName != null) __obj.updateDynamic("artifactName")(artifactName)
    if (guid != null) __obj.updateDynamic("guid")(guid)
    if (publish != null) __obj.updateDynamic("publish")(publish.asInstanceOf[js.Any])
    if (requestExecutionLevel != null) __obj.updateDynamic("requestExecutionLevel")(requestExecutionLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(unicode)) __obj.updateDynamic("unicode")(unicode)
    if (!js.isUndefined(useZip)) __obj.updateDynamic("useZip")(useZip)
    if (!js.isUndefined(warningsAsErrors)) __obj.updateDynamic("warningsAsErrors")(warningsAsErrors)
    __obj.asInstanceOf[PortableOptions]
  }
}

