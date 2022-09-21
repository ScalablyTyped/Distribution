package typings.angularCore.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlatformReflectionCapabilities extends StObject {
  
  /**
    * Return a list of annotations declared on the class
    */
  def annotations(`type`: Type[Any]): js.Array[Any]
  
  def factory(`type`: Type[Any]): js.Function
  
  def hasLifecycleHook(`type`: Any, lcProperty: String): Boolean
  
  /**
    * Return a list of annotations/types for constructor parameters
    */
  def parameters(`type`: Type[Any]): js.Array[js.Array[Any]]
  
  /**
    * Return a object literal which describes the annotations on Class fields/properties.
    */
  def propMetadata(typeOrFunc: Type[Any]): StringDictionary[js.Array[Any]]
}
object PlatformReflectionCapabilities {
  
  inline def apply(
    annotations: Type[Any] => js.Array[Any],
    factory: Type[Any] => js.Function,
    hasLifecycleHook: (Any, String) => Boolean,
    parameters: Type[Any] => js.Array[js.Array[Any]],
    propMetadata: Type[Any] => StringDictionary[js.Array[Any]]
  ): PlatformReflectionCapabilities = {
    val __obj = js.Dynamic.literal(annotations = js.Any.fromFunction1(annotations), factory = js.Any.fromFunction1(factory), hasLifecycleHook = js.Any.fromFunction2(hasLifecycleHook), parameters = js.Any.fromFunction1(parameters), propMetadata = js.Any.fromFunction1(propMetadata))
    __obj.asInstanceOf[PlatformReflectionCapabilities]
  }
  
  extension [Self <: PlatformReflectionCapabilities](x: Self) {
    
    inline def setAnnotations(value: Type[Any] => js.Array[Any]): Self = StObject.set(x, "annotations", js.Any.fromFunction1(value))
    
    inline def setFactory(value: Type[Any] => js.Function): Self = StObject.set(x, "factory", js.Any.fromFunction1(value))
    
    inline def setHasLifecycleHook(value: (Any, String) => Boolean): Self = StObject.set(x, "hasLifecycleHook", js.Any.fromFunction2(value))
    
    inline def setParameters(value: Type[Any] => js.Array[js.Array[Any]]): Self = StObject.set(x, "parameters", js.Any.fromFunction1(value))
    
    inline def setPropMetadata(value: Type[Any] => StringDictionary[js.Array[Any]]): Self = StObject.set(x, "propMetadata", js.Any.fromFunction1(value))
  }
}
