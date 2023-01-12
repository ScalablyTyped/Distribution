package typings.arconnect

import org.scalablytyped.runtime.StringDictionary
import typings.arconnect.mod.PermissionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Address extends StObject {
    
    var address: String
  }
  object Address {
    
    inline def apply(address: String): Address = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any])
      __obj.asInstanceOf[Address]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Address] (val x: Self) extends AnyVal {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    }
  }
  
  trait Algorithm extends StObject {
    
    var algorithm: String
    
    var hash: String
    
    var salt: js.UndefOr[String] = js.undefined
  }
  object Algorithm {
    
    inline def apply(algorithm: String, hash: String): Algorithm = {
      val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any])
      __obj.asInstanceOf[Algorithm]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Algorithm] (val x: Self) extends AnyVal {
      
      inline def setAlgorithm(value: String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setSalt(value: String): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
      
      inline def setSaltUndefined: Self = StObject.set(x, "salt", js.undefined)
    }
  }
  
  @js.native
  trait Connect extends StObject {
    
    def connect(permissions: js.Array[PermissionType]): js.Promise[Unit] = js.native
    
    def decrypt(data: js.typedarray.Uint8Array, options: Algorithm): js.Promise[String] = js.native
    
    def disconnect(): js.Promise[Unit] = js.native
    
    def encrypt(data: String, options: Algorithm): js.Promise[js.typedarray.Uint8Array] = js.native
    
    def getActiveAddress(): js.Promise[String] = js.native
    
    def getAllAddresses(): js.Promise[js.Array[String]] = js.native
    
    def getPermissions(): js.Promise[js.Array[PermissionType]] = js.native
    
    def getWalletNames(): js.Promise[StringDictionary[String]] = js.native
    
    def sign(
      transaction: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Transaction */ Any
    ): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Transaction */ Any
      ] = js.native
    def sign(
      transaction: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Transaction */ Any,
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SignatureOptions */ Any
    ): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Transaction */ Any
      ] = js.native
  }
}
