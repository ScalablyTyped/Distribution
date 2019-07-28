package typings.atAngularCompiler.srcMlUnderscoreParserTagsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagDefinition extends js.Object {
  var canSelfClose: Boolean
  var closedByParent: Boolean
  var contentType: TagContentType
  var ignoreFirstLf: Boolean
  var implicitNamespacePrefix: String | Null
  var isVoid: Boolean
  def isClosedByChild(name: String): Boolean
}

object TagDefinition {
  @scala.inline
  def apply(
    canSelfClose: Boolean,
    closedByParent: Boolean,
    contentType: TagContentType,
    ignoreFirstLf: Boolean,
    isClosedByChild: String => Boolean,
    isVoid: Boolean,
    implicitNamespacePrefix: String = null
  ): TagDefinition = {
    val __obj = js.Dynamic.literal(canSelfClose = canSelfClose, closedByParent = closedByParent, contentType = contentType, ignoreFirstLf = ignoreFirstLf, isClosedByChild = js.Any.fromFunction1(isClosedByChild), isVoid = isVoid)
    if (implicitNamespacePrefix != null) __obj.updateDynamic("implicitNamespacePrefix")(implicitNamespacePrefix)
    __obj.asInstanceOf[TagDefinition]
  }
}

