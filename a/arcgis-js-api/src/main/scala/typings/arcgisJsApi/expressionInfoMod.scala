package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.ExpressionInfo
import typings.arcgisJsApi.esri.ExpressionInfoConstructor
import typings.arcgisJsApi.esri.ExpressionInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expressionInfoMod extends Shortcut {
  
  @JSImport("esri/form/ExpressionInfo", JSImport.Namespace)
  @js.native
  val ^ : ExpressionInfoConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/form/ExpressionInfo", JSImport.Namespace)
  @js.native
  class Class () extends ExpressionInfo {
    def this(properties: ExpressionInfoProperties) = this()
  }
  
  type _To = ExpressionInfoConstructor
  
  /* This means you don't have to write `^`, but can instead just say `expressionInfoMod.foo` */
  override def _to: ExpressionInfoConstructor = ^
}
