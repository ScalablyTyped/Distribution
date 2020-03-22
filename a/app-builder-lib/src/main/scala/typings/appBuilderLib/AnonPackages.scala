package typings.appBuilderLib

import org.scalablytyped.runtime.StringDictionary
import typings.builderUtilRuntime.updateInfoMod.PackageFileInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPackages extends js.Object {
  var packages: StringDictionary[PackageFileInfo]
}

object AnonPackages {
  @scala.inline
  def apply(packages: StringDictionary[PackageFileInfo]): AnonPackages = {
    val __obj = js.Dynamic.literal(packages = packages.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPackages]
  }
}

