package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.LabelClass
import typings.arcgisJsApi.esri.LabelClassConstructor
import typings.arcgisJsApi.esri.LabelClassProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object labelClassMod extends Shortcut {
  
  @JSImport("esri/layers/support/LabelClass", JSImport.Namespace)
  @js.native
  val ^ : LabelClassConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/support/LabelClass", JSImport.Namespace)
  @js.native
  /**
    * Defines label expressions, symbols, scale ranges, label priorities, and label placement options for labels on a layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html)
    */
  class Class () extends LabelClass {
    def this(properties: LabelClassProperties) = this()
  }
  
  type _To = LabelClassConstructor
  
  /* This means you don't have to write `^`, but can instead just say `labelClassMod.foo` */
  override def _to: LabelClassConstructor = ^
}
