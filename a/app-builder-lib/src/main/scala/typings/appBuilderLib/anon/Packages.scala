package typings.appBuilderLib.anon

import org.scalablytyped.runtime.StringDictionary
import typings.builderUtilRuntime.updateInfoMod.PackageFileInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Packages extends js.Object {
  var packages: StringDictionary[PackageFileInfo]
}

object Packages {
  @scala.inline
  def apply(packages: StringDictionary[PackageFileInfo]): Packages = {
    val __obj = js.Dynamic.literal(packages = packages.asInstanceOf[js.Any])
    __obj.asInstanceOf[Packages]
  }
}

