package typings.ajv

import typings.ajv.distTypesMod.UriResolver
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCompileRefErrorMod {
  
  @JSImport("ajv/dist/compile/ref_error", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with MissingRefError {
    def this(resolver: UriResolver, baseId: String, ref: String) = this()
    def this(resolver: UriResolver, baseId: String, ref: String, msg: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    override val missingRef: String = js.native
    
    /* CompleteClass */
    override val missingSchema: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  trait MissingRefError
    extends StObject
       with Error {
    
    val missingRef: String
    
    val missingSchema: String
  }
  object MissingRefError {
    
    inline def apply(message: String, missingRef: String, missingSchema: String, name: String): MissingRefError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], missingRef = missingRef.asInstanceOf[js.Any], missingSchema = missingSchema.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[MissingRefError]
    }
    
    extension [Self <: MissingRefError](x: Self) {
      
      inline def setMissingRef(value: String): Self = StObject.set(x, "missingRef", value.asInstanceOf[js.Any])
      
      inline def setMissingSchema(value: String): Self = StObject.set(x, "missingSchema", value.asInstanceOf[js.Any])
    }
  }
}
