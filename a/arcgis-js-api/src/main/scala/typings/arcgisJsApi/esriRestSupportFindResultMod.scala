package typings.arcgisJsApi

import typings.arcgisJsApi.esri.FindResult
import typings.arcgisJsApi.esri.FindResultProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriRestSupportFindResultMod {
  
  @JSImport("esri/rest/support/FindResult", JSImport.Namespace)
  @js.native
  /**
  		 * The result from [find](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-find.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-FindResult.html)
  		 */
  open class ^ ()
    extends StObject
       with FindResult {
    def this(properties: FindResultProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/rest/support/FindResult", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): FindResult = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[FindResult]
}
