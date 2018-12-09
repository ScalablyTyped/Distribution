package typings
package atAngularCompilerLib.srcI18nExtractorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtractorHost
  extends atAngularCompilerLib.srcAotStaticUnderscoreSymbolUnderscoreResolverMod.StaticSymbolResolverHost
     with atAngularCompilerLib.srcAotSummaryUnderscoreResolverMod.AotSummaryResolverHost {
  /**
       * Loads a resource (e.g. html / css)
       */
  def loadResource(path: java.lang.String): js.Promise[java.lang.String] | java.lang.String = js.native
  /**
       * Converts a path that refers to a resource into an absolute filePath
       * that can be lateron used for loading the resource via `loadResource.
       */
  def resourceNameToFileName(path: java.lang.String, containingFile: java.lang.String): java.lang.String | scala.Null = js.native
}

