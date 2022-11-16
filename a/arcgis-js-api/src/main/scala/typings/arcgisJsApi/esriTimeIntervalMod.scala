package typings.arcgisJsApi

import typings.arcgisJsApi.esri.TimeInterval
import typings.arcgisJsApi.esri.TimeIntervalProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriTimeIntervalMod {
  
  @JSImport("esri/TimeInterval", JSImport.Namespace)
  @js.native
  /**
    * TimeInterval is a class that describes a length of time in one of ten temporal units such as seconds, days, or years.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeInterval.html)
    */
  open class ^ ()
    extends StObject
       with TimeInterval {
    def this(properties: TimeIntervalProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/TimeInterval", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): TimeInterval = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[TimeInterval]
}
