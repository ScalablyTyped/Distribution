package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.TimeExtentProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.TimeExtent")
@js.native
/**
  * A period of time with a definitive [start](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeExtent.html#start) and [end](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeExtent.html#end) date.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeExtent.html)
  */
open class TimeExtent ()
  extends StObject
     with typings.arcgisJsApi.esri.TimeExtent {
  def this(properties: TimeExtentProperties) = this()
  
  /**
    * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object TimeExtent {
  
  @JSGlobal("__esri.TimeExtent")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.TimeExtent = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.TimeExtent]
}
