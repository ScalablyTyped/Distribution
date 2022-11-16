package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.UniqueValueClassProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.UniqueValueClass")
@js.native
/**
  * Defines a category within a [UniqueValueGroup](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-UniqueValueGroup.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-UniqueValueClass.html)
  */
open class UniqueValueClass ()
  extends StObject
     with typings.arcgisJsApi.esri.UniqueValueClass {
  def this(properties: UniqueValueClassProperties) = this()
  
  /**
    * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object UniqueValueClass {
  
  @JSGlobal("__esri.UniqueValueClass")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.UniqueValueClass = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.UniqueValueClass]
}
