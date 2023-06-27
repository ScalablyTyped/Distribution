package typings.arcgisJsApi

import typings.arcgisJsApi.esri.LinearUnit
import typings.arcgisJsApi.esri.LinearUnitProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriRestSupportLinearUnitMod {
  
  @JSImport("esri/rest/support/LinearUnit", JSImport.Namespace)
  @js.native
  /**
  		 * A data object containing a linear distance.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-LinearUnit.html)
  		 */
  open class ^ ()
    extends StObject
       with LinearUnit {
    def this(properties: LinearUnitProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/rest/support/LinearUnit", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): LinearUnit = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[LinearUnit]
}
