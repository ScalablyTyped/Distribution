package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.Navigation
import typings.arcgisJsApi.esri.NavigationConstructor
import typings.arcgisJsApi.esri.NavigationProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriViewsNavigationNavigationMod extends Shortcut {
  
  @JSImport("esri/views/navigation/Navigation", JSImport.Namespace)
  @js.native
  val ^ : js.Object & NavigationConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/views/navigation/Navigation", JSImport.Namespace)
  @js.native
  /**
    * Navigation related configuration settings on the View.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-navigation-Navigation.html)
    */
  open class Class ()
    extends StObject
       with Navigation {
    def this(properties: NavigationProperties) = this()
  }
  
  type _To = js.Object & NavigationConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriViewsNavigationNavigationMod.foo` */
  override def _to: js.Object & NavigationConstructor = ^
}
