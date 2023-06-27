package typings.arcgisJsApi

import typings.arcgisJsApi.esri.DirectionPoint
import typings.arcgisJsApi.esri.DirectionPointProperties
import typings.arcgisJsApi.esri.Graphic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriRestSupportDirectionPointMod {
  
  @JSImport("esri/rest/support/DirectionPoint", JSImport.Namespace)
  @js.native
  /**
  		 * The DirectionPoint represents direction items as points with various display information.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DirectionPoint.html)
  		 */
  open class ^ ()
    extends StObject
       with DirectionPoint {
    def this(properties: DirectionPointProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/rest/support/DirectionPoint", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
  		 * Creates a [DirectionPoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DirectionPoint.html) from the parsed [Graphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DirectionPoint.html#fromGraphic)
  		 */
  inline def fromGraphic(): DirectionPoint = ^.asInstanceOf[js.Dynamic].applyDynamic("fromGraphic")().asInstanceOf[DirectionPoint]
  inline def fromGraphic(graphic: Graphic): DirectionPoint = ^.asInstanceOf[js.Dynamic].applyDynamic("fromGraphic")(graphic.asInstanceOf[js.Any]).asInstanceOf[DirectionPoint]
  
  inline def fromJSON(json: Any): DirectionPoint = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[DirectionPoint]
}
