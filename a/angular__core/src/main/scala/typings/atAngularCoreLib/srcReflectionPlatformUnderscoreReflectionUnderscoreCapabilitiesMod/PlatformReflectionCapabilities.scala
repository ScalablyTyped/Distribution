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
    annotations: js.Function1[atAngularCoreLib.srcTypeMod.Type[_], js.Array[_]],
    factory: js.Function1[atAngularCoreLib.srcTypeMod.Type[_], js.Function],
    getter: js.Function1[java.lang.String, atAngularCoreLib.srcReflectionTypesMod.GetterFn],
    guards: js.Function1[js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]],
    hasLifecycleHook: js.Function2[js.Any, java.lang.String, scala.Boolean],
    importUri: js.Function1[atAngularCoreLib.srcTypeMod.Type[_], java.lang.String],
    isReflectionEnabled: js.Function0[scala.Boolean],
    method: js.Function1[java.lang.String, atAngularCoreLib.srcReflectionTypesMod.MethodFn],
    parameters: js.Function1[atAngularCoreLib.srcTypeMod.Type[_], js.Array[js.Array[_]]],
    propMetadata: js.Function1[
      atAngularCoreLib.srcTypeMod.Type[_], 
      org.scalablytyped.runtime.StringDictionary[js.Array[_]]
    ],
    resolveEnum: js.Function2[js.Any, java.lang.String, js.Any],
    resolveIdentifier: js.Function4[java.lang.String, java.lang.String, js.Array[java.lang.String], js.Any, js.Any],
    resourceUri: js.Function1[atAngularCoreLib.srcTypeMod.Type[_], java.lang.String],
    setter: js.Function1[java.lang.String, atAngularCoreLib.srcReflectionTypesMod.SetterFn]
  ): PlatformReflectionCapabilities = {
    val __obj = js.Dynamic.literal(annotations = annotations, factory = factory, getter = getter, guards = guards, hasLifecycleHook = hasLifecycleHook, importUri = importUri, isReflectionEnabled = isReflectionEnabled, method = method, parameters = parameters, propMetadata = propMetadata, resolveEnum = resolveEnum, resolveIdentifier = resolveIdentifier, resourceUri = resourceUri, setter = setter)
  
    __obj.asInstanceOf[PlatformReflectionCapabilities]
  }
}

