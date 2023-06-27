package typings.arcgisJsApi

import typings.arcgisJsApi.esri.geotriggersInfoExpressionInfo
import typings.arcgisJsApi.esri.geotriggersInfoExpressionInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriWebdocGeotriggersInfoExpressionInfoMod {
  
  @JSImport("esri/webdoc/geotriggersInfo/ExpressionInfo", JSImport.Namespace)
  @js.native
  /**
  		 * Defines a script expression that can be used to compute values.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-geotriggersInfo-ExpressionInfo.html)
  		 */
  open class ^ ()
    extends StObject
       with geotriggersInfoExpressionInfo {
    def this(properties: geotriggersInfoExpressionInfoProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/webdoc/geotriggersInfo/ExpressionInfo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): geotriggersInfoExpressionInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[geotriggersInfoExpressionInfo]
}
