package typings
package apolloDashLinkLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GraphQLRequest extends js.Object {
  var context: js.UndefOr[stdLib.Record[java.lang.String, _]] = js.undefined
  var extensions: js.UndefOr[stdLib.Record[java.lang.String, _]] = js.undefined
  var operationName: js.UndefOr[java.lang.String] = js.undefined
  var query: graphqlLib.languageAstMod.DocumentNode
  var variables: js.UndefOr[stdLib.Record[java.lang.String, _]] = js.undefined
}

