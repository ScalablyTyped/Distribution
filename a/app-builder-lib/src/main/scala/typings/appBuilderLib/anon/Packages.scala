package typings.appBuilderLib.anon

import org.scalablytyped.runtime.StringDictionary
import typings.builderUtilRuntime.outUpdateInfoMod.PackageFileInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Packages extends StObject {
  
  var packages: StringDictionary[PackageFileInfo]
}
object Packages {
  
  inline def apply(packages: StringDictionary[PackageFileInfo]): Packages = {
    val __obj = js.Dynamic.literal(packages = packages.asInstanceOf[js.Any])
    __obj.asInstanceOf[Packages]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Packages] (val x: Self) extends AnyVal {
    
    inline def setPackages(value: StringDictionary[PackageFileInfo]): Self = StObject.set(x, "packages", value.asInstanceOf[js.Any])
  }
}
