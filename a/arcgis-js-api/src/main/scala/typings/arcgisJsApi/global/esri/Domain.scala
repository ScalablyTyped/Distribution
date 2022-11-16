package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.DomainProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.Domain")
@js.native
/**
  * Domains define constraints on a [layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html) [field](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Domain.html)
  */
open class Domain ()
  extends StObject
     with typings.arcgisJsApi.esri.Domain {
  def this(properties: DomainProperties) = this()
  
  /**
    * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object Domain {
  
  @JSGlobal("__esri.Domain")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.Domain = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.Domain]
}
