package typings.appDashBuilderDashLib.outPublishPublishManagerMod

import typings.appDashBuilderDashLib.Anon_Provider
import typings.appDashBuilderDashLib.outOptionsPlatformSpecificBuildOptionsMod.PlatformSpecificBuildOptions
import typings.appDashBuilderDashLib.outPackagerMod.Packager
import typings.appDashBuilderDashLib.outPlatformPackagerMod.PlatformPackager
import typings.builderDashUtil.outArchMod.Arch
import typings.builderDashUtilDashRuntime.outPublishOptionsMod.PublishConfiguration
import typings.electronDashPublish.electronDashPublishMod.PublishContext
import typings.electronDashPublish.electronDashPublishMod.PublishOptions
import typings.electronDashPublish.electronDashPublishMod.Publisher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out/publish/PublishManager", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def computeDownloadUrl(publishConfiguration: PublishConfiguration, fileName: String, packager: PlatformPackager[_]): String = js.native
  def computeDownloadUrl(publishConfiguration: PublishConfiguration, fileName: Null, packager: PlatformPackager[_]): String = js.native
  def createPublisher(
    context: PublishContext,
    version: String,
    publishConfig: PublishConfiguration,
    options: PublishOptions,
    packager: Packager
  ): Publisher | Null = js.native
  def getAppUpdatePublishConfiguration(packager: PlatformPackager[_], arch: Arch, errorIfCannot: Boolean): js.Promise[Anon_Provider | Null] = js.native
  def getPublishConfigs(
    platformPackager: PlatformPackager[_],
    targetSpecificOptions: js.UndefOr[scala.Nothing],
    arch: Null,
    errorIfCannot: Boolean
  ): js.Promise[js.Array[PublishConfiguration] | Null] = js.native
  def getPublishConfigs(
    platformPackager: PlatformPackager[_],
    targetSpecificOptions: js.UndefOr[scala.Nothing],
    arch: Arch,
    errorIfCannot: Boolean
  ): js.Promise[js.Array[PublishConfiguration] | Null] = js.native
  def getPublishConfigs(
    platformPackager: PlatformPackager[_],
    targetSpecificOptions: Null,
    arch: Null,
    errorIfCannot: Boolean
  ): js.Promise[js.Array[PublishConfiguration] | Null] = js.native
  def getPublishConfigs(
    platformPackager: PlatformPackager[_],
    targetSpecificOptions: Null,
    arch: Arch,
    errorIfCannot: Boolean
  ): js.Promise[js.Array[PublishConfiguration] | Null] = js.native
  def getPublishConfigs(
    platformPackager: PlatformPackager[_],
    targetSpecificOptions: PlatformSpecificBuildOptions,
    arch: Null,
    errorIfCannot: Boolean
  ): js.Promise[js.Array[PublishConfiguration] | Null] = js.native
  def getPublishConfigs(
    platformPackager: PlatformPackager[_],
    targetSpecificOptions: PlatformSpecificBuildOptions,
    arch: Arch,
    errorIfCannot: Boolean
  ): js.Promise[js.Array[PublishConfiguration] | Null] = js.native
  def getPublishConfigsForUpdateInfo(packager: PlatformPackager[_]): js.Promise[js.Array[PublishConfiguration] | Null] = js.native
  def getPublishConfigsForUpdateInfo(packager: PlatformPackager[_], publishConfigs: js.Array[PublishConfiguration]): js.Promise[js.Array[PublishConfiguration] | Null] = js.native
  def getPublishConfigsForUpdateInfo(packager: PlatformPackager[_], publishConfigs: js.Array[PublishConfiguration], arch: Arch): js.Promise[js.Array[PublishConfiguration] | Null] = js.native
  def getPublishConfigsForUpdateInfo(packager: PlatformPackager[_], publishConfigs: Null, arch: Arch): js.Promise[js.Array[PublishConfiguration] | Null] = js.native
}

