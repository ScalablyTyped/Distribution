package typings
package atAngularRouterLib.atAngularRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/router", "UrlSegment")
@js.native
class UrlSegment protected () extends js.Object {
  def this(/** The path part of a URL segment */
  path: java.lang.String, /** The matrix parameters associated with a segment */
  parameters: org.scalablytyped.runtime.StringDictionary[java.lang.String]) = this()
  val parameterMap: ParamMap = js.native
  /** The matrix parameters associated with a segment */
  var parameters: org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
  /** The path part of a URL segment */
  var path: java.lang.String = js.native
}

