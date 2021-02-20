package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.DimensionalDefinition
import typings.arcgisJsApi.esri.DimensionalDefinitionConstructor
import typings.arcgisJsApi.esri.DimensionalDefinitionProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dimensionalDefinitionMod extends Shortcut {
  
  @JSImport("esri/layers/support/DimensionalDefinition", JSImport.Namespace)
  @js.native
  val ^ : DimensionalDefinitionConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/support/DimensionalDefinition", JSImport.Namespace)
  @js.native
  /**
    * A dimensional definition defines a filter based on one variable and one dimension.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-DimensionalDefinition.html)
    */
  class Class () extends DimensionalDefinition {
    def this(properties: DimensionalDefinitionProperties) = this()
  }
  
  type _To = DimensionalDefinitionConstructor
  
  /* This means you don't have to write `^`, but can instead just say `dimensionalDefinitionMod.foo` */
  override def _to: DimensionalDefinitionConstructor = ^
}
