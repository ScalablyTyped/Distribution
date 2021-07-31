package typings.angularCompiler

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formattedErrorMod {
  
  @JSImport("@angular/compiler/src/aot/formatted_error", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def formattedError(chain: FormattedMessageChain): FormattedError_ = ^.asInstanceOf[js.Dynamic].applyDynamic("formattedError")(chain.asInstanceOf[js.Any]).asInstanceOf[FormattedError_]
  
  @scala.inline
  def isFormattedError(error: Error): /* is @angular/compiler.@angular/compiler/src/aot/formatted_error.FormattedError */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFormattedError")(error.asInstanceOf[js.Any]).asInstanceOf[/* is @angular/compiler.@angular/compiler/src/aot/formatted_error.FormattedError */ Boolean]
  
  trait FormattedError_
    extends StObject
       with Error {
    
    var chain: FormattedMessageChain
    
    var position: js.UndefOr[Position] = js.undefined
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
      def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    }
  }
  
  trait FormattedMessageChain extends StObject {
    
    var message: String
    
    var next: js.UndefOr[js.Array[FormattedMessageChain]] = js.undefined
    
    var position: js.UndefOr[Position] = js.undefined
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
  
  trait Position extends StObject {
    
    var column: Double
    
    var fileName: String
    
    var line: Double
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
