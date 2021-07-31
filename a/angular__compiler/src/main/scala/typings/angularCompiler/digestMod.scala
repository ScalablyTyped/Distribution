package typings.angularCompiler

import typings.angularCompiler.i18nAstMod.Message
import typings.angularCompiler.i18nAstMod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object digestMod {
  
  @JSImport("@angular/compiler/src/i18n/digest", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def computeDecimalDigest(message: Message): String = ^.asInstanceOf[js.Dynamic].applyDynamic("computeDecimalDigest")(message.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def computeDigest(message: Message): String = ^.asInstanceOf[js.Dynamic].applyDynamic("computeDigest")(message.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def computeMsgId(msg: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("computeMsgId")(msg.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def computeMsgId(msg: String, meaning: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("computeMsgId")(msg.asInstanceOf[js.Any], meaning.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def decimalDigest(message: Message): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decimalDigest")(message.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def digest(message: Message): String = ^.asInstanceOf[js.Dynamic].applyDynamic("digest")(message.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def fingerprint(str: String): js.Tuple2[Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("fingerprint")(str.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[Double, Double]]
  
  @scala.inline
  def serializeNodes(nodes: js.Array[Node]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeNodes")(nodes.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  @scala.inline
  def sha1(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sha1")(str.asInstanceOf[js.Any]).asInstanceOf[String]
}
