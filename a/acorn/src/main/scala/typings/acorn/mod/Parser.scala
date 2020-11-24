package typings.acorn.mod

import typings.acorn.anon.Call
import typings.acorn.anon.TypeofParser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("acorn", "Parser")
@js.native
class Parser protected () extends js.Object {
  def this(options: Options, input: String) = this()
  def this(options: Options, input: String, startPos: Double) = this()
  
  def parse(): Node = js.native
}
/* static members */
@JSImport("acorn", "Parser")
@js.native
object Parser extends js.Object {
  
  def extend(plugins: (js.Function1[/* BaseParser */ TypeofParser, TypeofParser])*): TypeofParser = js.native
  
  def parse(input: String): Node = js.native
  def parse(input: String, options: Options): Node = js.native
  
  def parseExpressionAt(input: String, pos: Double): Node = js.native
  def parseExpressionAt(input: String, pos: Double, options: Options): Node = js.native
  
  def tokenizer(input: String): Call = js.native
  def tokenizer(input: String, options: Options): Call = js.native
}
