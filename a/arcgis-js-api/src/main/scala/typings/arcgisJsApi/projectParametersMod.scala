package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.ProjectParameters
import typings.arcgisJsApi.esri.ProjectParametersConstructor
import typings.arcgisJsApi.esri.ProjectParametersProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object projectParametersMod extends Shortcut {
  
  @JSImport("esri/tasks/support/ProjectParameters", JSImport.Namespace)
  @js.native
  val ^ : ProjectParametersConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/tasks/support/ProjectParameters", JSImport.Namespace)
  @js.native
  class Class () extends ProjectParameters {
    def this(properties: ProjectParametersProperties) = this()
  }
  
  type _To = ProjectParametersConstructor
  
  /* This means you don't have to write `^`, but can instead just say `projectParametersMod.foo` */
  override def _to: ProjectParametersConstructor = ^
}
