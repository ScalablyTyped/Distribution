package typings.arcgisJsApi

import typings.arcgisJsApi.esri.Navigation
import typings.arcgisJsApi.esri.NavigationProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriViewsNavigationNavigationMod {
  
  @JSImport("esri/views/navigation/Navigation", JSImport.Namespace)
  @js.native
  /**
    * Navigation related configuration settings on the View.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-navigation-Navigation.html)
    */
  open class ^ ()
    extends StObject
       with Navigation {
    def this(properties: NavigationProperties) = this()
  }
}
