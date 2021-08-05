package typings.activexLibreoffice.com_.sun.star.lang

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** interface to get information about the types (usually interface types) supported by an object. */
trait XTypeProvider
  extends StObject
     with XInterface {
  
  /**
    * Obsolete unique identifier.
    *
    * Originally returned a sequence of bytes which, when non-empty, was used as an ID to distinguish unambiguously between two sets of types, for example
    * to realise hashing functionality when the object is introspected. Two objects that returned the same non-empty ID had to return the same set of types
    * in {@link getTypes()} . (If a unique ID could not be provided, this method was always allowed to return an empty sequence, though).
    * @deprecated DeprecatedThis feature should no longer be used, and implementations are encouraged to always return an empty sequence.
    */
  val ImplementationId: SafeArray[Double]
  
  /** returns a sequence of all types (usually interface types) provided by the object. */
  val Types: SafeArray[`type`]
  
  /**
    * Obsolete unique identifier.
    *
    * Originally returned a sequence of bytes which, when non-empty, was used as an ID to distinguish unambiguously between two sets of types, for example
    * to realise hashing functionality when the object is introspected. Two objects that returned the same non-empty ID had to return the same set of types
    * in {@link getTypes()} . (If a unique ID could not be provided, this method was always allowed to return an empty sequence, though).
    * @deprecated DeprecatedThis feature should no longer be used, and implementations are encouraged to always return an empty sequence.
    */
  def getImplementationId(): SafeArray[Double]
  
  /** returns a sequence of all types (usually interface types) provided by the object. */
  def getTypes(): SafeArray[`type`]
}
object XTypeProvider {
  
  inline def apply(
    ImplementationId: SafeArray[Double],
    Types: SafeArray[`type`],
    acquire: () => Unit,
    getImplementationId: () => SafeArray[Double],
    getTypes: () => SafeArray[`type`],
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XTypeProvider = {
    val __obj = js.Dynamic.literal(ImplementationId = ImplementationId.asInstanceOf[js.Any], Types = Types.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getImplementationId = js.Any.fromFunction0(getImplementationId), getTypes = js.Any.fromFunction0(getTypes), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XTypeProvider]
  }
  
  extension [Self <: XTypeProvider](x: Self) {
    
    inline def setGetImplementationId(value: () => SafeArray[Double]): Self = StObject.set(x, "getImplementationId", js.Any.fromFunction0(value))
    
    inline def setGetTypes(value: () => SafeArray[`type`]): Self = StObject.set(x, "getTypes", js.Any.fromFunction0(value))
    
    inline def setImplementationId(value: SafeArray[Double]): Self = StObject.set(x, "ImplementationId", value.asInstanceOf[js.Any])
    
    inline def setTypes(value: SafeArray[`type`]): Self = StObject.set(x, "Types", value.asInstanceOf[js.Any])
  }
}
