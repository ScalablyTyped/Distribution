package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BoundingBox extends StObject {
  
  /**
    * Height of the bounding box as a ratio of the overall image height.
    */
  var Height: js.UndefOr[Float] = js.undefined
  
  /**
    * Left coordinate of the bounding box as a ratio of overall image width.
    */
  var Left: js.UndefOr[Float] = js.undefined
  
  /**
    * Top coordinate of the bounding box as a ratio of overall image height.
    */
  var Top: js.UndefOr[Float] = js.undefined
  
  /**
    * Width of the bounding box as a ratio of the overall image width.
    */
  var Width: js.UndefOr[Float] = js.undefined
}
object BoundingBox {
  
  inline def apply(): BoundingBox = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BoundingBox]
  }
  
  extension [Self <: BoundingBox](x: Self) {
    
    inline def setHeight(value: Float): Self = StObject.set(x, "Height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "Height", js.undefined)
    
    inline def setLeft(value: Float): Self = StObject.set(x, "Left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "Left", js.undefined)
    
    inline def setTop(value: Float): Self = StObject.set(x, "Top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "Top", js.undefined)
    
    inline def setWidth(value: Float): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "Width", js.undefined)
  }
}
