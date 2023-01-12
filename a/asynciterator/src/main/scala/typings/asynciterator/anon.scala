package typings.asynciterator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AutoStart extends StObject {
    
    var autoStart: js.UndefOr[Boolean] = js.undefined
    
    var preserve: js.UndefOr[Boolean] = js.undefined
  }
  object AutoStart {
    
    inline def apply(): AutoStart = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutoStart]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AutoStart] (val x: Self) extends AnyVal {
      
      inline def setAutoStart(value: Boolean): Self = StObject.set(x, "autoStart", value.asInstanceOf[js.Any])
      
      inline def setAutoStartUndefined: Self = StObject.set(x, "autoStart", js.undefined)
      
      inline def setPreserve(value: Boolean): Self = StObject.set(x, "preserve", value.asInstanceOf[js.Any])
      
      inline def setPreserveUndefined: Self = StObject.set(x, "preserve", js.undefined)
    }
  }
  
  /* Inlined asynciterator.asynciterator.BufferedIteratorOptions & {  destroySources :boolean | undefined} */
  trait BufferedIteratorOptionsde extends StObject {
    
    var autoStart: js.UndefOr[Boolean] = js.undefined
    
    var destroySources: js.UndefOr[Boolean] = js.undefined
    
    var maxBufferSize: js.UndefOr[Double] = js.undefined
  }
  object BufferedIteratorOptionsde {
    
    inline def apply(): BufferedIteratorOptionsde = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BufferedIteratorOptionsde]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BufferedIteratorOptionsde] (val x: Self) extends AnyVal {
      
      inline def setAutoStart(value: Boolean): Self = StObject.set(x, "autoStart", value.asInstanceOf[js.Any])
      
      inline def setAutoStartUndefined: Self = StObject.set(x, "autoStart", js.undefined)
      
      inline def setDestroySources(value: Boolean): Self = StObject.set(x, "destroySources", value.asInstanceOf[js.Any])
      
      inline def setDestroySourcesUndefined: Self = StObject.set(x, "destroySources", js.undefined)
      
      inline def setMaxBufferSize(value: Double): Self = StObject.set(x, "maxBufferSize", value.asInstanceOf[js.Any])
      
      inline def setMaxBufferSizeUndefined: Self = StObject.set(x, "maxBufferSize", js.undefined)
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: End] (val x: Self) extends AnyVal {
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    }
  }
  
  trait Limit extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
  }
  object Limit {
    
    inline def apply(): Limit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Limit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Limit] (val x: Self) extends AnyVal {
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    }
  }
}
