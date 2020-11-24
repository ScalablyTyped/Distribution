package typings.appBuilderLib

import org.scalablytyped.runtime.StringDictionary
import typings.appBuilderLib.linuxOptionsMod.LinuxTargetSpecificOptions
import typings.appBuilderLib.linuxPackagerMod.LinuxPackager
import typings.appBuilderLib.platformPackagerMod.IconInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("app-builder-lib/out/targets/LinuxTargetHelper", JSImport.Namespace)
@js.native
object linuxTargetHelperMod extends js.Object {
  
  val installPrefix: /* "/opt" */ String = js.native
  
  @js.native
  class LinuxTargetHelper protected () extends js.Object {
    def this(packager: LinuxPackager) = this()
    
    def computeDesktopEntry(targetSpecificOptions: LinuxTargetSpecificOptions): js.Promise[String] = js.native
    def computeDesktopEntry(
      targetSpecificOptions: LinuxTargetSpecificOptions,
      exec: js.UndefOr[scala.Nothing],
      extra: StringDictionary[String]
    ): js.Promise[String] = js.native
    def computeDesktopEntry(targetSpecificOptions: LinuxTargetSpecificOptions, exec: String): js.Promise[String] = js.native
    def computeDesktopEntry(targetSpecificOptions: LinuxTargetSpecificOptions, exec: String, extra: StringDictionary[String]): js.Promise[String] = js.native
    
    var computeDesktopIcons: js.Any = js.native
    
    var computeMimeTypeFiles: js.Any = js.native
    
    def getDescription(options: LinuxTargetSpecificOptions): String = js.native
    
    val iconPromise: js.Any = js.native
    
    def icons: js.Promise[js.Array[IconInfo]] = js.native
    
    var maxIconPath: String | Null = js.native
    
    def mimeTypeFiles: js.Promise[String | Null] = js.native
    
    val mimeTypeFilesPromise: js.Any = js.native
    
    var packager: js.Any = js.native
    
    def writeDesktopEntry(targetSpecificOptions: LinuxTargetSpecificOptions): js.Promise[String] = js.native
    def writeDesktopEntry(
      targetSpecificOptions: LinuxTargetSpecificOptions,
      exec: js.UndefOr[scala.Nothing],
      destination: js.UndefOr[scala.Nothing],
      extra: StringDictionary[String]
    ): js.Promise[String] = js.native
    def writeDesktopEntry(
      targetSpecificOptions: LinuxTargetSpecificOptions,
      exec: js.UndefOr[scala.Nothing],
      destination: String
    ): js.Promise[String] = js.native
    def writeDesktopEntry(
      targetSpecificOptions: LinuxTargetSpecificOptions,
      exec: js.UndefOr[scala.Nothing],
      destination: String,
      extra: StringDictionary[String]
    ): js.Promise[String] = js.native
    def writeDesktopEntry(
      targetSpecificOptions: LinuxTargetSpecificOptions,
      exec: js.UndefOr[scala.Nothing],
      destination: Null,
      extra: StringDictionary[String]
    ): js.Promise[String] = js.native
    def writeDesktopEntry(targetSpecificOptions: LinuxTargetSpecificOptions, exec: String): js.Promise[String] = js.native
    def writeDesktopEntry(
      targetSpecificOptions: LinuxTargetSpecificOptions,
      exec: String,
      destination: js.UndefOr[scala.Nothing],
      extra: StringDictionary[String]
    ): js.Promise[String] = js.native
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
}
