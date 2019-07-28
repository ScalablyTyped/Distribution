package typings.atAngularCompiler

import typings.atAngularCompiler.srcMlUnderscoreParserTagsMod.TagContentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClosedByChildren extends js.Object {
  var closedByChildren: js.UndefOr[js.Array[String]] = js.undefined
  var closedByParent: js.UndefOr[Boolean] = js.undefined
  var contentType: js.UndefOr[TagContentType] = js.undefined
  var ignoreFirstLf: js.UndefOr[Boolean] = js.undefined
  var implicitNamespacePrefix: js.UndefOr[String] = js.undefined
  var isVoid: js.UndefOr[Boolean] = js.undefined
}

object Anon_ClosedByChildren {
  @scala.inline
  def apply(
    closedByChildren: js.Array[String] = null,
    closedByParent: js.UndefOr[Boolean] = js.undefined,
    contentType: TagContentType = null,
    ignoreFirstLf: js.UndefOr[Boolean] = js.undefined,
    implicitNamespacePrefix: String = null,
    isVoid: js.UndefOr[Boolean] = js.undefined
  ): Anon_ClosedByChildren = {
    val __obj = js.Dynamic.literal()
    if (closedByChildren != null) __obj.updateDynamic("closedByChildren")(closedByChildren)
    if (!js.isUndefined(closedByParent)) __obj.updateDynamic("closedByParent")(closedByParent)
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (!js.isUndefined(ignoreFirstLf)) __obj.updateDynamic("ignoreFirstLf")(ignoreFirstLf)
    if (implicitNamespacePrefix != null) __obj.updateDynamic("implicitNamespacePrefix")(implicitNamespacePrefix)
    if (!js.isUndefined(isVoid)) __obj.updateDynamic("isVoid")(isVoid)
    __obj.asInstanceOf[Anon_ClosedByChildren]
  }
}

