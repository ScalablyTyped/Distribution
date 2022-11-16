package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.geotriggersInfoExpressionInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.geotriggersInfoExpressionInfo")
@js.native
/**
  * Defines a script expression that can be used to compute values.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-geotriggersInfo-ExpressionInfo.html)
  */
open class geotriggersInfoExpressionInfo ()
  extends StObject
     with typings.arcgisJsApi.esri.geotriggersInfoExpressionInfo {
  def this(properties: geotriggersInfoExpressionInfoProperties) = this()
  
  /**
    * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object geotriggersInfoExpressionInfo {
  
  @JSGlobal("__esri.geotriggersInfoExpressionInfo")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.geotriggersInfoExpressionInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.geotriggersInfoExpressionInfo]
}
