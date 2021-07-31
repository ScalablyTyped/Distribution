package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.BasemapView
import typings.arcgisJsApi.esri.BasemapViewConstructor
import typings.arcgisJsApi.esri.BasemapViewProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object basemapViewMod extends Shortcut {
  
  @JSImport("esri/views/BasemapView", JSImport.Namespace)
  @js.native
  val ^ : js.Object & BasemapViewConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/views/BasemapView", JSImport.Namespace)
  @js.native
  class Class ()
    extends StObject
       with BasemapView {
    def this(properties: BasemapViewProperties) = this()
  }
  
  type _To = js.Object & BasemapViewConstructor
  
  /* This means you don't have to write `^`, but can instead just say `basemapViewMod.foo` */
  override def _to: js.Object & BasemapViewConstructor = ^
}
