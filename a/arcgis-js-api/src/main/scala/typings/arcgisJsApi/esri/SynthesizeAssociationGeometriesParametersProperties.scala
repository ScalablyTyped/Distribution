package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SynthesizeAssociationGeometriesParametersProperties extends StObject {
  
  /**
    * The extent used to execute a spatial query to retrieve the associations.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-SynthesizeAssociationGeometriesParameters.html#extent)
    */
  var extent: js.UndefOr[ExtentProperties] = js.undefined
  
  /**
    * The geodatabase version to execute the function against.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-SynthesizeAssociationGeometriesParameters.html#gdbVersion)
    */
  var gdbVersion: js.UndefOr[String] = js.undefined
  
  /**
    * A number that indicates the maximum associations that should be synthesized after which the operation should immediately return.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-SynthesizeAssociationGeometriesParameters.html#maxGeometryCount)
    */
  var maxGeometryCount: js.UndefOr[Double] = js.undefined
  
  /**
    * The date/timestamp (in UTC) to execute the function.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-SynthesizeAssociationGeometriesParameters.html#moment)
    */
  var moment: js.UndefOr[DateProperties] = js.undefined
  
  /**
    * The spatial reference that should be used to project the synthesized geometries.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-SynthesizeAssociationGeometriesParameters.html#outSpatialReference)
    */
  var outSpatialReference: js.UndefOr[SpatialReferenceProperties] = js.undefined
  
  /**
    * Indicates whether to synthesize and return structual attachment associations.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-SynthesizeAssociationGeometriesParameters.html#returnAttachmentAssociations)
    */
  var returnAttachmentAssociations: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether to synthesize and return connectivity associations.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-SynthesizeAssociationGeometriesParameters.html#returnConnectivityAssociations)
    */
  var returnConnectivityAssociations: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether to synthesize and return containment associations.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-SynthesizeAssociationGeometriesParameters.html#returnContainmentAssociations)
    */
  var returnContainmentAssociations: js.UndefOr[Boolean] = js.undefined
}
object SynthesizeAssociationGeometriesParametersProperties {
  
  inline def apply(): SynthesizeAssociationGeometriesParametersProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SynthesizeAssociationGeometriesParametersProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SynthesizeAssociationGeometriesParametersProperties] (val x: Self) extends AnyVal {
    
    inline def setExtent(value: ExtentProperties): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
    
    inline def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
    
    inline def setGdbVersion(value: String): Self = StObject.set(x, "gdbVersion", value.asInstanceOf[js.Any])
    
    inline def setGdbVersionUndefined: Self = StObject.set(x, "gdbVersion", js.undefined)
    
    inline def setMaxGeometryCount(value: Double): Self = StObject.set(x, "maxGeometryCount", value.asInstanceOf[js.Any])
    
    inline def setMaxGeometryCountUndefined: Self = StObject.set(x, "maxGeometryCount", js.undefined)
    
    inline def setMoment(value: DateProperties): Self = StObject.set(x, "moment", value.asInstanceOf[js.Any])
    
    inline def setMomentUndefined: Self = StObject.set(x, "moment", js.undefined)
    
    inline def setOutSpatialReference(value: SpatialReferenceProperties): Self = StObject.set(x, "outSpatialReference", value.asInstanceOf[js.Any])
    
    inline def setOutSpatialReferenceUndefined: Self = StObject.set(x, "outSpatialReference", js.undefined)
    
    inline def setReturnAttachmentAssociations(value: Boolean): Self = StObject.set(x, "returnAttachmentAssociations", value.asInstanceOf[js.Any])
    
    inline def setReturnAttachmentAssociationsUndefined: Self = StObject.set(x, "returnAttachmentAssociations", js.undefined)
    
    inline def setReturnConnectivityAssociations(value: Boolean): Self = StObject.set(x, "returnConnectivityAssociations", value.asInstanceOf[js.Any])
    
    inline def setReturnConnectivityAssociationsUndefined: Self = StObject.set(x, "returnConnectivityAssociations", js.undefined)
    
    inline def setReturnContainmentAssociations(value: Boolean): Self = StObject.set(x, "returnContainmentAssociations", value.asInstanceOf[js.Any])
    
    inline def setReturnContainmentAssociationsUndefined: Self = StObject.set(x, "returnContainmentAssociations", js.undefined)
  }
}
