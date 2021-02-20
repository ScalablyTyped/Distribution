package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.widgetsSearch
import typings.arcgisJsApi.esri.widgetsSearchConstructor
import typings.arcgisJsApi.esri.widgetsSearchProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object widgetsSearchMod extends Shortcut {
  
  @JSImport("esri/widgets/Search", JSImport.Namespace)
  @js.native
  val ^ : widgetsSearchConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Search", JSImport.Namespace)
  @js.native
  /**
    * The Search widget provides a way to perform search operations on [locator service(s)](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Locator.html) and/or [map](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html)/[feature](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) service feature layer(s).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html)
    */
  class Class () extends widgetsSearch {
    def this(properties: widgetsSearchProperties) = this()
  }
  
  type _To = widgetsSearchConstructor
  
  /* This means you don't have to write `^`, but can instead just say `widgetsSearchMod.foo` */
  override def _to: widgetsSearchConstructor = ^
}
