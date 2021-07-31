package typings.awsCryptoSha256Browser

import typings.awsSdkTypes.cryptoMod.SourceData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isEmptyDataMod {
  
  @JSImport("@aws-crypto/sha256-browser/build/isEmptyData", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def isEmptyData(data: SourceData): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmptyData")(data.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
