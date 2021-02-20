package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.IdentifyParameters
import typings.arcgisJsApi.esri.IdentifyParametersConstructor
import typings.arcgisJsApi.esri.IdentifyParametersProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object identifyParametersMod extends Shortcut {
  
  @JSImport("esri/tasks/support/IdentifyParameters", JSImport.Namespace)
  @js.native
  val ^ : IdentifyParametersConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/tasks/support/IdentifyParameters", JSImport.Namespace)
  @js.native
  class Class () extends IdentifyParameters {
    def this(properties: IdentifyParametersProperties) = this()
  }
  
  type _To = IdentifyParametersConstructor
  
  /* This means you don't have to write `^`, but can instead just say `identifyParametersMod.foo` */
  override def _to: IdentifyParametersConstructor = ^
}
