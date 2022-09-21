package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.ButtonMenuItem
import typings.arcgisJsApi.esri.ButtonMenuItemConstructor
import typings.arcgisJsApi.esri.ButtonMenuItemProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonMenuItemMod extends Shortcut {
  
  @JSImport("esri/widgets/FeatureTable/Grid/support/ButtonMenuItem", JSImport.Namespace)
  @js.native
  val ^ : js.Object & ButtonMenuItemConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/FeatureTable/Grid/support/ButtonMenuItem", JSImport.Namespace)
  @js.native
  /**
    * The `ButtonMenuItem` class provides the underlying menu functionality to create and customize new menu items within the [FeatureTable](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html) widget's [ButtonMenu](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-Grid-support-ButtonMenu.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-Grid-support-ButtonMenuItem.html)
    */
  open class Class ()
    extends StObject
       with ButtonMenuItem {
    def this(properties: ButtonMenuItemProperties) = this()
  }
  
  type _To = js.Object & ButtonMenuItemConstructor
  
  /* This means you don't have to write `^`, but can instead just say `buttonMenuItemMod.foo` */
  override def _to: js.Object & ButtonMenuItemConstructor = ^
}
