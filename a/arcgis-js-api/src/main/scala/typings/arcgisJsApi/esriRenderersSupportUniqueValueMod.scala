package typings.arcgisJsApi

import typings.arcgisJsApi.esri.UniqueValueProperties
import typings.arcgisJsApi.esri.UniqueValue_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriRenderersSupportUniqueValueMod {
  
  @JSImport("esri/renderers/support/UniqueValue", JSImport.Namespace)
  @js.native
  /**
    * Defines combinations of values to expect from up to three fields of categorical data in a [UniqueValueRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-UniqueValue.html)
    */
  open class ^ ()
    extends StObject
       with UniqueValue_ {
    def this(properties: UniqueValueProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/renderers/support/UniqueValue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): UniqueValue_ = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[UniqueValue_]
}
