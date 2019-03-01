package typings
package atAngularCompilerLib.srcCompileUnderscoreMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompileQueryMetadata extends js.Object {
  var descendants: scala.Boolean
  var first: scala.Boolean
  var propertyName: java.lang.String
  var read: CompileTokenMetadata
  var selectors: js.Array[CompileTokenMetadata]
}

object CompileQueryMetadata {
  @scala.inline
  def apply(
    descendants: scala.Boolean,
    first: scala.Boolean,
    propertyName: java.lang.String,
    read: CompileTokenMetadata,
    selectors: js.Array[CompileTokenMetadata]
  ): CompileQueryMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("descendants")(descendants)
    __obj.updateDynamic("first")(first)
    __obj.updateDynamic("propertyName")(propertyName)
    __obj.updateDynamic("read")(read)
    __obj.updateDynamic("selectors")(selectors)
    __obj.asInstanceOf[CompileQueryMetadata]
  }
}

