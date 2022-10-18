package typings.atlaskitTokens

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilsTokenIdsMod {
  
  @JSImport("@atlaskit/tokens/dist/types/utils/token-ids", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getCSSCustomProperty(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCSSCustomProperty")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getCSSCustomProperty(path: js.Array[String]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCSSCustomProperty")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getFullyQualifiedTokenId(path: js.Array[String]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFullyQualifiedTokenId")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getTokenId(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTokenId")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getTokenId(path: js.Array[String]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTokenId")(path.asInstanceOf[js.Any]).asInstanceOf[String]
}
