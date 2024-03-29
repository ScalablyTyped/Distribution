package typings.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RetrieveTapeArchiveOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the retrieved virtual tape.
    */
  var TapeARN: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.TapeARN] = js.undefined
}
object RetrieveTapeArchiveOutput {
  
  inline def apply(): RetrieveTapeArchiveOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetrieveTapeArchiveOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RetrieveTapeArchiveOutput] (val x: Self) extends AnyVal {
    
    inline def setTapeARN(value: TapeARN): Self = StObject.set(x, "TapeARN", value.asInstanceOf[js.Any])
    
    inline def setTapeARNUndefined: Self = StObject.set(x, "TapeARN", js.undefined)
  }
}
