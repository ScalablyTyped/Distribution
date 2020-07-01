package typings.antDesignProLayout.pageHeaderWrapperMod

import typings.antd.tabsMod.TabsProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageHeaderTabConfig extends js.Object {
  var onTabChange: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: antd.antd/lib/tabs.TabsProps['onChange'] */ js.Any
  ] = js.undefined
  var tabActiveKey: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: antd.antd/lib/tabs.TabsProps['activeKey'] */ js.Any
  ] = js.undefined
  var tabBarExtraContent: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: antd.antd/lib/tabs.TabsProps['tabBarExtraContent'] */ js.Any
  ] = js.undefined
  var tabList: js.UndefOr[
    js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TabPaneProps */ _
    ]
  ] = js.undefined
  var tabProps: js.UndefOr[TabsProps] = js.undefined
}

object PageHeaderTabConfig {
  @scala.inline
  def apply(
    onTabChange: /* import warning: importer.ImportType#apply Failed type conversion: antd.antd/lib/tabs.TabsProps['onChange'] */ js.Any = null,
    tabActiveKey: /* import warning: importer.ImportType#apply Failed type conversion: antd.antd/lib/tabs.TabsProps['activeKey'] */ js.Any = null,
    tabBarExtraContent: /* import warning: importer.ImportType#apply Failed type conversion: antd.antd/lib/tabs.TabsProps['tabBarExtraContent'] */ js.Any = null,
    tabList: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TabPaneProps */ _
    ] = null,
    tabProps: TabsProps = null
  ): PageHeaderTabConfig = {
    val __obj = js.Dynamic.literal()
    if (onTabChange != null) __obj.updateDynamic("onTabChange")(onTabChange.asInstanceOf[js.Any])
    if (tabActiveKey != null) __obj.updateDynamic("tabActiveKey")(tabActiveKey.asInstanceOf[js.Any])
    if (tabBarExtraContent != null) __obj.updateDynamic("tabBarExtraContent")(tabBarExtraContent.asInstanceOf[js.Any])
    if (tabList != null) __obj.updateDynamic("tabList")(tabList.asInstanceOf[js.Any])
    if (tabProps != null) __obj.updateDynamic("tabProps")(tabProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageHeaderTabConfig]
  }
}

