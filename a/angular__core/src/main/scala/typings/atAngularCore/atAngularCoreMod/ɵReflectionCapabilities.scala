package typings.atAngularCore.atAngularCoreMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core", "\u0275ReflectionCapabilities")
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
  override def getter(name: String): ɵGetterFn = js.native
  /* CompleteClass */
  override def guards(`type`: js.Any): StringDictionary[js.Any] = js.native
  /* CompleteClass */
  override def hasLifecycleHook(`type`: js.Any, lcProperty: String): Boolean = js.native
  def importUri(`type`: js.Any): String = js.native
  /* CompleteClass */
  override def importUri(`type`: Type[_]): String = js.native
  /* CompleteClass */
  override def isReflectionEnabled(): Boolean = js.native
  /* CompleteClass */
  override def method(name: String): ɵMethodFn = js.native
  def ownPropMetadata(typeOrFunc: js.Any): StringDictionary[js.Array[_]] = js.native
  /**
    * Return a list of annotations/types for constructor parameters
    */
  /* CompleteClass */
  override def parameters(`type`: Type[_]): js.Array[js.Array[_]] = js.native
  def propMetadata(typeOrFunc: js.Any): StringDictionary[js.Array[_]] = js.native
  /**
    * Return a object literal which describes the annotations on Class fields/properties.
    */
  /* CompleteClass */
  override def propMetadata(typeOrFunc: Type[_]): StringDictionary[js.Array[_]] = js.native
  /* CompleteClass */
  override def resolveEnum(enumIdentifier: js.Any, name: String): js.Any = js.native
  /* CompleteClass */
  override def resolveIdentifier(name: String, moduleUrl: String, members: js.Array[String], runtime: js.Any): js.Any = js.native
  def resourceUri(`type`: js.Any): String = js.native
  /* CompleteClass */
  override def resourceUri(`type`: Type[_]): String = js.native
  /* CompleteClass */
  override def setter(name: String): ɵSetterFn = js.native
}

