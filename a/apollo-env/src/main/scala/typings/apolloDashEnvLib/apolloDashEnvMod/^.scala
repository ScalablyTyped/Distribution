package typings
package apolloDashEnvLib.apolloDashEnvMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-env", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val isNodeLike: scala.Boolean = js.native
  def createHash(kind: java.lang.String): nodeLib.cryptoMod.Hash = js.native
  def fetch(): js.Promise[apolloDashEnvLib.libFetchFetchMod.Response] = js.native
  def fetch(input: apolloDashEnvLib.libFetchFetchMod.RequestInfo): js.Promise[apolloDashEnvLib.libFetchFetchMod.Response] = js.native
  def fetch(
    input: apolloDashEnvLib.libFetchFetchMod.RequestInfo,
    init: apolloDashEnvLib.libFetchFetchMod.RequestInit
  ): js.Promise[apolloDashEnvLib.libFetchFetchMod.Response] = js.native
  def isNotNullOrUndefined[T](): /* is T */ scala.Boolean = js.native
  def isNotNullOrUndefined[T](value: T): /* is T */ scala.Boolean = js.native
  def mapValues[T, U](`object`: stdLib.Record[java.lang.String, T], callback: js.Function1[/* value */ T, U]): stdLib.Record[java.lang.String, U] = js.native
}

