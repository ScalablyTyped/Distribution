package typings.activexLibreoffice.com_.sun.star.ucb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Information about a transfer activity. */
trait TransferResult extends StObject {
  
  /** Either void if the transfer has been carried out successfully, or an exception indicating the kind of failure. */
  var Result: js.Any
  
  /** The URL of the source object. */
  var Source: String
  
  /** The URL of the target folder into which to transfer (a copy of) the source object. */
  var Target: String
}
object TransferResult {
  
  inline def apply(Result: js.Any, Source: String, Target: String): TransferResult = {
    val __obj = js.Dynamic.literal(Result = Result.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransferResult]
  }
  
  extension [Self <: TransferResult](x: Self) {
    
    inline def setResult(value: js.Any): Self = StObject.set(x, "Result", value.asInstanceOf[js.Any])
    
    inline def setSource(value: String): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: String): Self = StObject.set(x, "Target", value.asInstanceOf[js.Any])
  }
}
