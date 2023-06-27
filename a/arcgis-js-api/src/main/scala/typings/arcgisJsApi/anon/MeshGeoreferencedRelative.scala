package typings.arcgisJsApi.anon

import typings.arcgisJsApi.arcgisJsApiStrings.`georeferenced-relative`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined arcgis-js-api.__esri.MeshGeoreferencedRelativeVertexSpaceProperties & {  type :'georeferenced-relative'} */
trait MeshGeoreferencedRelative extends StObject {
  
  /**
  		 * Origin of the vertex space.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshGeoreferencedRelativeVertexSpace.html#origin)
  		 */
  var origin: js.UndefOr[js.Array[Double]] = js.undefined
  
  var `type`: `georeferenced-relative`
}
object MeshGeoreferencedRelative {
  
  inline def apply(): MeshGeoreferencedRelative = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("georeferenced-relative")
    __obj.asInstanceOf[MeshGeoreferencedRelative]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MeshGeoreferencedRelative] (val x: Self) extends AnyVal {
    
    inline def setOrigin(value: js.Array[Double]): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    inline def setOriginVarargs(value: Double*): Self = StObject.set(x, "origin", js.Array(value*))
    
    inline def setType(value: `georeferenced-relative`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
