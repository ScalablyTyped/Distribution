package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIMShapeVertices extends StObject {
  
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
  implicit class CIMShapeVerticesMutableBuilder[Self <: CIMShapeVertices] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndices(value: Double): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndicesUndefined: Self = StObject.set(x, "indices", js.undefined)
    
    @scala.inline
    def setShapes(value: String): Self = StObject.set(x, "shapes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapesUndefined: Self = StObject.set(x, "shapes", js.undefined)
    
    @scala.inline
    def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMShapeVertices): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
