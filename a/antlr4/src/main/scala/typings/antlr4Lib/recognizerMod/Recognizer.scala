package typings
package antlr4Lib.recognizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antlr4/Recognizer", "Recognizer")
@js.native
class Recognizer () extends js.Object {
  var state: scala.Double = js.native
  def addErrorListener(listener: antlr4Lib.errorErrorListenerMod.ErrorListener): scala.Unit = js.native
  def checkVersion(toolVersion: scala.Double): scala.Unit = js.native
  def getErrorHeader(e: js.Any): java.lang.String = js.native
  def getErrorListenerDispatch(): antlr4Lib.errorErrorListenerMod.ProxyErrorListener = js.native
  def getRuleIndexMap(): js.Any = js.native
  def getTokenErrorDisplay(t: antlr4Lib.tokenMod.Token): java.lang.String = js.native
  def getTokenType(tokenName: java.lang.String): js.Any = js.native
  def getTokenTypeMap(): js.Any = js.native
  def precpred(localCtx: antlr4Lib.parserrulecontextMod.ParserRuleContext, precedence: js.Any): scala.Boolean = js.native
  def removeErrorListeners(): scala.Unit = js.native
  def sempred(
    localCtx: antlr4Lib.parserrulecontextMod.ParserRuleContext,
    ruleIndex: scala.Double,
    actionIndex: scala.Double
  ): scala.Boolean = js.native
}

