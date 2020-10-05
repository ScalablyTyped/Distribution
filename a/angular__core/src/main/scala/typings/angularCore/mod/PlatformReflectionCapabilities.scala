package typings.angularCore.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlatformReflectionCapabilities extends js.Object {
  /**
    * Return a list of annotations declared on the class
    */
  def annotations(`type`: Type[_]): js.Array[_] = js.native
  def factory(`type`: Type[_]): js.Function = js.native
  def getter(name: String): ɵGetterFn = js.native
  def guards(`type`: js.Any): StringDictionary[js.Any] = js.native
  def hasLifecycleHook(`type`: js.Any, lcProperty: String): Boolean = js.native
  def importUri(`type`: Type[_]): String = js.native
  def isReflectionEnabled(): Boolean = js.native
  def method(name: String): ɵMethodFn = js.native
  /**
    * Return a list of annotations/types for constructor parameters
    */
  def parameters(`type`: Type[_]): js.Array[js.Array[_]] = js.native
  /**
    * Return a object literal which describes the annotations on Class fields/properties.
    */
  def propMetadata(typeOrFunc: Type[_]): StringDictionary[js.Array[_]] = js.native
  def resolveEnum(enumIdentifier: js.Any, name: String): js.Any = js.native
  def resolveIdentifier(name: String, moduleUrl: String, members: js.Array[String], runtime: js.Any): js.Any = js.native
  def resourceUri(`type`: Type[_]): String = js.native
  def setter(name: String): ɵSetterFn = js.native
}

object PlatformReflectionCapabilities {
  @scala.inline
  def apply(
    annotations: Type[_] => js.Array[_],
    factory: Type[_] => js.Function,
    getter: String => ɵGetterFn,
    guards: js.Any => StringDictionary[js.Any],
    hasLifecycleHook: (js.Any, String) => Boolean,
    importUri: Type[_] => String,
    isReflectionEnabled: () => Boolean,
    method: String => ɵMethodFn,
    parameters: Type[_] => js.Array[js.Array[_]],
    propMetadata: Type[_] => StringDictionary[js.Array[_]],
    resolveEnum: (js.Any, String) => js.Any,
    resolveIdentifier: (String, String, js.Array[String], js.Any) => js.Any,
    resourceUri: Type[_] => String,
    setter: String => ɵSetterFn
  ): PlatformReflectionCapabilities = {
    val __obj = js.Dynamic.literal(annotations = js.Any.fromFunction1(annotations), factory = js.Any.fromFunction1(factory), getter = js.Any.fromFunction1(getter), guards = js.Any.fromFunction1(guards), hasLifecycleHook = js.Any.fromFunction2(hasLifecycleHook), importUri = js.Any.fromFunction1(importUri), isReflectionEnabled = js.Any.fromFunction0(isReflectionEnabled), method = js.Any.fromFunction1(method), parameters = js.Any.fromFunction1(parameters), propMetadata = js.Any.fromFunction1(propMetadata), resolveEnum = js.Any.fromFunction2(resolveEnum), resolveIdentifier = js.Any.fromFunction4(resolveIdentifier), resourceUri = js.Any.fromFunction1(resourceUri), setter = js.Any.fromFunction1(setter))
    __obj.asInstanceOf[PlatformReflectionCapabilities]
  }
  @scala.inline
  implicit class PlatformReflectionCapabilitiesOps[Self <: PlatformReflectionCapabilities] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAnnotations(value: Type[_] => js.Array[_]): Self = this.set("annotations", js.Any.fromFunction1(value))
    @scala.inline
    def setFactory(value: Type[_] => js.Function): Self = this.set("factory", js.Any.fromFunction1(value))
    @scala.inline
    def setGetter(value: String => ɵGetterFn): Self = this.set("getter", js.Any.fromFunction1(value))
    @scala.inline
    def setGuards(value: js.Any => StringDictionary[js.Any]): Self = this.set("guards", js.Any.fromFunction1(value))
    @scala.inline
    def setHasLifecycleHook(value: (js.Any, String) => Boolean): Self = this.set("hasLifecycleHook", js.Any.fromFunction2(value))
    @scala.inline
    def setImportUri(value: Type[_] => String): Self = this.set("importUri", js.Any.fromFunction1(value))
    @scala.inline
    def setIsReflectionEnabled(value: () => Boolean): Self = this.set("isReflectionEnabled", js.Any.fromFunction0(value))
    @scala.inline
    def setMethod(value: String => ɵMethodFn): Self = this.set("method", js.Any.fromFunction1(value))
    @scala.inline
    def setParameters(value: Type[_] => js.Array[js.Array[_]]): Self = this.set("parameters", js.Any.fromFunction1(value))
    @scala.inline
    def setPropMetadata(value: Type[_] => StringDictionary[js.Array[_]]): Self = this.set("propMetadata", js.Any.fromFunction1(value))
    @scala.inline
    def setResolveEnum(value: (js.Any, String) => js.Any): Self = this.set("resolveEnum", js.Any.fromFunction2(value))
    @scala.inline
    def setResolveIdentifier(value: (String, String, js.Array[String], js.Any) => js.Any): Self = this.set("resolveIdentifier", js.Any.fromFunction4(value))
    @scala.inline
    def setResourceUri(value: Type[_] => String): Self = this.set("resourceUri", js.Any.fromFunction1(value))
    @scala.inline
    def setSetter(value: String => ɵSetterFn): Self = this.set("setter", js.Any.fromFunction1(value))
  }
  
}

