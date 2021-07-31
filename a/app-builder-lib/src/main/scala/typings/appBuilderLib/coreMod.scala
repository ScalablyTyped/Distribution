package typings.appBuilderLib

import typings.appBuilderLib.snapStorePublisherMod.SnapStoreOptions
import typings.builderUtil.archMod.Arch
import typings.builderUtil.archMod.ArchType
import typings.builderUtilRuntime.publishOptionsMod.AllPublishOptions
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreMod {
  
  @JSImport("app-builder-lib/out/core", "DEFAULT_TARGET")
  @js.native
  val DEFAULT_TARGET: /* "default" */ String = js.native
  
  @JSImport("app-builder-lib/out/core", "DIR_TARGET")
  @js.native
  val DIR_TARGET: /* "dir" */ String = js.native
  
  @JSImport("app-builder-lib/out/core", "Platform")
  @js.native
  class Platform protected () extends StObject {
    def this(
      name: String,
      buildConfigurationKey: String,
      nodeName: typings.node.processMod.global.NodeJS.Platform
    ) = this()
    
    var buildConfigurationKey: String = js.native
    
    def createTarget(`type`: String, archs: Arch*): Map[Platform, Map[Arch, js.Array[String]]] = js.native
    def createTarget(`type`: js.Array[String], archs: Arch*): Map[Platform, Map[Arch, js.Array[String]]] = js.native
    def createTarget(`type`: Null, archs: Arch*): Map[Platform, Map[Arch, js.Array[String]]] = js.native
    def createTarget(`type`: Unit, archs: Arch*): Map[Platform, Map[Arch, js.Array[String]]] = js.native
    
    var name: String = js.native
    
    var nodeName: typings.node.processMod.global.NodeJS.Platform = js.native
  }
  /* static members */
  object Platform {
    
    @JSImport("app-builder-lib/out/core", "Platform")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("app-builder-lib/out/core", "Platform.LINUX")
    @js.native
    def LINUX: Platform = js.native
    @scala.inline
    def LINUX_=(x: Platform): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LINUX")(x.asInstanceOf[js.Any])
    
    @JSImport("app-builder-lib/out/core", "Platform.MAC")
    @js.native
    def MAC: Platform = js.native
    @scala.inline
    def MAC_=(x: Platform): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAC")(x.asInstanceOf[js.Any])
    
    @JSImport("app-builder-lib/out/core", "Platform.WINDOWS")
    @js.native
    def WINDOWS: Platform = js.native
    @scala.inline
    def WINDOWS_=(x: Platform): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WINDOWS")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def current(): Platform = ^.asInstanceOf[js.Dynamic].applyDynamic("current")().asInstanceOf[Platform]
    
    @scala.inline
    def fromString(name: String): Platform = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(name.asInstanceOf[js.Any]).asInstanceOf[Platform]
  }
  
  @JSImport("app-builder-lib/out/core", "Target")
  @js.native
  abstract class Target protected () extends StObject {
    protected def this(name: String) = this()
    protected def this(name: String, isAsyncSupported: Boolean) = this()
    
    def build(appOutDir: String, arch: Arch): js.Promise[js.Any] = js.native
    
    def checkOptions(): js.Promise[js.Any] = js.native
    
    def finishBuild(): js.Promise[js.Any] = js.native
    
    val isAsyncSupported: Boolean = js.native
    
    val name: String = js.native
    
    val options: js.UndefOr[TargetSpecificOptions | Null] = js.native
    
    val outDir: String = js.native
  }
  
  trait BeforeBuildContext extends StObject {
    
    val appDir: String
    
    val arch: String
    
    val electronVersion: String
    
    val platform: Platform
  }
  object BeforeBuildContext {
    
    @scala.inline
    def apply(appDir: String, arch: String, electronVersion: String, platform: Platform): BeforeBuildContext = {
      val __obj = js.Dynamic.literal(appDir = appDir.asInstanceOf[js.Any], arch = arch.asInstanceOf[js.Any], electronVersion = electronVersion.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any])
      __obj.asInstanceOf[BeforeBuildContext]
    }
    
    @scala.inline
    implicit class BeforeBuildContextMutableBuilder[Self <: BeforeBuildContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppDir(value: String): Self = StObject.set(x, "appDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArch(value: String): Self = StObject.set(x, "arch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElectronVersion(value: String): Self = StObject.set(x, "electronVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlatform(value: Platform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.appBuilderLib.appBuilderLibStrings.store
    - typings.appBuilderLib.appBuilderLibStrings.normal
    - typings.appBuilderLib.appBuilderLibStrings.maximum
  */
  trait CompressionLevel extends StObject
  object CompressionLevel {
    
    @scala.inline
    def maximum: typings.appBuilderLib.appBuilderLibStrings.maximum = "maximum".asInstanceOf[typings.appBuilderLib.appBuilderLibStrings.maximum]
    
    @scala.inline
    def normal: typings.appBuilderLib.appBuilderLibStrings.normal = "normal".asInstanceOf[typings.appBuilderLib.appBuilderLibStrings.normal]
    
    @scala.inline
    def store: typings.appBuilderLib.appBuilderLibStrings.store = "store".asInstanceOf[typings.appBuilderLib.appBuilderLibStrings.store]
  }
  
  type Publish = AllPublishOptions | SnapStoreOptions | (js.Array[AllPublishOptions | SnapStoreOptions]) | Null
  
  trait SourceRepositoryInfo extends StObject {
    
    var domain: js.UndefOr[String] = js.undefined
    
    var project: String
    
    var `type`: js.UndefOr[String] = js.undefined
    
    var user: String
  }
  object SourceRepositoryInfo {
    
    @scala.inline
    def apply(project: String, user: String): SourceRepositoryInfo = {
      val __obj = js.Dynamic.literal(project = project.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[SourceRepositoryInfo]
    }
    
    @scala.inline
    implicit class SourceRepositoryInfoMutableBuilder[Self <: SourceRepositoryInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      @scala.inline
      def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
  
  type TargetConfigType = (js.Array[String | TargetConfiguration]) | String | TargetConfiguration | Null
  
  trait TargetConfiguration extends StObject {
    
    /**
      * The arch or list of archs.
      */
    val arch: js.UndefOr[js.Array[ArchType] | ArchType] = js.undefined
    
    /**
      * The target name. e.g. `snap`.
      */
    val target: String
  }
  object TargetConfiguration {
    
    @scala.inline
    def apply(target: String): TargetConfiguration = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[TargetConfiguration]
    }
    
    @scala.inline
    implicit class TargetConfigurationMutableBuilder[Self <: TargetConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArch(value: js.Array[ArchType] | ArchType): Self = StObject.set(x, "arch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArchUndefined: Self = StObject.set(x, "arch", js.undefined)
      
      @scala.inline
      def setArchVarargs(value: ArchType*): Self = StObject.set(x, "arch", js.Array(value :_*))
      
      @scala.inline
      def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  trait TargetSpecificOptions extends StObject {
    
    /**
      The [artifact file name template](/configuration/configuration#artifact-file-name-template).
      */
    val artifactName: js.UndefOr[String | Null] = js.undefined
    
    var publish: js.UndefOr[Publish] = js.undefined
  }
  object TargetSpecificOptions {
    
    @scala.inline
    def apply(): TargetSpecificOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TargetSpecificOptions]
    }
    
    @scala.inline
    implicit class TargetSpecificOptionsMutableBuilder[Self <: TargetSpecificOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArtifactName(value: String): Self = StObject.set(x, "artifactName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArtifactNameNull: Self = StObject.set(x, "artifactName", null)
      
      @scala.inline
      def setArtifactNameUndefined: Self = StObject.set(x, "artifactName", js.undefined)
      
      @scala.inline
      def setPublish(value: Publish): Self = StObject.set(x, "publish", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublishNull: Self = StObject.set(x, "publish", null)
      
      @scala.inline
      def setPublishUndefined: Self = StObject.set(x, "publish", js.undefined)
      
      @scala.inline
      def setPublishVarargs(value: (AllPublishOptions | SnapStoreOptions)*): Self = StObject.set(x, "publish", js.Array(value :_*))
    }
  }
}
