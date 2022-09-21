package typings.awsCrt

import org.scalablytyped.runtime.Instantiable1
import typings.awsCrt.anon.Instantiable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nativeResourceMod {
  
  @JSImport("aws-crt/dist/native/native_resource", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("aws-crt/dist/native/native_resource", "NativeResource")
  @js.native
  open class NativeResource protected () extends StObject {
    def this(handle: Any) = this()
    
    /* private */ var handle: Any = js.native
    
    /** @internal */
    def native_handle(): Any = js.native
  }
  
  inline def NativeResourceMixin[T /* <: Ctor[js.Object] */](Base: T): Instantiable & T = ^.asInstanceOf[js.Dynamic].applyDynamic("NativeResourceMixin")(Base.asInstanceOf[js.Any]).asInstanceOf[Instantiable & T]
  
  /** @internal */
  type Ctor[T] = Instantiable1[/* args (repeated) */ Any, T]
}
