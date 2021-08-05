package typings.apolloEnv

import typings.node.cryptoMod.Hash
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createHashMod {
  
  @JSImport("apollo-env/lib/utils/createHash", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createHash(kind: String): Hash = ^.asInstanceOf[js.Dynamic].applyDynamic("createHash")(kind.asInstanceOf[js.Any]).asInstanceOf[Hash]
}
