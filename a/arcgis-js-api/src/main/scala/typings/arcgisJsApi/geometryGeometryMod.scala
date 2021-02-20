package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.GeometryConstructor
import typings.arcgisJsApi.esri.GeometryProperties
import typings.arcgisJsApi.esri.Geometry_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geometryGeometryMod extends Shortcut {
  
  @JSImport("esri/geometry/Geometry", JSImport.Namespace)
  @js.native
  val ^ : GeometryConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/geometry/Geometry", JSImport.Namespace)
  @js.native
  class Class () extends Geometry_ {
    def this(properties: GeometryProperties) = this()
  }
  
  type _To = GeometryConstructor
  
  /* This means you don't have to write `^`, but can instead just say `geometryGeometryMod.foo` */
  override def _to: GeometryConstructor = ^
}
