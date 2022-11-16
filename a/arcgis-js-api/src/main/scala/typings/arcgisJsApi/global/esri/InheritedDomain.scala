package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.InheritedDomainProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.InheritedDomain")
@js.native
/**
  * This is a subclass of [Domain](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Domain.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-InheritedDomain.html)
  */
open class InheritedDomain ()
  extends StObject
     with typings.arcgisJsApi.esri.InheritedDomain {
  def this(properties: InheritedDomainProperties) = this()
  
  /**
    * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object InheritedDomain {
  
  @JSGlobal("__esri.InheritedDomain")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.InheritedDomain = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.InheritedDomain]
}
