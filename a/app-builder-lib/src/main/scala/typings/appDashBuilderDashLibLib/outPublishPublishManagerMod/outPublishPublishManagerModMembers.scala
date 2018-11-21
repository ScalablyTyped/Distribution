package typings
package appDashBuilderDashLibLib.outPublishPublishManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out/publish/PublishManager", JSImport.Namespace)
@js.native
object outPublishPublishManagerModMembers extends js.Object {
  def computeDownloadUrl(
    publishConfiguration: builderDashUtilDashRuntimeLib.outPublishOptionsMod.PublishConfiguration,
    fileName: java.lang.String,
    packager: appDashBuilderDashLibLib.outPlatformPackagerMod.PlatformPackager[_]
  ): java.lang.String = js.native
  def computeDownloadUrl(
    publishConfiguration: builderDashUtilDashRuntimeLib.outPublishOptionsMod.PublishConfiguration,
    fileName: scala.Null,
    packager: appDashBuilderDashLibLib.outPlatformPackagerMod.PlatformPackager[_]
  ): java.lang.String = js.native
  def createPublisher(
    context: electronDashPublishLib.electronDashPublishMod.PublishContext,
    version: java.lang.String,
    publishConfig: builderDashUtilDashRuntimeLib.outPublishOptionsMod.PublishConfiguration,
    options: electronDashPublishLib.electronDashPublishMod.PublishOptions
  ): electronDashPublishLib.electronDashPublishMod.Publisher | scala.Null = js.native
  def getAppUpdatePublishConfiguration(
    packager: appDashBuilderDashLibLib.outPlatformPackagerMod.PlatformPackager[_],
    arch: builderDashUtilLib.outArchMod.Arch,
    errorIfCannot: scala.Boolean
  ): stdLib.Promise[
    builderDashUtilDashRuntimeLib.outPublishOptionsMod.PublishConfiguration | scala.Null
  ] = js.native
  def getPublishConfigs(
    platformPackager: appDashBuilderDashLibLib.outPlatformPackagerMod.PlatformPackager[_],
    targetSpecificOptions: appDashBuilderDashLibLib.outOptionsPlatformSpecificBuildOptionsMod.PlatformSpecificBuildOptions,
    arch: builderDashUtilLib.outArchMod.Arch,
    errorIfCannot: scala.Boolean
  ): stdLib.Promise[
    js.Array[builderDashUtilDashRuntimeLib.outPublishOptionsMod.PublishConfiguration] | scala.Null
  ] = js.native
  def getPublishConfigs(
    platformPackager: appDashBuilderDashLibLib.outPlatformPackagerMod.PlatformPackager[_],
    targetSpecificOptions: appDashBuilderDashLibLib.outOptionsPlatformSpecificBuildOptionsMod.PlatformSpecificBuildOptions,
    arch: scala.Null,
    errorIfCannot: scala.Boolean
  ): stdLib.Promise[
    js.Array[builderDashUtilDashRuntimeLib.outPublishOptionsMod.PublishConfiguration] | scala.Null
  ] = js.native
  def getPublishConfigs(
    platformPackager: appDashBuilderDashLibLib.outPlatformPackagerMod.PlatformPackager[_],
    targetSpecificOptions: js.UndefOr[scala.Nothing],
    arch: builderDashUtilLib.outArchMod.Arch,
    errorIfCannot: scala.Boolean
  ): stdLib.Promise[
    js.Array[builderDashUtilDashRuntimeLib.outPublishOptionsMod.PublishConfiguration] | scala.Null
  ] = js.native
  def getPublishConfigs(
    platformPackager: appDashBuilderDashLibLib.outPlatformPackagerMod.PlatformPackager[_],
    targetSpecificOptions: js.UndefOr[scala.Nothing],
    arch: scala.Null,
    errorIfCannot: scala.Boolean
  ): stdLib.Promise[
    js.Array[builderDashUtilDashRuntimeLib.outPublishOptionsMod.PublishConfiguration] | scala.Null
  ] = js.native
  def getPublishConfigs(
    platformPackager: appDashBuilderDashLibLib.outPlatformPackagerMod.PlatformPackager[_],
    targetSpecificOptions: scala.Null,
    arch: builderDashUtilLib.outArchMod.Arch,
    errorIfCannot: scala.Boolean
  ): stdLib.Promise[
    js.Array[builderDashUtilDashRuntimeLib.outPublishOptionsMod.PublishConfiguration] | scala.Null
  ] = js.native
  def getPublishConfigs(
    platformPackager: appDashBuilderDashLibLib.outPlatformPackagerMod.PlatformPackager[_],
    targetSpecificOptions: scala.Null,
    arch: scala.Null,
    errorIfCannot: scala.Boolean
  ): stdLib.Promise[
    js.Array[builderDashUtilDashRuntimeLib.outPublishOptionsMod.PublishConfiguration] | scala.Null
  ] = js.native
  def getPublishConfigsForUpdateInfo(packager: appDashBuilderDashLibLib.outPlatformPackagerMod.PlatformPackager[_]): stdLib.Promise[
    js.Array[builderDashUtilDashRuntimeLib.outPublishOptionsMod.PublishConfiguration] | scala.Null
  ] = js.native
  def getPublishConfigsForUpdateInfo(
    packager: appDashBuilderDashLibLib.outPlatformPackagerMod.PlatformPackager[_],
    publishConfigs: js.Array[builderDashUtilDashRuntimeLib.outPublishOptionsMod.PublishConfiguration]
  ): stdLib.Promise[
    js.Array[builderDashUtilDashRuntimeLib.outPublishOptionsMod.PublishConfiguration] | scala.Null
  ] = js.native
  def getPublishConfigsForUpdateInfo(
    packager: appDashBuilderDashLibLib.outPlatformPackagerMod.PlatformPackager[_],
    publishConfigs: js.Array[builderDashUtilDashRuntimeLib.outPublishOptionsMod.PublishConfiguration],
    arch: builderDashUtilLib.outArchMod.Arch
  ): stdLib.Promise[
    js.Array[builderDashUtilDashRuntimeLib.outPublishOptionsMod.PublishConfiguration] | scala.Null
  ] = js.native
  def getPublishConfigsForUpdateInfo(
    packager: appDashBuilderDashLibLib.outPlatformPackagerMod.PlatformPackager[_],
    publishConfigs: scala.Null,
    arch: builderDashUtilLib.outArchMod.Arch
  ): stdLib.Promise[
    js.Array[builderDashUtilDashRuntimeLib.outPublishOptionsMod.PublishConfiguration] | scala.Null
  ] = js.native
}

