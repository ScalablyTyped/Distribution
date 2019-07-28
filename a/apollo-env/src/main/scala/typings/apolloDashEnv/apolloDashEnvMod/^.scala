package typings.apolloDashEnv.apolloDashEnvMod

import typings.apolloDashEnv.libFetchFetchMod.RequestInfo
import typings.apolloDashEnv.libFetchFetchMod.RequestInit
import typings.node.cryptoMod.Hash
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-env", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val isNodeLike: Boolean = js.native
  def createHash(kind: String): Hash = js.native
  def fetch(): js.Promise[typings.apolloDashEnv.libFetchFetchMod.Response] = js.native
  def fetch(input: RequestInfo): js.Promise[typings.apolloDashEnv.libFetchFetchMod.Response] = js.native
  def fetch(input: RequestInfo, init: RequestInit): js.Promise[typings.apolloDashEnv.libFetchFetchMod.Response] = js.native
  def isNotNullOrUndefined[T](): /* is T */ Boolean = js.native
  def isNotNullOrUndefined[T](value: T): /* is T */ Boolean = js.native
  def mapValues[T, U](`object`: Record[String, T], callback: js.Function1[/* value */ T, U]): Record[String, U] = js.native
}

