package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Definition of what a factory function should look like.
  */
@js.native
trait FactoryFn[T] extends StObject {
  
  /**
    * If no constructor to instantiate is provided, an instance of type T itself is created.
    */
  def apply(t: Unit): T = js.native
  /**
    * Subclasses without an explicit constructor call through to the factory of their base
    * definition, providing it with their own constructor to instantiate.
    */
  def apply[U /* <: T */](t: Type[U]): U = js.native
}
