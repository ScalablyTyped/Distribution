package typings.appBuilderLib

import org.scalablytyped.runtime.StringDictionary
import typings.appBuilderLib.linuxOptionsMod.LinuxTargetSpecificOptions
import typings.appBuilderLib.linuxPackagerMod.LinuxPackager
import typings.appBuilderLib.platformPackagerMod.IconInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linuxTargetHelperMod {
  
  @JSImport("app-builder-lib/out/targets/LinuxTargetHelper", "LinuxTargetHelper")
  @js.native
  open class LinuxTargetHelper protected () extends StObject {
    def this(packager: LinuxPackager) = this()
    
    def computeDesktopEntry(targetSpecificOptions: LinuxTargetSpecificOptions): js.Promise[String] = js.native
    def computeDesktopEntry(targetSpecificOptions: LinuxTargetSpecificOptions, exec: String): js.Promise[String] = js.native
    def computeDesktopEntry(targetSpecificOptions: LinuxTargetSpecificOptions, exec: String, extra: StringDictionary[String]): js.Promise[String] = js.native
    def computeDesktopEntry(targetSpecificOptions: LinuxTargetSpecificOptions, exec: Unit, extra: StringDictionary[String]): js.Promise[String] = js.native
    
    /* private */ var computeDesktopIcons: Any = js.native
    
    /* private */ var computeMimeTypeFiles: Any = js.native
    
    def getDescription(options: LinuxTargetSpecificOptions): String = js.native
    
    /* private */ val iconPromise: Any = js.native
    
    def icons: js.Promise[js.Array[IconInfo]] = js.native
    
    var maxIconPath: String | Null = js.native
    
    def mimeTypeFiles: js.Promise[String | Null] = js.native
    
    /* private */ val mimeTypeFilesPromise: Any = js.native
    
    /* private */ var packager: Any = js.native
    
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
    def writeDesktopEntry(
      targetSpecificOptions: LinuxTargetSpecificOptions,
      exec: String,
      destination: Unit,
      extra: StringDictionary[String]
    ): js.Promise[String] = js.native
    def writeDesktopEntry(targetSpecificOptions: LinuxTargetSpecificOptions, exec: Unit, destination: String): js.Promise[String] = js.native
    def writeDesktopEntry(
      targetSpecificOptions: LinuxTargetSpecificOptions,
      exec: Unit,
      destination: String,
      extra: StringDictionary[String]
    ): js.Promise[String] = js.native
    def writeDesktopEntry(
      targetSpecificOptions: LinuxTargetSpecificOptions,
      exec: Unit,
      destination: Null,
      extra: StringDictionary[String]
    ): js.Promise[String] = js.native
    def writeDesktopEntry(
      targetSpecificOptions: LinuxTargetSpecificOptions,
      exec: Unit,
      destination: Unit,
      extra: StringDictionary[String]
    ): js.Promise[String] = js.native
  }
  
  @JSImport("app-builder-lib/out/targets/LinuxTargetHelper", "installPrefix")
  @js.native
  val installPrefix: /* "/opt" */ String = js.native
}
