package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.GeometryService
import typings.arcgisJsApi.esri.GeometryServiceConstructor
import typings.arcgisJsApi.esri.GeometryServiceProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geometryServiceMod extends Shortcut {
  
  @JSImport("esri/tasks/GeometryService", JSImport.Namespace)
  @js.native
  val ^ : js.Object & GeometryServiceConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/tasks/GeometryService", JSImport.Namespace)
  @js.native
  /**
    * Represents a geometry service resource exposed by the ArcGIS REST API.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html)
    */
  class Class ()
    extends StObject
       with GeometryService {
    def this(properties: GeometryServiceProperties) = this()
  }
  
  type _To = js.Object & GeometryServiceConstructor
  
  /* This means you don't have to write `^`, but can instead just say `geometryServiceMod.foo` */
  override def _to: js.Object & GeometryServiceConstructor = ^
}
