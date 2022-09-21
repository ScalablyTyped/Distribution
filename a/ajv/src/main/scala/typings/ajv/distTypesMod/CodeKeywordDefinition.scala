package typings.ajv.distTypesMod

import typings.ajv.validateMod.KeywordCxt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CodeKeywordDefinition
  extends StObject
     with KeywordDef
     with KeywordDefinition {
  
  def code(cxt: KeywordCxt): Unit = js.native
  def code(cxt: KeywordCxt, ruleType: String): Unit = js.native
  
  var trackErrors: js.UndefOr[Boolean] = js.native
}
