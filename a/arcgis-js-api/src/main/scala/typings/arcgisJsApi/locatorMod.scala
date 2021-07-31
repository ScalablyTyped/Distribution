package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.Locator
import typings.arcgisJsApi.esri.LocatorConstructor
import typings.arcgisJsApi.esri.LocatorProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object locatorMod extends Shortcut {
  
  @JSImport("esri/tasks/Locator", JSImport.Namespace)
  @js.native
  val ^ : js.Object & LocatorConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/tasks/Locator", JSImport.Namespace)
  @js.native
  /**
    * Represents a geocode service resource exposed by the ArcGIS Server REST API.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Locator.html)
    */
  class Class ()
    extends StObject
       with Locator {
    def this(properties: LocatorProperties) = this()
  }
  
  type _To = js.Object & LocatorConstructor
  
  /* This means you don't have to write `^`, but can instead just say `locatorMod.foo` */
  override def _to: js.Object & LocatorConstructor = ^
}
