package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.LabelClassProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.LabelClass")
@js.native
/**
		 * Defines label expressions, symbols, scale ranges, label priorities, and label placement options for labels on a layer.
		 *
		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html)
		 */
open class LabelClass ()
  extends StObject
     with typings.arcgisJsApi.esri.LabelClass {
  def this(properties: LabelClassProperties) = this()
  
  /**
  		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
  		 */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object LabelClass {
  
  @JSGlobal("__esri.LabelClass")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.LabelClass = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.LabelClass]
}
