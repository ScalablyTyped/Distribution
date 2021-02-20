package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.FeatureType
import typings.arcgisJsApi.esri.FeatureTypeConstructor
import typings.arcgisJsApi.esri.FeatureTypeProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object featureTypeMod extends Shortcut {
  
  @JSImport("esri/layers/support/FeatureType", JSImport.Namespace)
  @js.native
  val ^ : FeatureTypeConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/support/FeatureType", JSImport.Namespace)
  @js.native
  class Class () extends FeatureType {
    def this(properties: FeatureTypeProperties) = this()
  }
  
  type _To = FeatureTypeConstructor
  
  /* This means you don't have to write `^`, but can instead just say `featureTypeMod.foo` */
  override def _to: FeatureTypeConstructor = ^
}
