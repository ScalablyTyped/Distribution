package typings.adeiraTestUtils

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@adeira/test-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def evaluateGraphQLResolver(field: Record[String, Any], testValue: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("evaluateGraphQLResolver")(field.asInstanceOf[js.Any], testValue.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def evaluateGraphQLResolver(field: Record[String, Any], testValue: Any, argsValue: Unit, contextValue: Record[String, Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("evaluateGraphQLResolver")(field.asInstanceOf[js.Any], testValue.asInstanceOf[js.Any], argsValue.asInstanceOf[js.Any], contextValue.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def evaluateGraphQLResolver(field: Record[String, Any], testValue: Any, argsValue: Record[String, Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("evaluateGraphQLResolver")(field.asInstanceOf[js.Any], testValue.asInstanceOf[js.Any], argsValue.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def evaluateGraphQLResolver(
    field: Record[String, Any],
    testValue: Any,
    argsValue: Record[String, Any],
    contextValue: Record[String, Any]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("evaluateGraphQLResolver")(field.asInstanceOf[js.Any], testValue.asInstanceOf[js.Any], argsValue.asInstanceOf[js.Any], contextValue.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def generateTestsFromFixtures(fixturesPath: String, operation: js.Function1[/* input */ String, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateTestsFromFixtures")(fixturesPath.asInstanceOf[js.Any], operation.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def generateTestsFromFixtures(fixturesPath: String, operation: js.Function1[/* input */ String, Any], snapshotName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateTestsFromFixtures")(fixturesPath.asInstanceOf[js.Any], operation.asInstanceOf[js.Any], snapshotName.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
