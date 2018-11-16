package typings
package appDashBuilderDashLibLib.outFrameworkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Framework extends js.Object {
  var beforeCopyExtraFiles: js.UndefOr[
    js.Function3[
      /* packager */ appDashBuilderDashLibLib.outMod.PlatformPackager[_], 
      /* appOutDir */ java.lang.String, 
      /* asarIntegrity */ appDashBuilderDashLibLib.outAsarIntegrityMod.AsarIntegrity | scala.Null, 
      stdLib.Promise[_]
    ]
  ] = js.undefined
  var createTransformer: js.UndefOr[js.Function0[builderDashUtilLib.outFsMod.FileTransformer | scala.Null]] = js.undefined
  val defaultAppIdPrefix: java.lang.String
  val distMacOsAppName: java.lang.String
  var getDefaultIcon: js.UndefOr[
    js.Function1[/* platform */ appDashBuilderDashLibLib.outMod.Platform, java.lang.String]
  ] = js.undefined
  val isDefaultAppIconProvided: scala.Boolean
  val isNpmRebuildRequired: scala.Boolean
  val macOsDefaultTargets: js.Array[java.lang.String]
  val name: java.lang.String
  val version: java.lang.String
  def prepareApplicationStageDirectory(options: PrepareApplicationStageDirectoryOptions): stdLib.Promise[_]
}

