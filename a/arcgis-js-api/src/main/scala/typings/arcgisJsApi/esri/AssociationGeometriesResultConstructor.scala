package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociationGeometriesResultConstructor
  extends StObject
     with /**
  * This class defines the results of the function [synthesizeAssociationGeometries](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-synthesizeAssociationGeometries.html) which takes an extent and returns an [AggregatedGeometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-AggregatedGeometry.html) of all [associations](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-Association.html) within the extent based on the defined parameters.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-AssociationGeometriesResult.html)
  */
Instantiable0[AssociationGeometriesResult]
     with Instantiable1[
      /* properties */ AssociationGeometriesResultProperties, 
      AssociationGeometriesResult
    ] {
  
  def fromJSON(json: Any): AssociationGeometriesResult = js.native
}
