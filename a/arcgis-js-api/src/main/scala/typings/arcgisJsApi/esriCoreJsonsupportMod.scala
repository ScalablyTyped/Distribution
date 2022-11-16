package typings.arcgisJsApi

import typings.arcgisJsApi.esri.JSONSupport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriCoreJsonsupportMod {
  
  @JSImport("esri/core/JSONSupport", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with JSONSupport {
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/core/JSONSupport", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new instance of this class and initializes it with values from a JSON object generated from an ArcGIS product.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#fromJSON)
    */
  inline def fromJSON(json: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[Any]
}
