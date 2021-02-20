package typings.angularCompiler

import typings.angularCompiler.i18nAstMod.Message
import typings.angularCompiler.i18nAstMod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object digestMod {
  
  @JSImport("@angular/compiler/src/i18n/digest", "computeDecimalDigest")
  @js.native
  def computeDecimalDigest(message: Message): String = js.native
  
  @JSImport("@angular/compiler/src/i18n/digest", "computeDigest")
  @js.native
  def computeDigest(message: Message): String = js.native
  
  @JSImport("@angular/compiler/src/i18n/digest", "computeMsgId")
  @js.native
  def computeMsgId(msg: String): String = js.native
  @JSImport("@angular/compiler/src/i18n/digest", "computeMsgId")
  @js.native
  def computeMsgId(msg: String, meaning: String): String = js.native
  
  @JSImport("@angular/compiler/src/i18n/digest", "decimalDigest")
  @js.native
  def decimalDigest(message: Message): String = js.native
  
  @JSImport("@angular/compiler/src/i18n/digest", "digest")
  @js.native
  def digest(message: Message): String = js.native
  
  @JSImport("@angular/compiler/src/i18n/digest", "fingerprint")
  @js.native
  def fingerprint(str: String): js.Tuple2[Double, Double] = js.native
  
  @JSImport("@angular/compiler/src/i18n/digest", "serializeNodes")
  @js.native
  def serializeNodes(nodes: js.Array[Node]): js.Array[String] = js.native
  
  @JSImport("@angular/compiler/src/i18n/digest", "sha1")
  @js.native
  def sha1(str: String): String = js.native
}
