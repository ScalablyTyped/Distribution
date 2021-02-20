package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.FieldsIndex
import typings.arcgisJsApi.esri.FieldsIndexConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fieldsIndexMod extends Shortcut {
  
  @JSImport("esri/layers/support/FieldsIndex", JSImport.Namespace)
  @js.native
  val ^ : FieldsIndexConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/support/FieldsIndex", JSImport.Namespace)
  @js.native
  class Class () extends FieldsIndex {
    def this(properties: js.Any) = this()
  }
  
  type _To = FieldsIndexConstructor
  
  /* This means you don't have to write `^`, but can instead just say `fieldsIndexMod.foo` */
  override def _to: FieldsIndexConstructor = ^
}
