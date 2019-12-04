package typings.atAngularCompiler

import typings.atAngularCompiler.srcI18nI18nUnderscoreAstMod.Message
import typings.atAngularCompiler.srcI18nI18nUnderscoreAstMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/i18n/digest", JSImport.Namespace)
@js.native
object srcI18nDigestMod extends js.Object {
  def computeMsgId(msg: String, meaning: String): String = js.native
  def decimalDigest(message: Message): String = js.native
  def digest(message: Message): String = js.native
  def fingerprint(str: String): js.Tuple2[Double, Double] = js.native
  def serializeNodes(nodes: js.Array[Node]): js.Array[String] = js.native
  def sha1(str: String): String = js.native
}

