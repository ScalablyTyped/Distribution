package typings
package atAngularCompilerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClosedByChildren extends js.Object {
  var closedByChildren: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var closedByParent: js.UndefOr[scala.Boolean] = js.undefined
  var contentType: js.UndefOr[atAngularCompilerLib.srcMlUnderscoreParserTagsMod.TagContentType] = js.undefined
  var ignoreFirstLf: js.UndefOr[scala.Boolean] = js.undefined
  var implicitNamespacePrefix: js.UndefOr[java.lang.String] = js.undefined
  var isVoid: js.UndefOr[scala.Boolean] = js.undefined
  var requiredParents: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Anon_ClosedByChildren {
  @scala.inline
  def apply(
    closedByChildren: js.Array[java.lang.String] = null,
    closedByParent: js.UndefOr[scala.Boolean] = js.undefined,
    contentType: atAngularCompilerLib.srcMlUnderscoreParserTagsMod.TagContentType = null,
    ignoreFirstLf: js.UndefOr[scala.Boolean] = js.undefined,
    implicitNamespacePrefix: java.lang.String = null,
    isVoid: js.UndefOr[scala.Boolean] = js.undefined,
    requiredParents: js.Array[java.lang.String] = null
  ): Anon_ClosedByChildren = {
    val __obj = js.Dynamic.literal()
    if (closedByChildren != null) __obj.updateDynamic("closedByChildren")(closedByChildren)
    if (!js.isUndefined(closedByParent)) __obj.updateDynamic("closedByParent")(closedByParent)
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (!js.isUndefined(ignoreFirstLf)) __obj.updateDynamic("ignoreFirstLf")(ignoreFirstLf)
    if (implicitNamespacePrefix != null) __obj.updateDynamic("implicitNamespacePrefix")(implicitNamespacePrefix)
    if (!js.isUndefined(isVoid)) __obj.updateDynamic("isVoid")(isVoid)
    if (requiredParents != null) __obj.updateDynamic("requiredParents")(requiredParents)
    __obj.asInstanceOf[Anon_ClosedByChildren]
  }
}

