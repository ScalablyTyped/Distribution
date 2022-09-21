package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MissingTranslationStrategy extends StObject
@JSImport("@angular/compiler", "MissingTranslationStrategy")
@js.native
object MissingTranslationStrategy extends StObject {
  
  @js.native
  sealed trait Error
    extends StObject
       with MissingTranslationStrategy
  
  @js.native
  sealed trait Ignore
    extends StObject
       with MissingTranslationStrategy
  
  @js.native
  sealed trait Warning
    extends StObject
       with MissingTranslationStrategy
}
