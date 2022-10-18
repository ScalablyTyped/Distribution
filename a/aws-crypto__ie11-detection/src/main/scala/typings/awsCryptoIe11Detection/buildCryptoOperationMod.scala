package typings.awsCryptoIe11Detection

import typings.awsCryptoIe11Detection.buildKeyMod.Key
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildCryptoOperationMod {
  
  trait CryptoOperation extends StObject {
    
    def abort(): Unit
    
    val algorithm: String
    
    def finish(): Unit
    
    val key: Key
    
    def onabort(event: Event): Unit
    
    def oncomplete(event: Event): Unit
    
    def onerror(event: Event): Unit
    
    def onprogress(event: Event): Unit
    
    def process(buffer: js.typedarray.ArrayBufferView): Unit
    
    val result: js.UndefOr[js.typedarray.ArrayBuffer] = js.undefined
  }
  object CryptoOperation {
    
    inline def apply(
      abort: () => Unit,
      algorithm: String,
      finish: () => Unit,
      key: Key,
      onabort: Event => Unit,
      oncomplete: Event => Unit,
      onerror: Event => Unit,
      onprogress: Event => Unit,
      process: js.typedarray.ArrayBufferView => Unit
    ): CryptoOperation = {
      val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), algorithm = algorithm.asInstanceOf[js.Any], finish = js.Any.fromFunction0(finish), key = key.asInstanceOf[js.Any], onabort = js.Any.fromFunction1(onabort), oncomplete = js.Any.fromFunction1(oncomplete), onerror = js.Any.fromFunction1(onerror), onprogress = js.Any.fromFunction1(onprogress), process = js.Any.fromFunction1(process))
      __obj.asInstanceOf[CryptoOperation]
    }
    
    extension [Self <: CryptoOperation](x: Self) {
      
      inline def setAbort(value: () => Unit): Self = StObject.set(x, "abort", js.Any.fromFunction0(value))
      
      inline def setAlgorithm(value: String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      inline def setFinish(value: () => Unit): Self = StObject.set(x, "finish", js.Any.fromFunction0(value))
      
      inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setOnabort(value: Event => Unit): Self = StObject.set(x, "onabort", js.Any.fromFunction1(value))
      
      inline def setOncomplete(value: Event => Unit): Self = StObject.set(x, "oncomplete", js.Any.fromFunction1(value))
      
      inline def setOnerror(value: Event => Unit): Self = StObject.set(x, "onerror", js.Any.fromFunction1(value))
      
      inline def setOnprogress(value: Event => Unit): Self = StObject.set(x, "onprogress", js.Any.fromFunction1(value))
      
      inline def setProcess(value: js.typedarray.ArrayBufferView => Unit): Self = StObject.set(x, "process", js.Any.fromFunction1(value))
      
      inline def setResult(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    }
  }
}
