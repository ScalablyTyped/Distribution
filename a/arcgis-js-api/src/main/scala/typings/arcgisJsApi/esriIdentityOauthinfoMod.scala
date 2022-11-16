package typings.arcgisJsApi

import typings.arcgisJsApi.esri.OAuthInfo
import typings.arcgisJsApi.esri.OAuthInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriIdentityOauthinfoMod {
  
  @JSImport("esri/identity/OAuthInfo", JSImport.Namespace)
  @js.native
  /**
    * This class contains information about an OAuth 2.0 configuration.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-OAuthInfo.html)
    */
  open class ^ ()
    extends StObject
       with OAuthInfo {
    def this(properties: OAuthInfoProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/identity/OAuthInfo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): OAuthInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[OAuthInfo]
}
