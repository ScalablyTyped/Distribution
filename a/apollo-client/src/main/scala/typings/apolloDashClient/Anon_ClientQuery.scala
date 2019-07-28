package typings.apolloDashClient

import typings.apolloDashClient.coreTypesMod.OperationVariables
import typings.graphql.languageAstMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClientQuery extends js.Object {
  var clientQuery: DocumentNode | Null
  var defaultVars: OperationVariables
  var document: DocumentNode
  var hasClientExports: Boolean
  var hasForcedResolvers: Boolean
  var serverQuery: DocumentNode | Null
}

object Anon_ClientQuery {
  @scala.inline
  def apply(
    defaultVars: OperationVariables,
    document: DocumentNode,
    hasClientExports: Boolean,
    hasForcedResolvers: Boolean,
    clientQuery: DocumentNode = null,
    serverQuery: DocumentNode = null
  ): Anon_ClientQuery = {
    val __obj = js.Dynamic.literal(defaultVars = defaultVars, document = document, hasClientExports = hasClientExports, hasForcedResolvers = hasForcedResolvers)
    if (clientQuery != null) __obj.updateDynamic("clientQuery")(clientQuery)
    if (serverQuery != null) __obj.updateDynamic("serverQuery")(serverQuery)
    __obj.asInstanceOf[Anon_ClientQuery]
  }
}

