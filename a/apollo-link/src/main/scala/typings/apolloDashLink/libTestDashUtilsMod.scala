package typings.apolloDashLink

import typings.apolloDashLink.libTestDashUtilsMockLinkMod.default
import typings.apolloDashLink.libTestDashUtilsTestingUtilsMod.TestResultType
import typings.apolloDashLink.libTypesMod.RequestHandler
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-link/lib/test-utils", JSImport.Namespace)
@js.native
object libTestDashUtilsMod extends js.Object {
  @js.native
  class MockLink () extends default {
    def this(handleRequest: RequestHandler) = this()
  }
  
  @js.native
  class SetContextLink ()
    extends typings.apolloDashLink.libTestDashUtilsSetContextMod.default {
    def this(setContext: js.Function1[/* context */ Record[String, _], Record[String, _]]) = this()
  }
  
  def checkCalls[T](calls: js.Array[_], results: js.Array[T]): Unit = js.native
  def testLinkResults(params: TestResultType): Unit = js.native
}

