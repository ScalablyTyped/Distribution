package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.Presentation
import typings.arcgisJsApi.esri.PresentationConstructor
import typings.arcgisJsApi.esri.PresentationProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object presentationMod extends Shortcut {
  
  @JSImport("esri/webscene/Presentation", JSImport.Namespace)
  @js.native
  val ^ : js.Object & PresentationConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/webscene/Presentation", JSImport.Namespace)
  @js.native
  class Class ()
    extends StObject
       with Presentation {
    def this(properties: PresentationProperties) = this()
  }
  
  type _To = js.Object & PresentationConstructor
  
  /* This means you don't have to write `^`, but can instead just say `presentationMod.foo` */
  override def _to: js.Object & PresentationConstructor = ^
}
