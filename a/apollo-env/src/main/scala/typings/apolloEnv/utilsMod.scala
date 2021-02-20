package typings.apolloEnv

import typings.node.cryptoMod.Hash
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("apollo-env/lib/utils", "createHash")
  @js.native
  def createHash(kind: String): Hash = js.native
  
  @JSImport("apollo-env/lib/utils", "isNodeLike")
  @js.native
  val isNodeLike: Boolean = js.native
  
  @JSImport("apollo-env/lib/utils", "isNotNullOrUndefined")
  @js.native
  def isNotNullOrUndefined[T](): /* is T */ Boolean = js.native
  @JSImport("apollo-env/lib/utils", "isNotNullOrUndefined")
  @js.native
  def isNotNullOrUndefined[T](value: T): /* is T */ Boolean = js.native
  
  @JSImport("apollo-env/lib/utils", "mapValues")
  @js.native
  def mapValues[T, U](`object`: Record[String, T], callback: js.Function1[/* value */ T, U]): Record[String, U] = js.native
}
