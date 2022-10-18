package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("@angular/core", "NgModuleFactory")
@js.native
open class NgModuleFactory[T] () extends StObject {
  
  def create(): NgModuleRef[T] = js.native
  def create(parentInjector: Injector): NgModuleRef[T] = js.native
  
  def moduleType: Type[T] = js.native
}
