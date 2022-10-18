package typings.authmosphere

import typings.authmosphere.libSrcTypesLoggerMod.Logger
import typings.authmosphere.libSrcTypesTokenMod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSrcTypesGetTokenInfoMod {
  
  type GetTokenInfo[T] = js.Function3[
    /* tokenInfoUrl */ String, 
    /* accessToken */ String, 
    /* logger */ js.UndefOr[Logger], 
    js.Promise[Token[T]]
  ]
}
