package typings.appiumAdb

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apkSigningMod extends Shortcut {
  
  @JSImport("appium-adb/lib/tools/apk-signing", JSImport.Default)
  @js.native
  val default: ApkSigning = js.native
  
  @js.native
  trait ApkSigning extends StObject {
    
    /**
      * Check if the app is already signed with the default Appium certificate.
      *
      * @param appPath - The full path to the local .apk(s) file.
      * @param pgk - The name of application package.
      * @return True if given application is already signed.
      */
    def checkApkCert(appPath: String, pkg: String): js.Promise[Boolean] = js.native
    def checkApkCert(appPath: String, pkg: String, opts: CertCheckOptions): js.Promise[Boolean] = js.native
    
    /**
      * Execute apksigner utility with given arguments.
      *
      * @param args - The list of tool arguments.
      * @return - Command stdout
      * @throws If apksigner binary is not present on the local file system
      *                 or the return code is not equal to zero.
      */
    def executeApksigner(): js.Promise[String] = js.native
    def executeApksigner(args: js.Array[String]): js.Promise[String] = js.native
    
    /**
      * Retrieve the the hash of the given keystore.
      *
      * @throws If getting keystore hash fails.
      */
    def getKeystoreHash(keytool: String, md5re: js.RegExp): js.Promise[KeystoreHash] = js.native
    
    /**
      * (Re)sign the given apk file on the local file system with either
      * custom or default certificate based on _this.useKeystore_ property value
      * and Zip-aligns it after signing.
      *
      * @param appPath - The full path to the local .apk(s) file.
      * @throws If signing fails.
      */
    def sign(appPath: String): js.Promise[Unit] = js.native
    
    /**
      * (Re)sign the given apk file on the local file system with a custom certificate.
      *
      * @param apk - The full path to the local apk file.
      * @throws If signing fails.
      */
    def signWithCustomCert(apk: String): js.Promise[Unit] = js.native
    
    /**
      * (Re)sign the given apk file on the local file system with the default certificate.
      *
      * @param apk - The full path to the local apk file.
      * @throws If signing fails.
      */
    def signWithDefaultCert(apk: String): js.Promise[Unit] = js.native
    
    /**
      * Perform zip-aligning to the given local apk file.
      *
      * @param apk - The full path to the local apk file.
      * @returns True if the apk has been successfully aligned
      * or false if the apk has been already aligned.
      * @throws If zip-align fails.
      */
    def zipAlignApk(apk: String): js.Promise[Boolean] = js.native
  }
  
  trait CertCheckOptions extends StObject {
    
    /**
      * Whether to require that the destination APK
      * is signed with the default Appium certificate or any valid certificate. This option
      * only has effect if `useKeystore` property is unset.
      * @default true
      */
    var requireDefaultCert: js.UndefOr[Boolean] = js.undefined
  }
  object CertCheckOptions {
    
    inline def apply(): CertCheckOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CertCheckOptions]
    }
    
    extension [Self <: CertCheckOptions](x: Self) {
      
      inline def setRequireDefaultCert(value: Boolean): Self = StObject.set(x, "requireDefaultCert", value.asInstanceOf[js.Any])
      
      inline def setRequireDefaultCertUndefined: Self = StObject.set(x, "requireDefaultCert", js.undefined)
    }
  }
  
  trait KeystoreHash extends StObject {
    
    /**
      * the md5 hash value of the keystore
      */
    var md5: js.UndefOr[String] = js.undefined
    
    /**
      * the sha1 hash value of the keystore
      */
    var sha1: js.UndefOr[String] = js.undefined
    
    /**
      * the sha256 hash value of the keystore
      */
    var sha256: js.UndefOr[String] = js.undefined
    
    /**
      * the sha512 hash value of the keystore
      */
    var sha512: js.UndefOr[String] = js.undefined
  }
  object KeystoreHash {
    
    inline def apply(): KeystoreHash = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeystoreHash]
    }
    
    extension [Self <: KeystoreHash](x: Self) {
      
      inline def setMd5(value: String): Self = StObject.set(x, "md5", value.asInstanceOf[js.Any])
      
      inline def setMd5Undefined: Self = StObject.set(x, "md5", js.undefined)
      
      inline def setSha1(value: String): Self = StObject.set(x, "sha1", value.asInstanceOf[js.Any])
      
      inline def setSha1Undefined: Self = StObject.set(x, "sha1", js.undefined)
      
      inline def setSha256(value: String): Self = StObject.set(x, "sha256", value.asInstanceOf[js.Any])
      
      inline def setSha256Undefined: Self = StObject.set(x, "sha256", js.undefined)
      
      inline def setSha512(value: String): Self = StObject.set(x, "sha512", value.asInstanceOf[js.Any])
      
      inline def setSha512Undefined: Self = StObject.set(x, "sha512", js.undefined)
    }
  }
  
  type _To = ApkSigning
  
  /* This means you don't have to write `default`, but can instead just say `apkSigningMod.foo` */
  override def _to: ApkSigning = default
}
