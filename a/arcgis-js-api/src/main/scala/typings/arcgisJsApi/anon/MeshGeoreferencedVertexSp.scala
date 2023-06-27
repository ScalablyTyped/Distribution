package typings.arcgisJsApi.anon

import typings.arcgisJsApi.arcgisJsApiStrings.georeferenced
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined arcgis-js-api.__esri.MeshGeoreferencedVertexSpaceProperties & {  type :'georeferenced'} */
trait MeshGeoreferencedVertexSp extends StObject {
  
  var `type`: georeferenced
}
object MeshGeoreferencedVertexSp {
  
  inline def apply(): MeshGeoreferencedVertexSp = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("georeferenced")
    __obj.asInstanceOf[MeshGeoreferencedVertexSp]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MeshGeoreferencedVertexSp] (val x: Self) extends AnyVal {
    
    inline def setType(value: georeferenced): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
