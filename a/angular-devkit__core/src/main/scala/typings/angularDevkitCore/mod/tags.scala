package typings.angularDevkitCore.mod

import typings.angularDevkitCore.literalsMod.TemplateTag
import typings.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tags {
  
  @JSImport("@angular-devkit/core", "tags")
  @js.native
  val ^ : js.Any = js.native
  
  inline def indentBy(indentations: Double): TemplateTag[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("indentBy")(indentations.asInstanceOf[js.Any]).asInstanceOf[TemplateTag[String]]
  
  inline def oneLine(strings: TemplateStringsArray, values: Any*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("oneLine")(List(strings.asInstanceOf[js.Any]).`++`(values.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
  
  inline def stripIndent(strings: TemplateStringsArray, values: Any*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stripIndent")(List(strings.asInstanceOf[js.Any]).`++`(values.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
  
  inline def stripIndents(strings: TemplateStringsArray, values: Any*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stripIndents")(List(strings.asInstanceOf[js.Any]).`++`(values.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
  
  inline def trimNewlines(strings: TemplateStringsArray, values: Any*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("trimNewlines")(List(strings.asInstanceOf[js.Any]).`++`(values.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
}
