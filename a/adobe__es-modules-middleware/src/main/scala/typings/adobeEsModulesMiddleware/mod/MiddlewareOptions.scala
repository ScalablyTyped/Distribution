package typings.adobeEsModulesMiddleware.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MiddlewareOptions extends js.Object {
  /** a map of url base path to file system path from which to serve files */
  var paths: StringDictionary[String]
}

object MiddlewareOptions {
  @scala.inline
  def apply(paths: StringDictionary[String]): MiddlewareOptions = {
    val __obj = js.Dynamic.literal(paths = paths.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MiddlewareOptions]
  }
}

