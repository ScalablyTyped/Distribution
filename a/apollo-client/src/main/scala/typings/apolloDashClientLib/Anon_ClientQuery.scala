package typings
package apolloDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClientQuery extends js.Object {
  var clientQuery: graphqlLib.languageAstMod.DocumentNode | scala.Null
  var defaultVars: apolloDashClientLib.coreTypesMod.OperationVariables
  var document: graphqlLib.languageAstMod.DocumentNode
  var hasClientExports: scala.Boolean
  var hasForcedResolvers: scala.Boolean
  var serverQuery: graphqlLib.languageAstMod.DocumentNode | scala.Null
}

object Anon_ClientQuery {
  @scala.inline
  def apply(
    defaultVars: apolloDashClientLib.coreTypesMod.OperationVariables,
    document: graphqlLib.languageAstMod.DocumentNode,
    hasClientExports: scala.Boolean,
    hasForcedResolvers: scala.Boolean,
    clientQuery: graphqlLib.languageAstMod.DocumentNode = null,
    serverQuery: graphqlLib.languageAstMod.DocumentNode = null
  ): Anon_ClientQuery = {
    val __obj = js.Dynamic.literal(defaultVars = defaultVars, document = document, hasClientExports = hasClientExports, hasForcedResolvers = hasForcedResolvers)
    if (clientQuery != null) __obj.updateDynamic("clientQuery")(clientQuery)
    if (serverQuery != null) __obj.updateDynamic("serverQuery")(serverQuery)
    __obj.asInstanceOf[Anon_ClientQuery]
  }
}

