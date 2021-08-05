package typings.asynciterator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AutoStart extends StObject {
    
    var autoStart: js.UndefOr[Boolean] = js.undefined
  }
  object AutoStart {
    
    inline def apply(): AutoStart = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutoStart]
    }
    
    extension [Self <: AutoStart](x: Self) {
      
      inline def setAutoStart(value: Boolean): Self = StObject.set(x, "autoStart", value.asInstanceOf[js.Any])
      
      inline def setAutoStartUndefined: Self = StObject.set(x, "autoStart", js.undefined)
    }
  }
  
  trait End extends StObject {
    
    var end: js.UndefOr[Double] = js.undefined
    
    var start: js.UndefOr[Double] = js.undefined
    
    var step: js.UndefOr[Double] = js.undefined
  }
  object End {
    
    inline def apply(): End = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[End]
    }
    
    extension [Self <: End](x: Self) {
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    }
  }
  
  trait MaxBufferSize extends StObject {
    
    var autoStart: js.UndefOr[Boolean] = js.undefined
    
    var maxBufferSize: js.UndefOr[Double] = js.undefined
  }
  object MaxBufferSize {
    
    inline def apply(): MaxBufferSize = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MaxBufferSize]
    }
    
    extension [Self <: MaxBufferSize](x: Self) {
      
      inline def setAutoStart(value: Boolean): Self = StObject.set(x, "autoStart", value.asInstanceOf[js.Any])
      
      inline def setAutoStartUndefined: Self = StObject.set(x, "autoStart", js.undefined)
      
      inline def setMaxBufferSize(value: Double): Self = StObject.set(x, "maxBufferSize", value.asInstanceOf[js.Any])
      
      inline def setMaxBufferSizeUndefined: Self = StObject.set(x, "maxBufferSize", js.undefined)
    }
  }
}
