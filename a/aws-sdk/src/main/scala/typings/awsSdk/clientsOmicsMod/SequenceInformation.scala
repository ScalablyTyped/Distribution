package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SequenceInformation extends StObject {
  
  /**
    * The sequence's alignment setting.
    */
  var alignment: js.UndefOr[String] = js.undefined
  
  /**
    * Where the sequence originated.
    */
  var generatedFrom: js.UndefOr[GeneratedFrom] = js.undefined
  
  /**
    * The sequence's total base count.
    */
  var totalBaseCount: js.UndefOr[Long] = js.undefined
  
  /**
    * The sequence's total read count.
    */
  var totalReadCount: js.UndefOr[Long] = js.undefined
}
object SequenceInformation {
  
  inline def apply(): SequenceInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SequenceInformation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SequenceInformation] (val x: Self) extends AnyVal {
    
    inline def setAlignment(value: String): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
    
    inline def setGeneratedFrom(value: GeneratedFrom): Self = StObject.set(x, "generatedFrom", value.asInstanceOf[js.Any])
    
    inline def setGeneratedFromUndefined: Self = StObject.set(x, "generatedFrom", js.undefined)
    
    inline def setTotalBaseCount(value: Long): Self = StObject.set(x, "totalBaseCount", value.asInstanceOf[js.Any])
    
    inline def setTotalBaseCountUndefined: Self = StObject.set(x, "totalBaseCount", js.undefined)
    
    inline def setTotalReadCount(value: Long): Self = StObject.set(x, "totalReadCount", value.asInstanceOf[js.Any])
    
    inline def setTotalReadCountUndefined: Self = StObject.set(x, "totalReadCount", js.undefined)
  }
}
