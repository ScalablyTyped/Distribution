package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.Column
import typings.arcgisJsApi.esri.ColumnConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object columnMod extends Shortcut {
  
  @JSImport("esri/widgets/FeatureTable/Grid/Column", JSImport.Namespace)
  @js.native
  val ^ : ColumnConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/FeatureTable/Grid/Column", JSImport.Namespace)
  @js.native
  class Class () extends Column
  
  type _To = ColumnConstructor
  
  /* This means you don't have to write `^`, but can instead just say `columnMod.foo` */
  override def _to: ColumnConstructor = ^
}
