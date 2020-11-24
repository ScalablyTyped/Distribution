package typings.adeiraTestUtils

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@adeira/test-utils", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def evaluateGraphQLResolver(field: Record[String, _], testValue: js.Any): js.Any = js.native
  def evaluateGraphQLResolver(
    field: Record[String, _],
    testValue: js.Any,
    argsValue: js.UndefOr[scala.Nothing],
    contextValue: Record[String, _]
  ): js.Any = js.native
  def evaluateGraphQLResolver(field: Record[String, _], testValue: js.Any, argsValue: Record[String, _]): js.Any = js.native
  def evaluateGraphQLResolver(
    field: Record[String, _],
    testValue: js.Any,
    argsValue: Record[String, _],
    contextValue: Record[String, _]
  ): js.Any = js.native
  
  def generateTestsFromFixtures(fixturesPath: String, operation: js.Function1[/* input */ String, _]): Unit = js.native
  def generateTestsFromFixtures(fixturesPath: String, operation: js.Function1[/* input */ String, _], snapshotName: String): Unit = js.native
}
