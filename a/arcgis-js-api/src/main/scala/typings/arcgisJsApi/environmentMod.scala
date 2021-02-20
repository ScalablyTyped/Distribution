package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.Environment
import typings.arcgisJsApi.esri.EnvironmentConstructor
import typings.arcgisJsApi.esri.EnvironmentProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object environmentMod extends Shortcut {
  
  @JSImport("esri/webscene/Environment", JSImport.Namespace)
  @js.native
  val ^ : EnvironmentConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/webscene/Environment", JSImport.Namespace)
  @js.native
  class Class () extends Environment {
    def this(properties: EnvironmentProperties) = this()
  }
  
  type _To = EnvironmentConstructor
  
  /* This means you don't have to write `^`, but can instead just say `environmentMod.foo` */
  override def _to: EnvironmentConstructor = ^
}
