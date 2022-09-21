package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.ImageHistogramParameters
import typings.arcgisJsApi.esri.ImageHistogramParametersConstructor
import typings.arcgisJsApi.esri.ImageHistogramParametersProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageHistogramParametersMod extends Shortcut {
  
  @JSImport("esri/rest/support/ImageHistogramParameters", JSImport.Namespace)
  @js.native
  val ^ : js.Object & ImageHistogramParametersConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/rest/support/ImageHistogramParameters", JSImport.Namespace)
  @js.native
  /**
    * Input parameters for the [computeHistograms](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html#computeHistograms) or [computeStatisticsHistograms](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html#computeStatisticsHistograms) method on [ImageryLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageHistogramParameters.html)
    */
  open class Class ()
    extends StObject
       with ImageHistogramParameters {
    def this(properties: ImageHistogramParametersProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & ImageHistogramParametersConstructor
  
  /* This means you don't have to write `^`, but can instead just say `imageHistogramParametersMod.foo` */
  override def _to: js.Object & ImageHistogramParametersConstructor = ^
}
