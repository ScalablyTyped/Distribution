package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScanFilePath extends StObject {
  
  /**
    * File name of the infected file.
    */
  var FileName: js.UndefOr[String] = js.undefined
  
  /**
    * The file path of the infected file.
    */
  var FilePath: js.UndefOr[String] = js.undefined
  
  /**
    * The hash value of the infected file.
    */
  var Hash: js.UndefOr[String] = js.undefined
  
  /**
    * EBS volume Arn details of the infected file.
    */
  var VolumeArn: js.UndefOr[String] = js.undefined
}
object ScanFilePath {
  
  inline def apply(): ScanFilePath = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScanFilePath]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScanFilePath] (val x: Self) extends AnyVal {
    
    inline def setFileName(value: String): Self = StObject.set(x, "FileName", value.asInstanceOf[js.Any])
    
    inline def setFileNameUndefined: Self = StObject.set(x, "FileName", js.undefined)
    
    inline def setFilePath(value: String): Self = StObject.set(x, "FilePath", value.asInstanceOf[js.Any])
    
    inline def setFilePathUndefined: Self = StObject.set(x, "FilePath", js.undefined)
    
    inline def setHash(value: String): Self = StObject.set(x, "Hash", value.asInstanceOf[js.Any])
    
    inline def setHashUndefined: Self = StObject.set(x, "Hash", js.undefined)
    
    inline def setVolumeArn(value: String): Self = StObject.set(x, "VolumeArn", value.asInstanceOf[js.Any])
    
    inline def setVolumeArnUndefined: Self = StObject.set(x, "VolumeArn", js.undefined)
  }
}
