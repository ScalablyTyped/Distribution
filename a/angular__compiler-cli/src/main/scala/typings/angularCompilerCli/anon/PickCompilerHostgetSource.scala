package typings.angularCompilerCli.anon

import typings.typescript.mod.ScriptTarget
import typings.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<typescript.typescript.CompilerHost, 'getSourceFile' | 'fileExists'> */
trait PickCompilerHostgetSource extends StObject {
  
  def fileExists(fileName: String): Boolean
  @JSName("fileExists")
  var fileExists_Original: js.Function1[/* fileName */ String, Boolean]
  
  def getSourceFile(fileName: String, languageVersionOrOptions: ScriptTarget): js.UndefOr[SourceFile]
  @JSName("getSourceFile")
  var getSourceFile_Original: js.Function2[
    /* fileName */ String, 
    /* languageVersionOrOptions */ ScriptTarget, 
    js.UndefOr[SourceFile]
  ]
}
object PickCompilerHostgetSource {
  
  inline def apply(
    fileExists: /* fileName */ String => Boolean,
    getSourceFile: (/* fileName */ String, /* languageVersionOrOptions */ ScriptTarget) => js.UndefOr[SourceFile]
  ): PickCompilerHostgetSource = {
    val __obj = js.Dynamic.literal(fileExists = js.Any.fromFunction1(fileExists), getSourceFile = js.Any.fromFunction2(getSourceFile))
    __obj.asInstanceOf[PickCompilerHostgetSource]
  }
  
  extension [Self <: PickCompilerHostgetSource](x: Self) {
    
    inline def setFileExists(value: /* fileName */ String => Boolean): Self = StObject.set(x, "fileExists", js.Any.fromFunction1(value))
    
    inline def setGetSourceFile(
      value: (/* fileName */ String, /* languageVersionOrOptions */ ScriptTarget) => js.UndefOr[SourceFile]
    ): Self = StObject.set(x, "getSourceFile", js.Any.fromFunction2(value))
  }
}
