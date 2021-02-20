package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.GeographicTransformation
import typings.arcgisJsApi.esri.GeographicTransformationConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geographicTransformationMod extends Shortcut {
  
  @JSImport("esri/geometry/support/GeographicTransformation", JSImport.Namespace)
  @js.native
  val ^ : GeographicTransformationConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/geometry/support/GeographicTransformation", JSImport.Namespace)
  @js.native
  /**
    * Projecting your data between coordinate systems sometimes requires transforming between geographic coordinate systems.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-GeographicTransformation.html)
    */
  class Class () extends GeographicTransformation {
    def this(properties: js.Any) = this()
  }
  
  type _To = GeographicTransformationConstructor
  
  /* This means you don't have to write `^`, but can instead just say `geographicTransformationMod.foo` */
  override def _to: GeographicTransformationConstructor = ^
}
