package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMShapeVertices extends StObject {
  
  /**
    * The indices.
    */
  var indices: js.UndefOr[Double] = js.undefined
  
  /**
    * The shape.
    */
  var shapes: js.UndefOr[String] = js.undefined
  
  var `type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMShapeVertices
}
object CIMShapeVertices {
  
  inline def apply(): CIMShapeVertices = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("CIMShapeVertices")
    __obj.asInstanceOf[CIMShapeVertices]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CIMShapeVertices] (val x: Self) extends AnyVal {
    
    inline def setIndices(value: Double): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    inline def setIndicesUndefined: Self = StObject.set(x, "indices", js.undefined)
    
    inline def setShapes(value: String): Self = StObject.set(x, "shapes", value.asInstanceOf[js.Any])
    
    inline def setShapesUndefined: Self = StObject.set(x, "shapes", js.undefined)
    
    inline def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMShapeVertices): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
