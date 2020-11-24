package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebStyleSymbolProperties extends SymbolProperties {
  
  /**
    * The name of the symbol within the web style.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WebStyleSymbol.html#name)
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The portal that contains the web style this symbol refers to.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WebStyleSymbol.html#portal)
    */
  var portal: js.UndefOr[PortalProperties] = js.native
  
  /**
    * A registered web style name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WebStyleSymbol.html#styleName)
    */
  var styleName: js.UndefOr[String] = js.native
  
  /**
    * URL that points to the web style definition.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WebStyleSymbol.html#styleUrl)
    */
  var styleUrl: js.UndefOr[String] = js.native
}
object WebStyleSymbolProperties {
  
  @scala.inline
  def apply(): WebStyleSymbolProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebStyleSymbolProperties]
  }
  
  @scala.inline
  implicit class WebStyleSymbolPropertiesOps[Self <: WebStyleSymbolProperties] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPortal(value: PortalProperties): Self = this.set("portal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePortal: Self = this.set("portal", js.undefined)
    
    @scala.inline
    def setStyleName(value: String): Self = this.set("styleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyleName: Self = this.set("styleName", js.undefined)
    
    @scala.inline
    def setStyleUrl(value: String): Self = this.set("styleUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyleUrl: Self = this.set("styleUrl", js.undefined)
  }
}
