package typings.antd.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typings.antd.esCommentMod.CommentProps
import typings.antd.esCommentMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: style, className */
object Comment
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.antd.esCommentMod.default].asInstanceOf[String | js.Object]
  def apply(
    content: TagMod[Any],
    actions: js.Array[TagMod[Any]] = null,
    author: TagMod[Any] = null,
    avatar: TagMod[Any] = null,
    datetime: TagMod[Any] = null,
    prefixCls: String = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(content = content)
    if (actions != null) __obj.updateDynamic("actions")(actions)
    if (author != null) __obj.updateDynamic("author")(author)
    if (avatar != null) __obj.updateDynamic("avatar")(avatar)
    if (datetime != null) __obj.updateDynamic("datetime")(datetime)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = CommentProps
}

