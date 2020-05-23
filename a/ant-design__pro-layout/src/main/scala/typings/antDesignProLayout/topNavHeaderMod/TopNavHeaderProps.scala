package typings.antDesignProLayout.topNavHeaderMod

import typings.antDesignProLayout.antDesignProLayoutBooleans.`false`
import typings.antDesignProLayout.siderMenuSiderMenuMod.SiderMenuProps
import typings.antDesignProLayout.typingsMod.WithFalse
import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TopNavHeaderProps extends SiderMenuProps {
  var onCollapse: js.UndefOr[js.Function1[/* collapse */ Boolean, Unit]] = js.undefined
  var rightContentRender: js.UndefOr[WithFalse[js.Function1[/* props */ this.type, ReactNode]]] = js.undefined
}

object TopNavHeaderProps {
  @scala.inline
  def apply(
    breakpoint: (/* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SiderProps * / any['breakpoint'] */ js.Any) | `false` = null,
    className: String = null,
    hide: js.UndefOr[Boolean] = js.undefined,
    links: js.Array[ReactNode] = null,
    logo: ReactNode = null,
    menuHeaderRender: WithFalse[
      js.Function3[
        /* logo */ ReactNode, 
        /* title */ ReactNode, 
        /* props */ js.UndefOr[TopNavHeaderProps], 
        ReactNode
      ]
    ] = null,
    onCollapse: /* collapse */ Boolean => Unit = null,
    onMenuHeaderClick: /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit = null,
    onOpenChange: /* openKeys */ WithFalse[js.Array[String]] => Unit = null,
    rightContentRender: WithFalse[js.Function1[TopNavHeaderProps, ReactNode]] = null,
    siderWidth: js.UndefOr[Double] = js.undefined,
    style: CSSProperties = null
  ): TopNavHeaderProps = {
    val __obj = js.Dynamic.literal()
    if (breakpoint != null) __obj.updateDynamic("breakpoint")(breakpoint.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(hide)) __obj.updateDynamic("hide")(hide.get.asInstanceOf[js.Any])
    if (links != null) __obj.updateDynamic("links")(links.asInstanceOf[js.Any])
    if (logo != null) __obj.updateDynamic("logo")(logo.asInstanceOf[js.Any])
    if (menuHeaderRender != null) __obj.updateDynamic("menuHeaderRender")(menuHeaderRender.asInstanceOf[js.Any])
    if (onCollapse != null) __obj.updateDynamic("onCollapse")(js.Any.fromFunction1(onCollapse))
    if (onMenuHeaderClick != null) __obj.updateDynamic("onMenuHeaderClick")(js.Any.fromFunction1(onMenuHeaderClick))
    if (onOpenChange != null) __obj.updateDynamic("onOpenChange")(js.Any.fromFunction1(onOpenChange))
    if (rightContentRender != null) __obj.updateDynamic("rightContentRender")(rightContentRender.asInstanceOf[js.Any])
    if (!js.isUndefined(siderWidth)) __obj.updateDynamic("siderWidth")(siderWidth.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopNavHeaderProps]
  }
}

