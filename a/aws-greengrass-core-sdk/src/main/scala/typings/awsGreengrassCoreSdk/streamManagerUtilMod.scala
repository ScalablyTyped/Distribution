package typings.awsGreengrassCoreSdk

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object streamManagerUtilMod {
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def deserializeJsonBytesToObj[T](bytes: Buffer, `type`: FromMap[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeJsonBytesToObj")(bytes.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def validateAndSerializeToJsonBytes(o: Any): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("validateAndSerializeToJsonBytes")(o.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  trait FromMap[T] extends StObject {
    
    def fromMap(m: Any): T
  }
  object FromMap {
    
    inline def apply[T](fromMap: Any => T): FromMap[T] = {
      val __obj = js.Dynamic.literal(fromMap = js.Any.fromFunction1(fromMap))
      __obj.asInstanceOf[FromMap[T]]
    }
    
    extension [Self <: FromMap[?], T](x: Self & FromMap[T]) {
      
      inline def setFromMap(value: Any => T): Self = StObject.set(x, "fromMap", js.Any.fromFunction1(value))
    }
  }
}
