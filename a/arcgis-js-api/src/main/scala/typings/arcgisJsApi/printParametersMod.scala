package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.PrintParameters
import typings.arcgisJsApi.esri.PrintParametersConstructor
import typings.arcgisJsApi.esri.PrintParametersProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object printParametersMod extends Shortcut {
  
  @JSImport("esri/tasks/support/PrintParameters", JSImport.Namespace)
  @js.native
  val ^ : PrintParametersConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/tasks/support/PrintParameters", JSImport.Namespace)
  @js.native
  class Class () extends PrintParameters {
    def this(properties: PrintParametersProperties) = this()
  }
  
  type _To = PrintParametersConstructor
  
  /* This means you don't have to write `^`, but can instead just say `printParametersMod.foo` */
  override def _to: PrintParametersConstructor = ^
}
