package typings.arcgisJsApi

import typings.arcgisJsApi.esri.FeatureSet
import typings.arcgisJsApi.esri.FeatureSetProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriRestSupportFeatureSetMod {
  
  @JSImport("esri/rest/support/FeatureSet", JSImport.Namespace)
  @js.native
  /**
    * A collection of features returned from ArcGIS Server or used as input to methods.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-FeatureSet.html)
    */
  open class ^ ()
    extends StObject
       with FeatureSet {
    def this(properties: FeatureSetProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/rest/support/FeatureSet", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): FeatureSet = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[FeatureSet]
}
