package typings.awsSdk.clientsDirectoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateComputerResult extends StObject {
  
  /**
    * A Computer object that represents the computer account.
    */
  var Computer: js.UndefOr[typings.awsSdk.clientsDirectoryserviceMod.Computer] = js.undefined
}
object CreateComputerResult {
  
  inline def apply(): CreateComputerResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateComputerResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateComputerResult] (val x: Self) extends AnyVal {
    
    inline def setComputer(value: Computer): Self = StObject.set(x, "Computer", value.asInstanceOf[js.Any])
    
    inline def setComputerUndefined: Self = StObject.set(x, "Computer", js.undefined)
  }
}
