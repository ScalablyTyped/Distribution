package typings.arcgisJsApi.esri.CIM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIMShapeVertices extends js.Object {
  
  /**
    * The indices.
    */
  var indices: js.UndefOr[Double] = js.native
  
  /**
    * The shape.
    */
  var shapes: js.UndefOr[String] = js.native
  
  var `type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMShapeVertices = js.native
}
object CIMShapeVertices {
  
  @scala.inline
  def apply(`type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMShapeVertices): CIMShapeVertices = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMShapeVertices]
  }
  
  @scala.inline
  implicit class CIMShapeVerticesOps[Self <: CIMShapeVertices] (val x: Self) extends AnyVal {
    
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
    def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMShapeVertices): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndices(value: Double): Self = this.set("indices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndices: Self = this.set("indices", js.undefined)
    
    @scala.inline
    def setShapes(value: String): Self = this.set("shapes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShapes: Self = this.set("shapes", js.undefined)
  }
}
