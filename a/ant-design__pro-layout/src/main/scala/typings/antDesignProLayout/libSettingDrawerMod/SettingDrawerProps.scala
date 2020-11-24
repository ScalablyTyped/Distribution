package typings.antDesignProLayout.libSettingDrawerMod

import typings.antDesignProLayout.anon.MergerSettingsTypeProSett
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SettingDrawerProps extends js.Object {
  
  var collapse: js.UndefOr[Boolean] = js.native
  
  var getContainer: js.UndefOr[js.Any] = js.native
  
  var hideColors: js.UndefOr[Boolean] = js.native
  
  var hideCopyButton: js.UndefOr[Boolean] = js.native
  
  var hideHintAlert: js.UndefOr[Boolean] = js.native
  
  var hideLoading: js.UndefOr[Boolean] = js.native
  
  var onCollapseChange: js.UndefOr[js.Function1[/* collapse */ Boolean, Unit]] = js.native
  
  var onSettingChange: js.UndefOr[js.Function1[/* settings */ MergerSettingsTypeProSett, Unit]] = js.native
  
  var prefixCls: js.UndefOr[String] = js.native
  
  var publicPath: js.UndefOr[String] = js.native
  
  var settings: js.UndefOr[MergerSettingsTypeProSett] = js.native
}
object SettingDrawerProps {
  
  @scala.inline
  def apply(): SettingDrawerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SettingDrawerProps]
  }
  
  @scala.inline
  implicit class SettingDrawerPropsOps[Self <: SettingDrawerProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCollapse(value: Boolean): Self = this.set("collapse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollapse: Self = this.set("collapse", js.undefined)
    
    @scala.inline
    def setGetContainer(value: js.Any): Self = this.set("getContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGetContainer: Self = this.set("getContainer", js.undefined)
    
    @scala.inline
    def setHideColors(value: Boolean): Self = this.set("hideColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideColors: Self = this.set("hideColors", js.undefined)
    
    @scala.inline
    def setHideCopyButton(value: Boolean): Self = this.set("hideCopyButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideCopyButton: Self = this.set("hideCopyButton", js.undefined)
    
    @scala.inline
    def setHideHintAlert(value: Boolean): Self = this.set("hideHintAlert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideHintAlert: Self = this.set("hideHintAlert", js.undefined)
    
    @scala.inline
    def setHideLoading(value: Boolean): Self = this.set("hideLoading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideLoading: Self = this.set("hideLoading", js.undefined)
    
    @scala.inline
    def setOnCollapseChange(value: /* collapse */ Boolean => Unit): Self = this.set("onCollapseChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnCollapseChange: Self = this.set("onCollapseChange", js.undefined)
    
    @scala.inline
    def setOnSettingChange(value: /* settings */ MergerSettingsTypeProSett => Unit): Self = this.set("onSettingChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSettingChange: Self = this.set("onSettingChange", js.undefined)
    
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    
    @scala.inline
    def setPublicPath(value: String): Self = this.set("publicPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublicPath: Self = this.set("publicPath", js.undefined)
    
    @scala.inline
    def setSettings(value: MergerSettingsTypeProSett): Self = this.set("settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSettings: Self = this.set("settings", js.undefined)
  }
}
