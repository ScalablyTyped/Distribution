package typings
package apolloDashServerDashCoreLib.distRunHttpQueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-core/dist/runHttpQuery", "HttpQueryError")
@js.native
class HttpQueryError protected ()
  extends stdLib.Error {
  def this(statusCode: scala.Double, message: java.lang.String) = this()
  def this(statusCode: scala.Double, message: java.lang.String, isGraphQLError: scala.Boolean) = this()
  def this(statusCode: scala.Double, message: java.lang.String, isGraphQLError: scala.Boolean, headers: org.scalablytyped.runtime.StringDictionary[java.lang.String]) = this()
  var headers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.native
  var isGraphQLError: scala.Boolean = js.native
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
  var statusCode: scala.Double = js.native
}

