package typings
package atAngularCompilerLib.srcViewUnderscoreCompilerViewUnderscoreCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/view_compiler/view_compiler", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def elementEventFullName(target: java.lang.String, name: java.lang.String): java.lang.String = js.native
  def elementEventFullName(target: scala.Null, name: java.lang.String): java.lang.String = js.native
  def findStaticQueryIds(
    nodes: js.Array[
      atAngularCompilerLib.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.TemplateAst
    ]
  ): stdLib.Map[
    atAngularCompilerLib.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.TemplateAst, 
    StaticAndDynamicQueryIds
  ] = js.native
  def findStaticQueryIds(
    nodes: js.Array[
      atAngularCompilerLib.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.TemplateAst
    ],
    result: stdLib.Map[
      atAngularCompilerLib.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.TemplateAst, 
      StaticAndDynamicQueryIds
    ]
  ): stdLib.Map[
    atAngularCompilerLib.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.TemplateAst, 
    StaticAndDynamicQueryIds
  ] = js.native
  def staticViewQueryIds(
    nodeStaticQueryIds: stdLib.Map[
      atAngularCompilerLib.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.TemplateAst, 
      StaticAndDynamicQueryIds
    ]
  ): StaticAndDynamicQueryIds = js.native
}

