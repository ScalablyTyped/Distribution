package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MissingTranslationStrategy extends StObject
@JSImport("@angular/core", "MissingTranslationStrategy")
@js.native
object MissingTranslationStrategy extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MissingTranslationStrategy & Double] = js.native
  
  @js.native
  sealed trait Error
    extends StObject
       with MissingTranslationStrategy
  /* 0 */ val Error: typings.angularCore.mod.MissingTranslationStrategy.Error & Double = js.native
  
  @js.native
  sealed trait Ignore
    extends StObject
       with MissingTranslationStrategy
  /* 2 */ val Ignore: typings.angularCore.mod.MissingTranslationStrategy.Ignore & Double = js.native
  
  @js.native
  sealed trait Warning
    extends StObject
       with MissingTranslationStrategy
  /* 1 */ val Warning: typings.angularCore.mod.MissingTranslationStrategy.Warning & Double = js.native
}
