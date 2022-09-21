package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SynthesizeAssociationGeometriesParametersConstructor
  extends StObject
     with /**
  * This class describes the parameters required to execute the synthesizeAssociationGeometries function which synthesizes and returns the associations geometries in a given extent.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-SynthesizeAssociationGeometriesParameters.html)
  */
Instantiable0[SynthesizeAssociationGeometriesParameters]
     with Instantiable1[
      /* properties */ SynthesizeAssociationGeometriesParametersProperties, 
      SynthesizeAssociationGeometriesParameters
    ] {
  
  def fromJSON(json: Any): SynthesizeAssociationGeometriesParameters = js.native
}
