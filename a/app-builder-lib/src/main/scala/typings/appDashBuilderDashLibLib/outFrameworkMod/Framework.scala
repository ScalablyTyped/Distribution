package typings
package appDashBuilderDashLibLib.outFrameworkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Framework extends js.Object {
  var afterPack: js.UndefOr[
    js.Function1[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AfterPackContext */ /* context */ js.Any, 
      js.Promise[_]
    ]
  ] = js.undefined
  var beforeCopyExtraFiles: js.UndefOr[js.Function1[/* options */ BeforeCopyExtraFilesOptions, js.Promise[_]]] = js.undefined
  var createTransformer: js.UndefOr[js.Function0[builderDashUtilLib.outFsMod.FileTransformer | scala.Null]] = js.undefined
  val defaultAppIdPrefix: java.lang.String
  val distMacOsAppName: java.lang.String
  var getDefaultIcon: js.UndefOr[
    js.Function1[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Platform */ /* platform */ js.Any, 
      java.lang.String | scala.Null
    ]
  ] = js.undefined
  var getExcludedDependencies: js.UndefOr[
    js.Function1[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Platform */ /* platform */ js.Any, 
      js.Array[java.lang.String] | scala.Null
    ]
  ] = js.undefined
  var getMainFile: js.UndefOr[
    js.Function1[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Platform */ /* platform */ js.Any, 
      java.lang.String | scala.Null
    ]
  ] = js.undefined
  val isCopyElevateHelper: scala.Boolean
  val isNpmRebuildRequired: scala.Boolean
  val macOsDefaultTargets: js.Array[java.lang.String]
  val name: java.lang.String
  val version: java.lang.String
  def prepareApplicationStageDirectory(options: PrepareApplicationStageDirectoryOptions): js.Promise[_]
}

object Framework {
  @scala.inline
  def apply(
    defaultAppIdPrefix: java.lang.String,
    distMacOsAppName: java.lang.String,
    isCopyElevateHelper: scala.Boolean,
    isNpmRebuildRequired: scala.Boolean,
    macOsDefaultTargets: js.Array[java.lang.String],
    name: java.lang.String,
    prepareApplicationStageDirectory: js.Function1[PrepareApplicationStageDirectoryOptions, js.Promise[_]],
    version: java.lang.String,
    afterPack: js.Function1[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AfterPackContext */ /* context */ js.Any, 
      js.Promise[_]
    ] = null,
    beforeCopyExtraFiles: js.Function1[/* options */ BeforeCopyExtraFilesOptions, js.Promise[_]] = null,
    createTransformer: js.Function0[builderDashUtilLib.outFsMod.FileTransformer | scala.Null] = null,
    getDefaultIcon: js.Function1[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Platform */ /* platform */ js.Any, 
      java.lang.String | scala.Null
    ] = null,
    getExcludedDependencies: js.Function1[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Platform */ /* platform */ js.Any, 
      js.Array[java.lang.String] | scala.Null
    ] = null,
    getMainFile: js.Function1[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Platform */ /* platform */ js.Any, 
      java.lang.String | scala.Null
    ] = null
  ): Framework = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("defaultAppIdPrefix")(defaultAppIdPrefix)
    __obj.updateDynamic("distMacOsAppName")(distMacOsAppName)
    __obj.updateDynamic("isCopyElevateHelper")(isCopyElevateHelper)
    __obj.updateDynamic("isNpmRebuildRequired")(isNpmRebuildRequired)
    __obj.updateDynamic("macOsDefaultTargets")(macOsDefaultTargets)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("prepareApplicationStageDirectory")(prepareApplicationStageDirectory)
    __obj.updateDynamic("version")(version)
    if (afterPack != null) __obj.updateDynamic("afterPack")(afterPack)
    if (beforeCopyExtraFiles != null) __obj.updateDynamic("beforeCopyExtraFiles")(beforeCopyExtraFiles)
    if (createTransformer != null) __obj.updateDynamic("createTransformer")(createTransformer)
    if (getDefaultIcon != null) __obj.updateDynamic("getDefaultIcon")(getDefaultIcon)
    if (getExcludedDependencies != null) __obj.updateDynamic("getExcludedDependencies")(getExcludedDependencies)
    if (getMainFile != null) __obj.updateDynamic("getMainFile")(getMainFile)
    __obj.asInstanceOf[Framework]
  }
}

