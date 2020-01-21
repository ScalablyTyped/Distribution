package typings.angularCompiler

import typings.angularCompiler.tagsMod.TagContentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClosedByChildren extends js.Object {
  var closedByChildren: js.UndefOr[js.Array[String]] = js.undefined
  var closedByParent: js.UndefOr[Boolean] = js.undefined
  var contentType: js.UndefOr[TagContentType] = js.undefined
  var ignoreFirstLf: js.UndefOr[Boolean] = js.undefined
  var implicitNamespacePrefix: js.UndefOr[String] = js.undefined
  var isVoid: js.UndefOr[Boolean] = js.undefined
}

object AnonClosedByChildren {
  @scala.inline
  def apply(
    closedByChildren: js.Array[String] = null,
    closedByParent: js.UndefOr[Boolean] = js.undefined,
    contentType: TagContentType = null,
    ignoreFirstLf: js.UndefOr[Boolean] = js.undefined,
    implicitNamespacePrefix: String = null,
    isVoid: js.UndefOr[Boolean] = js.undefined
  ): AnonClosedByChildren = {
    val __obj = js.Dynamic.literal()
    if (closedByChildren != null) __obj.updateDynamic("closedByChildren")(closedByChildren.asInstanceOf[js.Any])
    if (!js.isUndefined(closedByParent)) __obj.updateDynamic("closedByParent")(closedByParent.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreFirstLf)) __obj.updateDynamic("ignoreFirstLf")(ignoreFirstLf.asInstanceOf[js.Any])
    if (implicitNamespacePrefix != null) __obj.updateDynamic("implicitNamespacePrefix")(implicitNamespacePrefix.asInstanceOf[js.Any])
    if (!js.isUndefined(isVoid)) __obj.updateDynamic("isVoid")(isVoid.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClosedByChildren]
  }
}

