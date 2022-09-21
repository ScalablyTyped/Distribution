package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FactoryTarget2 extends StObject
@JSImport("@angular/compiler", "FactoryTarget_2")
@js.native
object FactoryTarget2 extends StObject {
  
  @js.native
  sealed trait Component
    extends StObject
       with FactoryTarget2
  
  @js.native
  sealed trait Directive
    extends StObject
       with FactoryTarget2
  
  @js.native
  sealed trait Injectable
    extends StObject
       with FactoryTarget2
  
  @js.native
  sealed trait NgModule
    extends StObject
       with FactoryTarget2
  
  @js.native
  sealed trait Pipe
    extends StObject
       with FactoryTarget2
}
