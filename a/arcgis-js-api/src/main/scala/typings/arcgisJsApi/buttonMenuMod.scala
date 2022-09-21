package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.ButtonMenu
import typings.arcgisJsApi.esri.ButtonMenuConstructor
import typings.arcgisJsApi.esri.ButtonMenuProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonMenuMod extends Shortcut {
  
  @JSImport("esri/widgets/FeatureTable/Grid/support/ButtonMenu", JSImport.Namespace)
  @js.native
  val ^ : js.Object & ButtonMenuConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/FeatureTable/Grid/support/ButtonMenu", JSImport.Namespace)
  @js.native
  /**
    * This widget provides the underlying menu functionality when working with the [FeatureTable](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-Grid-support-ButtonMenu.html)
    */
  open class Class ()
    extends StObject
       with ButtonMenu {
    def this(properties: ButtonMenuProperties) = this()
  }
  
  type _To = js.Object & ButtonMenuConstructor
  
  /* This means you don't have to write `^`, but can instead just say `buttonMenuMod.foo` */
  override def _to: js.Object & ButtonMenuConstructor = ^
}
