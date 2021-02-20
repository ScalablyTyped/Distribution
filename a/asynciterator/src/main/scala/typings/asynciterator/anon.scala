package typings.asynciterator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait AutoStart extends StObject {
    
    var autoStart: js.UndefOr[Boolean] = js.native
  }
  object AutoStart {
    
    @scala.inline
    def apply(): AutoStart = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutoStart]
    }
    
    @scala.inline
    implicit class AutoStartMutableBuilder[Self <: AutoStart] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoStart(value: Boolean): Self = StObject.set(x, "autoStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoStartUndefined: Self = StObject.set(x, "autoStart", js.undefined)
    }
  }
  
  @js.native
  trait End extends StObject {
    
    var end: js.UndefOr[Double] = js.native
    
    var start: js.UndefOr[Double] = js.native
    
    var step: js.UndefOr[Double] = js.native
  }
  object End {
    
    @scala.inline
    def apply(): End = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[End]
    }
    
    @scala.inline
    implicit class EndMutableBuilder[Self <: End] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      @scala.inline
      def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    }
  }
  
  @js.native
  trait MaxBufferSize extends StObject {
    
    var autoStart: js.UndefOr[Boolean] = js.native
    
    var maxBufferSize: js.UndefOr[Double] = js.native
  }
  object MaxBufferSize {
    
    @scala.inline
    def apply(): MaxBufferSize = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MaxBufferSize]
    }
    
    @scala.inline
    implicit class MaxBufferSizeMutableBuilder[Self <: MaxBufferSize] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoStart(value: Boolean): Self = StObject.set(x, "autoStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoStartUndefined: Self = StObject.set(x, "autoStart", js.undefined)
      
      @scala.inline
      def setMaxBufferSize(value: Double): Self = StObject.set(x, "maxBufferSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxBufferSizeUndefined: Self = StObject.set(x, "maxBufferSize", js.undefined)
    }
  }
}
