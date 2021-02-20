package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.SpatialReference
import typings.arcgisJsApi.esri.SpatialReferenceConstructor
import typings.arcgisJsApi.esri.SpatialReferenceProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spatialReferenceMod extends Shortcut {
  
  @JSImport("esri/geometry/SpatialReference", JSImport.Namespace)
  @js.native
  val ^ : SpatialReferenceConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/geometry/SpatialReference", JSImport.Namespace)
  @js.native
  class Class () extends SpatialReference {
    def this(properties: SpatialReferenceProperties) = this()
  }
  
  type _To = SpatialReferenceConstructor
  
  /* This means you don't have to write `^`, but can instead just say `spatialReferenceMod.foo` */
  override def _to: SpatialReferenceConstructor = ^
}
