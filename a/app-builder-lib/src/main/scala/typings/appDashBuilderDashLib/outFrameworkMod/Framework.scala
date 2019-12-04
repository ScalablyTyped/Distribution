package typings.appDashBuilderDashLib.outFrameworkMod

import typings.appDashBuilderDashLib.appDashBuilderDashLibMod.Platform
import typings.appDashBuilderDashLib.outConfigurationMod.AfterPackContext
import typings.builderDashUtil.outFsMod.FileTransformer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Framework extends js.Object {
  var afterPack: js.UndefOr[js.Function1[/* context */ AfterPackContext, js.Promise[_]]] = js.undefined
  var beforeCopyExtraFiles: js.UndefOr[js.Function1[/* options */ BeforeCopyExtraFilesOptions, js.Promise[_]]] = js.undefined
  var createTransformer: js.UndefOr[js.Function0[FileTransformer | Null]] = js.undefined
  val defaultAppIdPrefix: String
  val distMacOsAppName: String
  var getDefaultIcon: js.UndefOr[js.Function1[/* platform */ Platform, String | Null]] = js.undefined
  var getExcludedDependencies: js.UndefOr[js.Function1[/* platform */ Platform, js.Array[String] | Null]] = js.undefined
  var getMainFile: js.UndefOr[js.Function1[/* platform */ Platform, String | Null]] = js.undefined
  val isCopyElevateHelper: Boolean
  val isNpmRebuildRequired: Boolean
  val macOsDefaultTargets: js.Array[String]
  val name: String
  val version: String
  def prepareApplicationStageDirectory(options: PrepareApplicationStageDirectoryOptions): js.Promise[_]
}

object Framework {
  @scala.inline
  def apply(
    defaultAppIdPrefix: String,
    distMacOsAppName: String,
    isCopyElevateHelper: Boolean,
    isNpmRebuildRequired: Boolean,
    macOsDefaultTargets: js.Array[String],
    name: String,
    prepareApplicationStageDirectory: PrepareApplicationStageDirectoryOptions => js.Promise[_],
    version: String,
    afterPack: /* context */ AfterPackContext => js.Promise[_] = null,
    beforeCopyExtraFiles: /* options */ BeforeCopyExtraFilesOptions => js.Promise[_] = null,
    createTransformer: () => FileTransformer | Null = null,
    getDefaultIcon: /* platform */ Platform => String | Null = null,
    getExcludedDependencies: /* platform */ Platform => js.Array[String] | Null = null,
    getMainFile: /* platform */ Platform => String | Null = null
  ): Framework = {
    val __obj = js.Dynamic.literal(defaultAppIdPrefix = defaultAppIdPrefix.asInstanceOf[js.Any], distMacOsAppName = distMacOsAppName.asInstanceOf[js.Any], isCopyElevateHelper = isCopyElevateHelper.asInstanceOf[js.Any], isNpmRebuildRequired = isNpmRebuildRequired.asInstanceOf[js.Any], macOsDefaultTargets = macOsDefaultTargets.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], prepareApplicationStageDirectory = js.Any.fromFunction1(prepareApplicationStageDirectory), version = version.asInstanceOf[js.Any])
    if (afterPack != null) __obj.updateDynamic("afterPack")(js.Any.fromFunction1(afterPack))
    if (beforeCopyExtraFiles != null) __obj.updateDynamic("beforeCopyExtraFiles")(js.Any.fromFunction1(beforeCopyExtraFiles))
    if (createTransformer != null) __obj.updateDynamic("createTransformer")(js.Any.fromFunction0(createTransformer))
    if (getDefaultIcon != null) __obj.updateDynamic("getDefaultIcon")(js.Any.fromFunction1(getDefaultIcon))
    if (getExcludedDependencies != null) __obj.updateDynamic("getExcludedDependencies")(js.Any.fromFunction1(getExcludedDependencies))
    if (getMainFile != null) __obj.updateDynamic("getMainFile")(js.Any.fromFunction1(getMainFile))
    __obj.asInstanceOf[Framework]
  }
}

