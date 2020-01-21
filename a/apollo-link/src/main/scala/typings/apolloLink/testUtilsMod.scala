package typings.apolloLink

import typings.apolloLink.mockLinkMod.default
import typings.apolloLink.testingUtilsMod.TestResultType
import typings.apolloLink.typesMod.RequestHandler
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-link/lib/test-utils", JSImport.Namespace)
@js.native
object testUtilsMod extends js.Object {
  @js.native
  class MockLink () extends default {
    def this(handleRequest: RequestHandler) = this()
  }
  
  @js.native
  class SetContextLink ()
    extends typings.apolloLink.setContextMod.default {
    def this(setContext: js.Function1[/* context */ Record[String, _], Record[String, _]]) = this()
  }
  
  def checkCalls[T](calls: js.Array[_], results: js.Array[T]): Unit = js.native
  def testLinkResults(params: TestResultType): Unit = js.native
}

