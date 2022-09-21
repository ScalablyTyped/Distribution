package typings.agAuth

import typings.jsonwebtoken.mod.Jwt
import typings.jsonwebtoken.mod.Secret
import typings.jsonwebtoken.mod.SignOptions
import typings.jsonwebtoken.mod.VerifyOptions
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ag-auth", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with AuthEngine
  
  @js.native
  trait AuthEngine extends StObject {
    
    def signToken(token: String, key: Secret): js.Promise[js.UndefOr[String]] = js.native
    def signToken(token: String, key: Secret, options: SignOptions): js.Promise[js.UndefOr[String]] = js.native
    def signToken(token: js.Object, key: Secret): js.Promise[js.UndefOr[String]] = js.native
    def signToken(token: js.Object, key: Secret, options: SignOptions): js.Promise[js.UndefOr[String]] = js.native
    def signToken(token: Buffer, key: Secret): js.Promise[js.UndefOr[String]] = js.native
    def signToken(token: Buffer, key: Secret, options: SignOptions): js.Promise[js.UndefOr[String]] = js.native
    
    def verifyToken(signedToken: String, key: Secret): js.Promise[Jwt] = js.native
    def verifyToken(signedToken: String, key: Secret, options: VerifyOptions): js.Promise[Jwt] = js.native
    def verifyToken(signedToken: Null, key: Secret): js.Promise[Jwt] = js.native
    def verifyToken(signedToken: Null, key: Secret, options: VerifyOptions): js.Promise[Jwt] = js.native
  }
}
