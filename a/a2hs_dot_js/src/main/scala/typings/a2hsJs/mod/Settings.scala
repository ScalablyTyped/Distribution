package typings.a2hsJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Settings extends js.Object {
  
  /**
    * Background color for container
    * @default '#f9f9f9'
    */
  var backgroundColor: js.UndefOr[String] = js.native
  
  /**
    * Brand for default `htmlContent`
    * @default ''
    */
  var brandName: js.UndefOr[String] = js.native
  
  /**
    * Font color for content in container
    * @default '#5d5d5d'
    */
  var color: js.UndefOr[String] = js.native
  
  /**
    * Font family for content in container
    * @default '-apple-system, sans-serif'
    */
  var fontFamily: js.UndefOr[String] = js.native
  
  /**
    * Font size for content in container
    * @default '0.9rem'
    */
  var fontSize: js.UndefOr[String] = js.native
  
  /**
    * Content for container with HTML
    */
  var htmlContent: js.UndefOr[String] = js.native
  
  /**
    * Logo for container
    */
  var logoImage: js.UndefOr[String] = js.native
  
  /**
    * Padding for container
    * @default '10px'
    */
  var padding: js.UndefOr[String] = js.native
  
  /**
    * Shadow color for top of container
    * @default '#e9e9e9'
    */
  var shadowColor: js.UndefOr[String] = js.native
  
  /**
    * Shadow size for top of container
    * @default '10px'
    */
  var shadowSize: js.UndefOr[String] = js.native
}
object Settings {
  
  @scala.inline
  def apply(): Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Settings]
  }
  
  @scala.inline
  implicit class SettingsOps[Self <: Settings] (val x: Self) extends AnyVal {
    
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
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setBrandName(value: String): Self = this.set("brandName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrandName: Self = this.set("brandName", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setFontFamily(value: String): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontFamily: Self = this.set("fontFamily", js.undefined)
    
    @scala.inline
    def setFontSize(value: String): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    
    @scala.inline
    def setHtmlContent(value: String): Self = this.set("htmlContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtmlContent: Self = this.set("htmlContent", js.undefined)
    
    @scala.inline
    def setLogoImage(value: String): Self = this.set("logoImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogoImage: Self = this.set("logoImage", js.undefined)
    
    @scala.inline
    def setPadding(value: String): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    
    @scala.inline
    def setShadowColor(value: String): Self = this.set("shadowColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadowColor: Self = this.set("shadowColor", js.undefined)
    
    @scala.inline
    def setShadowSize(value: String): Self = this.set("shadowSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadowSize: Self = this.set("shadowSize", js.undefined)
  }
}
