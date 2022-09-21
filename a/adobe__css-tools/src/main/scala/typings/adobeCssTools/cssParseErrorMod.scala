package typings.adobeCssTools

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cssParseErrorMod {
  
  @JSImport("@adobe/css-tools/dist/cjs/CssParseError", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with CssParseError {
    def this(filename: String, msg: String, lineno: Double, column: Double, css: String) = this()
    
    /* CompleteClass */
    override val column: Double = js.native
    
    /* CompleteClass */
    override val line: Double = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    override val reason: String = js.native
    
    /* CompleteClass */
    override val source: String = js.native
  }
  
  trait CssParseError
    extends StObject
       with Error {
    
    val column: Double
    
    val filename: js.UndefOr[String] = js.undefined
    
    val line: Double
    
    val reason: String
    
    val source: String
  }
  object CssParseError {
    
    inline def apply(column: Double, line: Double, message: String, name: String, reason: String, source: String): CssParseError = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[CssParseError]
    }
    
    extension [Self <: CssParseError](x: Self) {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
}
