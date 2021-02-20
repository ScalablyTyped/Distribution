package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.DensifyParameters
import typings.arcgisJsApi.esri.DensifyParametersConstructor
import typings.arcgisJsApi.esri.DensifyParametersProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object densifyParametersMod extends Shortcut {
  
  @JSImport("esri/tasks/support/DensifyParameters", JSImport.Namespace)
  @js.native
  val ^ : DensifyParametersConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/tasks/support/DensifyParameters", JSImport.Namespace)
  @js.native
  class Class () extends DensifyParameters {
    def this(properties: DensifyParametersProperties) = this()
  }
  
  type _To = DensifyParametersConstructor
  
  /* This means you don't have to write `^`, but can instead just say `densifyParametersMod.foo` */
  override def _to: DensifyParametersConstructor = ^
}
