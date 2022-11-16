package typings.arcgisJsApi

import typings.arcgisJsApi.esri.AddressCandidate
import typings.arcgisJsApi.esri.AddressCandidateProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriRestSupportAddressCandidateMod {
  
  @JSImport("esri/rest/support/AddressCandidate", JSImport.Namespace)
  @js.native
  /**
    * Represents the result of a geocode service operation as a list of address candidates.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-AddressCandidate.html)
    */
  open class ^ ()
    extends StObject
       with AddressCandidate {
    def this(properties: AddressCandidateProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/rest/support/AddressCandidate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): AddressCandidate = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[AddressCandidate]
}
