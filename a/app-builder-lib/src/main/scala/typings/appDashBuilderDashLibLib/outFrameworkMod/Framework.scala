package typings
package appDashBuilderDashLibLib.outFrameworkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Framework extends js.Object {
  var afterPack: js.UndefOr[
    js.Function1[
      /* context */ appDashBuilderDashLibLib.outConfigurationMod.AfterPackContext, 
      stdLib.Promise[_]
    ]
  ] = js.undefined
  var beforeCopyExtraFiles: js.UndefOr[js.Function1[/* options */ BeforeCopyExtraFilesOptions, stdLib.Promise[_]]] = js.undefined
  var createTransformer: js.UndefOr[js.Function0[builderDashUtilLib.outFsMod.FileTransformer | scala.Null]] = js.undefined
  val defaultAppIdPrefix: java.lang.String
  val distMacOsAppName: java.lang.String
  var getDefaultIcon: js.UndefOr[
    js.Function1[
      /* platform */ appDashBuilderDashLibLib.outMod.Platform, 
      java.lang.String | scala.Null
    ]
  ] = js.undefined
  var getExcludedDependencies: js.UndefOr[
    js.Function1[
      /* platform */ appDashBuilderDashLibLib.outMod.Platform, 
      js.Array[java.lang.String] | scala.Null
    ]
  ] = js.undefined
  var getMainFile: js.UndefOr[
    js.Function1[
      /* platform */ appDashBuilderDashLibLib.outMod.Platform, 
      java.lang.String | scala.Null
    ]
  ] = js.undefined
  val isCopyElevateHelper: scala.Boolean
  val isNpmRebuildRequired: scala.Boolean
  val macOsDefaultTargets: js.Array[java.lang.String]
  val name: java.lang.String
  val version: java.lang.String
  def prepareApplicationStageDirectory(options: PrepareApplicationStageDirectoryOptions): stdLib.Promise[_]
}

