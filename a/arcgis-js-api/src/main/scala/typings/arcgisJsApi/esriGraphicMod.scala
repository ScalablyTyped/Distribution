package typings.arcgisJsApi

import typings.arcgisJsApi.esri.Graphic
import typings.arcgisJsApi.esri.GraphicProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriGraphicMod {
  
  @JSImport("esri/Graphic", JSImport.Namespace)
  @js.native
  /**
    * A Graphic is a vector representation of real world geographic phenomena.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html)
    */
  open class ^ ()
    extends StObject
       with Graphic {
    def this(properties: GraphicProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/Graphic", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): Graphic = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[Graphic]
}
