package typings.aceBuilds.mod.Ace

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tokenizer extends StObject {
  
  def createSplitterRegexp(src: String): js.RegExp = js.native
  def createSplitterRegexp(src: String, flag: String): js.RegExp = js.native
  
  def getLineTokens(line: String, startState: String): js.Array[Token] = js.native
  def getLineTokens(line: String, startState: js.Array[String]): js.Array[Token] = js.native
  
  def removeCapturingGroups(src: String): String = js.native
}
