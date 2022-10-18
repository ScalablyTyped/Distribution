package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.OAuthInfo
import typings.arcgisJsApi.esri.OAuthInfoConstructor
import typings.arcgisJsApi.esri.OAuthInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriIdentityOauthinfoMod extends Shortcut {
  
  @JSImport("esri/identity/OAuthInfo", JSImport.Namespace)
  @js.native
  val ^ : js.Object & OAuthInfoConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/identity/OAuthInfo", JSImport.Namespace)
  @js.native
  /**
    * This class contains information about an OAuth 2.0 configuration.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-OAuthInfo.html)
    */
  open class Class ()
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
  
  type _To = js.Object & OAuthInfoConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriIdentityOauthinfoMod.foo` */
  override def _to: js.Object & OAuthInfoConstructor = ^
}
