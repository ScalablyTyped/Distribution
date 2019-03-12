package typings
package atAngularCoreLib.srcReflectionPlatformUnderscoreReflectionUnderscoreCapabilitiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlatformReflectionCapabilities extends js.Object {
  /**
    * Return a list of annotations declared on the class
    */
  def annotations(`type`: atAngularCoreLib.srcTypeMod.Type[_]): js.Array[_]
  def factory(`type`: atAngularCoreLib.srcTypeMod.Type[_]): js.Function
  def getter(name: java.lang.String): atAngularCoreLib.srcReflectionTypesMod.GetterFn
  def guards(`type`: js.Any): org.scalablytyped.runtime.StringDictionary[js.Any]
  def hasLifecycleHook(`type`: js.Any, lcProperty: java.lang.String): scala.Boolean
  def importUri(`type`: atAngularCoreLib.srcTypeMod.Type[_]): java.lang.String
  def isReflectionEnabled(): scala.Boolean
  def method(name: java.lang.String): atAngularCoreLib.srcReflectionTypesMod.MethodFn
  /**
    * Return a list of annotations/types for constructor parameters
    */
  def parameters(`type`: atAngularCoreLib.srcTypeMod.Type[_]): js.Array[js.Array[_]]
  /**
    * Return a object literal which describes the annotations on Class fields/properties.
    */
  def propMetadata(typeOrFunc: atAngularCoreLib.srcTypeMod.Type[_]): org.scalablytyped.runtime.StringDictionary[js.Array[_]]
  def resolveEnum(enumIdentifier: js.Any, name: java.lang.String): js.Any
  def resolveIdentifier(
    name: java.lang.String,
    moduleUrl: java.lang.String,
    members: js.Array[java.lang.String],
    runtime: js.Any
  ): js.Any
  def resourceUri(`type`: atAngularCoreLib.srcTypeMod.Type[_]): java.lang.String
  def setter(name: java.lang.String): atAngularCoreLib.srcReflectionTypesMod.SetterFn
}

object PlatformReflectionCapabilities {
  @scala.inline
  def apply(
    annotations: atAngularCoreLib.srcTypeMod.Type[_] => js.Array[_],
    factory: atAngularCoreLib.srcTypeMod.Type[_] => js.Function,
    getter: java.lang.String => atAngularCoreLib.srcReflectionTypesMod.GetterFn,
    guards: js.Any => org.scalablytyped.runtime.StringDictionary[js.Any],
    hasLifecycleHook: (js.Any, java.lang.String) => scala.Boolean,
    importUri: atAngularCoreLib.srcTypeMod.Type[_] => java.lang.String,
    isReflectionEnabled: () => scala.Boolean,
    method: java.lang.String => atAngularCoreLib.srcReflectionTypesMod.MethodFn,
    parameters: atAngularCoreLib.srcTypeMod.Type[_] => js.Array[js.Array[_]],
    propMetadata: atAngularCoreLib.srcTypeMod.Type[_] => org.scalablytyped.runtime.StringDictionary[js.Array[_]],
    resolveEnum: (js.Any, java.lang.String) => js.Any,
    resolveIdentifier: (java.lang.String, java.lang.String, js.Array[java.lang.String], js.Any) => js.Any,
    resourceUri: atAngularCoreLib.srcTypeMod.Type[_] => java.lang.String,
    setter: java.lang.String => atAngularCoreLib.srcReflectionTypesMod.SetterFn
  ): PlatformReflectionCapabilities = {
    val __obj = js.Dynamic.literal(annotations = js.Any.fromFunction1(annotations), factory = js.Any.fromFunction1(factory), getter = js.Any.fromFunction1(getter), guards = js.Any.fromFunction1(guards), hasLifecycleHook = js.Any.fromFunction2(hasLifecycleHook), importUri = js.Any.fromFunction1(importUri), isReflectionEnabled = js.Any.fromFunction0(isReflectionEnabled), method = js.Any.fromFunction1(method), parameters = js.Any.fromFunction1(parameters), propMetadata = js.Any.fromFunction1(propMetadata), resolveEnum = js.Any.fromFunction2(resolveEnum), resolveIdentifier = js.Any.fromFunction4(resolveIdentifier), resourceUri = js.Any.fromFunction1(resourceUri), setter = js.Any.fromFunction1(setter))
  
    __obj.asInstanceOf[PlatformReflectionCapabilities]
  }
}

