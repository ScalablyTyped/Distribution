package typings.apolloDashEnv

import typings.node.cryptoMod.Hash
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-env/lib/utils", JSImport.Namespace)
@js.native
object libUtilsMod extends js.Object {
  val isNodeLike: Boolean = js.native
  def createHash(kind: String): Hash = js.native
  def isNotNullOrUndefined[T](): /* is T */ Boolean = js.native
  def isNotNullOrUndefined[T](value: T): /* is T */ Boolean = js.native
  def mapValues[T, U](`object`: Record[String, T], callback: js.Function1[/* value */ T, U]): Record[String, U] = js.native
}

