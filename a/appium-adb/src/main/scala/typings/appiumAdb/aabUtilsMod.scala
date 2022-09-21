package typings.appiumAdb

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object aabUtilsMod extends Shortcut {
  
  @JSImport("appium-adb/lib/tools/aab-utils", JSImport.Default)
  @js.native
  val default: AabUtils = js.native
  
  @js.native
  trait AabUtils extends StObject {
    
    /**
      * Builds a universal .apk from the given .aab package. See
      * https://developer.android.com/studio/command-line/bundletool#generate_apks
      * for more details.
      *
      * @param aabPath Full path to the source .aab package
      * @returns The path to the resulting universal .apk. The .apk is stored in the internal cache
      * by default.
      * @throws If there was an error while creating the universal .apk
      */
    def extractUniversalApk(aabPath: String): js.Promise[String] = js.native
    def extractUniversalApk(aabPath: String, opts: ApkCreationOptions): js.Promise[String] = js.native
  }
  
  trait ApkCreationOptions extends StObject {
    
    /**
      * Specifies the alias of the signing key you want to use.
      * It is mandatory to provide this value if `keystore` one is assigned
      * otherwise it is going to be ignored.
      */
    var keyAlias: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies the password for the signing key.
      * It is mandatory to provide this value if `keystore` one is assigned
      * otherwise it is going to be ignored.
      */
    var keyPassword: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies the path to the deployment keystore used
      * to sign the APKs. This flag is optional. If you don't include it,
      * bundletool attempts to sign your APKs with a debug signing key.
      * If the .apk has been already signed and cached then it is not going to be resigned
      * unless a different keystore or key alias is used.
      */
    var keystore: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies your keystore’s password.
      * It is mandatory to provide this value if `keystore` one is assigned
      * otherwise it is going to be ignored.
      */
    var keystorePassword: js.UndefOr[Boolean] = js.undefined
  }
  object ApkCreationOptions {
    
    inline def apply(): ApkCreationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ApkCreationOptions]
    }
    
    extension [Self <: ApkCreationOptions](x: Self) {
      
      inline def setKeyAlias(value: Boolean): Self = StObject.set(x, "keyAlias", value.asInstanceOf[js.Any])
      
      inline def setKeyAliasUndefined: Self = StObject.set(x, "keyAlias", js.undefined)
      
      inline def setKeyPassword(value: Boolean): Self = StObject.set(x, "keyPassword", value.asInstanceOf[js.Any])
      
      inline def setKeyPasswordUndefined: Self = StObject.set(x, "keyPassword", js.undefined)
      
      inline def setKeystore(value: Boolean): Self = StObject.set(x, "keystore", value.asInstanceOf[js.Any])
      
      inline def setKeystorePassword(value: Boolean): Self = StObject.set(x, "keystorePassword", value.asInstanceOf[js.Any])
      
      inline def setKeystorePasswordUndefined: Self = StObject.set(x, "keystorePassword", js.undefined)
      
      inline def setKeystoreUndefined: Self = StObject.set(x, "keystore", js.undefined)
    }
  }
  
  type _To = AabUtils
  
  /* This means you don't have to write `default`, but can instead just say `aabUtilsMod.foo` */
  override def _to: AabUtils = default
}
