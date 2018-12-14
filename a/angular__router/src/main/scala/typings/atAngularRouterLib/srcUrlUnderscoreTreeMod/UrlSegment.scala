package typings
package atAngularRouterLib.srcUrlUnderscoreTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/router/src/url_tree", "UrlSegment")
@js.native
class UrlSegment protected () extends js.Object {
  def this(/** The path part of a URL segment */
  path: java.lang.String, /** The matrix parameters associated with a segment */
  parameters: org.scalablytyped.runtime.StringDictionary[java.lang.String]) = this()
  val parameterMap: atAngularRouterLib.srcSharedMod.ParamMap = js.native
  /** The matrix parameters associated with a segment */
  var parameters: org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
  /** The path part of a URL segment */
  var path: java.lang.String = js.native
}

