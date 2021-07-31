package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.Navigation
import typings.arcgisJsApi.esri.NavigationConstructor
import typings.arcgisJsApi.esri.NavigationProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object navigationMod extends Shortcut {
  
  @JSImport("esri/views/navigation/Navigation", JSImport.Namespace)
  @js.native
  val ^ : js.Object & NavigationConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/views/navigation/Navigation", JSImport.Namespace)
  @js.native
  class Class ()
    extends StObject
       with Navigation {
    def this(properties: NavigationProperties) = this()
  }
  
  type _To = js.Object & NavigationConstructor
  
  /* This means you don't have to write `^`, but can instead just say `navigationMod.foo` */
  override def _to: js.Object & NavigationConstructor = ^
}
