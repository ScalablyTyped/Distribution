package typings.apolloDashGraphql

import typings.graphql.languageAstMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-graphql/lib/operationId", JSImport.Namespace)
@js.native
object libOperationIdMod extends js.Object {
  def defaultEngineReportingSignature(ast: DocumentNode, operationName: String): String = js.native
  def defaultOperationRegistrySignature(ast: DocumentNode, operationName: String): String = js.native
  def operationHash(operation: String): String = js.native
}

