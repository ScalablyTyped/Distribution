package typings.angularCompiler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object styleParserMod {
  
  @JSImport("@angular/compiler/src/render3/view/style_parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def hyphenate(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hyphenate")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def parse(value: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  @scala.inline
  def stripUnnecessaryQuotes(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stripUnnecessaryQuotes")(value.asInstanceOf[js.Any]).asInstanceOf[String]
}
