package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.TravelMode
import typings.arcgisJsApi.esri.TravelModeConstructor
import typings.arcgisJsApi.esri.TravelModeProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriRestSupportTravelModeMod extends Shortcut {
  
  @JSImport("esri/rest/support/TravelMode", JSImport.Namespace)
  @js.native
  val ^ : js.Object & TravelModeConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/rest/support/TravelMode", JSImport.Namespace)
  @js.native
  /**
    * A TravelMode is a set of characteristics that define how an object like a vehicle, bicycle, or pedestrian moves along a street network.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TravelMode.html)
    */
  open class Class ()
    extends StObject
       with TravelMode {
    def this(properties: TravelModeProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & TravelModeConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriRestSupportTravelModeMod.foo` */
  override def _to: js.Object & TravelModeConstructor = ^
}
