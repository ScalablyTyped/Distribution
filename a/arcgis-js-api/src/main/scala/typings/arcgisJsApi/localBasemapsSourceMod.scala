package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.LocalBasemapsSource
import typings.arcgisJsApi.esri.LocalBasemapsSourceConstructor
import typings.arcgisJsApi.esri.LocalBasemapsSourceProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object localBasemapsSourceMod extends Shortcut {
  
  @JSImport("esri/widgets/BasemapGallery/support/LocalBasemapsSource", JSImport.Namespace)
  @js.native
  val ^ : js.Object & LocalBasemapsSourceConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/BasemapGallery/support/LocalBasemapsSource", JSImport.Namespace)
  @js.native
  class Class ()
    extends StObject
       with LocalBasemapsSource {
    def this(properties: LocalBasemapsSourceProperties) = this()
  }
  
  type _To = js.Object & LocalBasemapsSourceConstructor
  
  /* This means you don't have to write `^`, but can instead just say `localBasemapsSourceMod.foo` */
  override def _to: js.Object & LocalBasemapsSourceConstructor = ^
}
