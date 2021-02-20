package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.Field
import typings.arcgisJsApi.esri.FieldConstructor
import typings.arcgisJsApi.esri.FieldProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fieldMod extends Shortcut {
  
  @JSImport("esri/layers/support/Field", JSImport.Namespace)
  @js.native
  val ^ : FieldConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/support/Field", JSImport.Namespace)
  @js.native
  class Class () extends Field {
    def this(properties: FieldProperties) = this()
  }
  
  type _To = FieldConstructor
  
  /* This means you don't have to write `^`, but can instead just say `fieldMod.foo` */
  override def _to: FieldConstructor = ^
}
