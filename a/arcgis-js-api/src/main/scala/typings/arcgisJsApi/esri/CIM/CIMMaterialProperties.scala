package typings.arcgisJsApi.esri.CIM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIMMaterialProperties extends js.Object {
  
  /**
    * How this material combines with externally defined colors.
    */
  var externalColorMixMode: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ExternalColorMixMode * / any */ String
  ] = js.native
  
  /**
    * The shininess.
    */
  var shininess: js.UndefOr[Double] = js.native
  
  /**
    * The specular color.
    */
  var specularColor: js.UndefOr[js.Array[Double]] = js.native
  
  var `type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMMaterialProperties = js.native
}
object CIMMaterialProperties {
  
  @scala.inline
  def apply(`type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMMaterialProperties): CIMMaterialProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMMaterialProperties]
  }
  
  @scala.inline
  implicit class CIMMaterialPropertiesOps[Self <: CIMMaterialProperties] (val x: Self) extends AnyVal {
    
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
    def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMMaterialProperties): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalColorMixMode(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ExternalColorMixMode * / any */ String
    ): Self = this.set("externalColorMixMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternalColorMixMode: Self = this.set("externalColorMixMode", js.undefined)
    
    @scala.inline
    def setShininess(value: Double): Self = this.set("shininess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShininess: Self = this.set("shininess", js.undefined)
    
    @scala.inline
    def setSpecularColorVarargs(value: Double*): Self = this.set("specularColor", js.Array(value :_*))
    
    @scala.inline
    def setSpecularColor(value: js.Array[Double]): Self = this.set("specularColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpecularColor: Self = this.set("specularColor", js.undefined)
  }
}
