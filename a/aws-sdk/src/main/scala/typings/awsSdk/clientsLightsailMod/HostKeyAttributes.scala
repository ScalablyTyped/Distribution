package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HostKeyAttributes extends StObject {
  
  /**
    * The SSH host key algorithm or the RDP certificate format. For SSH host keys, the algorithm may be ssh-rsa, ecdsa-sha2-nistp256, ssh-ed25519, etc. For RDP certificates, the algorithm is always x509-cert.
    */
  var algorithm: js.UndefOr[String] = js.undefined
  
  /**
    * The SHA-1 fingerprint of the returned SSH host key or RDP certificate.   Example of an SHA-1 SSH fingerprint:  SHA1:1CHH6FaAaXjtFOsR/t83vf91SR0    Example of an SHA-1 RDP fingerprint:  af:34:51:fe:09:f0:e0:da:b8:4e:56:ca:60:c2:10:ff:38:06:db:45   
    */
  var fingerprintSHA1: js.UndefOr[String] = js.undefined
  
  /**
    * The SHA-256 fingerprint of the returned SSH host key or RDP certificate.   Example of an SHA-256 SSH fingerprint:  SHA256:KTsMnRBh1IhD17HpdfsbzeGA4jOijm5tyXsMjKVbB8o    Example of an SHA-256 RDP fingerprint:  03:9b:36:9f:4b:de:4e:61:70:fc:7c:c9:78:e7:d2:1a:1c:25:a8:0c:91:f6:7c:e4:d6:a0:85:c8:b4:53:99:68   
    */
  var fingerprintSHA256: js.UndefOr[String] = js.undefined
  
  /**
    * The returned RDP certificate is not valid after this point in time. This value is listed only for RDP certificates.
    */
  var notValidAfter: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The returned RDP certificate is valid after this point in time. This value is listed only for RDP certificates.
    */
  var notValidBefore: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The public SSH host key or the RDP certificate.
    */
  var publicKey: js.UndefOr[String] = js.undefined
  
  /**
    * The time that the SSH host key or RDP certificate was recorded by Lightsail.
    */
  var witnessedAt: js.UndefOr[js.Date] = js.undefined
}
object HostKeyAttributes {
  
  inline def apply(): HostKeyAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HostKeyAttributes]
  }
  
  extension [Self <: HostKeyAttributes](x: Self) {
    
    inline def setAlgorithm(value: String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    inline def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
    
    inline def setFingerprintSHA1(value: String): Self = StObject.set(x, "fingerprintSHA1", value.asInstanceOf[js.Any])
    
    inline def setFingerprintSHA1Undefined: Self = StObject.set(x, "fingerprintSHA1", js.undefined)
    
    inline def setFingerprintSHA256(value: String): Self = StObject.set(x, "fingerprintSHA256", value.asInstanceOf[js.Any])
    
    inline def setFingerprintSHA256Undefined: Self = StObject.set(x, "fingerprintSHA256", js.undefined)
    
    inline def setNotValidAfter(value: js.Date): Self = StObject.set(x, "notValidAfter", value.asInstanceOf[js.Any])
    
    inline def setNotValidAfterUndefined: Self = StObject.set(x, "notValidAfter", js.undefined)
    
    inline def setNotValidBefore(value: js.Date): Self = StObject.set(x, "notValidBefore", value.asInstanceOf[js.Any])
    
    inline def setNotValidBeforeUndefined: Self = StObject.set(x, "notValidBefore", js.undefined)
    
    inline def setPublicKey(value: String): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
    
    inline def setPublicKeyUndefined: Self = StObject.set(x, "publicKey", js.undefined)
    
    inline def setWitnessedAt(value: js.Date): Self = StObject.set(x, "witnessedAt", value.asInstanceOf[js.Any])
    
    inline def setWitnessedAtUndefined: Self = StObject.set(x, "witnessedAt", js.undefined)
  }
}
