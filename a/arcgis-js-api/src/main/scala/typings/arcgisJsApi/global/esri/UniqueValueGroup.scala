package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.UniqueValueGroupProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.UniqueValueGroup")
@js.native
/**
		 * UniqueValueGroup represents a group of [unique value classes](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-UniqueValueClass.html) (i.e.
		 *
		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-UniqueValueGroup.html)
		 */
open class UniqueValueGroup ()
  extends StObject
     with typings.arcgisJsApi.esri.UniqueValueGroup {
  def this(properties: UniqueValueGroupProperties) = this()
  
  /**
  		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
  		 */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object UniqueValueGroup {
  
  @JSGlobal("__esri.UniqueValueGroup")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.UniqueValueGroup = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.UniqueValueGroup]
}
