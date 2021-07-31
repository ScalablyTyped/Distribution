package typings.adeiraTestUtils

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@adeira/test-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def evaluateGraphQLResolver(field: Record[String, js.Any], testValue: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("evaluateGraphQLResolver")(field.asInstanceOf[js.Any], testValue.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def evaluateGraphQLResolver(
    field: Record[String, js.Any],
    testValue: js.Any,
    argsValue: Unit,
    contextValue: Record[String, js.Any]
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("evaluateGraphQLResolver")(field.asInstanceOf[js.Any], testValue.asInstanceOf[js.Any], argsValue.asInstanceOf[js.Any], contextValue.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def evaluateGraphQLResolver(field: Record[String, js.Any], testValue: js.Any, argsValue: Record[String, js.Any]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("evaluateGraphQLResolver")(field.asInstanceOf[js.Any], testValue.asInstanceOf[js.Any], argsValue.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def evaluateGraphQLResolver(
    field: Record[String, js.Any],
    testValue: js.Any,
    argsValue: Record[String, js.Any],
    contextValue: Record[String, js.Any]
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("evaluateGraphQLResolver")(field.asInstanceOf[js.Any], testValue.asInstanceOf[js.Any], argsValue.asInstanceOf[js.Any], contextValue.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def generateTestsFromFixtures(fixturesPath: String, operation: js.Function1[/* input */ String, js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateTestsFromFixtures")(fixturesPath.asInstanceOf[js.Any], operation.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def generateTestsFromFixtures(fixturesPath: String, operation: js.Function1[/* input */ String, js.Any], snapshotName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateTestsFromFixtures")(fixturesPath.asInstanceOf[js.Any], operation.asInstanceOf[js.Any], snapshotName.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
