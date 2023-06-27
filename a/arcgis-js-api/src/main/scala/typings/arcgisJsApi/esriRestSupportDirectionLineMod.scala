package typings.arcgisJsApi

import typings.arcgisJsApi.esri.DirectionLine
import typings.arcgisJsApi.esri.DirectionLineProperties
import typings.arcgisJsApi.esri.Graphic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriRestSupportDirectionLineMod {
  
  @JSImport("esri/rest/support/DirectionLine", JSImport.Namespace)
  @js.native
  /**
  		 * The DirectionLine represents polylines associated with individual direction items.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DirectionLine.html)
  		 */
  open class ^ ()
    extends StObject
       with DirectionLine {
    def this(properties: DirectionLineProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/rest/support/DirectionLine", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
  		 * Creates a [DirectionLine](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DirectionLine.html) from the parsed [Graphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DirectionLine.html#fromGraphic)
  		 */
  inline def fromGraphic(): DirectionLine = ^.asInstanceOf[js.Dynamic].applyDynamic("fromGraphic")().asInstanceOf[DirectionLine]
  inline def fromGraphic(graphic: Graphic): DirectionLine = ^.asInstanceOf[js.Dynamic].applyDynamic("fromGraphic")(graphic.asInstanceOf[js.Any]).asInstanceOf[DirectionLine]
  
  inline def fromJSON(json: Any): DirectionLine = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[DirectionLine]
}
