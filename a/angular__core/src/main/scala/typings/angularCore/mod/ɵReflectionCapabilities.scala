package typings.angularCore.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/core", "\u0275ReflectionCapabilities")
@js.native
open class ɵReflectionCapabilities ()
  extends StObject
     with PlatformReflectionCapabilities {
  def this(reflect: Any) = this()
  
  /* private */ var _ownAnnotations: Any = js.native
  
  /* private */ var _ownParameters: Any = js.native
  
  /* private */ var _ownPropMetadata: Any = js.native
  
  /* private */ var _reflect: Any = js.native
  
  /**
    * Return a list of annotations declared on the class
    */
  /* CompleteClass */
  override def annotations(`type`: Type[Any]): js.Array[Any] = js.native
  
  /* CompleteClass */
  override def factory(`type`: Type[Any]): js.Function = js.native
  
  /* CompleteClass */
  override def hasLifecycleHook(`type`: Any, lcProperty: String): Boolean = js.native
  
  def ownPropMetadata(typeOrFunc: Any): StringDictionary[js.Array[Any]] = js.native
  
  /**
    * Return a list of annotations/types for constructor parameters
    */
  /* CompleteClass */
  override def parameters(`type`: Type[Any]): js.Array[js.Array[Any]] = js.native
  
  def propMetadata(typeOrFunc: Any): StringDictionary[js.Array[Any]] = js.native
  /**
    * Return a object literal which describes the annotations on Class fields/properties.
    */
  /* CompleteClass */
  override def propMetadata(typeOrFunc: Type[Any]): StringDictionary[js.Array[Any]] = js.native
}
