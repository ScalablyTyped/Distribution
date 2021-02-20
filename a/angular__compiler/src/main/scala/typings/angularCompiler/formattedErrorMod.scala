package typings.angularCompiler

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formattedErrorMod {
  
  @JSImport("@angular/compiler/src/aot/formatted_error", "formattedError")
  @js.native
  def formattedError(chain: FormattedMessageChain): FormattedError_ = js.native
  
  @JSImport("@angular/compiler/src/aot/formatted_error", "isFormattedError")
  @js.native
  def isFormattedError(error: Error): /* is @angular/compiler.@angular/compiler/src/aot/formatted_error.FormattedError */ Boolean = js.native
  
  /* Inlined std.Error & {  chain :@angular/compiler.@angular/compiler/src/aot/formatted_error.FormattedMessageChain,   position :@angular/compiler.@angular/compiler/src/aot/formatted_error.Position | undefined} */
  @js.native
  trait FormattedError_ extends StObject {
    
    var chain: FormattedMessageChain = js.native
    
    var message: String = js.native
    
    var name: String = js.native
    
    var position: js.UndefOr[Position] = js.native
    
    var stack: js.UndefOr[String] = js.native
  }
  object FormattedError_ {
    
    @scala.inline
    def apply(chain: FormattedMessageChain, message: String, name: String): FormattedError_ = {
      val __obj = js.Dynamic.literal(chain = chain.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormattedError_]
    }
    
    @scala.inline
    implicit class FormattedError_MutableBuilder[Self <: FormattedError_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChain(value: FormattedMessageChain): Self = StObject.set(x, "chain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    }
  }
  
  @js.native
  trait FormattedMessageChain extends StObject {
    
    var message: String = js.native
    
    var next: js.UndefOr[js.Array[FormattedMessageChain]] = js.native
    
    var position: js.UndefOr[Position] = js.native
  }
  object FormattedMessageChain {
    
    @scala.inline
    def apply(message: String): FormattedMessageChain = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormattedMessageChain]
    }
    
    @scala.inline
    implicit class FormattedMessageChainMutableBuilder[Self <: FormattedMessageChain] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNext(value: js.Array[FormattedMessageChain]): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
      
      @scala.inline
      def setNextVarargs(value: FormattedMessageChain*): Self = StObject.set(x, "next", js.Array(value :_*))
      
      @scala.inline
      def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    }
  }
  
  @js.native
  trait Position extends StObject {
    
    var column: Double = js.native
    
    var fileName: String = js.native
    
    var line: Double = js.native
  }
  object Position {
    
    @scala.inline
    def apply(column: Double, fileName: String, line: Double): Position = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
      __obj.asInstanceOf[Position]
    }
    
    @scala.inline
    implicit class PositionMutableBuilder[Self <: Position] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    }
  }
}
