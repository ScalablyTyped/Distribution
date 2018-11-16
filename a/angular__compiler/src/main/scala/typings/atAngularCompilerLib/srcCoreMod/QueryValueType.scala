package typings
package atAngularCompilerLib.srcCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait QueryValueType extends js.Object

@JSImport("@angular/compiler/src/core", "QueryValueType")
@js.native
object QueryValueType extends js.Object {
  @js.native
  sealed trait ElementRef
    extends atAngularCompilerLib.srcCoreMod.QueryValueType
  
  @js.native
  sealed trait Provider
    extends atAngularCompilerLib.srcCoreMod.QueryValueType
  
  @js.native
  sealed trait RenderElement
    extends atAngularCompilerLib.srcCoreMod.QueryValueType
  
  @js.native
  sealed trait TemplateRef
    extends atAngularCompilerLib.srcCoreMod.QueryValueType
  
  @js.native
  sealed trait ViewContainerRef
    extends atAngularCompilerLib.srcCoreMod.QueryValueType
  
  /* 0 */ val ElementRef: ElementRef with scala.Double = js.native
  /* 4 */ val Provider: Provider with scala.Double = js.native
  /* 1 */ val RenderElement: RenderElement with scala.Double = js.native
  /* 2 */ val TemplateRef: TemplateRef with scala.Double = js.native
  /* 3 */ val ViewContainerRef: ViewContainerRef with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[atAngularCompilerLib.srcCoreMod.QueryValueType with scala.Double] = js.native
}

