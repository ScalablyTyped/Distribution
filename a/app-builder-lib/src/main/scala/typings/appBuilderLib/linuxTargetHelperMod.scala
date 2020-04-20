package typings.appBuilderLib

import org.scalablytyped.runtime.StringDictionary
import typings.appBuilderLib.appBuilderLibStrings.Slashopt
import typings.appBuilderLib.linuxOptionsMod.LinuxTargetSpecificOptions
import typings.appBuilderLib.linuxPackagerMod.LinuxPackager
import typings.appBuilderLib.platformPackagerMod.IconInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out/targets/LinuxTargetHelper", JSImport.Namespace)
@js.native
object linuxTargetHelperMod extends js.Object {
  @js.native
  class LinuxTargetHelper protected () extends js.Object {
    def this(packager: LinuxPackager) = this()
    var computeDesktopIcons: js.Any = js.native
    var computeMimeTypeFiles: js.Any = js.native
    val iconPromise: js.Any = js.native
    var maxIconPath: String | Null = js.native
    val mimeTypeFilesPromise: js.Any = js.native
    var packager: js.Any = js.native
    def computeDesktopEntry(targetSpecificOptions: LinuxTargetSpecificOptions): js.Promise[String] = js.native
    def computeDesktopEntry(targetSpecificOptions: LinuxTargetSpecificOptions, exec: String): js.Promise[String] = js.native
    def computeDesktopEntry(targetSpecificOptions: LinuxTargetSpecificOptions, exec: String, extra: StringDictionary[String]): js.Promise[String] = js.native
    def getDescription(options: LinuxTargetSpecificOptions): String = js.native
    def icons: js.Promise[js.Array[IconInfo]] = js.native
    def mimeTypeFiles: js.Promise[String | Null] = js.native
    def writeDesktopEntry(targetSpecificOptions: LinuxTargetSpecificOptions): js.Promise[String] = js.native
    def writeDesktopEntry(targetSpecificOptions: LinuxTargetSpecificOptions, exec: String): js.Promise[String] = js.native
    def writeDesktopEntry(targetSpecificOptions: LinuxTargetSpecificOptions, exec: String, destination: String): js.Promise[String] = js.native
    def writeDesktopEntry(
      targetSpecificOptions: LinuxTargetSpecificOptions,
      exec: String,
      destination: String,
      extra: StringDictionary[String]
    ): js.Promise[String] = js.native
    def writeDesktopEntry(
      targetSpecificOptions: LinuxTargetSpecificOptions,
      exec: String,
      destination: Null,
      extra: StringDictionary[String]
    ): js.Promise[String] = js.native
  }
  
  val installPrefix: Slashopt = js.native
}

