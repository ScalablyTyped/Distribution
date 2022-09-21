package typings.appBuilderLib

import org.scalablytyped.runtime.StringDictionary
import typings.appBuilderLib.configurationMod.Configuration
import typings.builderUtil.mod.DebugLogger
import typings.lazyVal.mod.Lazy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configMod {
  
  @JSImport("app-builder-lib/out/util/config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def computeDefaultAppDirectory(projectDir: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("computeDefaultAppDirectory")(projectDir.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def computeDefaultAppDirectory(projectDir: String, userAppDir: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeDefaultAppDirectory")(projectDir.asInstanceOf[js.Any], userAppDir.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def doMergeConfigs(configs: js.Array[Configuration]): Configuration = ^.asInstanceOf[js.Dynamic].applyDynamic("doMergeConfigs")(configs.asInstanceOf[js.Any]).asInstanceOf[Configuration]
  
  inline def getConfig(projectDir: String): js.Promise[Configuration] = ^.asInstanceOf[js.Dynamic].applyDynamic("getConfig")(projectDir.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Configuration]]
  inline def getConfig(projectDir: String, configPath: String): js.Promise[Configuration] = (^.asInstanceOf[js.Dynamic].applyDynamic("getConfig")(projectDir.asInstanceOf[js.Any], configPath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Configuration]]
  inline def getConfig(
    projectDir: String,
    configPath: String,
    configFromOptions: Null,
    packageMetadata: Lazy[StringDictionary[Any] | Null]
  ): js.Promise[Configuration] = (^.asInstanceOf[js.Dynamic].applyDynamic("getConfig")(projectDir.asInstanceOf[js.Any], configPath.asInstanceOf[js.Any], configFromOptions.asInstanceOf[js.Any], packageMetadata.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Configuration]]
  inline def getConfig(
    projectDir: String,
    configPath: String,
    configFromOptions: Unit,
    packageMetadata: Lazy[StringDictionary[Any] | Null]
  ): js.Promise[Configuration] = (^.asInstanceOf[js.Dynamic].applyDynamic("getConfig")(projectDir.asInstanceOf[js.Any], configPath.asInstanceOf[js.Any], configFromOptions.asInstanceOf[js.Any], packageMetadata.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Configuration]]
  inline def getConfig(projectDir: String, configPath: String, configFromOptions: Configuration): js.Promise[Configuration] = (^.asInstanceOf[js.Dynamic].applyDynamic("getConfig")(projectDir.asInstanceOf[js.Any], configPath.asInstanceOf[js.Any], configFromOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Configuration]]
  inline def getConfig(
    projectDir: String,
    configPath: String,
    configFromOptions: Configuration,
    packageMetadata: Lazy[StringDictionary[Any] | Null]
  ): js.Promise[Configuration] = (^.asInstanceOf[js.Dynamic].applyDynamic("getConfig")(projectDir.asInstanceOf[js.Any], configPath.asInstanceOf[js.Any], configFromOptions.asInstanceOf[js.Any], packageMetadata.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Configuration]]
  inline def getConfig(
    projectDir: String,
    configPath: Null,
    configFromOptions: Null,
    packageMetadata: Lazy[StringDictionary[Any] | Null]
  ): js.Promise[Configuration] = (^.asInstanceOf[js.Dynamic].applyDynamic("getConfig")(projectDir.asInstanceOf[js.Any], configPath.asInstanceOf[js.Any], configFromOptions.asInstanceOf[js.Any], packageMetadata.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Configuration]]
  inline def getConfig(
    projectDir: String,
    configPath: Null,
    configFromOptions: Unit,
    packageMetadata: Lazy[StringDictionary[Any] | Null]
  ): js.Promise[Configuration] = (^.asInstanceOf[js.Dynamic].applyDynamic("getConfig")(projectDir.asInstanceOf[js.Any], configPath.asInstanceOf[js.Any], configFromOptions.asInstanceOf[js.Any], packageMetadata.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Configuration]]
  inline def getConfig(projectDir: String, configPath: Null, configFromOptions: Configuration): js.Promise[Configuration] = (^.asInstanceOf[js.Dynamic].applyDynamic("getConfig")(projectDir.asInstanceOf[js.Any], configPath.asInstanceOf[js.Any], configFromOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Configuration]]
  inline def getConfig(
    projectDir: String,
    configPath: Null,
    configFromOptions: Configuration,
    packageMetadata: Lazy[StringDictionary[Any] | Null]
  ): js.Promise[Configuration] = (^.asInstanceOf[js.Dynamic].applyDynamic("getConfig")(projectDir.asInstanceOf[js.Any], configPath.asInstanceOf[js.Any], configFromOptions.asInstanceOf[js.Any], packageMetadata.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Configuration]]
  
  inline def validateConfig(config: Configuration, debugLogger: DebugLogger): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("validateConfig")(config.asInstanceOf[js.Any], debugLogger.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
