package typings.angularDevkitCore

import typings.angularDevkitCore.anon.PRIVATEDEVKITPATHFRAGMENT
import typings.angularDevkitCore.srcExceptionMod.BaseException
import typings.angularDevkitCore.srcUtilsLiteralsMod.TemplateTag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcVirtualFsPathMod {
  
  @JSImport("@angular-devkit/core/src/virtual-fs/path", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular-devkit/core/src/virtual-fs/path", "InvalidPathException")
  @js.native
  open class InvalidPathException protected () extends BaseException {
    def this(path: String) = this()
  }
  
  @JSImport("@angular-devkit/core/src/virtual-fs/path", "NormalizedRoot")
  @js.native
  val NormalizedRoot: Path_ = js.native
  
  @JSImport("@angular-devkit/core/src/virtual-fs/path", "NormalizedSep")
  @js.native
  val NormalizedSep: Path_ = js.native
  
  @JSImport("@angular-devkit/core/src/virtual-fs/path", "PathCannotBeFragmentException")
  @js.native
  open class PathCannotBeFragmentException protected () extends BaseException {
    def this(path: String) = this()
  }
  
  @JSImport("@angular-devkit/core/src/virtual-fs/path", "PathMustBeAbsoluteException")
  @js.native
  open class PathMustBeAbsoluteException protected () extends BaseException {
    def this(path: String) = this()
  }
  
  inline def asPosixPath(path: Path_): PosixPath = ^.asInstanceOf[js.Dynamic].applyDynamic("asPosixPath")(path.asInstanceOf[js.Any]).asInstanceOf[PosixPath]
  
  inline def asWindowsPath(path: Path_): WindowsPath = ^.asInstanceOf[js.Dynamic].applyDynamic("asWindowsPath")(path.asInstanceOf[js.Any]).asInstanceOf[WindowsPath]
  
  inline def basename(path: Path_): PathFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("basename")(path.asInstanceOf[js.Any]).asInstanceOf[PathFragment]
  
  inline def dirname(path: Path_): Path_ = ^.asInstanceOf[js.Dynamic].applyDynamic("dirname")(path.asInstanceOf[js.Any]).asInstanceOf[Path_]
  
  inline def extname(path: Path_): String = ^.asInstanceOf[js.Dynamic].applyDynamic("extname")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def fragment(path: String): PathFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("fragment")(path.asInstanceOf[js.Any]).asInstanceOf[PathFragment]
  
  inline def getSystemPath(path: Path_): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSystemPath")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isAbsolute(p: Path_): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAbsolute")(p.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def join(p1: Path_, others: String*): Path_ = ^.asInstanceOf[js.Dynamic].applyDynamic("join")(scala.List(p1.asInstanceOf[js.Any]).`++`(others.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Path_]
  
  inline def noCacheNormalize(path: String): Path_ = ^.asInstanceOf[js.Dynamic].applyDynamic("noCacheNormalize")(path.asInstanceOf[js.Any]).asInstanceOf[Path_]
  
  inline def normalize(path: String): Path_ = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(path.asInstanceOf[js.Any]).asInstanceOf[Path_]
  
  @JSImport("@angular-devkit/core/src/virtual-fs/path", "path")
  @js.native
  val path: TemplateTag[Path_] = js.native
  
  inline def relative(from: Path_, to: Path_): Path_ = (^.asInstanceOf[js.Dynamic].applyDynamic("relative")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[Path_]
  
  inline def resetNormalizeCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetNormalizeCache")().asInstanceOf[Unit]
  
  inline def resolve(p1: Path_, p2: Path_): Path_ = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any])).asInstanceOf[Path_]
  
  inline def split(path: Path_): js.Array[PathFragment] = ^.asInstanceOf[js.Dynamic].applyDynamic("split")(path.asInstanceOf[js.Any]).asInstanceOf[js.Array[PathFragment]]
  
  type PathFragment = Path_ & PRIVATEDEVKITPATHFRAGMENT
  
  @js.native
  trait Path_
    extends StObject
       with typings.std.String {
    
    var __PRIVATE_DEVKIT_PATH: Unit = js.native
  }
  
  @js.native
  trait PosixPath
    extends StObject
       with typings.std.String {
    
    var __PRIVATE_DEVKIT_POSIX_PATH: Unit = js.native
  }
  
  @js.native
  trait WindowsPath
    extends StObject
       with typings.std.String {
    
    var __PRIVATE_DEVKIT_WINDOWS_PATH: Unit = js.native
  }
}
