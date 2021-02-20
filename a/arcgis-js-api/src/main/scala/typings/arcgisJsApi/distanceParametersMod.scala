package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.DistanceParameters
import typings.arcgisJsApi.esri.DistanceParametersConstructor
import typings.arcgisJsApi.esri.DistanceParametersProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distanceParametersMod extends Shortcut {
  
  @JSImport("esri/tasks/support/DistanceParameters", JSImport.Namespace)
  @js.native
  val ^ : DistanceParametersConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/tasks/support/DistanceParameters", JSImport.Namespace)
  @js.native
  class Class () extends DistanceParameters {
    def this(properties: DistanceParametersProperties) = this()
  }
  
  type _To = DistanceParametersConstructor
  
  /* This means you don't have to write `^`, but can instead just say `distanceParametersMod.foo` */
  override def _to: DistanceParametersConstructor = ^
}
