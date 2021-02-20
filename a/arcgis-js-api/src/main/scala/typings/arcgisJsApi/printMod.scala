package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.Print
import typings.arcgisJsApi.esri.PrintConstructor
import typings.arcgisJsApi.esri.PrintProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object printMod extends Shortcut {
  
  @JSImport("esri/widgets/Print", JSImport.Namespace)
  @js.native
  val ^ : PrintConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Print", JSImport.Namespace)
  @js.native
  /**
    * The Print widget connects your application with a [printing service](https://server.arcgis.com/en/portal/latest/administer/windows/configure-the-portal-to-print-maps.htm) to allow the map to be printed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print.html)
    */
  class Class () extends Print {
    def this(properties: PrintProperties) = this()
  }
  
  type _To = PrintConstructor
  
  /* This means you don't have to write `^`, but can instead just say `printMod.foo` */
  override def _to: PrintConstructor = ^
}
