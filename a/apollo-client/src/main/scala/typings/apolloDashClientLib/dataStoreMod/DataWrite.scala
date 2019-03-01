package typings
package apolloDashClientLib.dataStoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataWrite extends js.Object {
  var document: graphqlLib.languageAstMod.DocumentNode
  var operationName: java.lang.String | scala.Null
  var result: js.Any
  var rootId: java.lang.String
  var variables: js.Object
}

object DataWrite {
  @scala.inline
  def apply(
    document: graphqlLib.languageAstMod.DocumentNode,
    result: js.Any,
    rootId: java.lang.String,
    variables: js.Object,
    operationName: java.lang.String = null
  ): DataWrite = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("document")(document)
    __obj.updateDynamic("result")(result)
    __obj.updateDynamic("rootId")(rootId)
    __obj.updateDynamic("variables")(variables)
    if (operationName != null) __obj.updateDynamic("operationName")(operationName)
    __obj.asInstanceOf[DataWrite]
  }
}

