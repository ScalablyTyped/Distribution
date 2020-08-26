package typings.appBuilderLib

import org.scalablytyped.runtime.StringDictionary
import typings.appBuilderLib.configurationMod.Configuration
import typings.builderUtil.mod.DebugLogger
import typings.lazyVal.mod.Lazy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out/util/config", JSImport.Namespace)
@js.native
object configMod extends js.Object {
  def computeDefaultAppDirectory(projectDir: String): js.Promise[String] = js.native
  def computeDefaultAppDirectory(projectDir: String, userAppDir: String): js.Promise[String] = js.native
  def doMergeConfigs(configuration: Configuration): Configuration = js.native
  def doMergeConfigs(configuration: Configuration, parentConfiguration: Configuration): Configuration = js.native
  def getConfig(projectDir: String): js.Promise[Configuration] = js.native
  def getConfig(projectDir: String, configPath: String): js.Promise[Configuration] = js.native
  def getConfig(
    projectDir: String,
    configPath: String,
    configFromOptions: js.UndefOr[scala.Nothing],
    packageMetadata: Lazy[StringDictionary[_] | Null]
  ): js.Promise[Configuration] = js.native
  def getConfig(
    projectDir: String,
    configPath: String,
    configFromOptions: Null,
    packageMetadata: Lazy[StringDictionary[_] | Null]
  ): js.Promise[Configuration] = js.native
  def getConfig(projectDir: String, configPath: String, configFromOptions: Configuration): js.Promise[Configuration] = js.native
  def getConfig(
    projectDir: String,
    configPath: String,
    configFromOptions: Configuration,
    packageMetadata: Lazy[StringDictionary[_] | Null]
  ): js.Promise[Configuration] = js.native
  def getConfig(
    projectDir: String,
    configPath: Null,
    configFromOptions: js.UndefOr[scala.Nothing],
    packageMetadata: Lazy[StringDictionary[_] | Null]
  ): js.Promise[Configuration] = js.native
  def getConfig(
    projectDir: String,
    configPath: Null,
    configFromOptions: Null,
    packageMetadata: Lazy[StringDictionary[_] | Null]
  ): js.Promise[Configuration] = js.native
  def getConfig(projectDir: String, configPath: Null, configFromOptions: Configuration): js.Promise[Configuration] = js.native
  def getConfig(
    projectDir: String,
    configPath: Null,
    configFromOptions: Configuration,
    packageMetadata: Lazy[StringDictionary[_] | Null]
  ): js.Promise[Configuration] = js.native
  def validateConfig(config: Configuration, debugLogger: DebugLogger): js.Promise[Unit] = js.native
}

