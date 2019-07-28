package typings.atAngularCompiler.srcI18nExtractorMod

import typings.atAngularCompiler.srcAotStaticUnderscoreSymbolUnderscoreResolverMod.StaticSymbolResolverHost
import typings.atAngularCompiler.srcAotSummaryUnderscoreResolverMod.AotSummaryResolverHost
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtractorHost
  extends StaticSymbolResolverHost
     with AotSummaryResolverHost {
  /**
    * Loads a resource (e.g. html / css)
    */
  def loadResource(path: String): js.Promise[String] | String = js.native
  /**
    * Converts a path that refers to a resource into an absolute filePath
    * that can be lateron used for loading the resource via `loadResource.
    */
  def resourceNameToFileName(path: String, containingFile: String): String | Null = js.native
}

