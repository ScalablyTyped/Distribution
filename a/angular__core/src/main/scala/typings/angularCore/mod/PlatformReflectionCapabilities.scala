package typings.angularCore.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlatformReflectionCapabilities extends StObject {
  
  /**
    * Return a list of annotations declared on the class
    */
  def annotations(`type`: Type[js.Any]): js.Array[js.Any]
  
  def factory(`type`: Type[js.Any]): js.Function
  
  def getter(name: String): ɵGetterFn
  
  def guards(`type`: js.Any): StringDictionary[js.Any]
  
  def hasLifecycleHook(`type`: js.Any, lcProperty: String): Boolean
  
  def importUri(`type`: Type[js.Any]): String
  
  def isReflectionEnabled(): Boolean
  
  def method(name: String): ɵMethodFn
  
  /**
    * Return a list of annotations/types for constructor parameters
    */
  def parameters(`type`: Type[js.Any]): js.Array[js.Array[js.Any]]
  
  /**
    * Return a object literal which describes the annotations on Class fields/properties.
    */
  def propMetadata(typeOrFunc: Type[js.Any]): StringDictionary[js.Array[js.Any]]
  
  def resolveEnum(enumIdentifier: js.Any, name: String): js.Any
  
  def resolveIdentifier(name: String, moduleUrl: String, members: js.Array[String], runtime: js.Any): js.Any
  
  def resourceUri(`type`: Type[js.Any]): String
  
  def setter(name: String): ɵSetterFn
}
object PlatformReflectionCapabilities {
  
  inline def apply(
    annotations: Type[js.Any] => js.Array[js.Any],
    factory: Type[js.Any] => js.Function,
    getter: String => ɵGetterFn,
    guards: js.Any => StringDictionary[js.Any],
    hasLifecycleHook: (js.Any, String) => Boolean,
    importUri: Type[js.Any] => String,
    isReflectionEnabled: () => Boolean,
    method: String => ɵMethodFn,
    parameters: Type[js.Any] => js.Array[js.Array[js.Any]],
    propMetadata: Type[js.Any] => StringDictionary[js.Array[js.Any]],
    resolveEnum: (js.Any, String) => js.Any,
    resolveIdentifier: (String, String, js.Array[String], js.Any) => js.Any,
    resourceUri: Type[js.Any] => String,
    setter: String => ɵSetterFn
  ): PlatformReflectionCapabilities = {
    val __obj = js.Dynamic.literal(annotations = js.Any.fromFunction1(annotations), factory = js.Any.fromFunction1(factory), getter = js.Any.fromFunction1(getter), guards = js.Any.fromFunction1(guards), hasLifecycleHook = js.Any.fromFunction2(hasLifecycleHook), importUri = js.Any.fromFunction1(importUri), isReflectionEnabled = js.Any.fromFunction0(isReflectionEnabled), method = js.Any.fromFunction1(method), parameters = js.Any.fromFunction1(parameters), propMetadata = js.Any.fromFunction1(propMetadata), resolveEnum = js.Any.fromFunction2(resolveEnum), resolveIdentifier = js.Any.fromFunction4(resolveIdentifier), resourceUri = js.Any.fromFunction1(resourceUri), setter = js.Any.fromFunction1(setter))
    __obj.asInstanceOf[PlatformReflectionCapabilities]
  }
  
  extension [Self <: PlatformReflectionCapabilities](x: Self) {
    
    inline def setAnnotations(value: Type[js.Any] => js.Array[js.Any]): Self = StObject.set(x, "annotations", js.Any.fromFunction1(value))
    
    inline def setFactory(value: Type[js.Any] => js.Function): Self = StObject.set(x, "factory", js.Any.fromFunction1(value))
    
    inline def setGetter(value: String => ɵGetterFn): Self = StObject.set(x, "getter", js.Any.fromFunction1(value))
    
    inline def setGuards(value: js.Any => StringDictionary[js.Any]): Self = StObject.set(x, "guards", js.Any.fromFunction1(value))
    
    inline def setHasLifecycleHook(value: (js.Any, String) => Boolean): Self = StObject.set(x, "hasLifecycleHook", js.Any.fromFunction2(value))
    
    inline def setImportUri(value: Type[js.Any] => String): Self = StObject.set(x, "importUri", js.Any.fromFunction1(value))
    
    inline def setIsReflectionEnabled(value: () => Boolean): Self = StObject.set(x, "isReflectionEnabled", js.Any.fromFunction0(value))
    
    inline def setMethod(value: String => ɵMethodFn): Self = StObject.set(x, "method", js.Any.fromFunction1(value))
    
    inline def setParameters(value: Type[js.Any] => js.Array[js.Array[js.Any]]): Self = StObject.set(x, "parameters", js.Any.fromFunction1(value))
    
    inline def setPropMetadata(value: Type[js.Any] => StringDictionary[js.Array[js.Any]]): Self = StObject.set(x, "propMetadata", js.Any.fromFunction1(value))
    
    inline def setResolveEnum(value: (js.Any, String) => js.Any): Self = StObject.set(x, "resolveEnum", js.Any.fromFunction2(value))
    
    inline def setResolveIdentifier(value: (String, String, js.Array[String], js.Any) => js.Any): Self = StObject.set(x, "resolveIdentifier", js.Any.fromFunction4(value))
    
    inline def setResourceUri(value: Type[js.Any] => String): Self = StObject.set(x, "resourceUri", js.Any.fromFunction1(value))
    
    inline def setSetter(value: String => ɵSetterFn): Self = StObject.set(x, "setter", js.Any.fromFunction1(value))
  }
}
