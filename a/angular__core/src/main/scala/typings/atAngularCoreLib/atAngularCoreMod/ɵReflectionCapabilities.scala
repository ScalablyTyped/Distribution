package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core", "ɵReflectionCapabilities")
@js.native
class ɵReflectionCapabilities () extends PlatformReflectionCapabilities {
  def this(reflect: js.Any) = this()
  var _ownAnnotations: js.Any = js.native
  var _ownParameters: js.Any = js.native
  var _ownPropMetadata: js.Any = js.native
  var _reflect: js.Any = js.native
  /**
    * Return a list of annotations declared on the class
    */
  /* CompleteClass */
  override def annotations(`type`: Type[_]): js.Array[_] = js.native
  /* CompleteClass */
  override def factory(`type`: Type[_]): js.Function = js.native
  /* CompleteClass */
  override def getter(name: java.lang.String): ɵGetterFn = js.native
  /* CompleteClass */
  override def guards(`type`: js.Any): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  /* CompleteClass */
  override def hasLifecycleHook(`type`: js.Any, lcProperty: java.lang.String): scala.Boolean = js.native
  /* CompleteClass */
  override def importUri(`type`: Type[_]): java.lang.String = js.native
  def importUri(`type`: js.Any): java.lang.String = js.native
  /* CompleteClass */
  override def isReflectionEnabled(): scala.Boolean = js.native
  /* CompleteClass */
  override def method(name: java.lang.String): ɵMethodFn = js.native
  def ownPropMetadata(typeOrFunc: js.Any): org.scalablytyped.runtime.StringDictionary[js.Array[_]] = js.native
  /**
    * Return a list of annotations/types for constructor parameters
    */
  /* CompleteClass */
  override def parameters(`type`: Type[_]): js.Array[js.Array[_]] = js.native
  /**
    * Return a object literal which describes the annotations on Class fields/properties.
    */
  /* CompleteClass */
  override def propMetadata(typeOrFunc: Type[_]): org.scalablytyped.runtime.StringDictionary[js.Array[_]] = js.native
  def propMetadata(typeOrFunc: js.Any): org.scalablytyped.runtime.StringDictionary[js.Array[_]] = js.native
  /* CompleteClass */
  override def resolveEnum(enumIdentifier: js.Any, name: java.lang.String): js.Any = js.native
  /* CompleteClass */
  override def resolveIdentifier(
    name: java.lang.String,
    moduleUrl: java.lang.String,
    members: js.Array[java.lang.String],
    runtime: js.Any
  ): js.Any = js.native
  /* CompleteClass */
  override def resourceUri(`type`: Type[_]): java.lang.String = js.native
  def resourceUri(`type`: js.Any): java.lang.String = js.native
  /* CompleteClass */
  override def setter(name: java.lang.String): ɵSetterFn = js.native
}

