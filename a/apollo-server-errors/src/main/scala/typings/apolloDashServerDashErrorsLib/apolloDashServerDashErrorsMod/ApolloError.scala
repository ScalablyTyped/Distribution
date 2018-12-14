package typings
package apolloDashServerDashErrorsLib.apolloDashServerDashErrorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-errors", "ApolloError")
@js.native
class ApolloError protected ()
  extends graphqlLib.graphqlMod.GraphQLError
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  def this(message: java.lang.String) = this()
  def this(message: java.lang.String, code: java.lang.String) = this()
  def this(message: java.lang.String, code: java.lang.String, properties: stdLib.Record[java.lang.String, _]) = this()
  @JSName("extensions")
  var extensions_ApolloError: stdLib.Record[java.lang.String, _] = js.native
}

