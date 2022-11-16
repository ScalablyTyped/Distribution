package typings.arcgisJsApi

import typings.arcgisJsApi.esri.GPMessage
import typings.arcgisJsApi.esri.GPMessageProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriRestSupportGpmessageMod {
  
  @JSImport("esri/rest/support/GPMessage", JSImport.Namespace)
  @js.native
  /**
    * Represents a message generated during the execution of a module:esri/rest/Geoprocessor method.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-GPMessage.html)
    */
  open class ^ ()
    extends StObject
       with GPMessage {
    def this(properties: GPMessageProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/rest/support/GPMessage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): GPMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[GPMessage]
}
