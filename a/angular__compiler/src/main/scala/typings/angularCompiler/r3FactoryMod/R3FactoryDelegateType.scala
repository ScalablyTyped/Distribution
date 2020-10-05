package typings.angularCompiler.r3FactoryMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait R3FactoryDelegateType extends js.Object

@JSImport("@angular/compiler/src/render3/r3_factory", "R3FactoryDelegateType")
@js.native
object R3FactoryDelegateType extends js.Object {
  @js.native
  sealed trait Class extends R3FactoryDelegateType
  
  @js.native
  sealed trait Factory extends R3FactoryDelegateType
  
  @js.native
  sealed trait Function extends R3FactoryDelegateType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[R3FactoryDelegateType with Double] = js.native
  /* 0 */ @js.native
  object Class extends TopLevel[Class with Double]
  
  /* 2 */ @js.native
  object Factory extends TopLevel[Factory with Double]
  
  /* 1 */ @js.native
  object Function extends TopLevel[Function with Double]
  
}

