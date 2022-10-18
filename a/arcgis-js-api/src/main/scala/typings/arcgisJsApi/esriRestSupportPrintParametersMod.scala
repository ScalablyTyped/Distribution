package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.PrintParameters
import typings.arcgisJsApi.esri.PrintParametersConstructor
import typings.arcgisJsApi.esri.PrintParametersProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriRestSupportPrintParametersMod extends Shortcut {
  
  @JSImport("esri/rest/support/PrintParameters", JSImport.Namespace)
  @js.native
  val ^ : js.Object & PrintParametersConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/rest/support/PrintParameters", JSImport.Namespace)
  @js.native
  /**
    * Input parameters for [print](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-print.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PrintParameters.html)
    */
  open class Class ()
    extends StObject
       with PrintParameters {
    def this(properties: PrintParametersProperties) = this()
  }
  
  type _To = js.Object & PrintParametersConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriRestSupportPrintParametersMod.foo` */
  override def _to: js.Object & PrintParametersConstructor = ^
}
