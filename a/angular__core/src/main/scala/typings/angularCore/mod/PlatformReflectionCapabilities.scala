package typings.angularCore.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlatformReflectionCapabilities extends StObject {
  
  /**
    * Return a list of annotations declared on the class
    */
  def annotations(`type`: typings.angularCore.mod.Type[_]): js.Array[_] = js.native
  
  def factory(`type`: typings.angularCore.mod.Type[_]): js.Function = js.native
  
  def getter(name: String): ɵGetterFn = js.native
  
  def guards(`type`: js.Any): StringDictionary[js.Any] = js.native
  
  def hasLifecycleHook(`type`: js.Any, lcProperty: String): Boolean = js.native
  
  def importUri(`type`: typings.angularCore.mod.Type[_]): String = js.native
  
  def isReflectionEnabled(): Boolean = js.native
  
  def method(name: String): ɵMethodFn = js.native
  
  /**
    * Return a list of annotations/types for constructor parameters
    */
  def parameters(`type`: typings.angularCore.mod.Type[_]): js.Array[js.Array[_]] = js.native
  
  /**
    * Return a object literal which describes the annotations on Class fields/properties.
    */
  def propMetadata(typeOrFunc: typings.angularCore.mod.Type[_]): StringDictionary[js.Array[_]] = js.native
  
  def resolveEnum(enumIdentifier: js.Any, name: String): js.Any = js.native
  
  def resolveIdentifier(name: String, moduleUrl: String, members: js.Array[String], runtime: js.Any): js.Any = js.native
  
  def resourceUri(`type`: typings.angularCore.mod.Type[_]): String = js.native
  
  def setter(name: String): ɵSetterFn = js.native
}
object PlatformReflectionCapabilities {
  
  @scala.inline
  def apply(
    annotations: typings.angularCore.mod.Type[_] => js.Array[_],
    factory: typings.angularCore.mod.Type[_] => js.Function,
    getter: String => ɵGetterFn,
    guards: js.Any => StringDictionary[js.Any],
    hasLifecycleHook: (js.Any, String) => Boolean,
    importUri: typings.angularCore.mod.Type[_] => String,
    isReflectionEnabled: () => Boolean,
    method: String => ɵMethodFn,
    parameters: typings.angularCore.mod.Type[_] => js.Array[js.Array[_]],
    propMetadata: typings.angularCore.mod.Type[_] => StringDictionary[js.Array[_]],
    resolveEnum: (js.Any, String) => js.Any,
    resolveIdentifier: (String, String, js.Array[String], js.Any) => js.Any,
    resourceUri: typings.angularCore.mod.Type[_] => String,
    setter: String => ɵSetterFn
  ): PlatformReflectionCapabilities = {
    val __obj = js.Dynamic.literal(annotations = js.Any.fromFunction1(annotations), factory = js.Any.fromFunction1(factory), getter = js.Any.fromFunction1(getter), guards = js.Any.fromFunction1(guards), hasLifecycleHook = js.Any.fromFunction2(hasLifecycleHook), importUri = js.Any.fromFunction1(importUri), isReflectionEnabled = js.Any.fromFunction0(isReflectionEnabled), method = js.Any.fromFunction1(method), parameters = js.Any.fromFunction1(parameters), propMetadata = js.Any.fromFunction1(propMetadata), resolveEnum = js.Any.fromFunction2(resolveEnum), resolveIdentifier = js.Any.fromFunction4(resolveIdentifier), resourceUri = js.Any.fromFunction1(resourceUri), setter = js.Any.fromFunction1(setter))
    __obj.asInstanceOf[PlatformReflectionCapabilities]
  }
  
  @scala.inline
  implicit class PlatformReflectionCapabilitiesMutableBuilder[Self <: PlatformReflectionCapabilities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnnotations(value: typings.angularCore.mod.Type[_] => js.Array[_]): Self = StObject.set(x, "annotations", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFactory(value: typings.angularCore.mod.Type[_] => js.Function): Self = StObject.set(x, "factory", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetter(value: String => ɵGetterFn): Self = StObject.set(x, "getter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGuards(value: js.Any => StringDictionary[js.Any]): Self = StObject.set(x, "guards", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHasLifecycleHook(value: (js.Any, String) => Boolean): Self = StObject.set(x, "hasLifecycleHook", js.Any.fromFunction2(value))
    
    @scala.inline
    def setImportUri(value: typings.angularCore.mod.Type[_] => String): Self = StObject.set(x, "importUri", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsReflectionEnabled(value: () => Boolean): Self = StObject.set(x, "isReflectionEnabled", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMethod(value: String => ɵMethodFn): Self = StObject.set(x, "method", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParameters(value: typings.angularCore.mod.Type[_] => js.Array[js.Array[_]]): Self = StObject.set(x, "parameters", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPropMetadata(value: typings.angularCore.mod.Type[_] => StringDictionary[js.Array[_]]): Self = StObject.set(x, "propMetadata", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResolveEnum(value: (js.Any, String) => js.Any): Self = StObject.set(x, "resolveEnum", js.Any.fromFunction2(value))
    
    @scala.inline
    def setResolveIdentifier(value: (String, String, js.Array[String], js.Any) => js.Any): Self = StObject.set(x, "resolveIdentifier", js.Any.fromFunction4(value))
    
    @scala.inline
    def setResourceUri(value: typings.angularCore.mod.Type[_] => String): Self = StObject.set(x, "resourceUri", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetter(value: String => ɵSetterFn): Self = StObject.set(x, "setter", js.Any.fromFunction1(value))
  }
}
