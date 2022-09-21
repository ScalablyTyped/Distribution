package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The utility network associations model connectivity, containment, and structure relations between assets.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-synthesizeAssociationGeometries.html)
  */
@js.native
trait synthesizeAssociationGeometries extends StObject {
  
  /**
    * Given an extent, returns all associations within this extent and their synthesized geometries.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-synthesizeAssociationGeometries.html#synthesizeAssociationGeometries)
    */
  def synthesizeAssociationGeometries(url: String, params: SynthesizeAssociationGeometriesParameters): js.Promise[AssociationGeometriesResult] = js.native
  def synthesizeAssociationGeometries(url: String, params: SynthesizeAssociationGeometriesParameters, requestOptions: Any): js.Promise[AssociationGeometriesResult] = js.native
}
