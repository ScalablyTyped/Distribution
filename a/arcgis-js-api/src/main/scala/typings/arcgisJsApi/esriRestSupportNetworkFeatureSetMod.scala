package typings.arcgisJsApi

import typings.arcgisJsApi.esri.NetworkFeatureSet
import typings.arcgisJsApi.esri.NetworkFeatureSetProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriRestSupportNetworkFeatureSetMod {
  
  @JSImport("esri/rest/support/NetworkFeatureSet", JSImport.Namespace)
  @js.native
  /**
    * A subclass of FeaureSet that can be used as an input in the Route, Closest Facility, and Service Area solvers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-NetworkFeatureSet.html)
    */
  open class ^ ()
    extends StObject
       with NetworkFeatureSet {
    def this(properties: NetworkFeatureSetProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/rest/support/NetworkFeatureSet", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): NetworkFeatureSet = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[NetworkFeatureSet]
}
