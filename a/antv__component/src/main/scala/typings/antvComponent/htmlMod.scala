package typings.antvComponent

import typings.antvComponent.htmlComponentMod.HtmlComponent
import typings.antvComponent.typesMod.HtmlAnnotationCfg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/component/lib/annotation/html", JSImport.Namespace)
@js.native
object htmlMod extends js.Object {
  
  @js.native
  trait HtmlAnnotation extends HtmlComponent[HtmlAnnotationCfg]
  
  @js.native
  class default () extends HtmlAnnotation
}
