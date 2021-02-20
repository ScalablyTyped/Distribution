package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.FindParameters
import typings.arcgisJsApi.esri.FindParametersConstructor
import typings.arcgisJsApi.esri.FindParametersProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object findParametersMod extends Shortcut {
  
  @JSImport("esri/tasks/support/FindParameters", JSImport.Namespace)
  @js.native
  val ^ : FindParametersConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/tasks/support/FindParameters", JSImport.Namespace)
  @js.native
  class Class () extends FindParameters {
    def this(properties: FindParametersProperties) = this()
  }
  
  type _To = FindParametersConstructor
  
  /* This means you don't have to write `^`, but can instead just say `findParametersMod.foo` */
  override def _to: FindParametersConstructor = ^
}
