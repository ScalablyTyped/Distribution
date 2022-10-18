package typings.appBuilderLib

import typings.appBuilderLib.anon.Provider
import typings.appBuilderLib.outOptionsPlatformSpecificBuildOptionsMod.PlatformSpecificBuildOptions
import typings.appBuilderLib.outPackagerMod.Packager
import typings.appBuilderLib.outPlatformPackagerMod.PlatformPackager
import typings.builderUtil.outArchMod.Arch
import typings.builderUtilRuntime.mod.CancellationToken
import typings.builderUtilRuntime.outPublishOptionsMod.PublishConfiguration
import typings.electronPublish.mod.PublishContext
import typings.electronPublish.mod.PublishOptions
import typings.electronPublish.mod.Publisher
import typings.electronPublish.outMultiProgressMod.MultiProgress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outPublishPublishManagerMod {
  
  @JSImport("app-builder-lib/out/publish/PublishManager", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("app-builder-lib/out/publish/PublishManager", "PublishManager")
  @js.native
  open class PublishManager protected ()
    extends StObject
       with PublishContext {
    def this(packager: Packager, publishOptions: PublishOptions) = this()
    def this(packager: Packager, publishOptions: PublishOptions, cancellationToken: CancellationToken) = this()
    
    /* private */ var artifactCreatedWithoutExplicitPublishConfig: Any = js.native
    
    def awaitTasks(): js.Promise[Unit] = js.native
    
    def cancelTasks(): Unit = js.native
    
    /* CompleteClass */
    override val cancellationToken: CancellationToken = js.native
    
    /* private */ var getAppInfo: Any = js.native
    
    def getGlobalPublishConfigurations(): js.Promise[js.Array[PublishConfiguration] | Null] = js.native
    
    /* private */ var getOrCreatePublisher: Any = js.native
    
    val isPublish: Boolean = js.native
    
    /* private */ val nameToPublisher: Any = js.native
    
    /* private */ val packager: Any = js.native
    
    /* CompleteClass */
    override val progress: MultiProgress | Null = js.native
    
    /* private */ val publishOptions: Any = js.native
    
    /* private */ val taskManager: Any = js.native
    
    /* private */ val updateFileWriteTask: Any = js.native
  }
  
  inline def computeDownloadUrl(publishConfiguration: PublishConfiguration, fileName: String, packager: PlatformPackager[Any]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("computeDownloadUrl")(publishConfiguration.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], packager.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def computeDownloadUrl(publishConfiguration: PublishConfiguration, fileName: Null, packager: PlatformPackager[Any]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("computeDownloadUrl")(publishConfiguration.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], packager.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def createPublisher(
    context: PublishContext,
    version: String,
    publishConfig: PublishConfiguration,
    options: PublishOptions,
    packager: Packager
  ): Publisher | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("createPublisher")(context.asInstanceOf[js.Any], version.asInstanceOf[js.Any], publishConfig.asInstanceOf[js.Any], options.asInstanceOf[js.Any], packager.asInstanceOf[js.Any])).asInstanceOf[Publisher | Null]
  
  inline def getAppUpdatePublishConfiguration(packager: PlatformPackager[Any], arch: Arch, errorIfCannot: Boolean): js.Promise[Provider | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAppUpdatePublishConfiguration")(packager.asInstanceOf[js.Any], arch.asInstanceOf[js.Any], errorIfCannot.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Provider | Null]]
  
  inline def getPublishConfigs(
    platformPackager: PlatformPackager[Any],
    targetSpecificOptions: Null,
    arch: Null,
    errorIfCannot: Boolean
  ): js.Promise[js.Array[PublishConfiguration] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPublishConfigs")(platformPackager.asInstanceOf[js.Any], targetSpecificOptions.asInstanceOf[js.Any], arch.asInstanceOf[js.Any], errorIfCannot.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[PublishConfiguration] | Null]]
  inline def getPublishConfigs(
    platformPackager: PlatformPackager[Any],
    targetSpecificOptions: Null,
    arch: Arch,
    errorIfCannot: Boolean
  ): js.Promise[js.Array[PublishConfiguration] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPublishConfigs")(platformPackager.asInstanceOf[js.Any], targetSpecificOptions.asInstanceOf[js.Any], arch.asInstanceOf[js.Any], errorIfCannot.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[PublishConfiguration] | Null]]
  inline def getPublishConfigs(
    platformPackager: PlatformPackager[Any],
    targetSpecificOptions: Unit,
    arch: Null,
    errorIfCannot: Boolean
  ): js.Promise[js.Array[PublishConfiguration] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPublishConfigs")(platformPackager.asInstanceOf[js.Any], targetSpecificOptions.asInstanceOf[js.Any], arch.asInstanceOf[js.Any], errorIfCannot.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[PublishConfiguration] | Null]]
  inline def getPublishConfigs(
    platformPackager: PlatformPackager[Any],
    targetSpecificOptions: Unit,
    arch: Arch,
    errorIfCannot: Boolean
  ): js.Promise[js.Array[PublishConfiguration] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPublishConfigs")(platformPackager.asInstanceOf[js.Any], targetSpecificOptions.asInstanceOf[js.Any], arch.asInstanceOf[js.Any], errorIfCannot.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[PublishConfiguration] | Null]]
  inline def getPublishConfigs(
    platformPackager: PlatformPackager[Any],
    targetSpecificOptions: PlatformSpecificBuildOptions,
    arch: Null,
    errorIfCannot: Boolean
  ): js.Promise[js.Array[PublishConfiguration] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPublishConfigs")(platformPackager.asInstanceOf[js.Any], targetSpecificOptions.asInstanceOf[js.Any], arch.asInstanceOf[js.Any], errorIfCannot.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[PublishConfiguration] | Null]]
  inline def getPublishConfigs(
    platformPackager: PlatformPackager[Any],
    targetSpecificOptions: PlatformSpecificBuildOptions,
    arch: Arch,
    errorIfCannot: Boolean
  ): js.Promise[js.Array[PublishConfiguration] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPublishConfigs")(platformPackager.asInstanceOf[js.Any], targetSpecificOptions.asInstanceOf[js.Any], arch.asInstanceOf[js.Any], errorIfCannot.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[PublishConfiguration] | Null]]
  
  inline def getPublishConfigsForUpdateInfo(packager: PlatformPackager[Any]): js.Promise[js.Array[PublishConfiguration] | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPublishConfigsForUpdateInfo")(packager.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[PublishConfiguration] | Null]]
  inline def getPublishConfigsForUpdateInfo(packager: PlatformPackager[Any], publishConfigs: js.Array[PublishConfiguration]): js.Promise[js.Array[PublishConfiguration] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPublishConfigsForUpdateInfo")(packager.asInstanceOf[js.Any], publishConfigs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[PublishConfiguration] | Null]]
  inline def getPublishConfigsForUpdateInfo(packager: PlatformPackager[Any], publishConfigs: js.Array[PublishConfiguration], arch: Arch): js.Promise[js.Array[PublishConfiguration] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPublishConfigsForUpdateInfo")(packager.asInstanceOf[js.Any], publishConfigs.asInstanceOf[js.Any], arch.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[PublishConfiguration] | Null]]
  inline def getPublishConfigsForUpdateInfo(packager: PlatformPackager[Any], publishConfigs: Null, arch: Arch): js.Promise[js.Array[PublishConfiguration] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPublishConfigsForUpdateInfo")(packager.asInstanceOf[js.Any], publishConfigs.asInstanceOf[js.Any], arch.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[PublishConfiguration] | Null]]
}
