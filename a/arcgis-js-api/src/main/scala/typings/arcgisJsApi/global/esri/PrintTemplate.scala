package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.PrintTemplateProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.PrintTemplate")
@js.native
/**
  * Defines the layout template options used by [print](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-print.html) and the [PrintViewModel.print()](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-PrintViewModel.html#print) method to generate the print page.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PrintTemplate.html)
  */
open class PrintTemplate ()
  extends StObject
     with typings.arcgisJsApi.esri.PrintTemplate {
  def this(properties: PrintTemplateProperties) = this()
}
