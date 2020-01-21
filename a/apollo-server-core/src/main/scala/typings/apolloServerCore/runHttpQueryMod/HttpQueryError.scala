package typings.apolloServerCore.runHttpQueryMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-core/dist/runHttpQuery", "HttpQueryError")
@js.native
class HttpQueryError protected () extends Error {
  def this(statusCode: Double, message: String) = this()
  def this(statusCode: Double, message: String, isGraphQLError: Boolean) = this()
  def this(statusCode: Double, message: String, isGraphQLError: Boolean, headers: StringDictionary[String]) = this()
  var headers: js.UndefOr[StringDictionary[String]] = js.native
  var isGraphQLError: Boolean = js.native
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
  var statusCode: Double = js.native
}

