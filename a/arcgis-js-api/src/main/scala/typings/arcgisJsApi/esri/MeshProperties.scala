package typings.arcgisJsApi.esri

import typings.arcgisJsApi.anon.MeshGeoreferencedRelative
import typings.arcgisJsApi.anon.MeshGeoreferencedVertexSp
import typings.arcgisJsApi.anon.MeshLocalVertexSpacePrope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeshProperties
  extends StObject
     with GeometryProperties
     with LoadableProperties {
  
  /**
  		 * An array of mesh components that can be used to apply materials to different regions of the same mesh.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#components)
  		 */
  var components: js.UndefOr[js.Array[MeshComponentProperties]] = js.undefined
  
  /**
  		 * The transform of the mesh.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#transform)
  		 */
  var transform: js.UndefOr[MeshTransformProperties] = js.undefined
  
  /**
  		 * Object describing the attributes of each vertex of the mesh.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#vertexAttributes)
  		 */
  var vertexAttributes: js.UndefOr[MeshVertexAttributesProperties] = js.undefined
  
  /**
  		 * The vertex space of the mesh.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#vertexSpace)
  		 */
  var vertexSpace: js.UndefOr[
    MeshGeoreferencedVertexSp | MeshGeoreferencedRelative | MeshLocalVertexSpacePrope
  ] = js.undefined
}
object MeshProperties {
  
  inline def apply(): MeshProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeshProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MeshProperties] (val x: Self) extends AnyVal {
    
    inline def setComponents(value: js.Array[MeshComponentProperties]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
    
    inline def setComponentsVarargs(value: MeshComponentProperties*): Self = StObject.set(x, "components", js.Array(value*))
    
    inline def setTransform(value: MeshTransformProperties): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    inline def setVertexAttributes(value: MeshVertexAttributesProperties): Self = StObject.set(x, "vertexAttributes", value.asInstanceOf[js.Any])
    
    inline def setVertexAttributesUndefined: Self = StObject.set(x, "vertexAttributes", js.undefined)
    
    inline def setVertexSpace(value: MeshGeoreferencedVertexSp | MeshGeoreferencedRelative | MeshLocalVertexSpacePrope): Self = StObject.set(x, "vertexSpace", value.asInstanceOf[js.Any])
    
    inline def setVertexSpaceUndefined: Self = StObject.set(x, "vertexSpace", js.undefined)
  }
}
