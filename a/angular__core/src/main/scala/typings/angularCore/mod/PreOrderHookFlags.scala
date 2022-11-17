package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PreOrderHookFlags {
  
  /**
    The index of the next pre-order hook to be called in the hooks array, on the first 16
    bits
    */
  inline def IndexOfTheNextPreOrderHookMaskMask: 65535 = 65535.asInstanceOf[65535]
  
  /**
    * The number of init hooks that have already been called, on the last 16 bits
    */
  inline def NumberOfInitHooksCalledIncrementer: 65536 = 65536.asInstanceOf[65536]
  
  inline def NumberOfInitHooksCalledMask: 4294901760d = 4294901760d.asInstanceOf[4294901760d]
  
  inline def NumberOfInitHooksCalledShift: 16 = 16.asInstanceOf[16]
}
