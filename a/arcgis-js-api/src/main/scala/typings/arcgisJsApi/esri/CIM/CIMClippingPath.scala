package typings.arcgisJsApi.esri.CIM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIMClippingPath extends js.Object {
  
  /**
    * The clipping type.
    */
  var clippingType: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ClippingType * / any */ String
  ] = js.native
  
  /**
    * The clipping path.
    */
  var path: js.UndefOr[ExternalReferencePolygon] = js.native
  
  var `type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMClippingPath = js.native
}
object CIMClippingPath {
  
  @scala.inline
  def apply(`type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMClippingPath): CIMClippingPath = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMClippingPath]
  }
  
  @scala.inline
  implicit class CIMClippingPathOps[Self <: CIMClippingPath] (val x: Self) extends AnyVal {
    
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
    def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMClippingPath): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClippingType(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ClippingType * / any */ String
    ): Self = this.set("clippingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClippingType: Self = this.set("clippingType", js.undefined)
    
    @scala.inline
    def setPath(value: ExternalReferencePolygon): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
  }
}
