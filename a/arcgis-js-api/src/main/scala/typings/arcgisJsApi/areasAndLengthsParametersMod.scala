package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.AreasAndLengthsParameters
import typings.arcgisJsApi.esri.AreasAndLengthsParametersConstructor
import typings.arcgisJsApi.esri.AreasAndLengthsParametersProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object areasAndLengthsParametersMod extends Shortcut {
  
  @JSImport("esri/tasks/support/AreasAndLengthsParameters", JSImport.Namespace)
  @js.native
  val ^ : AreasAndLengthsParametersConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/tasks/support/AreasAndLengthsParameters", JSImport.Namespace)
  @js.native
  class Class () extends AreasAndLengthsParameters {
    def this(properties: AreasAndLengthsParametersProperties) = this()
  }
  
  type _To = AreasAndLengthsParametersConstructor
  
  /* This means you don't have to write `^`, but can instead just say `areasAndLengthsParametersMod.foo` */
  override def _to: AreasAndLengthsParametersConstructor = ^
}
