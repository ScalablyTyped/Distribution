package typings
package atAngularCompilerLib.srcCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BindingFlags extends js.Object

@JSImport("@angular/compiler/src/core", "BindingFlags")
@js.native
object BindingFlags extends js.Object {
  @js.native
  sealed trait CatSyntheticProperty
    extends atAngularCompilerLib.srcCoreMod.BindingFlags
  
  @js.native
  sealed trait SyntheticHostProperty
    extends atAngularCompilerLib.srcCoreMod.BindingFlags
  
  @js.native
  sealed trait SyntheticProperty
    extends atAngularCompilerLib.srcCoreMod.BindingFlags
  
  @js.native
  sealed trait TypeElementAttribute
    extends atAngularCompilerLib.srcCoreMod.BindingFlags
  
  @js.native
  sealed trait TypeElementClass
    extends atAngularCompilerLib.srcCoreMod.BindingFlags
  
  @js.native
  sealed trait TypeElementStyle
    extends atAngularCompilerLib.srcCoreMod.BindingFlags
  
  @js.native
  sealed trait TypeProperty
    extends atAngularCompilerLib.srcCoreMod.BindingFlags
  
  @js.native
  sealed trait Types
    extends atAngularCompilerLib.srcCoreMod.BindingFlags
  
  /* 48 */ val CatSyntheticProperty: CatSyntheticProperty with scala.Double = js.native
  /* 32 */ val SyntheticHostProperty: SyntheticHostProperty with scala.Double = js.native
  /* 16 */ val SyntheticProperty: SyntheticProperty with scala.Double = js.native
  /* 1 */ val TypeElementAttribute: TypeElementAttribute with scala.Double = js.native
  /* 2 */ val TypeElementClass: TypeElementClass with scala.Double = js.native
  /* 4 */ val TypeElementStyle: TypeElementStyle with scala.Double = js.native
  /* 8 */ val TypeProperty: TypeProperty with scala.Double = js.native
  /* 15 */ val Types: Types with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[atAngularCompilerLib.srcCoreMod.BindingFlags with scala.Double] = js.native
}

