package typings.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImagePackage extends StObject {
  
  /**
    * The name of the package as reported to the operating system package manager.
    */
  var packageName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The version of the package as reported to the operating system package manager.
    */
  var packageVersion: js.UndefOr[NonEmptyString] = js.undefined
}
object ImagePackage {
  
  inline def apply(): ImagePackage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImagePackage]
  }
  
  extension [Self <: ImagePackage](x: Self) {
    
    inline def setPackageName(value: NonEmptyString): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
    
    inline def setPackageVersion(value: NonEmptyString): Self = StObject.set(x, "packageVersion", value.asInstanceOf[js.Any])
    
    inline def setPackageVersionUndefined: Self = StObject.set(x, "packageVersion", js.undefined)
  }
}
