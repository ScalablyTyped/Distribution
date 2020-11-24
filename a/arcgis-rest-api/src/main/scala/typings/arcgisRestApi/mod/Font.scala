package typings.arcgisRestApi.mod

import typings.arcgisRestApi.arcgisRestApiStrings.`line-through`
import typings.arcgisRestApi.arcgisRestApiStrings.bold
import typings.arcgisRestApi.arcgisRestApiStrings.bolder
import typings.arcgisRestApi.arcgisRestApiStrings.italic
import typings.arcgisRestApi.arcgisRestApiStrings.lighter
import typings.arcgisRestApi.arcgisRestApiStrings.none
import typings.arcgisRestApi.arcgisRestApiStrings.normal
import typings.arcgisRestApi.arcgisRestApiStrings.oblique
import typings.arcgisRestApi.arcgisRestApiStrings.underline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Font extends js.Object {
  
  var decoration: js.UndefOr[`line-through` | underline | none] = js.native
  
  var family: js.UndefOr[String] = js.native
  
   // "<fontFamily>";
  var size: js.UndefOr[Double] = js.native
  
   // <fontSize>;
  var style: js.UndefOr[italic | normal | oblique] = js.native
  
  var weight: js.UndefOr[bold | bolder | lighter | normal] = js.native
}
object Font {
  
  @scala.inline
  def apply(): Font = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Font]
  }
  
  @scala.inline
  implicit class FontOps[Self <: Font] (val x: Self) extends AnyVal {
    
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
    def setDecoration(value: `line-through` | underline | none): Self = this.set("decoration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecoration: Self = this.set("decoration", js.undefined)
    
    @scala.inline
    def setFamily(value: String): Self = this.set("family", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFamily: Self = this.set("family", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setStyle(value: italic | normal | oblique): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setWeight(value: bold | bolder | lighter | normal): Self = this.set("weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeight: Self = this.set("weight", js.undefined)
  }
}
