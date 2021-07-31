package typings.apolloEnv

import typings.node.cryptoMod.Hash
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("apollo-env/lib/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createHash(kind: String): Hash = ^.asInstanceOf[js.Dynamic].applyDynamic("createHash")(kind.asInstanceOf[js.Any]).asInstanceOf[Hash]
  
  @JSImport("apollo-env/lib/utils", "isNodeLike")
  @js.native
  val isNodeLike: Boolean = js.native
  
  @scala.inline
  def isNotNullOrUndefined[T](): /* is T */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNotNullOrUndefined")().asInstanceOf[/* is T */ Boolean]
  @scala.inline
  def isNotNullOrUndefined[T](value: T): /* is T */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNotNullOrUndefined")(value.asInstanceOf[js.Any]).asInstanceOf[/* is T */ Boolean]
  
  @scala.inline
  def mapValues[T, U](`object`: Record[String, T], callback: js.Function1[/* value */ T, U]): Record[String, U] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapValues")(`object`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Record[String, U]]
}
