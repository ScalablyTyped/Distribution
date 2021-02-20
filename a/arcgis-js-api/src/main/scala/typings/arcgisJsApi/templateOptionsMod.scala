package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.TemplateOptions
import typings.arcgisJsApi.esri.TemplateOptionsConstructor
import typings.arcgisJsApi.esri.TemplateOptionsProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object templateOptionsMod extends Shortcut {
  
  @JSImport("esri/widgets/Print/TemplateOptions", JSImport.Namespace)
  @js.native
  val ^ : TemplateOptionsConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Print/TemplateOptions", JSImport.Namespace)
  @js.native
  class Class () extends TemplateOptions {
    def this(properties: TemplateOptionsProperties) = this()
  }
  
  type _To = TemplateOptionsConstructor
  
  /* This means you don't have to write `^`, but can instead just say `templateOptionsMod.foo` */
  override def _to: TemplateOptionsConstructor = ^
}
