package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.FieldInfo
import typings.arcgisJsApi.esri.FieldInfoConstructor
import typings.arcgisJsApi.esri.FieldInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fieldInfoMod extends Shortcut {
  
  @JSImport("esri/popup/FieldInfo", JSImport.Namespace)
  @js.native
  val ^ : FieldInfoConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/popup/FieldInfo", JSImport.Namespace)
  @js.native
  class Class () extends FieldInfo {
    def this(properties: FieldInfoProperties) = this()
  }
  
  type _To = FieldInfoConstructor
  
  /* This means you don't have to write `^`, but can instead just say `fieldInfoMod.foo` */
  override def _to: FieldInfoConstructor = ^
}
