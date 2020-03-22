package typings.aceBuilds.mod.Ace

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tokenizer extends js.Object {
  def createSplitterRegexp(src: String): RegExp = js.native
  def createSplitterRegexp(src: String, flag: String): RegExp = js.native
  def getLineTokens(line: String, startState: String): js.Array[Token] = js.native
  def getLineTokens(line: String, startState: js.Array[String]): js.Array[Token] = js.native
  def removeCapturingGroups(src: String): String = js.native
}

