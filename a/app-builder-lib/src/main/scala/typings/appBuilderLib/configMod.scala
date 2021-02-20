package typings.appBuilderLib

import org.scalablytyped.runtime.StringDictionary
import typings.appBuilderLib.configurationMod.Configuration
import typings.builderUtil.mod.DebugLogger
import typings.lazyVal.mod.Lazy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configMod {
  
  @JSImport("app-builder-lib/out/util/config", "computeDefaultAppDirectory")
  @js.native
  def computeDefaultAppDirectory(projectDir: String): js.Promise[String] = js.native
  @JSImport("app-builder-lib/out/util/config", "computeDefaultAppDirectory")
  @js.native
  def computeDefaultAppDirectory(projectDir: String, userAppDir: String): js.Promise[String] = js.native
  
  @JSImport("app-builder-lib/out/util/config", "doMergeConfigs")
  @js.native
  def doMergeConfigs(configuration: Configuration): Configuration = js.native
  @JSImport("app-builder-lib/out/util/config", "doMergeConfigs")
  @js.native
  def doMergeConfigs(configuration: Configuration, parentConfiguration: Configuration): Configuration = js.native
  
  @JSImport("app-builder-lib/out/util/config", "getConfig")
  @js.native
  def getConfig(projectDir: String): js.Promise[Configuration] = js.native
  @JSImport("app-builder-lib/out/util/config", "getConfig")
  @js.native
  def getConfig(projectDir: String, configPath: String): js.Promise[Configuration] = js.native
  @JSImport("app-builder-lib/out/util/config", "getConfig")
  @js.native
  def getConfig(
    projectDir: String,
    configPath: String,
    configFromOptions: js.UndefOr[scala.Nothing],
    packageMetadata: Lazy[StringDictionary[_] | Null]
  ): js.Promise[Configuration] = js.native
  @JSImport("app-builder-lib/out/util/config", "getConfig")
  @js.native
  def getConfig(
    projectDir: String,
    configPath: String,
    configFromOptions: Null,
    packageMetadata: Lazy[StringDictionary[_] | Null]
  ): js.Promise[Configuration] = js.native
  @JSImport("app-builder-lib/out/util/config", "getConfig")
  @js.native
  def getConfig(projectDir: String, configPath: String, configFromOptions: Configuration): js.Promise[Configuration] = js.native
  @JSImport("app-builder-lib/out/util/config", "getConfig")
  @js.native
  def getConfig(
    projectDir: String,
    configPath: String,
    configFromOptions: Configuration,
    packageMetadata: Lazy[StringDictionary[_] | Null]
  ): js.Promise[Configuration] = js.native
  @JSImport("app-builder-lib/out/util/config", "getConfig")
  @js.native
  def getConfig(
    projectDir: String,
    configPath: Null,
    configFromOptions: js.UndefOr[scala.Nothing],
    packageMetadata: Lazy[StringDictionary[_] | Null]
  ): js.Promise[Configuration] = js.native
  @JSImport("app-builder-lib/out/util/config", "getConfig")
  @js.native
  def getConfig(
    projectDir: String,
    configPath: Null,
    configFromOptions: Null,
    packageMetadata: Lazy[StringDictionary[_] | Null]
  ): js.Promise[Configuration] = js.native
  @JSImport("app-builder-lib/out/util/config", "getConfig")
  @js.native
  def getConfig(projectDir: String, configPath: Null, configFromOptions: Configuration): js.Promise[Configuration] = js.native
  @JSImport("app-builder-lib/out/util/config", "getConfig")
  @js.native
  def getConfig(
    projectDir: String,
    configPath: Null,
    configFromOptions: Configuration,
    packageMetadata: Lazy[StringDictionary[_] | Null]
  ): js.Promise[Configuration] = js.native
  
  @JSImport("app-builder-lib/out/util/config", "validateConfig")
  @js.native
  def validateConfig(config: Configuration, debugLogger: DebugLogger): js.Promise[Unit] = js.native
}
