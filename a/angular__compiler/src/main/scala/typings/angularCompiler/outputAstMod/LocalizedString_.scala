package typings.angularCompiler.outputAstMod

import typings.angularCompiler.metaMod.I18nMeta
import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/output/output_ast", "LocalizedString")
@js.native
class LocalizedString_ protected () extends Expression {
  def this(
    metaBlock: I18nMeta,
    messageParts: js.Array[LiteralPiece],
    placeHolderNames: js.Array[PlaceholderPiece],
    expressions: js.Array[Expression]
  ) = this()
  def this(
    metaBlock: I18nMeta,
    messageParts: js.Array[LiteralPiece],
    placeHolderNames: js.Array[PlaceholderPiece],
    expressions: js.Array[Expression],
    sourceSpan: ParseSourceSpan
  ) = this()
  
  val expressions: js.Array[Expression] = js.native
  
  def getMessagePartSourceSpan(i: Double): ParseSourceSpan | Null = js.native
  
  def getPlaceholderSourceSpan(i: Double): ParseSourceSpan = js.native
  
  val messageParts: js.Array[LiteralPiece] = js.native
  
  val metaBlock: I18nMeta = js.native
  
  val placeHolderNames: js.Array[PlaceholderPiece] = js.native
  
  /**
    * Serialize the given `meta` and `messagePart` into "cooked" and "raw" strings that can be used
    * in a `$localize` tagged string. The format of the metadata is the same as that parsed by
    * `parseI18nMeta()`.
    *
    * @param meta The metadata to serialize
    * @param messagePart The first part of the tagged string
    */
  def serializeI18nHead(): CookedRawString = js.native
  
  /**
    * Serialize the given `placeholderName` and `messagePart` into "cooked" and "raw" strings that
    * can be used in a `$localize` tagged string.
    *
    * @param placeholderName The placeholder name to serialize
    * @param messagePart The following message string after this placeholder
    */
  def serializeI18nTemplatePart(partIndex: Double): CookedRawString = js.native
}
