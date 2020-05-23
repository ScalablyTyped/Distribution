package typings.angularCompiler.anon

import typings.angularCompiler.tagsMod.TagContentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClosedByChildren extends js.Object {
  var closedByChildren: js.UndefOr[js.Array[String]] = js.undefined
  var closedByParent: js.UndefOr[Boolean] = js.undefined
  var contentType: js.UndefOr[TagContentType] = js.undefined
  var ignoreFirstLf: js.UndefOr[Boolean] = js.undefined
  var implicitNamespacePrefix: js.UndefOr[String] = js.undefined
  var isVoid: js.UndefOr[Boolean] = js.undefined
}

object ClosedByChildren {
  @scala.inline
  def apply(
    closedByChildren: js.Array[String] = null,
    closedByParent: js.UndefOr[Boolean] = js.undefined,
    contentType: TagContentType = null,
    ignoreFirstLf: js.UndefOr[Boolean] = js.undefined,
    implicitNamespacePrefix: String = null,
    isVoid: js.UndefOr[Boolean] = js.undefined
  ): ClosedByChildren = {
    val __obj = js.Dynamic.literal()
    if (closedByChildren != null) __obj.updateDynamic("closedByChildren")(closedByChildren.asInstanceOf[js.Any])
    if (!js.isUndefined(closedByParent)) __obj.updateDynamic("closedByParent")(closedByParent.get.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreFirstLf)) __obj.updateDynamic("ignoreFirstLf")(ignoreFirstLf.get.asInstanceOf[js.Any])
    if (implicitNamespacePrefix != null) __obj.updateDynamic("implicitNamespacePrefix")(implicitNamespacePrefix.asInstanceOf[js.Any])
    if (!js.isUndefined(isVoid)) __obj.updateDynamic("isVoid")(isVoid.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClosedByChildren]
  }
}

