package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeshGeoreferencedRelativeVertexSpaceProperties extends StObject {
  
  /**
  		 * Origin of the vertex space.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshGeoreferencedRelativeVertexSpace.html#origin)
  		 */
  var origin: js.UndefOr[js.Array[Double]] = js.undefined
}
object MeshGeoreferencedRelativeVertexSpaceProperties {
  
  inline def apply(): MeshGeoreferencedRelativeVertexSpaceProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeshGeoreferencedRelativeVertexSpaceProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MeshGeoreferencedRelativeVertexSpaceProperties] (val x: Self) extends AnyVal {
    
    inline def setOrigin(value: js.Array[Double]): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    inline def setOriginVarargs(value: Double*): Self = StObject.set(x, "origin", js.Array(value*))
  }
}
