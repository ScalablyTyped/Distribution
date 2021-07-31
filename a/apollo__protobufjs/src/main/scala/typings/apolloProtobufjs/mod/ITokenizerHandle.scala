package typings.apolloProtobufjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITokenizerHandle extends StObject {
  
  /** Gets the comment on the previous line or the line comment on the specified line, if any */
  def cmnt(): String | Null
  def cmnt(line: Double): String | Null
  /** Gets the comment on the previous line or the line comment on the specified line, if any */
  @JSName("cmnt")
  var cmnt_Original: TokenizerHandleCmnt
  
  /** Current line number */
  var line: Double
  
  /** Gets the next token and advances (`null` on eof) */
  def next(): String | Null
  /** Gets the next token and advances (`null` on eof) */
  @JSName("next")
  var next_Original: TokenizerHandleNext
  
  /** Peeks for the next token (`null` on eof) */
  def peek(): String | Null
  /** Peeks for the next token (`null` on eof) */
  @JSName("peek")
  var peek_Original: TokenizerHandlePeek
  
  /** Pushes a token back to the stack */
  def push(token: String): Unit
  /** Pushes a token back to the stack */
  @JSName("push")
  var push_Original: TokenizerHandlePush
  
  /** Skips a token, returns its presence and advances or, if non-optional and not present, throws */
  def skip(expected: String): Boolean
  def skip(expected: String, optional: Boolean): Boolean
  /** Skips a token, returns its presence and advances or, if non-optional and not present, throws */
  @JSName("skip")
  var skip_Original: TokenizerHandleSkip
}
object ITokenizerHandle {
  
  @scala.inline
  def apply(
    cmnt: /* line */ js.UndefOr[Double] => String | Null,
    line: Double,
    next: () => String | Null,
    peek: () => String | Null,
    push: /* token */ String => Unit,
    skip: (/* expected */ String, /* optional */ js.UndefOr[Boolean]) => Boolean
  ): ITokenizerHandle = {
    val __obj = js.Dynamic.literal(cmnt = js.Any.fromFunction1(cmnt), line = line.asInstanceOf[js.Any], next = js.Any.fromFunction0(next), peek = js.Any.fromFunction0(peek), push = js.Any.fromFunction1(push), skip = js.Any.fromFunction2(skip))
    __obj.asInstanceOf[ITokenizerHandle]
  }
  
  @scala.inline
  implicit class ITokenizerHandleMutableBuilder[Self <: ITokenizerHandle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCmnt(value: /* line */ js.UndefOr[Double] => String | Null): Self = StObject.set(x, "cmnt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext(value: () => String | Null): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPeek(value: () => String | Null): Self = StObject.set(x, "peek", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPush(value: /* token */ String => Unit): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSkip(value: (/* expected */ String, /* optional */ js.UndefOr[Boolean]) => Boolean): Self = StObject.set(x, "skip", js.Any.fromFunction2(value))
  }
}
