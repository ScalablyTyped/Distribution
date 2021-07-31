package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.WidgetConstructor
import typings.arcgisJsApi.esri.WidgetProperties
import typings.arcgisJsApi.esri.Widget_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object widgetsWidgetMod extends Shortcut {
  
  @JSImport("esri/widgets/Widget", JSImport.Namespace)
  @js.native
  val ^ : js.Object & WidgetConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Widget", JSImport.Namespace)
  @js.native
  /**
    * The base class for widgets.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Widget.html)
    */
  class Class ()
    extends StObject
       with Widget_ {
    def this(properties: WidgetProperties) = this()
  }
  
  type _To = js.Object & WidgetConstructor
  
  /* This means you don't have to write `^`, but can instead just say `widgetsWidgetMod.foo` */
  override def _to: js.Object & WidgetConstructor = ^
}
