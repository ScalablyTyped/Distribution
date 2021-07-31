package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.MapViewBase
import typings.arcgisJsApi.esri.MapViewBaseConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mapViewBaseMod extends Shortcut {
  
  @JSImport("esri/views/MapViewBase", JSImport.Namespace)
  @js.native
  val ^ : MapViewBaseConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/views/MapViewBase", JSImport.Namespace)
  @js.native
  class Class ()
    extends StObject
       with MapViewBase
  
  type _To = MapViewBaseConstructor
  
  /* This means you don't have to write `^`, but can instead just say `mapViewBaseMod.foo` */
  override def _to: MapViewBaseConstructor = ^
}
