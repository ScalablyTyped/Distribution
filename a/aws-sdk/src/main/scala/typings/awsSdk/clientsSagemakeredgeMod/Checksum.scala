package typings.awsSdk.clientsSagemakeredgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Checksum extends StObject {
  
  /**
    * The checksum of the model.
    */
  var Sum: js.UndefOr[ChecksumString] = js.undefined
  
  /**
    * The type of the checksum.
    */
  var Type: js.UndefOr[ChecksumType] = js.undefined
}
object Checksum {
  
  inline def apply(): Checksum = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Checksum]
  }
  
  extension [Self <: Checksum](x: Self) {
    
    inline def setSum(value: ChecksumString): Self = StObject.set(x, "Sum", value.asInstanceOf[js.Any])
    
    inline def setSumUndefined: Self = StObject.set(x, "Sum", js.undefined)
    
    inline def setType(value: ChecksumType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
