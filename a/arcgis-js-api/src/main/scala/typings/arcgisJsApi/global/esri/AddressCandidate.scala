package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.AddressCandidateProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.AddressCandidate")
@js.native
/**
		 * Represents the result of a geocode service operation as a list of address candidates.
		 *
		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-AddressCandidate.html)
		 */
open class AddressCandidate ()
  extends StObject
     with typings.arcgisJsApi.esri.AddressCandidate {
  def this(properties: AddressCandidateProperties) = this()
  
  /**
  		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
  		 */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object AddressCandidate {
  
  @JSGlobal("__esri.AddressCandidate")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.AddressCandidate = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.AddressCandidate]
}
