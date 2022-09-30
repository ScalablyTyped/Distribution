package typings.angularDevkitBuildWebpack.srcMod

import typings.angularDevkitBuildWebpack.literalsMod.TemplateTag
import typings.angularDevkitBuildWebpack.pathMod.PathFragment
import typings.angularDevkitBuildWebpack.pathMod.Path_
import typings.angularDevkitBuildWebpack.pathMod.PosixPath
import typings.angularDevkitBuildWebpack.pathMod.WindowsPath
import typings.angularDevkitBuildWebpack.srcMod.^
import typings.angularDevkitBuildWebpack.templateMod.TemplateAst
import typings.angularDevkitBuildWebpack.templateMod.TemplateOptions
import typings.angularDevkitBuildWebpack.utilsMod.JsonValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def NormalizedRoot: Path_ = ^.asInstanceOf[js.Dynamic].selectDynamic("NormalizedRoot").asInstanceOf[Path_]

inline def NormalizedSep: Path_ = ^.asInstanceOf[js.Dynamic].selectDynamic("NormalizedSep").asInstanceOf[Path_]

inline def asPosixPath(path: Path_): PosixPath = ^.asInstanceOf[js.Dynamic].applyDynamic("asPosixPath")(path.asInstanceOf[js.Any]).asInstanceOf[PosixPath]

inline def asWindowsPath(path: Path_): WindowsPath = ^.asInstanceOf[js.Dynamic].applyDynamic("asWindowsPath")(path.asInstanceOf[js.Any]).asInstanceOf[WindowsPath]

inline def basename(path: Path_): PathFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("basename")(path.asInstanceOf[js.Any]).asInstanceOf[PathFragment]

inline def deepCopy[T](value: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("deepCopy")(value.asInstanceOf[js.Any]).asInstanceOf[T]

inline def dirname(path: Path_): Path_ = ^.asInstanceOf[js.Dynamic].applyDynamic("dirname")(path.asInstanceOf[js.Any]).asInstanceOf[Path_]

inline def extname(path: Path_): String = ^.asInstanceOf[js.Dynamic].applyDynamic("extname")(path.asInstanceOf[js.Any]).asInstanceOf[String]

inline def fragment(path: String): PathFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("fragment")(path.asInstanceOf[js.Any]).asInstanceOf[PathFragment]

inline def getSystemPath(path: Path_): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSystemPath")(path.asInstanceOf[js.Any]).asInstanceOf[String]

inline def isAbsolute(p: Path_): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAbsolute")(p.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isJsonArray(value: JsonValue): /* is @angular-devkit/build-webpack.@angular-devkit/build-webpack/core/src/json/utils.JsonArray */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJsonArray")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @angular-devkit/build-webpack.@angular-devkit/build-webpack/core/src/json/utils.JsonArray */ Boolean]

inline def isJsonObject(value: JsonValue): /* is @angular-devkit/build-webpack.@angular-devkit/build-webpack/core/src/json/utils.JsonObject */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJsonObject")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @angular-devkit/build-webpack.@angular-devkit/build-webpack/core/src/json/utils.JsonObject */ Boolean]

inline def isPromise(obj: Any): /* is std.Promise<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPromise")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is std.Promise<any> */ Boolean]

inline def join(p1: Path_, others: String*): Path_ = ^.asInstanceOf[js.Dynamic].applyDynamic("join")(scala.List(p1.asInstanceOf[js.Any]).`++`(others.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Path_]

inline def noCacheNormalize(path: String): Path_ = ^.asInstanceOf[js.Dynamic].applyDynamic("noCacheNormalize")(path.asInstanceOf[js.Any]).asInstanceOf[Path_]

inline def normalize(path: String): Path_ = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(path.asInstanceOf[js.Any]).asInstanceOf[Path_]

inline def path: TemplateTag[Path_] = ^.asInstanceOf[js.Dynamic].selectDynamic("path").asInstanceOf[TemplateTag[Path_]]

inline def relative(from: Path_, to: Path_): Path_ = (^.asInstanceOf[js.Dynamic].applyDynamic("relative")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[Path_]

inline def resetNormalizeCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetNormalizeCache")().asInstanceOf[Unit]

inline def resolve(p1: Path_, p2: Path_): Path_ = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any])).asInstanceOf[Path_]

inline def split(path: Path_): js.Array[PathFragment] = ^.asInstanceOf[js.Dynamic].applyDynamic("split")(path.asInstanceOf[js.Any]).asInstanceOf[js.Array[PathFragment]]

inline def template[T](content: String): js.Function1[/* input */ T, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("template")(content.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* input */ T, String]]
inline def template[T](content: String, options: TemplateOptions): js.Function1[/* input */ T, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("template")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* input */ T, String]]

inline def templateParser(sourceText: String, fileName: String): TemplateAst = (^.asInstanceOf[js.Dynamic].applyDynamic("templateParser")(sourceText.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[TemplateAst]
