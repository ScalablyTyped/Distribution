package typings.arcgisJsApi

import typings.arcgisJsApi.esri.TimeReference
import typings.arcgisJsApi.esri.TimeReferenceProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriLayersSupportTimeReferenceMod {
  
  @JSImport("esri/layers/support/TimeReference", JSImport.Namespace)
  @js.native
  /**
    * TimeReference contains information about how the time was captured when the data was created.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeReference.html)
    */
  open class ^ ()
    extends StObject
       with TimeReference {
    def this(properties: TimeReferenceProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/layers/support/TimeReference", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): TimeReference = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[TimeReference]
}
