package typings.angularCore.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlatformReflectionCapabilities extends js.Object {
  /**
    * Return a list of annotations declared on the class
    */
  def annotations(`type`: Type[_]): js.Array[_]
  def factory(`type`: Type[_]): js.Function
  def getter(name: String): ɵGetterFn
  def guards(`type`: js.Any): StringDictionary[js.Any]
  def hasLifecycleHook(`type`: js.Any, lcProperty: String): Boolean
  def importUri(`type`: Type[_]): String
  def isReflectionEnabled(): Boolean
  def method(name: String): ɵMethodFn
  /**
    * Return a list of annotations/types for constructor parameters
    */
  def parameters(`type`: Type[_]): js.Array[js.Array[_]]
  /**
    * Return a object literal which describes the annotations on Class fields/properties.
    */
  def propMetadata(typeOrFunc: Type[_]): StringDictionary[js.Array[_]]
  def resolveEnum(enumIdentifier: js.Any, name: String): js.Any
  def resolveIdentifier(name: String, moduleUrl: String, members: js.Array[String], runtime: js.Any): js.Any
  def resourceUri(`type`: Type[_]): String
  def setter(name: String): ɵSetterFn
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
}

