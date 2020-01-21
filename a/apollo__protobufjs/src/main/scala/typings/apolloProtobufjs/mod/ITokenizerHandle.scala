package typings.apolloProtobufjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITokenizerHandle extends js.Object {
  /** Gets the comment on the previous line or the line comment on the specified line, if any */
  @JSName("cmnt")
  var cmnt_Original: TokenizerHandleCmnt = js.native
  /** Current line number */
  var line: Double = js.native
  /** Gets the next token and advances (`null` on eof) */
  @JSName("next")
  var next_Original: TokenizerHandleNext = js.native
  /** Peeks for the next token (`null` on eof) */
  @JSName("peek")
  var peek_Original: TokenizerHandlePeek = js.native
  /** Pushes a token back to the stack */
  @JSName("push")
  var push_Original: TokenizerHandlePush = js.native
  /** Skips a token, returns its presence and advances or, if non-optional and not present, throws */
  @JSName("skip")
  var skip_Original: TokenizerHandleSkip = js.native
  /** Gets the comment on the previous line or the line comment on the specified line, if any */
  def cmnt(): String | Null = js.native
  def cmnt(line: Double): String | Null = js.native
  /** Gets the next token and advances (`null` on eof) */
  def next(): String | Null = js.native
  /** Peeks for the next token (`null` on eof) */
  def peek(): String | Null = js.native
  /** Pushes a token back to the stack */
  def push(token: String): Unit = js.native
  /** Skips a token, returns its presence and advances or, if non-optional and not present, throws */
  def skip(expected: String): Boolean = js.native
  def skip(expected: String, optional: Boolean): Boolean = js.native
}

