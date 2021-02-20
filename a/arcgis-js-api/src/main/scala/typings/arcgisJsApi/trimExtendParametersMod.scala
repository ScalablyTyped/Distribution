package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.TrimExtendParameters
import typings.arcgisJsApi.esri.TrimExtendParametersConstructor
import typings.arcgisJsApi.esri.TrimExtendParametersProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object trimExtendParametersMod extends Shortcut {
  
  @JSImport("esri/tasks/support/TrimExtendParameters", JSImport.Namespace)
  @js.native
  val ^ : TrimExtendParametersConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/tasks/support/TrimExtendParameters", JSImport.Namespace)
  @js.native
  class Class () extends TrimExtendParameters {
    def this(properties: TrimExtendParametersProperties) = this()
  }
  
  type _To = TrimExtendParametersConstructor
  
  /* This means you don't have to write `^`, but can instead just say `trimExtendParametersMod.foo` */
  override def _to: TrimExtendParametersConstructor = ^
}
