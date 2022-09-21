package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.PrintConstructor
import typings.arcgisJsApi.esri.PrintProperties
import typings.arcgisJsApi.esri.Print_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object widgetsPrintMod extends Shortcut {
  
  @JSImport("esri/widgets/Print", JSImport.Namespace)
  @js.native
  val ^ : js.Object & PrintConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Print", JSImport.Namespace)
  @js.native
  /**
    * The Print widget connects your application with a [printing service](https://enterprise.arcgis.com/en/portal/latest/administer/windows/configure-the-portal-to-print-maps.htm) to allow the map to be printed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print.html)
    */
  open class Class ()
    extends StObject
       with Print_ {
    def this(properties: PrintProperties) = this()
  }
  
  type _To = js.Object & PrintConstructor
  
  /* This means you don't have to write `^`, but can instead just say `widgetsPrintMod.foo` */
  override def _to: js.Object & PrintConstructor = ^
}
