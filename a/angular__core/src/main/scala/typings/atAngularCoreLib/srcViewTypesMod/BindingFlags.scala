package typings
package atAngularCoreLib.srcViewTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BindingFlags extends js.Object

@JSImport("@angular/core/src/view/types", "BindingFlags")
@js.native
object BindingFlags extends js.Object {
  @js.native
  sealed trait CatSyntheticProperty
    extends atAngularCoreLib.srcViewTypesMod.BindingFlags
  
  @js.native
  sealed trait SyntheticHostProperty
    extends atAngularCoreLib.srcViewTypesMod.BindingFlags
  
  @js.native
  sealed trait SyntheticProperty
    extends atAngularCoreLib.srcViewTypesMod.BindingFlags
  
  @js.native
  sealed trait TypeElementAttribute
    extends atAngularCoreLib.srcViewTypesMod.BindingFlags
  
  @js.native
  sealed trait TypeElementClass
    extends atAngularCoreLib.srcViewTypesMod.BindingFlags
  
  @js.native
  sealed trait TypeElementStyle
    extends atAngularCoreLib.srcViewTypesMod.BindingFlags
  
  @js.native
  sealed trait TypeProperty
    extends atAngularCoreLib.srcViewTypesMod.BindingFlags
  
  @js.native
  sealed trait Types
    extends atAngularCoreLib.srcViewTypesMod.BindingFlags
  
  /* 48 */ val CatSyntheticProperty: CatSyntheticProperty with scala.Double = js.native
  /* 32 */ val SyntheticHostProperty: SyntheticHostProperty with scala.Double = js.native
  /* 16 */ val SyntheticProperty: SyntheticProperty with scala.Double = js.native
  /* 1 */ val TypeElementAttribute: TypeElementAttribute with scala.Double = js.native
  /* 2 */ val TypeElementClass: TypeElementClass with scala.Double = js.native
  /* 4 */ val TypeElementStyle: TypeElementStyle with scala.Double = js.native
  /* 8 */ val TypeProperty: TypeProperty with scala.Double = js.native
  /* 15 */ val Types: Types with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[atAngularCoreLib.srcViewTypesMod.BindingFlags with scala.Double] = js.native
}

