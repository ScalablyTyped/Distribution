package typings.appBuilderLib

import typings.appBuilderLib.anon.Provider
import typings.appBuilderLib.packagerMod.Packager
import typings.appBuilderLib.platformPackagerMod.PlatformPackager
import typings.appBuilderLib.platformSpecificBuildOptionsMod.PlatformSpecificBuildOptions
import typings.builderUtil.archMod.Arch
import typings.builderUtilRuntime.mod.CancellationToken
import typings.builderUtilRuntime.publishOptionsMod.PublishConfiguration
import typings.electronPublish.mod.PublishContext
import typings.electronPublish.mod.PublishOptions
import typings.electronPublish.mod.Publisher
import typings.electronPublish.multiProgressMod.MultiProgress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object publishManagerMod {
  
  @JSImport("app-builder-lib/out/publish/PublishManager", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("app-builder-lib/out/publish/PublishManager", "PublishManager")
  @js.native
  class PublishManager protected ()
    extends StObject
       with PublishContext {
    def this(packager: Packager, publishOptions: PublishOptions) = this()
    def this(packager: Packager, publishOptions: PublishOptions, cancellationToken: CancellationToken) = this()
    
    var artifactCreatedWithoutExplicitPublishConfig: js.Any = js.native
    
    def awaitTasks(): js.Promise[Unit] = js.native
    
    def cancelTasks(): Unit = js.native
    
    /* CompleteClass */
    override val cancellationToken: CancellationToken = js.native
    
    var getAppInfo: js.Any = js.native
    
    def getGlobalPublishConfigurations(): js.Promise[js.Array[PublishConfiguration] | Null] = js.native
    
    var getOrCreatePublisher: js.Any = js.native
    
    val isPublish: Boolean = js.native
    
    val nameToPublisher: js.Any = js.native
    
    val packager: js.Any = js.native
    
    /* CompleteClass */
    override val progress: MultiProgress | Null = js.native
    
    val publishOptions: js.Any = js.native
    
    val taskManager: js.Any = js.native
    
    val updateFileWriteTask: js.Any = js.native
  }
  
  @scala.inline
  def computeDownloadUrl(publishConfiguration: PublishConfiguration, fileName: String, packager: PlatformPackager[js.Any]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("computeDownloadUrl")(publishConfiguration.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], packager.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def computeDownloadUrl(publishConfiguration: PublishConfiguration, fileName: Null, packager: PlatformPackager[js.Any]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("computeDownloadUrl")(publishConfiguration.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], packager.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def createPublisher(
    context: PublishContext,
    version: String,
    publishConfig: PublishConfiguration,
    options: PublishOptions,
    packager: Packager
  ): Publisher | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("createPublisher")(context.asInstanceOf[js.Any], version.asInstanceOf[js.Any], publishConfig.asInstanceOf[js.Any], options.asInstanceOf[js.Any], packager.asInstanceOf[js.Any])).asInstanceOf[Publisher | Null]
  
  @scala.inline
  def getAppUpdatePublishConfiguration(packager: PlatformPackager[js.Any], arch: Arch, errorIfCannot: Boolean): js.Promise[Provider | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAppUpdatePublishConfiguration")(packager.asInstanceOf[js.Any], arch.asInstanceOf[js.Any], errorIfCannot.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Provider | Null]]
  
  @scala.inline
  def getPublishConfigs(
    platformPackager: PlatformPackager[js.Any],
    targetSpecificOptions: Null,
    arch: Null,
    errorIfCannot: Boolean
  ): js.Promise[js.Array[PublishConfiguration] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPublishConfigs")(platformPackager.asInstanceOf[js.Any], targetSpecificOptions.asInstanceOf[js.Any], arch.asInstanceOf[js.Any], errorIfCannot.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[PublishConfiguration] | Null]]
  @scala.inline
  def getPublishConfigs(
    platformPackager: PlatformPackager[js.Any],
    targetSpecificOptions: Null,
    arch: Arch,
    errorIfCannot: Boolean
  ): js.Promise[js.Array[PublishConfiguration] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPublishConfigs")(platformPackager.asInstanceOf[js.Any], targetSpecificOptions.asInstanceOf[js.Any], arch.asInstanceOf[js.Any], errorIfCannot.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[PublishConfiguration] | Null]]
  @scala.inline
  def getPublishConfigs(
    platformPackager: PlatformPackager[js.Any],
    targetSpecificOptions: Unit,
    arch: Null,
    errorIfCannot: Boolean
  ): js.Promise[js.Array[PublishConfiguration] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPublishConfigs")(platformPackager.asInstanceOf[js.Any], targetSpecificOptions.asInstanceOf[js.Any], arch.asInstanceOf[js.Any], errorIfCannot.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[PublishConfiguration] | Null]]
  @scala.inline
  def getPublishConfigs(
    platformPackager: PlatformPackager[js.Any],
    targetSpecificOptions: Unit,
    arch: Arch,
    errorIfCannot: Boolean
  ): js.Promise[js.Array[PublishConfiguration] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPublishConfigs")(platformPackager.asInstanceOf[js.Any], targetSpecificOptions.asInstanceOf[js.Any], arch.asInstanceOf[js.Any], errorIfCannot.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[PublishConfiguration] | Null]]
  @scala.inline
  def getPublishConfigs(
    platformPackager: PlatformPackager[js.Any],
    targetSpecificOptions: PlatformSpecificBuildOptions,
    arch: Null,
    errorIfCannot: Boolean
  ): js.Promise[js.Array[PublishConfiguration] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPublishConfigs")(platformPackager.asInstanceOf[js.Any], targetSpecificOptions.asInstanceOf[js.Any], arch.asInstanceOf[js.Any], errorIfCannot.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[PublishConfiguration] | Null]]
  @scala.inline
  def getPublishConfigs(
    platformPackager: PlatformPackager[js.Any],
    targetSpecificOptions: PlatformSpecificBuildOptions,
    arch: Arch,
    errorIfCannot: Boolean
  ): js.Promise[js.Array[PublishConfiguration] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPublishConfigs")(platformPackager.asInstanceOf[js.Any], targetSpecificOptions.asInstanceOf[js.Any], arch.asInstanceOf[js.Any], errorIfCannot.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[PublishConfiguration] | Null]]
  
  @scala.inline
  def getPublishConfigsForUpdateInfo(packager: PlatformPackager[js.Any]): js.Promise[js.Array[PublishConfiguration] | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPublishConfigsForUpdateInfo")(packager.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[PublishConfiguration] | Null]]
  @scala.inline
  def getPublishConfigsForUpdateInfo(packager: PlatformPackager[js.Any], publishConfigs: js.Array[PublishConfiguration]): js.Promise[js.Array[PublishConfiguration] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPublishConfigsForUpdateInfo")(packager.asInstanceOf[js.Any], publishConfigs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[PublishConfiguration] | Null]]
  @scala.inline
  def getPublishConfigsForUpdateInfo(packager: PlatformPackager[js.Any], publishConfigs: js.Array[PublishConfiguration], arch: Arch): js.Promise[js.Array[PublishConfiguration] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPublishConfigsForUpdateInfo")(packager.asInstanceOf[js.Any], publishConfigs.asInstanceOf[js.Any], arch.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[PublishConfiguration] | Null]]
  @scala.inline
  def getPublishConfigsForUpdateInfo(packager: PlatformPackager[js.Any], publishConfigs: Null, arch: Arch): js.Promise[js.Array[PublishConfiguration] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPublishConfigsForUpdateInfo")(packager.asInstanceOf[js.Any], publishConfigs.asInstanceOf[js.Any], arch.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[PublishConfiguration] | Null]]
}
