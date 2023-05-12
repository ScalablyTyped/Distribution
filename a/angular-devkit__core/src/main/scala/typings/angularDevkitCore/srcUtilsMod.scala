package typings.angularDevkitCore

import typings.angularDevkitCore.srcUtilsLiteralsMod.TemplateTag
import typings.angularDevkitCore.srcUtilsTemplateMod.TemplateAst
import typings.angularDevkitCore.srcUtilsTemplateMod.TemplateOptions
import typings.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtilsMod {
  
  @JSImport("@angular-devkit/core/src/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular-devkit/core/src/utils", "CircularDependencyFoundException")
  @js.native
  open class CircularDependencyFoundException ()
    extends typings.angularDevkitCore.srcUtilsPartiallyOrderedSetMod.CircularDependencyFoundException
  
  @JSImport("@angular-devkit/core/src/utils", "DependencyNotFoundException")
  @js.native
  open class DependencyNotFoundException ()
    extends typings.angularDevkitCore.srcUtilsPartiallyOrderedSetMod.DependencyNotFoundException
  
  @JSImport("@angular-devkit/core/src/utils", "PartiallyOrderedSet")
  @js.native
  open class PartiallyOrderedSet[T] ()
    extends typings.angularDevkitCore.srcUtilsPartiallyOrderedSetMod.PartiallyOrderedSet[T]
  
  @JSImport("@angular-devkit/core/src/utils", "PriorityQueue")
  @js.native
  open class PriorityQueue[T] protected ()
    extends typings.angularDevkitCore.srcUtilsPriorityQueueMod.PriorityQueue[T] {
    def this(_comparator: js.Function2[/* x */ T, /* y */ T, Double]) = this()
  }
  
  inline def deepCopy[T](value: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("deepCopy")(value.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def isPromise(obj: Any): /* is std.Promise<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPromise")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is std.Promise<any> */ Boolean]
  
  object strings {
    
    @JSImport("@angular-devkit/core/src/utils", "strings")
    @js.native
    val ^ : js.Any = js.native
    
    inline def camelize(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("camelize")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def capitalize(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("capitalize")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def classify(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("classify")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def dasherize(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("dasherize")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def decamelize(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decamelize")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def levenshtein(a: String, b: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("levenshtein")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def underscore(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("underscore")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  object tags {
    
    @JSImport("@angular-devkit/core/src/utils", "tags")
    @js.native
    val ^ : js.Any = js.native
    
    inline def indentBy(indentations: Double): TemplateTag[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("indentBy")(indentations.asInstanceOf[js.Any]).asInstanceOf[TemplateTag[String]]
    
    inline def oneLine(strings: TemplateStringsArray, values: Any*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("oneLine")(scala.List(strings.asInstanceOf[js.Any]).`++`(values.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
    
    inline def stripIndent(strings: TemplateStringsArray, values: Any*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stripIndent")(scala.List(strings.asInstanceOf[js.Any]).`++`(values.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
    
    inline def stripIndents(strings: TemplateStringsArray, values: Any*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stripIndents")(scala.List(strings.asInstanceOf[js.Any]).`++`(values.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
    
    inline def trimNewlines(strings: TemplateStringsArray, values: Any*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("trimNewlines")(scala.List(strings.asInstanceOf[js.Any]).`++`(values.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
  }
  
  inline def template[T](content: String): js.Function1[/* input */ T, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("template")(content.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* input */ T, String]]
  inline def template[T](content: String, options: TemplateOptions): js.Function1[/* input */ T, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("template")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* input */ T, String]]
  
  inline def templateParser(sourceText: String, fileName: String): TemplateAst = (^.asInstanceOf[js.Dynamic].applyDynamic("templateParser")(sourceText.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[TemplateAst]
}
